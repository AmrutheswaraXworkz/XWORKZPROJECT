package com.xworkz.dto.app.repository;

import com.xworkz.dto.app.dto.DoctorDto;

public interface DoctorRepository {

	int TOTAL=6;
	void saveInfo(DoctorDto doctorDto);
}
