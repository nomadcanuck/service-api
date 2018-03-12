/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.tables.JTestItemStructure;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.4" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTestItemStructureRecord extends UpdatableRecordImpl<JTestItemStructureRecord> implements Record4<Long, Long, Long, Long> {

	private static final long serialVersionUID = -1863411899;

	/**
	 * Setter for <code>public.test_item_structure.item_id</code>.
	 */
	public void setItemId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.test_item_structure.item_id</code>.
	 */
	public Long getItemId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.test_item_structure.launch_id</code>.
	 */
	public void setLaunchId(Long value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.test_item_structure.launch_id</code>.
	 */
	public Long getLaunchId() {
		return (Long) get(1);
	}

	/**
	 * Setter for <code>public.test_item_structure.parent_id</code>.
	 */
	public void setParentId(Long value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.test_item_structure.parent_id</code>.
	 */
	public Long getParentId() {
		return (Long) get(2);
	}

	/**
	 * Setter for <code>public.test_item_structure.retry_of</code>.
	 */
	public void setRetryOf(Long value) {
		set(3, value);
	}

	/**
	 * Getter for <code>public.test_item_structure.retry_of</code>.
	 */
	public Long getRetryOf() {
		return (Long) get(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, Long, Long, Long> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, Long, Long, Long> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JTestItemStructure.TEST_ITEM_STRUCTURE.ITEM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return JTestItemStructure.TEST_ITEM_STRUCTURE.LAUNCH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return JTestItemStructure.TEST_ITEM_STRUCTURE.PARENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return JTestItemStructure.TEST_ITEM_STRUCTURE.RETRY_OF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component2() {
		return getLaunchId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component3() {
		return getParentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component4() {
		return getRetryOf();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getLaunchId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value3() {
		return getParentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getRetryOf();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemStructureRecord value1(Long value) {
		setItemId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemStructureRecord value2(Long value) {
		setLaunchId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemStructureRecord value3(Long value) {
		setParentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemStructureRecord value4(Long value) {
		setRetryOf(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTestItemStructureRecord values(Long value1, Long value2, Long value3, Long value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JTestItemStructureRecord
	 */
	public JTestItemStructureRecord() {
		super(JTestItemStructure.TEST_ITEM_STRUCTURE);
	}

	/**
	 * Create a detached, initialised JTestItemStructureRecord
	 */
	public JTestItemStructureRecord(Long itemId, Long launchId, Long parentId, Long retryOf) {
		super(JTestItemStructure.TEST_ITEM_STRUCTURE);

		set(0, itemId);
		set(1, launchId);
		set(2, parentId);
		set(3, retryOf);
	}
}
