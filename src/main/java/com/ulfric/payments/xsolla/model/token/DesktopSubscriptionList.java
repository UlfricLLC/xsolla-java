package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class DesktopSubscriptionList {

	private String layout; // TODO use enum
	private String description;
	@SerializedName("display_local_price")
	private Boolean displayLocalPrice;

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getDisplayLocalPrice() {
		return displayLocalPrice;
	}

	public void setDisplayLocalPrice(Boolean displayLocalPrice) {
		this.displayLocalPrice = displayLocalPrice;
	}

}
