/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables;


import com.epam.ta.reportportal.store.jooq.JPublic;
import com.epam.ta.reportportal.store.jooq.Keys;
import com.epam.ta.reportportal.store.jooq.tables.records.JParameterRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JParameter extends TableImpl<JParameterRecord> {

    private static final long serialVersionUID = -1174290834;

    /**
     * The reference instance of <code>public.parameter</code>
     */
    public static final JParameter PARAMETER = new JParameter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JParameterRecord> getRecordType() {
        return JParameterRecord.class;
    }

    /**
     * The column <code>public.parameter.item_id</code>.
     */
    public final TableField<JParameterRecord, Long> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.parameter.key</code>.
     */
    public final TableField<JParameterRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.parameter.value</code>.
     */
    public final TableField<JParameterRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.parameter</code> table reference
     */
    public JParameter() {
        this(DSL.name("parameter"), null);
    }

    /**
     * Create an aliased <code>public.parameter</code> table reference
     */
    public JParameter(String alias) {
        this(DSL.name(alias), PARAMETER);
    }

    /**
     * Create an aliased <code>public.parameter</code> table reference
     */
    public JParameter(Name alias) {
        this(alias, PARAMETER);
    }

    private JParameter(Name alias, Table<JParameterRecord> aliased) {
        this(alias, aliased, null);
    }

    private JParameter(Name alias, Table<JParameterRecord> aliased, Field<?>[] parameters) {
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
    public List<ForeignKey<JParameterRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JParameterRecord, ?>>asList(Keys.PARAMETER__FKE7JDRKHBW7W40AKWVQIX6GK08);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JParameter as(String alias) {
        return new JParameter(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JParameter as(Name alias) {
        return new JParameter(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JParameter rename(String name) {
        return new JParameter(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JParameter rename(Name name) {
        return new JParameter(name, null);
    }
}
