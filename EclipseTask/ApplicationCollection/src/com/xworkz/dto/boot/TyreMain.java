package com.xworkz.dto.boot;


import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.TyreDTO;


public class TyreMain {

	public static void main(String[] args) {
		Collection<TyreDTO> collection = new HashSet<TyreDTO>();
		collection.add(new TyreDTO("205/60R16", "All-Season", "Symmetrical", 32));
		collection.add(new TyreDTO("195/65R15", "Summer", "Asymmetrical", 34));
		collection.add(new TyreDTO("225/55R17", "Winter", "Directional", 30));
		collection.add(new TyreDTO("195/65R15", "Summer", "Asymmetrical", 34));
		collection.add(new TyreDTO("215/70R16", "All-Season", "Symmetrical", 31));
		collection.add(new TyreDTO("225/45R18", "Performance", "Asymmetrical", 36));
		collection.add(new TyreDTO("195/60R14", "All-Season", "Symmetrical", 28));

		System.out.println(collection.stream().sorted().count());
		collection.stream().collect(Collectors.toSet()).forEach(a -> System.out.println(a));
	}
}
