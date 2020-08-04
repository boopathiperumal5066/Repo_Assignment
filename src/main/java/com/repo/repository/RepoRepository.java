package com.repo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.repo.model.RepoModel;

@Repository
public interface RepoRepository extends MongoRepository<RepoModel, String> {

	RepoModel findByProjectNameAndRepositoryName(String projectName, String repositoryName);
}
