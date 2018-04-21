package com.ulfric.payments.xsolla.model.token;

import java.math.BigDecimal;

import com.ulfric.payments.xsolla.model.Currency;

public class Checkout {

	private Currency currency;
	private BigDecimal amount;

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
