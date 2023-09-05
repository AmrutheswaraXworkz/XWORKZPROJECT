package com.xworkz.chandrayana.app.service;

import com.xworkz.chandrayana.app.repository.ArtistRepository;

public class ArtistServiceImpl implements ArtistService{
	private ArtistRepository artistRepository;
	
	public ArtistServiceImpl(ArtistRepository artistRepository) {
		// TODO Auto-generated constructor stub
		super();
		this.artistRepository=artistRepository;
	}
	
	
	
	@Override
	public boolean check(String features) {
		if(features!=null && !features.isEmpty() && features.length()>2) {
			System.out.println("valid input");
			this.artistRepository.features(features);
		}
		else {
			System.out.println("invalid input");
		}
		
	
		return false;
	}

}
