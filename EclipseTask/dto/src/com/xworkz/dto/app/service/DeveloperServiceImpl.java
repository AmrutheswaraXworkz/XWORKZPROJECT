package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.DevelopersDTO;
import com.xworkz.dto.app.repository.DeveloperRepository;

public class DeveloperServiceImpl implements DeveloperService {

		private DeveloperRepository repo;

		public DeveloperServiceImpl(DeveloperRepository repo) {
			super();
			this.repo = repo;
		}

		@Override
		public boolean validateDeveloper(DevelopersDTO developersDTO) {
			if (developersDTO != null) {
				String name = developersDTO.getName();
				int experience = developersDTO.getExperience();
				double salary = developersDTO.getSalary();
				String workingFor = developersDTO.getWorkingFor();
				String designation = developersDTO.getDesignation();
				boolean difficult = developersDTO.isDifficult();

				if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20 && workingFor != null
						&& !workingFor.isEmpty() && workingFor.length() >= 3 && workingFor.length() <= 20
						&& designation != null && !designation.isEmpty() && designation.length() >= 3
						&& designation.length() <= 20) {
					System.out.println("Name, WorkingFoe and Designatition are valid");

				} else {
					System.err.println("Name or WorkingFor or Designatition are not valid");
					return false;
				}

				if (experience > 0 && salary > 0) {
					System.out.println("Experience and Salary are valid");
				} else {
					System.err.println("Experience and Salary are in-valid");
					return false;
				}

				this.repo.saveDeveloperInfo(developersDTO);
				System.out.println();
			}
			return false;
		}

		@Override
		public DevelopersDTO findByName(String name) {

			System.out.println("running findBbyName...");

			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
				DevelopersDTO developersDTO = this.repo.findByName(name);
				return developersDTO;
			} else {
				System.err.println("Name is invalid..");
			}

			return findByName(name);
		}

	}

