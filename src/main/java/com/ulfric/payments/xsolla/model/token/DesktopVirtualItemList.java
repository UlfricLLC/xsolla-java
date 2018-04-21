package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class DesktopVirtualItemList {

	private String layout; // TODO use enum
	@SerializedName("button_with_price")
	private Boolean buttonWithPrice;
	private String view; // TODO use enum

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	public Boolean getButtonWithPrice() {
		return buttonWithPrice;
	}

	public void setButtonWithPrice(Boolean buttonWithPrice) {
		this.buttonWithPrice = buttonWithPrice;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

}
