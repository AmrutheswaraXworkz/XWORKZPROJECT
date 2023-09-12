package com.xworkz.app.repository;

import com.xworkz.app.dto.EngineerDTO;

public interface EngineerRepository {
	int TOTAL = 10;

	void save(EngineerDTO engineerDTO);

	boolean isExist(EngineerDTO engineerDTO);
	
	EngineerDTO isFound(String name); 

}
