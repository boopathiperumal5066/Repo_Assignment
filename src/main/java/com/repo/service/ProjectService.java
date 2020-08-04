package com.repo.service;

import java.util.List;

import com.repo.dto.ProjectDTO;
import com.repo.dto.ResponseDTO;

/**
 * @author boopathi
 *
 */
public interface ProjectService {

	public ResponseDTO addNewProject(ProjectDTO projectDTO);

	public List<ProjectDTO> listAllProject();

	public ProjectDTO searchByProjectName(String projectName);
}
