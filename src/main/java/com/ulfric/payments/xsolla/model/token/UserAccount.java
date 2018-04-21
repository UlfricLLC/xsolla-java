package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class UserAccount {

	private UserAccountInfo info;
	private UserAccountHistory history;
	@SerializedName("payment_accounts")
	private UserAccountPaymentAccounts paymentAccounts;
	private UserAccountSubscriptions subscriptions;

	public UserAccountInfo getInfo() {
		return info;
	}

	public void setInfo(UserAccountInfo info) {
		this.info = info;
	}

	public UserAccountHistory getHistory() {
		return history;
	}

	public void setHistory(UserAccountHistory history) {
		this.history = history;
	}

	public UserAccountPaymentAccounts getPaymentAccounts() {
		return paymentAccounts;
	}

	public void setPaymentAccounts(UserAccountPaymentAccounts paymentAccounts) {
		this.paymentAccounts = paymentAccounts;
	}

	public UserAccountSubscriptions getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(UserAccountSubscriptions subscriptions) {
		this.subscriptions = subscriptions;
	}

}
