package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class Desktop {

	private DesktopHeader header;
	@SerializedName("subscription_list")
	private DesktopSubscriptionList subscriptionList;
	@SerializedName("virtual_item_list")
	private DesktopVirtualItemList virtualItemList;
	@SerializedName("virtual_currency_list")
	private DesktopVirtualCurrencyList virtualCurrencyList;

	public DesktopHeader getHeader() {
		return header;
	}

	public void setHeader(DesktopHeader header) {
		this.header = header;
	}

	public DesktopSubscriptionList getSubscriptionList() {
		return subscriptionList;
	}

	public void setSubscriptionList(DesktopSubscriptionList subscriptionList) {
		this.subscriptionList = subscriptionList;
	}

	public DesktopVirtualItemList getVirtualItemList() {
		return virtualItemList;
	}

	public void setVirtualItemList(DesktopVirtualItemList virtualItemList) {
		this.virtualItemList = virtualItemList;
	}

	public DesktopVirtualCurrencyList getVirtualCurrencyList() {
		return virtualCurrencyList;
	}

	public void setVirtualCurrencyList(DesktopVirtualCurrencyList virtualCurrencyList) {
		this.virtualCurrencyList = virtualCurrencyList;
	}

}
