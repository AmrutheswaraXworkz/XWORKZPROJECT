package com.xworkz.dto.app.boot;

import com.xworkz.dto.app.dto.NewspaperDto;
import com.xworkz.dto.app.repository.NewsPapersRepository;

import com.xworkz.dto.app.repository.NewspaperRepositoryImpl;
import com.xworkz.dto.app.service.NewspaperService;
import com.xworkz.dto.app.service.NewspaperServiceImpl;

public class NewspaperRunner {
public static void main(String[] args) {
	NewsPapersRepository newspaperRepository=new NewspaperRepositoryImpl();
	NewspaperService newspaperService=new NewspaperServiceImpl(newspaperRepository);
	

	NewspaperDto dtos=new NewspaperDto("Amruth",25,"Times of India",10);
	boolean save=newspaperService.validateAndSave(dtos);
	System.out.println("saved:"+save);
	
	
}
}
