package com.repo.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repo.constant.AppConstants;
import com.repo.dto.ProjectDTO;
import com.repo.dto.ResponseDTO;
import com.repo.model.ProjectModel;
import com.repo.repository.ProjectRepository;
import com.repo.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	private DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

	@Override
	public ResponseDTO addNewProject(ProjectDTO projectDTO) {
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			ProjectModel projectModel = dozerBeanMapper.map(projectDTO, ProjectModel.class);
			projectRepository.save(projectModel);
			responseDTO.setResponseCode(AppConstants.GENERIC_SUCCESS_RESPONSE_CODE);
			responseDTO.setResponseDescription(AppConstants.GENERIC_SUCCESS_RESPONSE_DESCRIPTION);
		} catch (Exception e) {
			responseDTO.setResponseCode(AppConstants.GENERIC_FAILURE_RESPONSE_CODE);
			responseDTO.setResponseDescription(AppConstants.GENERIC_FAILURE_RESPONSE_DESCRIPTION);
		}
		return responseDTO;
	}

	@Override
	public List<ProjectDTO> listAllProject() {
		ProjectDTO projectDTO = null;
		List<ProjectDTO> projectDTOs = new ArrayList<ProjectDTO>();
		List<ProjectModel> projectModels = projectRepository.findAll();
		if (projectModels != null) {
			projectDTO = new ProjectDTO();
			for (ProjectModel model : projectModels) {
				projectDTO = dozerBeanMapper.map(model, ProjectDTO.class);
				projectDTOs.add(projectDTO);
			}
		}
		return projectDTOs;
	}

	@Override
	public ProjectDTO searchByProjectName(String projectName) {
		ProjectDTO projectDTO = new ProjectDTO();
		ProjectModel projectModel = projectRepository.findByProjectName(projectName);
		if (projectModel != null) {
			projectDTO = dozerBeanMapper.map(projectModel, ProjectDTO.class);
		}
		return projectDTO;
	}

}
