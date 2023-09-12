package com.xworkz.app.service;

import com.xworkz.app.dto.EngineerDTO;
import com.xworkz.app.repository.EngineerRepository;

public class EngineerServiceImpl implements EngineerService {

	private EngineerRepository engineerRepository;

	public EngineerServiceImpl(EngineerRepository engineerRepository) {
		this.engineerRepository = engineerRepository;
	}

	@Override
	public boolean validateAndSave(EngineerDTO engineerDTO) {
		if (engineerDTO != null) {
			System.out.println("engineerDto is not null");
			int id = engineerDTO.getId();
			String name = engineerDTO.getName();
			String cName = engineerDTO.getCollegeName();
			
			if (id > 0) {
				System.out.println("id is valid");
			} else {
				System.err.println("id is not valid,can't store the value");
				return false;
			}

			if (name != null && !name.isEmpty() && name.length() > 4) {
				System.out.println("name is valid");

			} else {
				System.err.println("name is not valid,can't store the value");
				return false;
			}

			if (cName != null && !cName.isEmpty() && cName.length() > 4) {
				System.out.println("college name is valid");
			} else {
				System.err.println("college name is not valid,can't store the value");
				return false;
			}
			
			
			if(!engineerRepository.isExist(engineerDTO)) {
				this.engineerRepository.save(engineerDTO);
				return true;
			}
			

		} else {
			System.err.println("engineerDto  is null");
			
		}
		return false;
	}

}
