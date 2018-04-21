package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;
import com.ulfric.payments.xsolla.model.StringAttribute;

public class Purchase {

	@SerializedName("virtual_currency")
	private VirtualCurrencyPurchase virtualCurrency;
	@SerializedName("virtual_items")
	private VirtualItemsPurchase virtualItems;
	private SubscriptionPurchase subscription;
	@SerializedName("pin_codes")
	private PinCodes pinCodes;
	private Checkout checkout;
	private StringAttribute description;
	private Gift gift;

	public VirtualCurrencyPurchase getVirtualCurrency() {
		return virtualCurrency;
	}

	public void setVirtualCurrency(VirtualCurrencyPurchase virtualCurrency) {
		this.virtualCurrency = virtualCurrency;
	}

	public VirtualItemsPurchase getVirtualItems() {
		return virtualItems;
	}

	public void setVirtualItems(VirtualItemsPurchase virtualItems) {
		this.virtualItems = virtualItems;
	}

	public SubscriptionPurchase getSubscription() {
		return subscription;
	}

	public void setSubscription(SubscriptionPurchase subscription) {
		this.subscription = subscription;
	}

	public PinCodes getPinCodes() {
		return pinCodes;
	}

	public void setPinCodes(PinCodes pinCodes) {
		this.pinCodes = pinCodes;
	}

	public Checkout getCheckout() {
		return checkout;
	}

	public void setCheckout(Checkout checkout) {
		this.checkout = checkout;
	}

	public StringAttribute getDescription() {
		return description;
	}

	public void setDescription(StringAttribute description) {
		this.description = description;
	}

	public Gift getGift() {
		return gift;
	}

	public void setGift(Gift gift) {
		this.gift = gift;
	}

}
