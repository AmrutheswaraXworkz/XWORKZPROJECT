package com.xworkz.chandrayana.app.service;

import com.xworkz.chandrayana.app.repository.PlacesRepository;

public class PlaceServiceImpl implements PlaceService {

	PlacesRepository placesRepository;
	
	public PlaceServiceImpl(PlacesRepository placesRepository) {
		super();
		this.placesRepository=placesRepository;
	}
	@Override
	public boolean check(String name) {
		if(name!=null&& !name.isEmpty() && name.length()>3)
		{
			System.out.println("valid input");
			this.placesRepository.place(name);
		}else {
			System.out.println("invalid");
		}
		return false;
	}

}
