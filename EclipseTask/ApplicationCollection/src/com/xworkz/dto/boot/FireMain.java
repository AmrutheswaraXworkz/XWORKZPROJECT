package com.xworkz.dto.boot;



import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.FireDTO;


public class FireMain {

	public static void main(String[] args) {

		FireDTO fire1 = new FireDTO("Forest Fire A", "Forest A", 80, false);
		FireDTO fire2 = new FireDTO("House Fire B", "Street B", 60, true);
		FireDTO fire3 = new FireDTO("Wildfire C", "Wilderness C", 90, false);
		FireDTO fire4 = new FireDTO("Industrial Fire D", "Industrial Area D", 75, true);
		FireDTO fire5 = new FireDTO("Brush Fire E", "Grassland E", 70, false);
		FireDTO fire6 = new FireDTO("Apartment Fire F", "Street F", 55, true);
		FireDTO fire7 = new FireDTO("Campfire G", "Campsite G", 40, true);
		FireDTO fire8 = new FireDTO("Campfire G", "Campsite G", 40, true);

		Collection<FireDTO> collection = new HashSet<FireDTO>();
		collection.add(fire1);
		collection.add(fire2);
		collection.add(fire3);
		collection.add(fire4);
		collection.add(fire5);
		collection.add(fire6);
		collection.add(fire7);
		collection.add(fire8);

		System.out.println(collection.stream().sorted().count());
		collection.stream().collect(Collectors.toSet()).forEach(a -> System.out.println(a));

	}
}
