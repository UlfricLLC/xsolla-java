package com.ulfric.payments.xsolla.model.wallet.users.list;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

public class User {

	@SerializedName("user_id")
	private String userId;
	@SerializedName("user_name")
	private String userName;
	@SerializedName("user_custom")
	private String userCustom;
	private String email;
	@SerializedName("register_date")
	private String registerDate;
	private BigDecimal balance;
	@SerializedName("wallet_amount")
	private BigDecimal walletAmount;
	@SerializedName("wallet_currency")
	private String walletCurrency; // TODO use enum
	private Boolean enabled;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(String userCustom) {
		this.userCustom = userCustom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getWalletAmount() {
		return walletAmount;
	}

	public void setWalletAmount(BigDecimal walletAmount) {
		this.walletAmount = walletAmount;
	}

	public String getWalletCurrency() {
		return walletCurrency;
	}

	public void setWalletCurrency(String walletCurrency) {
		this.walletCurrency = walletCurrency;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}
