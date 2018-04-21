package com.ulfric.payments.xsolla.model.subscription.list;

import com.google.gson.annotations.SerializedName;

public class Counters {

	private Integer active;
	private Integer closed;
	private Integer expired;
	private Integer frozen;
	@SerializedName("non_renewing")
	private Integer nonRenewing;

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public Integer getClosed() {
		return closed;
	}

	public void setClosed(Integer closed) {
		this.closed = closed;
	}

	public Integer getExpired() {
		return expired;
	}

	public void setExpired(Integer expired) {
		this.expired = expired;
	}

	public Integer getFrozen() {
		return frozen;
	}

	public void setFrozen(Integer frozen) {
		this.frozen = frozen;
	}

	public Integer getNonRenewing() {
		return nonRenewing;
	}

	public void setNonRenewing(Integer nonRenewing) {
		this.nonRenewing = nonRenewing;
	}

}
