package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class MobileFooter {

	@SerializedName("is_visible")
	private Boolean visible;

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

}
