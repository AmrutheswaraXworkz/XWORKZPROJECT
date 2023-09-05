package com.xworkz.chandrayana.app.service;

import com.xworkz.chandrayana.app.repository.GroceryRepository;

public class GroceryServiceImpl implements GroceryService {

	private GroceryRepository goceryRepository;
	
	 public GroceryServiceImpl(GroceryRepository goceryRepository) {
		super();
		this.goceryRepository=goceryRepository;
		
	}
	@Override
	public boolean check(String grocery) {
		if(grocery!=null && !grocery.isEmpty() && grocery.length()>2) {
			System.out.println("grocery item is valid");
			this.goceryRepository.save(grocery);
		}
		else {
			System.out.println("invalid input");
		}
		return false;
		
		

	}

}
