package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.DoctorDto;

public class DoctorRepositoryImpl implements DoctorRepository {

	int position;
	private DoctorDto[] doctorDto=new DoctorDto[TOTAL];
	@Override
	public void saveInfo(DoctorDto doctorDto) {
		if(position<TOTAL) {
			this.doctorDto[position]=doctorDto;
			System.out.println(doctorDto+" is stored in position "+this.position);
			this.position++;
		}
		else {
			System.err.println("out of storage cannot store");
		}
		
	}

}
