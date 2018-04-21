package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class DesktopHeader {

	@SerializedName("is_visible")
	private Boolean visible;
	@SerializedName("visible_logo")
	private Boolean visibleLogo;
	@SerializedName("visible_name")
	private Boolean visibleName;
	private String type; // TODO use enum

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public Boolean getVisibleLogo() {
		return visibleLogo;
	}

	public void setVisibleLogo(Boolean visibleLogo) {
		this.visibleLogo = visibleLogo;
	}

	public Boolean getVisibleName() {
		return visibleName;
	}

	public void setVisibleName(Boolean visibleName) {
		this.visibleName = visibleName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
