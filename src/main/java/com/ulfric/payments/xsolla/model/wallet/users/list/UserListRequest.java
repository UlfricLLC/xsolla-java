package com.ulfric.payments.xsolla.model.wallet.users.list;

import com.google.gson.annotations.SerializedName;
import com.ulfric.payments.xsolla.model.ProjectRequest;

public class UserListRequest extends ProjectRequest {

	@SerializedName("user_requisites")
	private String userRequisites;
	private String email;
	private Integer offset;
	private Integer limit;

	public String getUserRequisites() {
		return userRequisites;
	}

	public void setUserRequisites(String userRequisites) {
		this.userRequisites = userRequisites;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

}
