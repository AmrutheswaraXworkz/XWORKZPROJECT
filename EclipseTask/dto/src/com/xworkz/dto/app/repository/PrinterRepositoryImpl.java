package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.PrinterDto;

public class PrinterRepositoryImpl implements PrinterRepository {

	int position;
	private PrinterDto[] printerDto=new PrinterDto[TOTAL];
	@Override
	public void save(PrinterDto printerDto) {
		if(position<TOTAL) {
			this.printerDto[position]=printerDto;
			System.out.println(printerDto+" is stored :)");
			this.position++;
		}
		else {
			System.err.println("cant store.memory full");
		}
		
		
	}

}
