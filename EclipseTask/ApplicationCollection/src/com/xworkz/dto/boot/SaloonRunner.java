package com.xworkz.dto.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.app.dto.SaloonDto;

public class SaloonRunner {

	public static void main(String[] args) {
		SaloonDto saloon1 = new SaloonDto(1, "Image", 50, "Daily", true);
		SaloonDto saloon2 = new SaloonDto(2, "Hi Handsome", 60, "Weekly", true);
		SaloonDto saloon3 = new SaloonDto(3, "The Hair Heaven", 40, "Monthly", true);
		SaloonDto saloon4 = new SaloonDto(4, "Beauty", 70, "Daily", false);
		SaloonDto saloon5 = new SaloonDto(5, "Cut and Curl", 55, "Monthly", true);
		SaloonDto saloon6 = new SaloonDto(6, "Glam", 75, "Weekly", false);
		SaloonDto saloon7 = new SaloonDto(7, "Hair Studio", 45, "Monthly", true);
		SaloonDto saloon8 = new SaloonDto(8, "Classic Cuts", 65, "Daily", false);
		SaloonDto saloon9 = new SaloonDto(9, "The Salon", 70, "Weekly", true);
		SaloonDto saloon10 = new SaloonDto(10, "Loreal", 55, "Daily", false);

		
		Collection<SaloonDto> salon=new ArrayList<SaloonDto>();
		salon.add(saloon1);
		salon.add(saloon2);
		salon.add(saloon3);
		salon.add(saloon4);
		salon.add(saloon5);
		salon.add(saloon6);
		salon.add(saloon7);
		salon.add(saloon8);
		salon.add(saloon9);
		salon.add(saloon10);
		
//		for(SaloonDto salonDto:salon) {
//			System.out.println(salonDto);
//		}
		
		Iterator<SaloonDto> itr=salon.iterator();
		while(itr.hasNext()) {
			SaloonDto salons=itr.next();
			System.out.println(salons);
		}
		
		SaloonDto saloon11 = new SaloonDto(9, "The Salon", 70, "Weekly", true);
		SaloonDto saloon12 = new SaloonDto(10, "Loreal", 55, "Daily", false);
		Collection<SaloonDto> newSaloon=new ArrayList<SaloonDto>();
		newSaloon.add(saloon11);
		newSaloon.add(saloon12);
		System.out.println("Contain all:"+salon.containsAll(newSaloon));
		System.out.println("Contains:"+newSaloon.contains(saloon11));
		System.out.println("Remove:"+salon.remove(saloon10));
		System.out.println("Remove all:"+salon.removeAll(newSaloon));
	}
}
