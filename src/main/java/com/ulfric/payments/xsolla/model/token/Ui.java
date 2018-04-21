package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class Ui {

	private String theme; // TODO use enum
	private String size; // TODO use enum
	private String version; // TODO use enum
	private Desktop desktop;
	private Mobile mobile;
	private UiHeader header;
	@SerializedName("license_url")
	private String licenseUrl;
	private Components components;
	@SerializedName("user_account")
	private UserAccount userAccount;

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Desktop getDesktop() {
		return desktop;
	}

	public void setDesktop(Desktop desktop) {
		this.desktop = desktop;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public UiHeader getHeader() {
		return header;
	}

	public void setHeader(UiHeader header) {
		this.header = header;
	}

	public String getLicenseUrl() {
		return licenseUrl;
	}

	public void setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
	}

	public Components getComponents() {
		return components;
	}

	public void setComponents(Components components) {
		this.components = components;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

}
