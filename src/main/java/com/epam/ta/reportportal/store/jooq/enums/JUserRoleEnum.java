/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.enums;

import com.epam.ta.reportportal.store.jooq.JPublic;
import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.4" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum JUserRoleEnum implements EnumType {

	ADMINISTRATOR("ADMINISTRATOR"),

	USER("USER");

	private final String literal;

	private JUserRoleEnum(String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Catalog getCatalog() {
		return getSchema() == null ? null : getSchema().getCatalog();
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
	public String getName() {
		return "user_role_enum";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getLiteral() {
		return literal;
	}
}
