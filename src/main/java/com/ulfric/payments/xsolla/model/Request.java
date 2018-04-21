package com.ulfric.payments.xsolla.model;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class Request {

	@SerializedName("custom_parameters")
	private Map<String, String> customParameters;

	public Map<String, String> getCustomParameters() {
		return customParameters;
	}

	public void setCustomParameters(Map<String, String> customParameters) {
		this.customParameters = customParameters;
	}

}
