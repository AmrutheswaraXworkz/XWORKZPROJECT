package com.xworkz.dto.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.app.dto.TheaterDTO;

public class TheaterRunner {
	public static void main(String[] args) {
		TheaterDTO theater = new TheaterDTO("Narthaki", 200, "Banglore", 200);
		TheaterDTO theater1 = new TheaterDTO("Vasanta", 300, "Davangere", 150);
		TheaterDTO theater2 = new TheaterDTO("Movie Time", 250, "Davangere", 250);
		TheaterDTO theater3 = new TheaterDTO("PVR", 400, "Banglore", 300);
		TheaterDTO theater4 = new TheaterDTO("Trishul", 300, "Davangere", 100);

		Collection<TheaterDTO> theaters = new LinkedList<TheaterDTO>();
		theaters.add(theater);
		theaters.add(theater1);
		theaters.add(theater2);
		theaters.add(theater3);
		theaters.add(theater4);
		theaters.stream().forEach(b -> System.out.println(b));
		System.out.println("After sorting based on price!!!");
		theaters.stream().sorted().forEach(c -> System.out.println(c));

	}

}
