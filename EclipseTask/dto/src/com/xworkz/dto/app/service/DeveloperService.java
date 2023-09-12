package com.xworkz.dto.app.service;

import com.xworkz.dto.app.dto.DevelopersDTO;

public interface DeveloperService {
	boolean validateDeveloper(DevelopersDTO developersDTO);

	DevelopersDTO findByName(String name);


}
