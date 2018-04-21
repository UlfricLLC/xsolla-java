package com.ulfric.payments.xsolla.model;

import com.google.gson.annotations.SerializedName;

public abstract class Attribute {

	private Boolean hidden;
	@SerializedName("allow_modify")
	private Boolean allowModify;

	public Boolean getHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public Boolean getAllowModify() {
		return allowModify;
	}

	public void setAllowModify(Boolean allowModify) {
		this.allowModify = allowModify;
	}

}
