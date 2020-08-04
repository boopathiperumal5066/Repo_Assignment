package com.repo.service;

import java.util.List;

import com.repo.dto.RepoDTO;
import com.repo.dto.ResponseDTO;

public interface RepoService {

	public ResponseDTO addNewRepo(RepoDTO repoDTO);

	public List<RepoDTO> listAllRepo();

	public RepoDTO searchByProjectNameAndRepositoryName(String projectName, String repositoryName);

}
