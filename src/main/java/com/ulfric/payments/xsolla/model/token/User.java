package com.ulfric.payments.xsolla.model.token;

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ulfric.payments.xsolla.model.CountryAttribute;
import com.ulfric.payments.xsolla.model.StringAttribute;

public class User {

	private StringAttribute id;
	private StringAttribute name;
	private StringAttribute email;
	private StringAttribute phone;
	private CountryAttribute country;
	private Map<String, String> attributes;
	@SerializedName("steam_id")
	private StringAttribute steamId;
	@SerializedName("tracking_id")
	private StringAttribute trackingId;
	@SerializedName("public_id")
	private StringAttribute publicId;
	@SerializedName("utm")
	private TrafficAttributes trafficAttributes;

	public StringAttribute getId() {
		return id;
	}

	public void setId(StringAttribute id) {
		this.id = id;
	}

	public StringAttribute getName() {
		return name;
	}

	public void setName(StringAttribute name) {
		this.name = name;
	}

	public StringAttribute getEmail() {
		return email;
	}

	public void setEmail(StringAttribute email) {
		this.email = email;
	}

	public StringAttribute getPhone() {
		return phone;
	}

	public void setPhone(StringAttribute phone) {
		this.phone = phone;
	}

	public CountryAttribute getCountry() {
		return country;
	}

	public void setCountry(CountryAttribute country) {
		this.country = country;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public StringAttribute getSteamId() {
		return steamId;
	}

	public void setSteamId(StringAttribute steamId) {
		this.steamId = steamId;
	}

	public StringAttribute getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(StringAttribute trackingId) {
		this.trackingId = trackingId;
	}

	public StringAttribute getPublicId() {
		return publicId;
	}

	public void setPublicId(StringAttribute publicId) {
		this.publicId = publicId;
	}

	public TrafficAttributes getTrafficAttributes() {
		return trafficAttributes;
	}

	public void setTrafficAttributes(TrafficAttributes trafficAttributes) {
		this.trafficAttributes = trafficAttributes;
	}

}
