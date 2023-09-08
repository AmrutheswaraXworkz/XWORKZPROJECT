package com.xworkz.dto.app.boot;

import com.xworkz.dto.app.dto.DoctorDto;
import com.xworkz.dto.app.repository.DoctorRepository;
import com.xworkz.dto.app.repository.DoctorRepositoryImpl;
import com.xworkz.dto.app.service.DoctorService;
import com.xworkz.dto.app.service.DoctorServiceImpl;

public class DoctorRunner {
public static void main(String[] args) {
	
	DoctorRepository doctorRepository=new DoctorRepositoryImpl();
	DoctorService doctorService=new DoctorServiceImpl(doctorRepository);
	DoctorDto dDto=new DoctorDto("DR.Amruth", 15,"Jayanagar", 34);
	
	boolean persisted=doctorService.validSave(dDto);
	System.out.println("Is Stored? "+persisted);
}
}
