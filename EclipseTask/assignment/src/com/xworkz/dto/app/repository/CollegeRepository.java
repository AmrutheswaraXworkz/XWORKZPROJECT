package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.CollegeDTO;

public interface CollegeRepository {
	
	int TOTAL=10;
	void save(CollegeDTO collegeDto);
	boolean isExist(CollegeDTO collegeDto);
	CollegeDTO isFound(int cId,String name);
	

	
}
