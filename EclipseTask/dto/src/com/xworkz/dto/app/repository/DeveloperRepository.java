package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.DevelopersDTO;

public interface DeveloperRepository {
	int TOTAL_DEVELOPERS = 5;

	void saveDeveloperInfo(DevelopersDTO developersDTO);

	boolean isExist(DevelopersDTO developersDTO);

	DevelopersDTO findByName(String name);


}
