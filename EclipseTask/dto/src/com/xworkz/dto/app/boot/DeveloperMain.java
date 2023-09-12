package com.xworkz.dto.app.boot;

import com.xworkz.dto.app.dto.DevelopersDTO;
import com.xworkz.dto.app.repository.DeveloperRepository;
import com.xworkz.dto.app.repository.DeveloperRepositoryImpl;
import com.xworkz.dto.app.service.DeveloperService;
import com.xworkz.dto.app.service.DeveloperServiceImpl;

public class DeveloperMain {

		public static void main(String[] args) {
			DeveloperRepository developerRepository = new DeveloperRepositoryImpl();

			DeveloperService developerService = new DeveloperServiceImpl(developerRepository);

			DevelopersDTO developersDTO = new DevelopersDTO("Amruth", 3, 10000, "Xworkz", "Developer", false);

			DevelopersDTO developersDTO2 = new DevelopersDTO("Amruth", 5, 10000, "Xworkz", "Developer", false);

			DevelopersDTO developersDTO3 = new DevelopersDTO("Santosh", 3, 10000, "Xworkz", "Developer", false);

			DevelopersDTO developersDTO4 = new DevelopersDTO(null, 0, 0, null, null, false);

			DevelopersDTO developersDTO5 = new DevelopersDTO("Bindhu", 3, 10000, "Xworkz", "Tester", false);

			developerService.validateDeveloper(developersDTO);

			developerService.validateDeveloper(developersDTO2);

			developerService.validateDeveloper(developersDTO3);

			developerService.validateDeveloper(developersDTO4);

			developerService.validateDeveloper(developersDTO5);

			DevelopersDTO developersDTO6 = developerRepository.findByName("Amruth");
			System.out.println("found " + developersDTO6);

		}
	
}

