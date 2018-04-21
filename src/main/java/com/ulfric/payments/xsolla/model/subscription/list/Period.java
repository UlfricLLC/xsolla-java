package com.ulfric.payments.xsolla.model.subscription.list;

public class Period {

	private Integer value;
	private String type; // TODO use enum

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
