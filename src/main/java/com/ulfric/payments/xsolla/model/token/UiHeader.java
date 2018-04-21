package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class UiHeader {

	@SerializedName("visible_virtual_currency_balance")
	private Boolean visibleVirtualCurrencyBalance;

	public Boolean getVisibleVirtualCurrencyBalance() {
		return visibleVirtualCurrencyBalance;
	}

	public void setVisibleVirtualCurrencyBalance(Boolean visibleVirtualCurrencyBalance) {
		this.visibleVirtualCurrencyBalance = visibleVirtualCurrencyBalance;
	}

}
