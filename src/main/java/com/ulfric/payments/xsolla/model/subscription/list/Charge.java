package com.ulfric.payments.xsolla.model.subscription.list;

import java.math.BigDecimal;

public class Charge {

	private Period period;
	private BigDecimal amount;
	private String currency; // TODO use enum

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
