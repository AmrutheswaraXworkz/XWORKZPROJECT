package com.xworkz.dto.boot;


import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.app.dto.KnifeDTO;


public class KnifeMain {

	public static void main(String[] args) {
		KnifeDTO knife1 = new KnifeDTO("Pocket Knife", "Stainless Steel", 3.5, true);
		KnifeDTO knife2 = new KnifeDTO("Chef's Knife", "High Carbon Steel", 8.0, false);
		KnifeDTO knife3 = new KnifeDTO("Hunting Knife", "Damascus Steel", 5.5, true);
		KnifeDTO knife4 = new KnifeDTO("Bread Knife", "Serrated Stainless Steel", 7.0, false);
		KnifeDTO knife5 = new KnifeDTO("Throwing Knife", "High Carbon Steel", 6.0, true);
		KnifeDTO knife6 = new KnifeDTO("Throwing Knife", "High Carbon Steel", 6.0, true);
		KnifeDTO knife7 = new KnifeDTO("Cleaver", "Carbon Steel", 6.5, false);
		KnifeDTO knife8 = new KnifeDTO("Knife", "Carbon steel", 7.5, true);

		List<KnifeDTO> collection = new LinkedList<KnifeDTO>();

		collection.add(knife1);
		collection.add(knife2);
		collection.add(knife3);
		collection.add(knife4);
		collection.add(knife5);
		collection.add(knife6);
		collection.add(knife7);

//		System.out.println(collection.stream().sorted().count());
//		collection.stream().collect(Collectors.toSet()).forEach(a -> System.out.println(a));
		
		collection.add(3, knife8);
		collection.forEach(c->System.out.println(c));
		
		List<KnifeDTO> collection1 = new LinkedList<KnifeDTO>();
		collection1.add(knife5);
		collection1.add(knife8);
		System.out.println("================");
		collection1.addAll(2, collection);
		collection1.forEach(s->System.out.println(s));
		System.out.println("================");
		System.out.println(collection1.get(2));
		System.out.println("================");
		System.out.println(collection1.indexOf(knife5));
		System.out.println("================");
		collection1.subList(0, 6).forEach(c->System.out.println(c));
		System.out.println("================");
		System.out.println(collection1.set(2, knife8));
		
		
		
		
	}
}
