package com.repo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="project")
public class ProjectModel {
	
	@Id
	private String id;
	
	private String projectName;
	
	private String key;
	
	private String description;
	
	private boolean privacy;
	
	private String avatar;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public ProjectModel(String id, String projectName, String key, String description, boolean privacy, String avatar) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.key = key;
		this.description = description;
		this.privacy = privacy;
		this.avatar = avatar;
	}
	
	
}
