package com.repo.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repo.constant.AppConstants;
import com.repo.dto.RepoDTO;
import com.repo.dto.ResponseDTO;
import com.repo.model.RepoModel;
import com.repo.repository.RepoRepository;
import com.repo.service.RepoService;

@Service
public class RepoServiceImpl implements RepoService {

	@Autowired
	private RepoRepository repoRepository;

	private DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

	@Override
	public ResponseDTO addNewRepo(RepoDTO repoDTO) {
		ResponseDTO responseDTO = new ResponseDTO();
		try {
			RepoModel repoModel = dozerBeanMapper.map(repoDTO, RepoModel.class);
			repoRepository.save(repoModel);
			responseDTO.setResponseCode(AppConstants.GENERIC_SUCCESS_RESPONSE_CODE);
			responseDTO.setResponseDescription(AppConstants.GENERIC_SUCCESS_RESPONSE_DESCRIPTION);
		} catch (Exception e) {
			responseDTO.setResponseCode(AppConstants.GENERIC_FAILURE_RESPONSE_CODE);
			responseDTO.setResponseDescription(AppConstants.GENERIC_FAILURE_RESPONSE_DESCRIPTION);
		}
		return responseDTO;
	}

	@Override
	public List<RepoDTO> listAllRepo() {
		RepoDTO repoDTO = null;
		List<RepoDTO> repoDTOs = new ArrayList<RepoDTO>();
		List<RepoModel> repoModels = repoRepository.findAll();
		if (repoModels != null) {
			repoDTO = new RepoDTO();
			for (RepoModel model : repoModels) {
				repoDTO = dozerBeanMapper.map(model, RepoDTO.class);
				repoDTOs.add(repoDTO);
			}
		}
		return repoDTOs;
	}

	@Override
	public RepoDTO searchByProjectNameAndRepositoryName(String projectName, String repositoryName) {
		RepoDTO repoDTO = new RepoDTO();
		RepoModel repoModel = repoRepository.findByProjectNameAndRepositoryName(projectName, repositoryName);
		if (repoModel != null) {
			repoDTO = dozerBeanMapper.map(repoModel, RepoDTO.class);
		}
		return repoDTO;
	}

}
