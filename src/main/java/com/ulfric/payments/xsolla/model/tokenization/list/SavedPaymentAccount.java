package com.ulfric.payments.xsolla.model.tokenization.list;

import com.google.gson.annotations.SerializedName;

public class SavedPaymentAccount {

	private String type; // TODO enum;
	private Integer id;
	private String name;
	@SerializedName("payment_system")
	private PaymentSystem paymentSystem;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

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

	public PaymentSystem getPaymentSystem() {
		return paymentSystem;
	}

	public void setPaymentSystem(PaymentSystem paymentSystem) {
		this.paymentSystem = paymentSystem;
	}

}
