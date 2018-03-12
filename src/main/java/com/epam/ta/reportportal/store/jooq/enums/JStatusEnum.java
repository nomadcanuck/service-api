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
public enum JStatusEnum implements EnumType {

	IN_PROGRESS("IN_PROGRESS"),

	PASSED("PASSED"),

	FAILED("FAILED"),

	STOPPED("STOPPED"),

	SKIPPED("SKIPPED"),

	INTERRUPTED("INTERRUPTED"),

	RESETED("RESETED"),

	CANCELLED("CANCELLED");

	private final String literal;

	private JStatusEnum(String literal) {
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
		return "status_enum";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getLiteral() {
		return literal;
	}
}
