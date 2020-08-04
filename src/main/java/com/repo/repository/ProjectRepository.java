package com.repo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.repo.model.ProjectModel;

@Repository
public interface ProjectRepository extends MongoRepository<ProjectModel, String> {

	ProjectModel findByProjectName(String projectName);
}
