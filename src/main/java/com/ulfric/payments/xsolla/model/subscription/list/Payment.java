package com.ulfric.payments.xsolla.model.subscription.list;

import com.google.gson.annotations.SerializedName;

public class Payment {

	private Integer id;
	@SerializedName("id_payment")
	private Integer idPayment;
	@SerializedName("date_payment")
	private String datePayment; // TODO use java 8 time
	private String status; // TODO use enum
	private Subscription subscription;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(Integer idPayment) {
		this.idPayment = idPayment;
	}

	public String getDatePayment() {
		return datePayment;
	}

	public void setDatePayment(String datePayment) {
		this.datePayment = datePayment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

}
