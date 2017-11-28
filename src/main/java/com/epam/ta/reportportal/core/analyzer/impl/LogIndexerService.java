/*
 * Copyright 2017 EPAM Systems
 *
 *
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/service-api
 *
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.epam.ta.reportportal.core.analyzer.impl;

import com.epam.ta.reportportal.core.analyzer.ILogIndexer;
import com.epam.ta.reportportal.core.analyzer.client.AnalyzerServiceClient;
import com.epam.ta.reportportal.core.analyzer.model.IndexLaunch;
import com.epam.ta.reportportal.core.analyzer.model.IndexRs;
import com.epam.ta.reportportal.core.analyzer.model.IndexTestItem;
import com.epam.ta.reportportal.database.dao.LaunchRepository;
import com.epam.ta.reportportal.database.dao.LogRepository;
import com.epam.ta.reportportal.database.dao.TestItemRepository;
import com.epam.ta.reportportal.database.entity.Launch;
import com.epam.ta.reportportal.database.entity.Log;
import com.epam.ta.reportportal.database.entity.LogLevel;
import com.epam.ta.reportportal.database.entity.item.TestItem;
import com.epam.ta.reportportal.database.entity.item.issue.TestItemIssueType;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.apache.commons.collections.CollectionUtils;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.util.CloseableIterator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import static org.springframework.data.mongodb.core.query.Criteria.where;

/**
 * Default implementation of {@link ILogIndexer}.
 *
 * @author Ivan Sharamet
 * @author Pavel Bortnik
 */
@Service("indexerService")
public class LogIndexerService implements ILogIndexer {

	public static final int BATCH_SIZE = 1000;

	private static final String CHECKPOINT_COLL = "logIndexingCheckpoint";
	private static final String CHECKPOINT_ID = "checkpoint";
	private static final String CHECKPOINT_LOG_ID = "logId";
	private static final String LOG_LEVEL = "level.log_level";

	@Autowired
	private AnalyzerServiceClient analyzerServiceClient;

	@Autowired
	private MongoOperations mongoOperations;

	@Autowired
	private LaunchRepository launchRepository;

	@Autowired
	private TestItemRepository testItemRepository;

	@Autowired
	private LogRepository logRepository;

	@EventListener
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (mongoOperations.collectionExists(CHECKPOINT_COLL)) {
			Executors.newSingleThreadExecutor().execute(this::indexAllLogs);
		}
	}

	@Override
	public void indexLog(Log log) {
		IndexLaunch rq = createRqLaunch(log);
		if (rq != null) {
			List<IndexRs> rs = analyzerServiceClient.index(Collections.singletonList(rq));
			retryFailed(rs);
		}
	}

	@Override
	public void indexLogs(String launchId, List<TestItem> testItems) {
		Launch launch = launchRepository.findOne(launchId);
		if (launch != null) {
			List<IndexTestItem> rqTestItems = prepareItemsForIndexing(testItems);
			if (!CollectionUtils.isEmpty(rqTestItems)) {
				IndexLaunch rqLaunch = new IndexLaunch();
				rqLaunch.setLaunchId(launchId);
				rqLaunch.setLaunchName(launch.getName());
				rqLaunch.setProject(launch.getProjectRef());
				rqLaunch.setTestItems(rqTestItems);
				List<IndexRs> rs = analyzerServiceClient.index(Collections.singletonList(rqLaunch));
				retryFailed(rs);
			}
		}
	}

	@Override
	public void deleteIndex(String project) {
		analyzerServiceClient.deleteIndex(project);
	}

	@Override
	public void cleanIndex(String index, List<String> ids) {
		analyzerServiceClient.cleanIndex(index, ids);
	}

	@Override
	public void indexAllLogs() {
		String checkpoint = getLastCheckpoint();
		if (!analyzerServiceClient.hasClients()) {
			return;
		}
		try (CloseableIterator<Log> logIterator = getLogIterator(checkpoint)) {
			List<IndexLaunch> rq = new ArrayList<>(BATCH_SIZE);
			while (logIterator.hasNext()) {
				Log log = logIterator.next();
				IndexLaunch rqLaunch = createRqLaunch(log);
				if (rqLaunch != null) {
					if (checkpoint == null) {
						checkpoint = log.getId();
					}
					rq.add(rqLaunch);
					if (rq.size() == BATCH_SIZE || !logIterator.hasNext()) {
						createCheckpoint(checkpoint);

						List<IndexRs> rs = analyzerServiceClient.index(rq);

						retryFailed(rs);

						rq = new ArrayList<>(BATCH_SIZE);
						checkpoint = null;
					}
				}
			}
			if (!CollectionUtils.isEmpty(rq)) {
				analyzerServiceClient.index(rq);
			}
		}

		getCheckpointCollection().drop();
	}

	/**
	 * Creates {@link IndexLaunch} for specified log if
	 * it is suitable for indexing or else returns <code>null</code>
	 *
	 * @param log Log to be converted
	 * @return Prepared {@link IndexLaunch} rq for indexing
	 */
	private IndexLaunch createRqLaunch(Log log) {
		if (!isLevelSuitable(log)) {
			return null;
		}
		IndexLaunch rqLaunch = null;
		TestItem testItem = testItemRepository.findOne(log.getTestItemRef());
		if (isItemSuitable(testItem)) {
			Launch launch = launchRepository.findOne(testItem.getLaunchRef());
			if (launch != null) {
				rqLaunch = new IndexLaunch();
				rqLaunch.setLaunchId(launch.getId());
				rqLaunch.setLaunchName(launch.getName());
				rqLaunch.setProject(launch.getProjectRef());
				rqLaunch.setTestItems(Collections.singletonList(AnalyzerUtils.fromTestItem(testItem, Collections.singletonList(log))));
			}
		}
		return rqLaunch;
	}

	/**
	 * Creates {@link IndexTestItem} from suitable {@link TestItem}
	 * for indexing with logs greater than {@link LogLevel#ERROR}
	 *
	 * @param testItems Test item for preparing
	 * @return Prepared list of {@link IndexTestItem} for indexing
	 */
	private List<IndexTestItem> prepareItemsForIndexing(List<TestItem> testItems) {
		return testItems.stream()
				.filter(this::isItemSuitable)
				.map(it -> AnalyzerUtils.fromTestItem(it, logRepository.findGreaterOrEqualLevel(it.getId(), LogLevel.ERROR)))
				.filter(it -> !CollectionUtils.isEmpty(it.getLogs()))
				.collect(Collectors.toList());
	}

	/**
	 * Checks if the log is suitable for indexing in analyzer.
	 * Log's level is greater or equal than {@link LogLevel#ERROR}
	 *
	 * @param log Log for check
	 * @return true if suitable
	 */
	private boolean isLevelSuitable(Log log) {
		return null != log && null != log.getLevel() && log.getLevel().isGreaterOrEqual(LogLevel.ERROR);
	}

	/**
	 * Checks if the test item is suitable for indexing in analyzer.
	 * Test item issue type should not be {@link TestItemIssueType#TO_INVESTIGATE}
	 *
	 * @param testItem Test item for check
	 * @return true if suitable
	 */
	private boolean isItemSuitable(TestItem testItem) {
		return testItem != null && testItem.getIssue() != null && !TestItemIssueType.TO_INVESTIGATE.getLocator()
				.equals(testItem.getIssue().getIssueType());
	}

	private void retryFailed(List<IndexRs> rs) {
		// TODO: Retry failed items!
		//        List<IndexRsItem> failedItems =
		//                rs.getItems().stream().filter(i -> i.failed()).collect(Collectors.toList());
	}

	private CloseableIterator<Log> getLogIterator(String checkpoint) {
		Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, "_id"));
		Query query = new Query().with(sort).addCriteria(where(LOG_LEVEL).gte(LogLevel.ERROR_INT)).noCursorTimeout();

		if (checkpoint != null) {
			query.addCriteria(Criteria.where("_id").gte(new ObjectId(checkpoint)));
		}

		return mongoOperations.stream(query, Log.class);
	}

	private DBCollection getCheckpointCollection() {
		return mongoOperations.getCollection(CHECKPOINT_COLL);
	}

	private String getLastCheckpoint() {
		DBObject checkpoint = getCheckpointCollection().findOne(new BasicDBObject("_id", CHECKPOINT_ID));
		return checkpoint == null ? null : (String) checkpoint.get(CHECKPOINT_LOG_ID);
	}

	private void createCheckpoint(String logId) {
		BasicDBObject checkpoint = new BasicDBObject("_id", CHECKPOINT_ID).append(CHECKPOINT_LOG_ID, logId);
		getCheckpointCollection().save(checkpoint);
	}

}


