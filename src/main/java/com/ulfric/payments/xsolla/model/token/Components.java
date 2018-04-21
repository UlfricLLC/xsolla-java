package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class Components {

	@SerializedName("virtual_items")
	private VirtualItemsComponent virtualItems;
	@SerializedName("virtual_currency")
	private VirtualCurrencyComponent virtualCurrency;
	private SubscriptionsComponent subscriptions;

	public VirtualItemsComponent getVirtualItems() {
		return virtualItems;
	}

	public void setVirtualItems(VirtualItemsComponent virtualItems) {
		this.virtualItems = virtualItems;
	}

	public VirtualCurrencyComponent getVirtualCurrency() {
		return virtualCurrency;
	}

	public void setVirtualCurrency(VirtualCurrencyComponent virtualCurrency) {
		this.virtualCurrency = virtualCurrency;
	}

	public SubscriptionsComponent getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(SubscriptionsComponent subscriptions) {
		this.subscriptions = subscriptions;
	}

}
