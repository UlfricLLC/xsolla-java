package com.ulfric.payments.xsolla.model.token;

import com.ulfric.payments.xsolla.model.Request;

public class TokenCreateRequest extends Request {

	private User user;
	private Settings settings;
	private Purchase purchase;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Settings getSettings() {
		return settings;
	}

	public void setSettings(Settings settings) {
		this.settings = settings;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

}
