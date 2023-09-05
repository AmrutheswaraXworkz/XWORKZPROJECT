package com.xworkz.chandrayana.app.service;

import com.xworkz.chandrayana.app.repository.PatientRepository;

public class PatientServiceImpl implements PatientService {

	PatientRepository patientRepository;
	public PatientServiceImpl(PatientRepository patientRepository) {
		super();
		this.patientRepository=patientRepository;
	}
	@Override
	public boolean check(String name) {
		if(name!=null&& !name.isEmpty() && name.length()>3)
		{
			System.out.println("valid input");
			this.patientRepository.admit(name);
		}else {
			System.out.println("invalid");
		}
		return false;
	}

}
