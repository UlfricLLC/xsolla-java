package com.ulfric.payments.xsolla.model.token;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ulfric.payments.xsolla.model.Currency;

public class VirtualItemsPurchase {

	private Currency currency;
	private List<VirtualItem> items;
	@SerializedName("available_groups")
	private List<String> availableGroups;

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public List<VirtualItem> getItems() {
		return items;
	}

	public void setItems(List<VirtualItem> items) {
		this.items = items;
	}

	public List<String> getAvailableGroups() {
		return availableGroups;
	}

	public void setAvailableGroups(List<String> availableGroups) {
		this.availableGroups = availableGroups;
	}

}
