package com.xworkz.chandrayana.app.repository;

public class PatientRepositoryImpl implements PatientRepository {

	int i;
	String[] name=new String[TOTAL_WARD];
	public void admit(String name) {
		if(i<TOTAL_WARD) {
			this.name[i]=name;
			System.out.println("name of the patient in ward number:"+(this.i+1)+" is "+name);
			this.i++;
		}
		else {
			System.err.println("ward is full sorry :(");
		}
		

	}

}
