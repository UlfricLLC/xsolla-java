package com.ulfric.payments.xsolla.model.tokenization.list;

import com.google.gson.annotations.SerializedName;
import com.ulfric.payments.xsolla.model.ProjectRequest;

public class ListSavedPaymentAccountsRequest extends ProjectRequest {

	@SerializedName("user_id")
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
