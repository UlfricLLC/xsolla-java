package com.ulfric.payments.xsolla.model.token;

public class PinCode {

	public String getDigitalContent() {
		return digitalContent;
	}

	public void setDigitalContent(String digitalContent) {
		this.digitalContent = digitalContent;
	}

	public String getDrm() {
		return drm;
	}

	public void setDrm(String drm) {
		this.drm = drm;
	}

	private String digitalContent;
	private String drm;

}
