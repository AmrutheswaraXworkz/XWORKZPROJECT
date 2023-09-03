package com.xworkz.chandrayana.boot;

import com.xworkz.chandrayana.app.repository.PlacesRepositoryImpl;

public class PlacesRunner {
	public static void main(String[] args) {
		PlacesRepositoryImpl place=new PlacesRepositoryImpl();
		String[] abc= {"hampi","tajmahal","qutubminar","davangere"};
		for(int i=0;i<abc.length;i++) {
			place.place(abc[i]);
		}
	}

}
