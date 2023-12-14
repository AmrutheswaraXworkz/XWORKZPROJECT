package com.xworkz.dto.boot;


import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.CrackerDTO;



public class CrackerMain {

	public static void main(String[] args) {
		CrackerDTO cracker1 = new CrackerDTO("Popcorn Cracker", "Small", true, 2);
		CrackerDTO cracker2 = new CrackerDTO("Popcorn Cracker", "Small", true, 2);
		CrackerDTO cracker3 = new CrackerDTO("Whistle Cracker", "Medium", false, 3);
		CrackerDTO cracker4 = new CrackerDTO("Sparkler", "Small", false, 1);
		CrackerDTO cracker5 = new CrackerDTO("Thunder Bomb", "Extra Large", true, 5);
		CrackerDTO cracker6 = new CrackerDTO("Sizzling Spinner", "Medium", true, 4);
		CrackerDTO cracker7 = new CrackerDTO("Silent Cracker", "Small", false, 1);

		Collection<CrackerDTO> collection = new HashSet<CrackerDTO>();
		collection.add(cracker1);
		collection.add(cracker2);
		collection.add(cracker3);
		collection.add(cracker4);
		collection.add(cracker5);
		collection.add(cracker6);
		collection.add(cracker7);

		System.out.println(collection.stream().sorted().count());
		collection.stream().collect(Collectors.toSet()).forEach(a -> System.out.println(a));
	}
}
