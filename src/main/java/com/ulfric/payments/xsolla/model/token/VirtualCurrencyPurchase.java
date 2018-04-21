package com.ulfric.payments.xsolla.model.token;

import java.math.BigDecimal;

import com.ulfric.payments.xsolla.model.Currency;

public class VirtualCurrencyPurchase {

	private BigDecimal quantity;
	private Currency currency;

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

}
