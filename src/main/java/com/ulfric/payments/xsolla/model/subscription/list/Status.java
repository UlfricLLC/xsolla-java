package com.ulfric.payments.xsolla.model.subscription.list;

public class Status {

	private String value; // TODO enum
	private Counters counters;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Counters getCounters() {
		return counters;
	}

	public void setCounters(Counters counters) {
		this.counters = counters;
	}

}
