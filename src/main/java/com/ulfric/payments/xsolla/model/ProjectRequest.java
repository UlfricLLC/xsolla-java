package com.ulfric.payments.xsolla.model;

import com.google.gson.annotations.SerializedName;

public class ProjectRequest extends Request {

	@SerializedName("project_id")
	private Integer projectId;

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

}
