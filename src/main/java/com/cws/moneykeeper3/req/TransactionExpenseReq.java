package com.cws.moneykeeper3.req;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionExpenseReq {
	// region -- Fields --

	@JsonProperty(value = "ss1")
	private Integer id;

	@JsonProperty(value = "ss2")
	private String name;

	@JsonProperty(value = "ss3")
	private String note;

	// end

	// region -- Get set --

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	// end

	// region -- Methods --

	public TransactionExpenseReq() {
	}

	// end
}