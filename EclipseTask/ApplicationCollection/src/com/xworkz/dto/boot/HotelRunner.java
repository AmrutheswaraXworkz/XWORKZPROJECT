package com.xworkz.dto.boot;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.HotelDTO;

public class HotelRunner {

	public static void main(String[] args) {
		
		HotelDTO hotel1=new HotelDTO(1, "Udupi Hotel", "Manjunatha", 28.5, "India");
		HotelDTO hotel2=new HotelDTO(2, "Mangalore Hotel", "Kashinath", 30, "India");
		HotelDTO hotel3=new HotelDTO(3, "Khanavali", "Basappa", 25, "India");
		HotelDTO hotel4=new HotelDTO(4, "Ravana Hotel", "Ravana", 28.5, "Srilanka");
		HotelDTO hotel5=new HotelDTO(5, "Kumbakarana Hotel", "Kumbakarana", 23.5, "Srilanka");
		HotelDTO hotel6=new HotelDTO(6, "Hotel lanka", "Lankesh", 27, "Srilanka");
		HotelDTO hotel7=new HotelDTO(7, "Food", "Mark", 26, "USA");
		HotelDTO hotel8=new HotelDTO(8, "EatGood", "Antony", 25, "USA");
		HotelDTO hotel9=new HotelDTO(9, "Spend and Eat", "Leo", 22.5, "UK");
		HotelDTO hotel10=new HotelDTO(10, "Food Land", "Charles", 33.5, "UK");
		
		Collection<HotelDTO> hotels=new ArrayList<HotelDTO>();
		
		hotels.add(hotel1);
		hotels.add(hotel2);
		hotels.add(hotel3);
		hotels.add(hotel4);
		hotels.add(hotel5);
		hotels.add(hotel6);
		hotels.add(hotel7);
		hotels.add(hotel8);
		hotels.add(hotel9);
		hotels.add(hotel10);
		
		hotels.stream().filter((dto)->dto.getLocation().equals("India")).map(dto->dto.getName()).forEach(c->System.out.println("hotel of india:"+c));
		hotels.stream().filter((dto)->dto.getLocation().equals("Srilanka")).map(dto->dto.getName()).forEach(c->System.err.println("hotels of srilanka:"+c));
		hotels.stream().map(dto->dto.getOwnerName()).forEach(c->System.out.println("owner name:"+c));
		hotels.stream().map(dto->dto.getGst()).forEach(c->System.err.println("GST:"+c));
		hotels.stream().filter((dto)->dto.getLocation().equals("UK")).map(dto->dto.getId()).forEach(c->System.out.println("Id of UK hotels:"+c));
		hotels.stream().filter((dto)->dto.getLocation().equals("USA")).map(dto->dto.getOwnerName()).forEach(c->System.out.println("Ownername of hotel in USA:"+c));

		
		}
}
