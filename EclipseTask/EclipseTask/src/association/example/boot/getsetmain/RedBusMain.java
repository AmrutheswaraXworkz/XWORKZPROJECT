package com.xworkz.encapsul.boot;

import com.xworkz.encapsul.app.RedBus;

public class RedBusMain {

	public static void main(String[] args) {
		System.out.println("Invoking main in redbus");
		
		RedBus red=new RedBus();
		red.setCompanyName("RedBus");
		System.out.println(red.getCompanyName());
		
		red.setHeadquarters("New Delhi");
		System.out.println(red.getHeadquarters());
		
		red.setNumberofRoutes(600);
		System.out.println(red.getNumberofRoutes());
		
		red.setRegisteredUsers(500);
		System.out.println(red.getRegisteredUsers());
		
		red.setSupportedCities(60);
		System.out.println(red.getSupportedCities());
		
		red.setHasMobileApp(true);
		System.out.println(red.isHasMobileApp());
		
		red.setOffersAC(false);
		System.out.println(red.isOffersAC());
		
		red.setOffersBusTicket(true);
		System.out.println(red.isOffersBusTicket());
		
		red.setOffersBusTracking(true);
        System.out.println(red.isOffersBusTracking());
        
        red.setProvidesCancellation(false);
        System.out.println(red.isProvidesCancellation());
        
        red.setProvidesCustomerSupport(false);
        System.out.println(red.isProvidesCustomerSupport());
        
        red.setProvidesSeatSelection(true);
        System.out.println(red.isProvidesSeatSelection());
        
        red.setSupportsMultipleBus(true);
        System.out.println(red.isSupportsMultipleBus());
        
        red.setSupportsOnlinePayments(true);
        System.out.println(red.isSupportsOnlinePayments());
	}
}
