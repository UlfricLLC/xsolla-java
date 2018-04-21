package com.ulfric.payments.xsolla;

public class XsollaRuntimeException extends RuntimeException {

	public XsollaRuntimeException(Throwable cause) {
		super(cause);
	}

	public XsollaRuntimeException(String message) {
		super(message);
	}

	public XsollaRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

}