package com.ulfric.payments.xsolla.model;

public enum Language implements HasFriendlyName {

	EN("English");
	// TODO add all languages

	private final String friendlyName;

	Language(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	@Override
	public String getFriendlyName() {
		return friendlyName;
	}

}
