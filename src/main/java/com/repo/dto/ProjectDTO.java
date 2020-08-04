package com.repo.dto;

import com.mongodb.lang.NonNull;

/**
 * @author boopathi p
 *
 */
public class ProjectDTO {

	@NonNull
	private String projectName;

	@NonNull
	private String key;

	private String description;

	private boolean privacy;

	private String avatar;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPrivacy() {
		return privacy;
	}

	public void setPrivacy(boolean privacy) {
		this.privacy = privacy;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

}
