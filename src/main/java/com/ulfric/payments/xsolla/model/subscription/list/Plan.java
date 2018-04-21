package com.ulfric.payments.xsolla.model.subscription.list;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class Plan {

	private Integer id;
	@SerializedName("external_id")
	private String externalId;
	@SerializedName("group_id")
	private String groupId;
	@SerializedName("project_id")
	private Integer projectId;
	private Map<String, String> name;
	private Map<String, String> description;
	@SerializedName("localized_name")
	private String localizedName;
	private Charge charge;
	private Period expiration;
	private Period trial;
	@SerializedName("grace_period")
	private Period gracePeriod;
	private String type;
	private Status status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Map<String, String> getName() {
		return name;
	}

	public void setName(Map<String, String> name) {
		this.name = name;
	}

	public Map<String, String> getDescription() {
		return description;
	}

	public void setDescription(Map<String, String> description) {
		this.description = description;
	}

	public String getLocalizedName() {
		return localizedName;
	}

	public void setLocalizedName(String localizedName) {
		this.localizedName = localizedName;
	}

	public Charge getCharge() {
		return charge;
	}

	public void setCharge(Charge charge) {
		this.charge = charge;
	}

	public Period getExpiration() {
		return expiration;
	}

	public void setExpiration(Period expiration) {
		this.expiration = expiration;
	}

	public Period getTrial() {
		return trial;
	}

	public void setTrial(Period trial) {
		this.trial = trial;
	}

	public Period getGracePeriod() {
		return gracePeriod;
	}

	public void setGracePeriod(Period gracePeriod) {
		this.gracePeriod = gracePeriod;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
