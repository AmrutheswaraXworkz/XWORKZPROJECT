package com.xworkz.dto.boot;


import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.BridgeDTO;



public class BridgeMain {

	public static void main(String[] args) {
		BridgeDTO bridge1 = new BridgeDTO("Golden Gate Bridge", "Suspension", 2737, true);
		BridgeDTO bridge2 = new BridgeDTO("Golden Gate Bridge", "Suspension", 2737, true);
		BridgeDTO bridge3 = new BridgeDTO("Tower Bridge", "Bascule and Suspension", 244, true);
		BridgeDTO bridge4 = new BridgeDTO("Sydney Harbour Bridge", "Arch", 1149, true);
		BridgeDTO bridge5 = new BridgeDTO("Charles Bridge", "Stone", 621, true);
		BridgeDTO bridge6 = new BridgeDTO("Millau Viaduct", "Cable-stayed", 2460, true);
		BridgeDTO bridge7 = new BridgeDTO("Akashi Kaikyō Bridge", "Suspension", 1991, true);

		Collection<BridgeDTO> collection = new HashSet<BridgeDTO>();

		collection.add(bridge1);
		collection.add(bridge2);
		collection.add(bridge3);
		collection.add(bridge4);
		collection.add(bridge5);
		collection.add(bridge6);
		collection.add(bridge7);

		System.out.println(collection.stream().sorted().count());
		collection.stream().collect(Collectors.toSet()).forEach(a -> System.out.println(a));

	}
}

