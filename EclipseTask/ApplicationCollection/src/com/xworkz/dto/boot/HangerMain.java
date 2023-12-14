package com.xworkz.dto.boot;


import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.HangerDTO;


public class HangerMain {

	public static void main(String[] args) {

		HangerDTO hangar1 = new HangerDTO("Hangar A", "Private", 10, true);
		HangerDTO hangar2 = new HangerDTO("Hangar A", "Private", 10, true);
		HangerDTO hangar3 = new HangerDTO("Hangar C", "Military", 30, true);
		HangerDTO hangar4 = new HangerDTO("Hangar D", "Private", 15, false);
		HangerDTO hangar5 = new HangerDTO("Hangar E", "Commercial", 25, true);
		HangerDTO hangar6 = new HangerDTO("Hangar F", "Military", 35, false);
		HangerDTO hangar7 = new HangerDTO("Hangar G", "Private", 12, true);

		Collection<HangerDTO> collection = new HashSet<HangerDTO>();

		collection.add(hangar1);
		collection.add(hangar2);
		collection.add(hangar3);
		collection.add(hangar4);
		collection.add(hangar5);
		collection.add(hangar6);
		collection.add(hangar7);

		System.out.println(collection.stream().sorted().count());
		collection.stream().collect(Collectors.toSet()).forEach(a -> System.out.println(a));
	}
}
