package com.xworkz.chandrayana.app.repository;

public class PlacesRepositoryImpl implements PlacesRepository {

	int city;
	String[] name=new String[NUMBER];
	@Override
	public void place(String name) {
	if(city<NUMBER) {
		this.name[city]=name;
		System.out.println("places are "+name+" in "+this.city);
		this.city++;
	}

	}

}
