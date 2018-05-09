package com.cws.moneykeeper3.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "transaction_expense", schema = "public")
public class TransactionExpense {
	// region -- Fields --
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_expense_id_seq_generator")
	@SequenceGenerator(name = "transaction_expense_id_seq_generator", sequenceName = "transaction_expense_id_seq", allocationSize = 1)
	@Column(columnDefinition = "SERIAL")
	private Integer id;

	@Column(columnDefinition = "varchar(30)", name = "name")
	private String name;

	@Column(columnDefinition = "varchar(100)", name = "note")
	private String note;

	@Column(columnDefinition = "integer", name = "id_parent")
	private String idParent;

	@Column(columnDefinition = "varchar(60)", name = "owner")
	private String owner;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(columnDefinition = "TIMESTAMP WITH TIME ZONE", name = "create_date")
	private Date createDate;

	@Column(columnDefinition = "varchar(10)", name = "status")
	private String status;

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

	public String getIdParent() {
		return idParent;
	}

	public void setIdParent(String idParent) {
		this.idParent = idParent;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// end

	// region -- Methods --

	public TransactionExpense() {

	}

	// end
}
