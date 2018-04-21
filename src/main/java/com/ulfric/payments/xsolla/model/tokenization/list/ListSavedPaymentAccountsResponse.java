package com.ulfric.payments.xsolla.model.tokenization.list;

import java.util.List;

import com.ulfric.payments.xsolla.model.Response;

public class ListSavedPaymentAccountsResponse extends Response {

	private List<SavedPaymentAccount> array;

	public List<SavedPaymentAccount> getArray() {
		return array;
	}

	public void setArray(List<SavedPaymentAccount> array) {
		this.array = array;
	}

}
