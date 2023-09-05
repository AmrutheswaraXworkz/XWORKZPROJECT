package com.xworkz.chandrayana.boot.service;

import com.xworkz.chandrayana.app.repository.PlacesRepository;
import com.xworkz.chandrayana.app.repository.PlacesRepositoryImpl;
import com.xworkz.chandrayana.app.service.PlaceService;
import com.xworkz.chandrayana.app.service.PlaceServiceImpl;

public class PlaceServiceMain {
public static void main(String[] args) {
	
	PlacesRepository placesRepository=new PlacesRepositoryImpl();
	PlaceService placeService=new PlaceServiceImpl(placesRepository);
	String[] abc= {"hampi","tajmahal","qutubminar","davangere"};
	for(int i=0;i<abc.length;i++) {
		placeService.check(abc[i]);
	}
}
}
