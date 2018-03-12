/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.pojos;

import javax.annotation.Generated;
import java.io.Serializable;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.4" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JDefectFieldAllowedValue implements Serializable {

	private static final long serialVersionUID = 1972027048;

	private Integer id;
	private Integer defectFormField;
	private String valueId;
	private String valueName;

	public JDefectFieldAllowedValue() {
	}

	public JDefectFieldAllowedValue(JDefectFieldAllowedValue value) {
		this.id = value.id;
		this.defectFormField = value.defectFormField;
		this.valueId = value.valueId;
		this.valueName = value.valueName;
	}

	public JDefectFieldAllowedValue(Integer id, Integer defectFormField, String valueId, String valueName) {
		this.id = id;
		this.defectFormField = defectFormField;
		this.valueId = valueId;
		this.valueName = valueName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDefectFormField() {
		return this.defectFormField;
	}

	public void setDefectFormField(Integer defectFormField) {
		this.defectFormField = defectFormField;
	}

	public String getValueId() {
		return this.valueId;
	}

	public void setValueId(String valueId) {
		this.valueId = valueId;
	}

	public String getValueName() {
		return this.valueName;
	}

	public void setValueName(String valueName) {
		this.valueName = valueName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("JDefectFieldAllowedValue (");

		sb.append(id);
		sb.append(", ").append(defectFormField);
		sb.append(", ").append(valueId);
		sb.append(", ").append(valueName);

		sb.append(")");
		return sb.toString();
	}
}
