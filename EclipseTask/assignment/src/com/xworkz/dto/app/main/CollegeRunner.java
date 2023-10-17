package com.xworkz.dto.app.main;

import com.xworkz.dto.app.dto.CollegeDTO;
import com.xworkz.dto.app.repository.CollegeRepository;
import com.xworkz.dto.app.repository.CollegeRepositoryImpl;
import com.xworkz.dto.app.service.CollegeService;
import com.xworkz.dto.app.service.CollegeServiceImpl;

public class CollegeRunner {
public static void main(String[] args) {
	CollegeRepository collegeRepository=new CollegeRepositoryImpl();
	CollegeService collegeService=new CollegeServiceImpl(collegeRepository);
	
	
	CollegeDTO dto1=new CollegeDTO("Stj pu", 2, "davangere", 6360504953L, "www.stj.com", "stj@gmail.com", 2, 10, 2001, "puc", "india", "karnataka",109, 3, true, 54, true, 4, true, 20000, 1);
	CollegeDTO dto2=new CollegeDTO("Siddaganga", 1, "banglore", 6360804953L, "www.siddaganga.com", "siddaganaga@gmail.com", 2, 12, 2001, "puc", "india", "karnataka",109, 3, true, 54, true, 4, true, 20000, 1);
	CollegeDTO dto3=new CollegeDTO("Vishnavi", 3, "davangere", 6360904973L, "www.vishnavi.com", "vishnavi@gmail.com", 2, 12, 2001, "puc", "india", "karnataka",109, 3, true, 54, true, 4, true, 20000, 1);

	collegeService.validateAndSave(dto1);
	collegeService.validateAndSave(dto2);
	collegeService.validateAndSave(dto3);
	collegeRepository.isFound(2, "Stj pu");
}
}
