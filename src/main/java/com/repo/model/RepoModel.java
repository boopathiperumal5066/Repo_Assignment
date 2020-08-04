package com.repo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="repository")
public class RepoModel {
	
	@Id
	private String id;

	private String projectName;
	
	private String repositoryName;
	
	private boolean accessLevel;
	
	private boolean isReadMeIncluded;

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

	public String getRepositoryName() {
		return repositoryName;
	}

	public void setRepositoryName(String repositoryName) {
		this.repositoryName = repositoryName;
	}

	public boolean isAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(boolean accessLevel) {
		this.accessLevel = accessLevel;
	}

	public boolean isReadMeIncluded() {
		return isReadMeIncluded;
	}

	public void setReadMeIncluded(boolean isReadMeIncluded) {
		this.isReadMeIncluded = isReadMeIncluded;
	}
	
}
