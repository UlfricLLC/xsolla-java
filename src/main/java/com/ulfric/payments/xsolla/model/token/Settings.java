package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;
import com.ulfric.payments.xsolla.model.Currency;
import com.ulfric.payments.xsolla.model.Language;

public class Settings {

	@SerializedName("external_id")
	private String externalId;
	@SerializedName("project_id")
	private Integer projectId;
	private Language language;
	@SerializedName("return_url")
	private String returnUrl;
	private Currency currency;
	private String mode; // TODO use enum
	@SerializedName("payment_method")
	private Integer paymentMethod; // TODO use enum
	@SerializedName("payment_widget")
	private String paymentWidget; // TODO use enum
	private Ui ui;
	@SerializedName("shipping_enabled")
	private Boolean shippingEnabled;

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Integer getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(Integer paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentWidget() {
		return paymentWidget;
	}

	public void setPaymentWidget(String paymentWidget) {
		this.paymentWidget = paymentWidget;
	}

	public Ui getUi() {
		return ui;
	}

	public void setUi(Ui ui) {
		this.ui = ui;
	}

	public Boolean getShippingEnabled() {
		return shippingEnabled;
	}

	public void setShippingEnabled(Boolean shippingEnabled) {
		this.shippingEnabled = shippingEnabled;
	}

}
