package com.ulfric.payments.xsolla.model.token;

import java.util.List;

import com.ulfric.payments.xsolla.model.Currency;

public class PinCodes {

	private Currency currency;
	private List<PinCode> codes;

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public List<PinCode> getCodes() {
		return codes;
	}

	public void setCodes(List<PinCode> codes) {
		this.codes = codes;
	}

}
