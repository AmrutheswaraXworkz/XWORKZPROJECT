package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class MobileCollection {

	
	

	
	    public static void main(String[] args) {
	        // Create an ArrayList to store the mobile numbers
	        Collection<String> mobileNumbers = new ArrayList<String>();

	       
	        mobileNumbers.add("123-456-7890");
	        mobileNumbers.add("987-654-3210");
	        mobileNumbers.add("555-555-5555");
	        mobileNumbers.add("888-888-8888");
	        mobileNumbers.add("777-777-7777");
	        mobileNumbers.add("444-444-4444");
	        mobileNumbers.add("666-666-6666");
	        mobileNumbers.add("111-111-1111");
	        mobileNumbers.add("222-222-2222");
	        mobileNumbers.add("333-333-3333");
	        mobileNumbers.add("999-999-9999");
	        mobileNumbers.add("123-789-4560");
	        mobileNumbers.add("555-123-4567");
	        mobileNumbers.add("777-123-4567");
	        mobileNumbers.add("888-987-6543");
	        mobileNumbers.add("654-321-1234");
	        mobileNumbers.add("111-222-3333");
	        mobileNumbers.add("777-888-9999");
	        mobileNumbers.add("555-444-3333");
	        mobileNumbers.add("444-555-6666");
	        mobileNumbers.add("333-222-1111");
	        mobileNumbers.add("123-456-7891");
	        mobileNumbers.add("987-654-3211");
	        mobileNumbers.add("555-555-5556");
	        mobileNumbers.add("888-888-8889");
	        mobileNumbers.add("777-777-7778");
	        mobileNumbers.add("444-444-4445");
	        mobileNumbers.add("666-666-6667");
	        mobileNumbers.add("111-111-1112");
	        mobileNumbers.add("222-222-2223");

	       Iterator<String> itr=mobileNumbers.iterator();
	       
	       while(itr.hasNext()) {
	    	   String name=itr.next();
	    	   System.out.println("mobile numbers are:"+name);
	       }
	        
	        
	        
	        }
	    
	}


