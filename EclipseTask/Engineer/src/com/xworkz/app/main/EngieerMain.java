package com.xworkz.app.main;

import com.xworkz.app.dto.EngineerDTO;
import com.xworkz.app.repository.EngineerRepository;
import com.xworkz.app.repository.EngineerRepositoryImpl;
import com.xworkz.app.service.EngineerService;
import com.xworkz.app.service.EngineerServiceImpl;

public class EngieerMain {
public static void main(String[] args) {
	EngineerRepository engineerRepository=new EngineerRepositoryImpl();
	EngineerService engineerService=new EngineerServiceImpl(engineerRepository);
	EngineerDTO dto=new EngineerDTO(2,"Amruth","ubdt college");
	EngineerDTO dto1=new EngineerDTO(3,"Santosh","ubdt college");
	EngineerDTO dto5=new EngineerDTO(3,"Amruth","ubdt college");
	
	EngineerDTO dto2=new EngineerDTO(4,"Bindu","ubdt college");
	EngineerDTO dto3=new EngineerDTO(2,"Amruth","ubdt college");
	EngineerDTO dto4=new EngineerDTO(0,null,null);
	
	
	engineerService.validateAndSave(dto);
	engineerService.validateAndSave(dto1);
	engineerService.validateAndSave(dto2);
	engineerService.validateAndSave(dto3);
	engineerService.validateAndSave(dto4);
	engineerService.validateAndSave(dto5);
	
	engineerRepository.isFound("Amruth");

	
}
}
