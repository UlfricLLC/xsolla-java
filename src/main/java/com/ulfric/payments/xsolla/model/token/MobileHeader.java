package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class MobileHeader {

	@SerializedName("close_button")
	private Boolean closeButton;

	public Boolean getCloseButton() {
		return closeButton;
	}

	public void setCloseButton(Boolean closeButton) {
		this.closeButton = closeButton;
	}

}
