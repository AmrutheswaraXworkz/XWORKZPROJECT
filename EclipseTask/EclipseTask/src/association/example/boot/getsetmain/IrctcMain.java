package com.xworkz.encapsul.boot;

import com.xworkz.encapsul.app.Irctc;

public class IrctcMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in IRCTC");
		
		Irctc irctc=new Irctc();
		
		irctc.setCompanyName("IRCTC");
		System.out.println(irctc.getCompanyName());
		
		irctc.setHeadquartersLocation("New Delhi");
		System.out.println(irctc.getHeadquartersLocation());
		
		irctc.setLanguagesSupported(15);
		System.out.println(irctc.getLanguagesSupported());
		
		irctc.setnumberofTrains(100);
		System.out.println(irctc.getNumberofTrains());
		
		irctc.setRegisteredUsers(4000);
		System.out.println(irctc.getRegisteredUsers());
		
		irctc.setHasMobileApp(true);
		System.out.println(irctc.isHasMobileApp());

		irctc.setCustomerSupport(true);
		System.out.println(irctc.isCustomerSupport());
		
		irctc.setOffersOnlineTicketBooking(true);
		System.out.println(irctc.isOffersOnlineTicketBooking());
		
		irctc.setOffersSpecialDiscounts(false);
		System.out.println(irctc.isOffersSpecialDiscounts());
		
		irctc.setOffersSpecialDiscounts(false);
		System.out.println(irctc.isOffersTourismPackages());
		
		irctc.setPaymentOptions(true);
		System.out.println(irctc.isPaymentOptions());
		
		irctc.setProvidesEcatering(true);
		System.out.println(irctc.isProvidesEcatering());
		
		irctc.setProvidesTravelInsurance(false);
		System.out.println(irctc.isProvidesTravelInsurance());
		
		irctc.setSeatSelection(true);
		System.out.println(irctc.isSeatSelection());
		
	}

}
