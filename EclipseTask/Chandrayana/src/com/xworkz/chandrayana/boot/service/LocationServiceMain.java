package com.xworkz.chandrayana.boot.service;

import com.xworkz.chandrayana.app.repository.LocationRepository;
import com.xworkz.chandrayana.app.repository.LocationRepositoryImpl;
import com.xworkz.chandrayana.app.service.LocationService;
import com.xworkz.chandrayana.app.service.LocationServiceImpl;

public class LocationServiceMain {
public static void main(String[] args) {
	
	LocationRepository locationRepository=new LocationRepositoryImpl();
	LocationService locationService=new LocationServiceImpl(locationRepository);
	String[] location= {"hubli","hubli","banglore","durga"};
	for(int a=0;a<location.length;a++) {
		locationService.save(location[a]);
		
	}
}
}
