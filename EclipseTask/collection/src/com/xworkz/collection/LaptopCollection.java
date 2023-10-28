package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LaptopCollection {

	public static void main(String[] args) {
		Collection<String> laptopCollection=new ArrayList<String>();
		
		    laptopCollection.add("Acer Aspire 5");
	        laptopCollection.add("ASUS ZenBook 14");
	        laptopCollection.add("Dell XPS 13");
	        laptopCollection.add("HP Pavilion x360");
	        laptopCollection.add("Lenovo ThinkPad X1 Carbon");
	        laptopCollection.add("Apple MacBook Air");
	        laptopCollection.add("Microsoft Surface Laptop 4");
	        laptopCollection.add("MSI GS66 Stealth");
	        laptopCollection.add("Razer Blade 15");
	        laptopCollection.add("LG Gram 17");
	        laptopCollection.add("Acer Predator Helios 300");
	        laptopCollection.add("ASUS ROG Zephyrus G14");
	        laptopCollection.add("Dell Inspiron 15");
	        laptopCollection.add("HP Spectre x360");
	        laptopCollection.add("Lenovo Yoga C940");
	        laptopCollection.add("Apple MacBook Pro");
	        laptopCollection.add("Microsoft Surface Book 3");
	        laptopCollection.add("MSI Creator Z16");
	        laptopCollection.add("ASUS TUF Gaming A15");
	        laptopCollection.add("Acer Swift 3");
	        laptopCollection.add("Dell Alienware m15");
	        laptopCollection.add("Lenovo Legion 5");
	        laptopCollection.add("HP Envy x360");
	        laptopCollection.add("LG UltraFine 5K");
	        laptopCollection.add("Huawei MateBook X Pro");
	        laptopCollection.add("Google Pixelbook Go");
	        laptopCollection.add("ASUS VivoBook S15");
	        laptopCollection.add("Acer Chromebook Spin 13");
	        laptopCollection.add("Dell Latitude 9510");
	        laptopCollection.add("Microsoft Surface Pro 7");
	        laptopCollection.add("MSI Prestige 14");
	        laptopCollection.add("Acer Predator Triton 500");
	        laptopCollection.add("ASUS ROG Strix G15");
	        laptopCollection.add("HP Omen 15");
	        laptopCollection.add("Lenovo Ideapad L340");
	        laptopCollection.add("Apple MacBook Air M1");
	        laptopCollection.add("LG Gram 14");
	        laptopCollection.add("Dell XPS 15");
	        laptopCollection.add("Microsoft Surface Laptop Go");
	        laptopCollection.add("ASUS Chromebook Flip C434");
	        laptopCollection.add("Acer Aspire E15");
	        laptopCollection.add("HP EliteBook 840");
	        laptopCollection.add("Lenovo ThinkPad L14");
	        laptopCollection.add("ASUS ZenBook Pro Duo");
	        laptopCollection.add("Dell Precision 5550");
	        laptopCollection.add("MSI GE76 Raider");
	        laptopCollection.add("Acer Predator Helios 700");
	        laptopCollection.add("Lenovo Legion 7");
	        laptopCollection.add("ASUS ROG Zephyrus S17");
	        laptopCollection.add("Razer Blade Pro 17");
	        
	        Iterator<String> laptop=laptopCollection.iterator();
	        
	        while(laptop.hasNext()) {
	        	String lappy=laptop.next();
	        	System.out.println("Laptops are:"+lappy);
	        }
	        
	        System.out.println(laptopCollection.size());

	}
}
