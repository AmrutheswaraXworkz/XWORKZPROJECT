package com.xworkz.chandrayana.app.repository;

public class PolticianRepositoryImpl implements PolticianRepository {

	int index;
	String[] name=new String[cases];
	@Override
	public void name(String name) {
 
		if(index<cases) {
			this.name[index]=name;
			System.out.println("politician in position "+this.index+" is "+name);
			this.index++;
			
		}
	}

}
