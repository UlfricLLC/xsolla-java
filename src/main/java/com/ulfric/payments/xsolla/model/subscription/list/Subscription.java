package com.ulfric.payments.xsolla.model.subscription.list;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

public class Subscription {

	private Integer id;
	private Plan plan;
	private User user;
	@SerializedName("charge_amount")
	private BigDecimal chargeAmount;
	private String currency; // TODO use enum
	@SerializedName("date_create")
	private String dateCreate; // TODO use java 8 time
	@SerializedName("date_next_charge")
	private String dateNextCharge; // TODO use java 8 time
	@SerializedName("date_last_charge")
	private String dateLastCharge; // TODO use java 8 time
	private String status; // TODO use enum
	private String comment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BigDecimal getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(BigDecimal chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(String dateCreate) {
		this.dateCreate = dateCreate;
	}

	public String getDateNextCharge() {
		return dateNextCharge;
	}

	public void setDateNextCharge(String dateNextCharge) {
		this.dateNextCharge = dateNextCharge;
	}

	public String getDateLastCharge() {
		return dateLastCharge;
	}

	public void setDateLastCharge(String dateLastCharge) {
		this.dateLastCharge = dateLastCharge;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
