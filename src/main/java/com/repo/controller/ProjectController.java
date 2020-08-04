package com.repo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.repo.dto.ProjectDTO;
import com.repo.dto.ResponseDTO;
import com.repo.service.ProjectService;

@RestController
@RequestMapping(value = "/api")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@RequestMapping(value = "/addNewProject", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseDTO addNewProject(@RequestBody ProjectDTO projectDTO) {
		return projectService.addNewProject(projectDTO);
	}

	@RequestMapping(value = "/listAllProject", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<ProjectDTO> listAllProject() {
		return projectService.listAllProject();
	}

	@RequestMapping(value = "/searchByProjectName", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public ProjectDTO searchByProjectName(@RequestParam(name = "projectName", required = false)String projectName) {
		return projectService.searchByProjectName(projectName);
	}
}
