package com.ulfric.payments.xsolla.model.wallet.users.list;

import java.util.List;

import com.ulfric.payments.xsolla.model.Response;

public class UserListResponse extends Response {

	private Integer recordsTotal;
	private List<User> data;

	public Integer getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(Integer recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}

}
