package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.ApplicationDTO;
import com.xworkz.dto.app.repository.ApplicationRepository;

public class ApplicationServiceImpl implements ApplicationService {
	private ApplicationRepository applicationRepository;

	public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}

	@Override
	public boolean validateAndSave(ApplicationDTO applicationDTO) {
		if (applicationDTO != null) {
			int id = applicationDTO.getId();
			String name = applicationDTO.getName();
			String dAt = applicationDTO.getDevelopedAt();
			String dBy = applicationDTO.getDevelopedBy();
			String version = applicationDTO.getVersion();

			if (id > 0) {
				System.out.println("ID is valid can be stored");
			} else {
				System.err.println("id is invalid cannot be stored");
				return false;
			}
			if (name != null && !name.isEmpty() && name.length() > 3) {
				System.out.println("name is valid can be stored");
			} else {
				System.err.println("name is invalid cannot be stored");
				return false;

			}
			if (dAt != null && !dAt.isEmpty() && dAt.length() > 3) {
				System.out.println("developed at is valid can be stored");
			} else {
				System.err.println("developed at is invalid cannot be stored");
				return false;
			}
			if (dBy != null && !dBy.isEmpty() && dBy.length() > 3) {
				System.out.println("developed by is valid can be stored");
			} else {
				System.err.println("developed by is invalid cannot be stored");
				return false;
			}
			if (version != null && !version.isEmpty() && version.length() > 3) {
				System.out.println("version is valid can be stored");
			} else {
				System.err.println("vserion is invalid cannot be stored");
				return false;
			}
			if(!applicationRepository.isExist(applicationDTO)) {
				this.applicationRepository.save(applicationDTO);
				return true;
			}
			else {
				System.err.println("applicaionDto is null cannot stored");
			}
		}
		return false;
	}

}
