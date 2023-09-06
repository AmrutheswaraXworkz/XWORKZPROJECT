package com.xworkz.chandrayana.app.service;

import com.xworkz.chandrayana.app.repository.LocationRepository;

public class LocationServiceImpl implements LocationService {
	private LocationRepository locationRepository;

	public LocationServiceImpl(LocationRepository locationRepository) {
		super();
		this.locationRepository = locationRepository;
	}

	@Override
	public boolean save(String names) {
		if(names!=null && !names.isEmpty() && names.length()>3)
		{
			if(!locationRepository.isThere(names)) {
				this.locationRepository.saveLoc(names);
				System.out.println("can store");
				return true;
			}
			else {
				System.err.println("cant store duplicate values");
			}
		}
		else {
			System.err.println("cant store as it is invalid");
		}
		return false;
	}
}
