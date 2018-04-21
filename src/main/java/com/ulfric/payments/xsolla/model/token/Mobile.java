package com.ulfric.payments.xsolla.model.token;

public class Mobile {

	private String mode; // TODO use enum
	private MobileHeader mobileHeader;
	private MobileFooter mobileFooter;

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public MobileHeader getMobileHeader() {
		return mobileHeader;
	}

	public void setMobileHeader(MobileHeader mobileHeader) {
		this.mobileHeader = mobileHeader;
	}

	public MobileFooter getMobileFooter() {
		return mobileFooter;
	}

	public void setMobileFooter(MobileFooter mobileFooter) {
		this.mobileFooter = mobileFooter;
	}

}
