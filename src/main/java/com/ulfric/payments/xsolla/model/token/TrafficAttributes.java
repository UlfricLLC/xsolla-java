package com.ulfric.payments.xsolla.model.token;

import com.google.gson.annotations.SerializedName;

public class TrafficAttributes {

	@SerializedName("utm_source")
	private String source;
	@SerializedName("utm_medium")
	private String medium;
	@SerializedName("utm_campaign")
	private String campaign;
	@SerializedName("utm_term")
	private String term;
	@SerializedName("utm_content")
	private String content;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getCampaign() {
		return campaign;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
