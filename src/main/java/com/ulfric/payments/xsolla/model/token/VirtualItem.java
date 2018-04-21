package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class VirtualItem {

	private Integer amount;
	@SerializedName("sku")
	private String itemId;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
