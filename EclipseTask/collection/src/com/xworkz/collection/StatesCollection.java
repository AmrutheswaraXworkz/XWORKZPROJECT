package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StatesCollection {
	
	    public static void main(String[] args) {
	        // Create an ArrayList to store the states of India
	        Collection<String> indianStates = new ArrayList<String>();

	        // Add the 29 states of India to the ArrayList
	        indianStates.add("Andhra Pradesh");
	        indianStates.add("Arunachal Pradesh");
	        indianStates.add("Assam");
	        indianStates.add("Bihar");
	        indianStates.add("Chhattisgarh");
	        indianStates.add("Goa");
	        indianStates.add("Gujarat");
	        indianStates.add("Haryana");
	        indianStates.add("Himachal Pradesh");
	        indianStates.add("Jharkhand");
	        indianStates.add("Karnataka");
	        indianStates.add("Kerala");
	        indianStates.add("Madhya Pradesh");
	        indianStates.add("Maharashtra");
	        indianStates.add("Manipur");
	        indianStates.add("Meghalaya");
	        indianStates.add("Mizoram");
	        indianStates.add("Nagaland");
	        indianStates.add("Odisha");
	        indianStates.add("Punjab");
	        indianStates.add("Rajasthan");
	        indianStates.add("Sikkim");
	        indianStates.add("Tamil Nadu");
	        indianStates.add("Telangana");
	        indianStates.add("Tripura");
	        indianStates.add("Uttar Pradesh");
	        indianStates.add("Uttarakhand");
	        indianStates.add("West Bengal");
	        
	        
	        Iterator<String> states=indianStates.iterator();
	        while(states.hasNext()) {
	        	String state=states.next();
	        	System.out.println("states of india are:"+state);
	        }

	    }
}
