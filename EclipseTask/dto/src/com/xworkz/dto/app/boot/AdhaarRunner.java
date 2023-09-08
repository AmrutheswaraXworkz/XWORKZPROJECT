package com.xworkz.dto.app.boot;

import com.xworkz.dto.app.dto.AdhaarDto;
import com.xworkz.dto.app.repository.AdhaarRepository;
import com.xworkz.dto.app.repository.AdhaarRepositoryImpl;
import com.xworkz.dto.app.service.AdhaarService;
import com.xworkz.dto.app.service.AdhaarServiceImpl;

public class AdhaarRunner {

	public static void main(String[] args) {
		AdhaarRepository adhaarRepository=new AdhaarRepositoryImpl();
		AdhaarService adhaarService=new AdhaarServiceImpl(adhaarRepository);
		AdhaarDto aDto=new AdhaarDto("amruth",6360504953L ,"davangere", 23);
		
		boolean save=adhaarService.validAndSave(aDto);
		System.out.println("saved? \n"+save);
	}
}
