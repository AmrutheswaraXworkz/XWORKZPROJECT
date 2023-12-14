package com.xworkz.dto.boot;


import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.PinDTO;


public class PinMain {

	public static void main(String[] args) {
		PinDTO pin1 = new PinDTO("110001", "New Delhi", "Delhi", true);
		PinDTO pin2 = new PinDTO("400001", "Mumbai", "Maharashtra", true);
		PinDTO pin3 = new PinDTO("700001", "Kolkata", "West Bengal", true);
		PinDTO pin4 = new PinDTO("380001", "Ahmedabad", "Gujarat", true);
		PinDTO pin5 = new PinDTO("500001", "Hyderabad", "Telangana", true);
		PinDTO pin6 = new PinDTO("380001", "Ahmedabad", "Gujarat", true);
		PinDTO pin7 = new PinDTO("560001", "Bengaluru", "Karnataka", true);

		Collection<PinDTO> collection = new HashSet<PinDTO>();

		collection.add(pin1);
		collection.add(pin2);
		collection.add(pin3);
		collection.add(pin4);
		collection.add(pin5);
		collection.add(pin6);
		collection.add(pin7);

		System.out.println(collection.stream().sorted().count());
		collection.stream().collect(Collectors.toSet()).forEach(a -> System.out.println(a));
	}
}
