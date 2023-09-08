package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.AdhaarDto;

public class AdhaarRepositoryImpl implements AdhaarRepository{

	int people;
	private AdhaarDto[] adhaarDto=new AdhaarDto[TOTAL_PEOPLE];
	@Override
	public void save(AdhaarDto adhaarDto) {
		if(this.people<TOTAL_PEOPLE) {
			this.adhaarDto[people]=adhaarDto;
			System.out.println(adhaarDto+" is stored");
			this.people++;
		}
		else {
			System.err.println("cant store,memory full....");
		}
		
	}

}
