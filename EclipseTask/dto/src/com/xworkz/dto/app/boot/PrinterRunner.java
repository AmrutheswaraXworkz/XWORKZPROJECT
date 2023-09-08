package com.xworkz.dto.app.boot;

import com.xworkz.dto.app.dto.PrinterDto;
import com.xworkz.dto.app.repository.PrinterRepository;
import com.xworkz.dto.app.repository.PrinterRepositoryImpl;
import com.xworkz.dto.app.service.PrinterService;
import com.xworkz.dto.app.service.PrinterServiceImpl;

public class PrinterRunner {
public static void main(String[] args) {
	PrinterRepository printerRepository=new PrinterRepositoryImpl();
	PrinterService printerService=new PrinterServiceImpl(printerRepository);
	PrinterDto pDto=new PrinterDto("philips", 5, 25000, "red");
	
	
	boolean save=printerService.validSave(pDto);
	System.out.println("Is Saved? "+save);
}
}
