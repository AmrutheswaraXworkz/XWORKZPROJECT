package com.xworkz.chandrayana.boot.service;

import com.xworkz.chandrayana.app.repository.GroceryRepository;
import com.xworkz.chandrayana.app.repository.GroceryRepositoryImpl;
import com.xworkz.chandrayana.app.service.GroceryService;
import com.xworkz.chandrayana.app.service.GroceryServiceImpl;

public class GroceryServiceMain {
	public static void main(String[] args) {
		 GroceryRepository groceryRepository=new GroceryRepositoryImpl();
		 
		 GroceryService groceryService=new GroceryServiceImpl(groceryRepository);
		 String[] a = { "orange", " ", "choc", "jeera", "tomato", "juice", "toothpaste", "rice", "jowar", "chips",
			"salt" };
	for (int i = 0; i < a.length; i++) {
		groceryService.check(a[i]);																																																									
	}
	}

}
