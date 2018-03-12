/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.tables.JOauthRegistrationScope;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.4" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JOauthRegistrationScopeRecord extends UpdatableRecordImpl<JOauthRegistrationScopeRecord>
		implements Record3<Integer, String, String> {

	private static final long serialVersionUID = -1040130218;

	/**
	 * Setter for <code>public.oauth_registration_scope.id</code>.
	 */
	public void setId(Integer value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.oauth_registration_scope.id</code>.
	 */
	public Integer getId() {
		return (Integer) get(0);
	}

	/**
	 * Setter for <code>public.oauth_registration_scope.oauth_registration_fk</code>.
	 */
	public void setOauthRegistrationFk(String value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.oauth_registration_scope.oauth_registration_fk</code>.
	 */
	public String getOauthRegistrationFk() {
		return (String) get(1);
	}

	/**
	 * Setter for <code>public.oauth_registration_scope.scope</code>.
	 */
	public void setScope(String value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.oauth_registration_scope.scope</code>.
	 */
	public String getScope() {
		return (String) get(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, String, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, String, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.OAUTH_REGISTRATION_FK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.SCOPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer component1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component2() {
		return getOauthRegistrationFk();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component3() {
		return getScope();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getOauthRegistrationFk();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getScope();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JOauthRegistrationScopeRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JOauthRegistrationScopeRecord value2(String value) {
		setOauthRegistrationFk(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JOauthRegistrationScopeRecord value3(String value) {
		setScope(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JOauthRegistrationScopeRecord values(Integer value1, String value2, String value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JOauthRegistrationScopeRecord
	 */
	public JOauthRegistrationScopeRecord() {
		super(JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE);
	}

	/**
	 * Create a detached, initialised JOauthRegistrationScopeRecord
	 */
	public JOauthRegistrationScopeRecord(Integer id, String oauthRegistrationFk, String scope) {
		super(JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE);

		set(0, id);
		set(1, oauthRegistrationFk);
		set(2, scope);
	}
}
