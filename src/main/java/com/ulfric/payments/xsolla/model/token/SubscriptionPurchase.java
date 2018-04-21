package com.ulfric.payments.xsolla.model.token;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ulfric.payments.xsolla.model.Currency;

public class SubscriptionPurchase {

	@SerializedName("plan_id")
	private String planId;
	@SerializedName("product_id")
	private String productId;
	private Currency currency;
	@SerializedName("available_plans")
	private List<String> availablePlans;
	@SerializedName("trial_days")
	private Integer trialDays;

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public List<String> getAvailablePlans() {
		return availablePlans;
	}

	public void setAvailablePlans(List<String> availablePlans) {
		this.availablePlans = availablePlans;
	}

	public Integer getTrialDays() {
		return trialDays;
	}

	public void setTrialDays(Integer trialDays) {
		this.trialDays = trialDays;
	}

}
