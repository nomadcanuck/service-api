/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables;

import com.epam.ta.reportportal.store.jooq.Indexes;
import com.epam.ta.reportportal.store.jooq.JPublic;
import com.epam.ta.reportportal.store.jooq.Keys;
import com.epam.ta.reportportal.store.jooq.tables.records.JTicketRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.4" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTicket extends TableImpl<JTicketRecord> {

	private static final long serialVersionUID = 928892988;

	/**
	 * The reference instance of <code>public.ticket</code>
	 */
	public static final JTicket TICKET = new JTicket();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JTicketRecord> getRecordType() {
		return JTicketRecord.class;
	}

	/**
	 * The column <code>public.ticket.id</code>.
	 */
	public final TableField<JTicketRecord, Long> ID = createField(
			"id", org.jooq.impl.SQLDataType.BIGINT.nullable(false)
					.defaultValue(org.jooq.impl.DSL.field("nextval('ticket_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this,
			""
	);

	/**
	 * The column <code>public.ticket.ticket_id</code>.
	 */
	public final TableField<JTicketRecord, String> TICKET_ID = createField(
			"ticket_id", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

	/**
	 * The column <code>public.ticket.submitter_id</code>.
	 */
	public final TableField<JTicketRecord, Integer> SUBMITTER_ID = createField(
			"submitter_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.ticket.submit_date</code>.
	 */
	public final TableField<JTicketRecord, Timestamp> SUBMIT_DATE = createField(
			"submit_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false)
					.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

	/**
	 * The column <code>public.ticket.bts_id</code>.
	 */
	public final TableField<JTicketRecord, Integer> BTS_ID = createField(
			"bts_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.ticket.url</code>.
	 */
	public final TableField<JTicketRecord, String> URL = createField(
			"url", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

	/**
	 * Create a <code>public.ticket</code> table reference
	 */
	public JTicket() {
		this(DSL.name("ticket"), null);
	}

	/**
	 * Create an aliased <code>public.ticket</code> table reference
	 */
	public JTicket(String alias) {
		this(DSL.name(alias), TICKET);
	}

	/**
	 * Create an aliased <code>public.ticket</code> table reference
	 */
	public JTicket(Name alias) {
		this(alias, TICKET);
	}

	private JTicket(Name alias, Table<JTicketRecord> aliased) {
		this(alias, aliased, null);
	}

	private JTicket(Name alias, Table<JTicketRecord> aliased, Field<?>[] parameters) {
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
		return Arrays.<Index>asList(Indexes.TICKET_PK, Indexes.TICKET_TICKET_ID_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<JTicketRecord, Long> getIdentity() {
		return Keys.IDENTITY_TICKET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JTicketRecord> getPrimaryKey() {
		return Keys.TICKET_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JTicketRecord>> getKeys() {
		return Arrays.<UniqueKey<JTicketRecord>>asList(Keys.TICKET_PK, Keys.TICKET_TICKET_ID_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<JTicketRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<JTicketRecord, ?>>asList(Keys.TICKET__TICKET_SUBMITTER_ID_FKEY, Keys.TICKET__TICKET_BTS_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTicket as(String alias) {
		return new JTicket(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JTicket as(Name alias) {
		return new JTicket(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JTicket rename(String name) {
		return new JTicket(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JTicket rename(Name name) {
		return new JTicket(name, null);
	}
}
