package com.ulfric.payments.xsolla.model.subscription.list;

import com.ulfric.payments.xsolla.model.ProjectRequest;

public class SubscriptionListRequest extends ProjectRequest {

	private String status; // TODO use enum
	private Integer limit;
	private Integer offset;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

}
