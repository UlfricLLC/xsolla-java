package com.ulfric.payments.xsolla.model;

public enum Currency implements HasFriendlyName {

	USD("United States Dollar");
	// TODO add all currencies

	private final String friendlyName;

	Currency(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	@Override
	public String getFriendlyName() {
		return friendlyName;
	}

}
