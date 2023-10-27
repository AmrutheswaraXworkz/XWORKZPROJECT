package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CitiesCollection {

	public static void main(String[] args) {
		Collection<String> citiesInIndia=new ArrayList<String>();
		
		citiesInIndia.add("Mumbai");
        citiesInIndia.add("Delhi");
        citiesInIndia.add("Bangalore");
        citiesInIndia.add("Kolkata");
        citiesInIndia.add("Chennai");
        citiesInIndia.add("Hyderabad");
        citiesInIndia.add("Pune");
        citiesInIndia.add("Ahmedabad");
        citiesInIndia.add("Jaipur");
        citiesInIndia.add("Lucknow");
        citiesInIndia.add("Kanpur");
        citiesInIndia.add("Chandigarh");
        citiesInIndia.add("Bhopal");
        citiesInIndia.add("Indore");
        citiesInIndia.add("Nagpur");
        citiesInIndia.add("Surat");
        citiesInIndia.add("Agra");
        citiesInIndia.add("Varanasi");
        citiesInIndia.add("Kochi");
        citiesInIndia.add("Goa");
        
        Iterator<String> cities=citiesInIndia.iterator();
        while(cities.hasNext()) {
        	String city=cities.next();
        	System.out.println("Cities in india are:"+city);
        }

	}
}
