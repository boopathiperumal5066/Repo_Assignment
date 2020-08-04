package com.repo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.repo.dto.RepoDTO;
import com.repo.dto.ResponseDTO;
import com.repo.service.RepoService;

@RestController
@RequestMapping(value = "/api")
public class RepoController {

	@Autowired
	private RepoService repoService;

	@RequestMapping(value = "/addNewRepo", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseDTO addNewRepo(@RequestBody RepoDTO repoDTO) {
		return repoService.addNewRepo(repoDTO);
	}

	@RequestMapping(value = "/listAllRepo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<RepoDTO> listAllRepo() {
		List<RepoDTO> repoDTOs = repoService.listAllRepo();
		return repoDTOs;
	}

	@RequestMapping(value = "/searchByProjectNameAndRepositoryName", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public RepoDTO searchByProjectNameAndRepositoryName(@RequestParam String projectName,
			@RequestParam String repositoryName) {
		RepoDTO repoDTO = repoService.searchByProjectNameAndRepositoryName(projectName,repositoryName);
		return repoDTO;
	}
}
