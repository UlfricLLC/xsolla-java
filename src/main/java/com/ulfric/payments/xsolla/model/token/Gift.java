package com.ulfric.payments.xsolla.model.token;

import java.util.List;

public class Gift {

	private String giverId;
	private String message;
	private Boolean hideGiverFromReceiver;
	private List<Friend> friends;

	public String getGiverId() {
		return giverId;
	}

	public void setGiverId(String giverId) {
		this.giverId = giverId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getHideGiverFromReceiver() {
		return hideGiverFromReceiver;
	}

	public void setHideGiverFromReceiver(Boolean hideGiverFromReceiver) {
		this.hideGiverFromReceiver = hideGiverFromReceiver;
	}

	public List<Friend> getFriends() {
		return friends;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}

}
