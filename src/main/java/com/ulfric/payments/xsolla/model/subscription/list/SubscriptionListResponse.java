package com.ulfric.payments.xsolla.model.subscription.list;

import java.util.List;

import com.ulfric.payments.xsolla.model.Response;

public class SubscriptionListResponse extends Response {

	private List<Payment> array;

	public List<Payment> getArray() {
		return array;
	}

	public void setArray(List<Payment> array) {
		this.array = array;
	}

}
