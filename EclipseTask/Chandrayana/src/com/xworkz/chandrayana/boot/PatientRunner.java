package com.xworkz.chandrayana.boot;

import com.xworkz.chandrayana.app.repository.PatientRepositoryImpl;

public class PatientRunner {
	public static void main(String[] args) {
		PatientRepositoryImpl patient=new PatientRepositoryImpl();
		String[] a= {"Amruth","Gagan","Nitish","Manoj","Darshan","Sachin","Ambi"};
		System.out.println("total number of wards are:"+patient.TOTAL_WARD);
		for(int i=0;i<a.length;i++) {
			patient.admit(a[i]);
		}
	}

}
