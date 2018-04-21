package com.ulfric.payments.xsolla.model;

import com.google.gson.annotations.SerializedName;

public class Response {

	@SerializedName("http_status_code")
	private Integer httpStatusCode;
	private String message;
	@SerializedName("extended_message")
	private String extendedMessage;
	@SerializedName("request_id")
	private String requestId;

	public Integer getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getExtendedMessage() {
		return extendedMessage;
	}

	public void setExtendedMessage(String extendedMessage) {
		this.extendedMessage = extendedMessage;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
