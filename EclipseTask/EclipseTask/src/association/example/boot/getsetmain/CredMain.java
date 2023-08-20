package association.example.boot.getsetmain;

import association.example.app.getset.Cred;

public class CredMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in cred");
		
		Cred cred=new  Cred();
		
		cred.setCompanyName("CRED");
		System.out.println(cred.getCompanyName());
		
		cred.setHeadquarters("California");
		System.out.println(cred.getHeadquarters());
		
		cred.setNumberofCreditCards(10);
		System.out.println(cred.getNumberofCreditCards());
		
		cred.setRegisteredUsers(15);
		System.out.println(cred.getRegisteredUsers());
		
		cred.setSupportedCities(20);
		System.out.println(cred.getSupportedCities());
		
		cred.setHasMobileApp(true);
		System.out.println(cred.isHasMobileApp());
		
		cred.setHasSecurity(false);
		System.out.println(cred.isHasSecurity());
		
		cred.setOffersCreditCard(true);
		System.out.println(cred.isOffersCreditCard());
		
		cred.setOffersCreditScore(true);
		System.out.println(cred.isOffersCreditScore());
		
		cred.setOffersServices(false);
        System.out.println(cred.isOffersServices());
        
        cred.setProvidesBillReminders(true);
        System.out.println(cred.isProvidesBillReminders());
        
        cred.setProvidesRewards(false);
        System.out.println(cred.isProvidesRewards());
        
        cred.setSupportsMultipleBanks(true);
        System.out.println(cred.isSupportsMultipleBanks());
        
        cred.setSupportsUPIPayments(true);
        System.out.println(cred.isSupportsUPIPayments());
	}

}
