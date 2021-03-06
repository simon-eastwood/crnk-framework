package io.crnk.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IngoredAttributeEntity {

	public static final String ATTR_id = "id";

	public static final String ATTR_stringValue = "stringValue";

	private Long _id;

	private String _stringValue;

	public IngoredAttributeEntity() {

	}

	@Id
	public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		this._id = id;
	}

	public String getStringValue() {
		return _stringValue;
	}

	@Column
	public void setStringValue(String stringValue) {
		this._stringValue = stringValue;
	}
}
