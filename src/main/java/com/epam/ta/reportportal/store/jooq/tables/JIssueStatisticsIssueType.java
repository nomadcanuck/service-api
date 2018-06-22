/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables;

import com.epam.ta.reportportal.store.jooq.Indexes;
import com.epam.ta.reportportal.store.jooq.JPublic;
import com.epam.ta.reportportal.store.jooq.Keys;
import com.epam.ta.reportportal.store.jooq.tables.records.JIssueStatisticsIssueTypeRecord;
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
public class JIssueStatisticsIssueType extends TableImpl<JIssueStatisticsIssueTypeRecord> {

	private static final long serialVersionUID = -148001001;

	/**
	 * The reference instance of <code>public.issue_statistics_issue_type</code>
	 */
	public static final JIssueStatisticsIssueType ISSUE_STATISTICS_ISSUE_TYPE = new JIssueStatisticsIssueType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JIssueStatisticsIssueTypeRecord> getRecordType() {
		return JIssueStatisticsIssueTypeRecord.class;
	}

	/**
	 * The column <code>public.issue_statistics_issue_type.statistics_id</code>.
	 */
	public final TableField<JIssueStatisticsIssueTypeRecord, Long> STATISTICS_ID = createField(
			"statistics_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.issue_statistics_issue_type.issue_type_id</code>.
	 */
	public final TableField<JIssueStatisticsIssueTypeRecord, Long> ISSUE_TYPE_ID = createField(
			"issue_type_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.issue_statistics_issue_type.count</code>.
	 */
	public final TableField<JIssueStatisticsIssueTypeRecord, Integer> COUNT = createField(
			"count", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this,
			""
	);

	/**
	 * Create a <code>public.issue_statistics_issue_type</code> table reference
	 */
	public JIssueStatisticsIssueType() {
		this(DSL.name("issue_statistics_issue_type"), null);
	}

	/**
	 * Create an aliased <code>public.issue_statistics_issue_type</code> table reference
	 */
	public JIssueStatisticsIssueType(String alias) {
		this(DSL.name(alias), ISSUE_STATISTICS_ISSUE_TYPE);
	}

	/**
	 * Create an aliased <code>public.issue_statistics_issue_type</code> table reference
	 */
	public JIssueStatisticsIssueType(Name alias) {
		this(alias, ISSUE_STATISTICS_ISSUE_TYPE);
	}

	private JIssueStatisticsIssueType(Name alias, Table<JIssueStatisticsIssueTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private JIssueStatisticsIssueType(Name alias, Table<JIssueStatisticsIssueTypeRecord> aliased, Field<?>[] parameters) {
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
		return Arrays.<Index>asList(Indexes.ISSUE_STATISTICS_ISSUE_TYPE_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JIssueStatisticsIssueTypeRecord> getPrimaryKey() {
		return Keys.ISSUE_STATISTICS_ISSUE_TYPE_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JIssueStatisticsIssueTypeRecord>> getKeys() {
		return Arrays.<UniqueKey<JIssueStatisticsIssueTypeRecord>>asList(Keys.ISSUE_STATISTICS_ISSUE_TYPE_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<JIssueStatisticsIssueTypeRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<JIssueStatisticsIssueTypeRecord, ?>>asList(
				Keys.ISSUE_STATISTICS_ISSUE_TYPE__ISSUE_STATISTICS_ISSUE_TYPE_STATISTICS_ID_FKEY,
				Keys.ISSUE_STATISTICS_ISSUE_TYPE__ISSUE_STATISTICS_ISSUE_TYPE_ISSUE_TYPE_ID_FKEY
		);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueStatisticsIssueType as(String alias) {
		return new JIssueStatisticsIssueType(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueStatisticsIssueType as(Name alias) {
		return new JIssueStatisticsIssueType(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JIssueStatisticsIssueType rename(String name) {
		return new JIssueStatisticsIssueType(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JIssueStatisticsIssueType rename(Name name) {
		return new JIssueStatisticsIssueType(name, null);
	}
}