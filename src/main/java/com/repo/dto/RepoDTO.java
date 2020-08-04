package com.repo.dto;

import com.mongodb.lang.NonNull;

public class RepoDTO {

	@NonNull
	private String projectName;

	@NonNull
	private String repositoryName;

	private boolean accessLevel;

	private boolean isReadMeIncluded;

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
