package com.xworkz.encapsul.boot;

import com.xworkz.encapsul.app.Ola;

public class OlaMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in Ola");
		
		Ola ola=new Ola();
		
		ola.setCompanyName("Ola");
		System.out.println(ola.getCompanyName());
		
		ola.setHeadquarters("Bengaluru");
		System.out.println(ola.getHeadquarters());
		
		ola.setRegisteredDrivers(500);
		System.out.println(ola.getRegisteredDrivers());
		
		ola.setSupportedCities(30);
		System.out.println(ola.getSupportedCities());
		
		ola.setTypesofVehiclesAvailable(5);
		System.out.println(ola.getTypesofVehiclesAvailable());
		
		ola.setHasEmergency(true);
		System.out.println(ola.isHasEmergency());
		
		ola.setHasMobileApp(true);
		System.out.println(ola.isHasMobileApp());
		
		ola.setOffersLuxuryCar(false);
		System.out.println(ola.isOffersLuxuryCar());
		
		ola.setOffersOlaAuto(true);
		System.out.println(ola.isOffersOlaAuto());
		
		ola.setOffersRide(false);
        System.out.println(ola.isOffersRide());
        
        ola.setProvidesInCar(true);
        System.out.println(ola.isProvidesInCar());
        
        ola.setProvidesOlaRentals(false);
        System.out.println(ola.isProvidesOlaRentals());
        
        ola.setSupportsCashlessPayments(true);
        System.out.println(ola.isSupportsCashlessPayments());
        
        ola.setSupportsOutstation(false);
        System.out.println(ola.isSupportsOutstation());
        
    
        
	}

}
