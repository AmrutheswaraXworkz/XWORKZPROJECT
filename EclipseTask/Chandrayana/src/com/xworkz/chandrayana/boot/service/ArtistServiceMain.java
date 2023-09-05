package com.xworkz.chandrayana.boot.service;

import com.xworkz.chandrayana.app.repository.ArtistRepository;
import com.xworkz.chandrayana.app.repository.ArtistRepositoryImpl;

import com.xworkz.chandrayana.app.service.ArtistService;
import com.xworkz.chandrayana.app.service.ArtistServiceImpl;


public class ArtistServiceMain {
public static void main(String[] args) {
	 ArtistRepository artistRepository=new ArtistRepositoryImpl();
	 ArtistService artistService=new ArtistServiceImpl(artistRepository);
	 String[] features = { "good", "portrait", "sketch", "shades","12" };
		for (int j = 0; j < features.length; j++) {
			artistService.check(features[j]);

		}
	 


}
}
