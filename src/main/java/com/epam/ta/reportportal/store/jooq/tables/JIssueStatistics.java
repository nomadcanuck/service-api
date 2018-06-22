/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables;

import com.epam.ta.reportportal.store.jooq.Indexes;
import com.epam.ta.reportportal.store.jooq.JPublic;
import com.epam.ta.reportportal.store.jooq.Keys;
import com.epam.ta.reportportal.store.jooq.tables.records.JIssueStatisticsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JIssueStatistics extends TableImpl<JIssueStatisticsRecord> {

	private static final long serialVersionUID = -651041806;

	/**
	 * The reference instance of <code>public.issue_statistics</code>
	 */
	public static final JIssueStatistics ISSUE_STATISTICS = new JIssueStatistics();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JIssueStatisticsRecord> getRecordType() {
		return JIssueStatisticsRecord.class;
	}

	/**
	 * The column <code>public.issue_statistics.id</code>.
	 */
	public final TableField<JIssueStatisticsRecord, Long> ID = createField(
			"id", org.jooq.impl.SQLDataType.BIGINT.nullable(false)
					.defaultValue(
							org.jooq.impl.DSL.field("nextval('issue_statistics_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)),
			this, ""
	);

	/**
	 * The column <code>public.issue_statistics.launch_id</code>.
	 */
	public final TableField<JIssueStatisticsRecord, Long> LAUNCH_ID = createField("launch_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.issue_statistics.test_item_id</code>.
	 */
	public final TableField<JIssueStatisticsRecord, Long> TEST_ITEM_ID = createField(
			"test_item_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>public.issue_statistics</code> table reference
	 */
	public JIssueStatistics() {
		this(DSL.name("issue_statistics"), null);
	}

	/**
	 * Create an aliased <code>public.issue_statistics</code> table reference
	 */
	public JIssueStatistics(String alias) {
		this(DSL.name(alias), ISSUE_STATISTICS);
	}

	/**
	 * Create an aliased <code>public.issue_statistics</code> table reference
	 */
	public JIssueStatistics(Name alias) {
		this(alias, ISSUE_STATISTICS);
	}

	private JIssueStatistics(Name alias, Table<JIssueStatisticsRecord> aliased) {
		this(alias, aliased, null);
	}

	private JIssueStatistics(Name alias, Table<JIssueStatisticsRecord> aliased, Field<?>[] parameters) {
		super(alias, null, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schema getSchema() {
		return JPublic.PUBLIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Index> getIndexes() {
		return Arrays.<Index>asList(
				Indexes.ISSUE_STATISTICS_LAUNCH_ID_KEY, Indexes.ISSUE_STATISTICS_TEST_ITEM_ID_KEY, Indexes.PK_ISSUE_STATISTICS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<JIssueStatisticsRecord, Long> getIdentity() {
		return Keys.IDENTITY_ISSUE_STATISTICS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JIssueStatisticsRecord> getPrimaryKey() {
		return Keys.PK_ISSUE_STATISTICS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JIssueStatisticsRecord>> getKeys() {
		return Arrays.<UniqueKey<JIssueStatisticsRecord>>asList(
				Keys.PK_ISSUE_STATISTICS, Keys.ISSUE_STATISTICS_LAUNCH_ID_KEY, Keys.ISSUE_STATISTICS_TEST_ITEM_ID_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<JIssueStatisticsRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<JIssueStatisticsRecord, ?>>asList(
				Keys.ISSUE_STATISTICS__ISSUE_STATISTICS_LAUNCH_ID_FKEY, Keys.ISSUE_STATISTICS__ISSUE_STATISTICS_TEST_ITEM_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueStatistics as(String alias) {
		return new JIssueStatistics(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueStatistics as(Name alias) {
		return new JIssueStatistics(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JIssueStatistics rename(String name) {
		return new JIssueStatistics(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JIssueStatistics rename(Name name) {
		return new JIssueStatistics(name, null);
	}
}
