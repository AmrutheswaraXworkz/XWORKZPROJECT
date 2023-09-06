package com.xworkz.chandrayana.app.repository;

public class LocationRepositoryImpl implements LocationRepository {

	private String[] names = new String[NO];
	int pos;

	@Override
	public void saveLoc(String name) {
		if (pos < NO) {
			this.names[pos] = name;
			System.out.println("Loaction:" + name + " are stored");
			this.pos++;

		}
		else {
			System.err.println("out of storage");
		}
	}

	@Override
	public boolean isThere(String name) {
		for(int a=0;a<=this.pos;a++) {
			String temp=names[a];
			if(temp!=null && temp.equals(name)) {
				System.out.println("it can be stored");
				return true;
			}
		}
		return LocationRepository.super.isThere(name);
	}
}
