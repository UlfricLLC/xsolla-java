package com.ulfric.payments.xsolla.model.token;

import com.ulfric.payments.xsolla.model.Response;

public class TokenCreateResponse extends Response {

	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
