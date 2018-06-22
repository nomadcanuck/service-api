/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.tables.JIssueStatisticsIssueGroup;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JIssueStatisticsIssueGroupRecord extends UpdatableRecordImpl<JIssueStatisticsIssueGroupRecord>
		implements Record3<Long, Short, Integer> {

	private static final long serialVersionUID = -409886008;

	/**
	 * Setter for <code>public.issue_statistics_issue_group.statistics_id</code>.
	 */
	public void setStatisticsId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.issue_statistics_issue_group.statistics_id</code>.
	 */
	public Long getStatisticsId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.issue_statistics_issue_group.issue_group_id</code>.
	 */
	public void setIssueGroupId(Short value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.issue_statistics_issue_group.issue_group_id</code>.
	 */
	public Short getIssueGroupId() {
		return (Short) get(1);
	}

	/**
	 * Setter for <code>public.issue_statistics_issue_group.total</code>.
	 */
	public void setTotal(Integer value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.issue_statistics_issue_group.total</code>.
	 */
	public Integer getTotal() {
		return (Integer) get(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Long, Short> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Long, Short, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Long, Short, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JIssueStatisticsIssueGroup.ISSUE_STATISTICS_ISSUE_GROUP.STATISTICS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field2() {
		return JIssueStatisticsIssueGroup.ISSUE_STATISTICS_ISSUE_GROUP.ISSUE_GROUP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return JIssueStatisticsIssueGroup.ISSUE_STATISTICS_ISSUE_GROUP.TOTAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getStatisticsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short component2() {
		return getIssueGroupId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer component3() {
		return getTotal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getStatisticsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value2() {
		return getIssueGroupId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getTotal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueStatisticsIssueGroupRecord value1(Long value) {
		setStatisticsId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueStatisticsIssueGroupRecord value2(Short value) {
		setIssueGroupId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueStatisticsIssueGroupRecord value3(Integer value) {
		setTotal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueStatisticsIssueGroupRecord values(Long value1, Short value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JIssueStatisticsIssueGroupRecord
	 */
	public JIssueStatisticsIssueGroupRecord() {
		super(JIssueStatisticsIssueGroup.ISSUE_STATISTICS_ISSUE_GROUP);
	}

	/**
	 * Create a detached, initialised JIssueStatisticsIssueGroupRecord
	 */
	public JIssueStatisticsIssueGroupRecord(Long statisticsId, Short issueGroupId, Integer total) {
		super(JIssueStatisticsIssueGroup.ISSUE_STATISTICS_ISSUE_GROUP);

		set(0, statisticsId);
		set(1, issueGroupId);
		set(2, total);
	}
}
