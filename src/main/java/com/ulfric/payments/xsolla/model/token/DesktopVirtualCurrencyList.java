package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class DesktopVirtualCurrencyList {

	private String description;
	@SerializedName("button_with_price")
	private Boolean buttonWithPrice;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getButtonWithPrice() {
		return buttonWithPrice;
	}

	public void setButtonWithPrice(Boolean buttonWithPrice) {
		this.buttonWithPrice = buttonWithPrice;
	}

}
