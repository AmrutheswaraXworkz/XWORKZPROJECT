package com.xworkz.chandrayana.boot.service;

import com.xworkz.chandrayana.app.repository.PatientRepository;
import com.xworkz.chandrayana.app.repository.PatientRepositoryImpl;
import com.xworkz.chandrayana.app.service.PatientService;
import com.xworkz.chandrayana.app.service.PatientServiceImpl;

public class PatientServiceMain {
public static void main(String[] args) {
	PatientRepository patientRepository=new PatientRepositoryImpl();
	PatientService patientService=new PatientServiceImpl(patientRepository);
	String[] a= {"Amruth","Gagan","Nitish","Manoj","Darshan","Sachin","Ambi"};
	System.out.println("total number of wards are:"+PatientRepository.TOTAL_WARD);
	for(int i=0;i<a.length;i++) {
		patientService.check(a[i]);
	}
}
}
