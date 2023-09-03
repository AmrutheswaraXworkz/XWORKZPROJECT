package com.xworkz.chandrayana.boot;

import com.xworkz.chandrayana.app.repository.GroceryRepository;
import com.xworkz.chandrayana.app.repository.GroceryRepositoryImpl;

public class GroceryRunner {
	public static void main(String[] args) {
		GroceryRepository groceryRepo = new GroceryRepositoryImpl();
		String[] a = { "orange", "onion", "choc", "jeera", "tomato", "juice", "toothpaste", "rice", "jowar", "chips",
				"salt" };
		for (int i = 0; i < a.length; i++) {
			groceryRepo.save(a[i]);																																																									
		}

	}

}
