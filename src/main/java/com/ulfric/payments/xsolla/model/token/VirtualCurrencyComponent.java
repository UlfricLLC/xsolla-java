package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class VirtualCurrencyComponent extends Component {

	@SerializedName("custom_amount")
	private Boolean allowCustomAmount;

	public Boolean getAllowCustomAmount() {
		return allowCustomAmount;
	}

	public void setAllowCustomAmount(Boolean allowCustomAmount) {
		this.allowCustomAmount = allowCustomAmount;
	}

}
