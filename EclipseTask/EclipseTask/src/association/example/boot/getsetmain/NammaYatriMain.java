package association.example.boot.getsetmain;

import association.example.app.getset.Yatri;

public class NammaYatriMain {
	public static void main(String[] args) {
		Yatri yatri = new Yatri();
		yatri.setFounder("Vimal Kumar");
		System.out.println(yatri.getFounder());

		yatri.setStartYear(2022);
		System.out.println(yatri.getStartYear());

		yatri.setBookRide(true);
		System.out.println(yatri.isBookRide());
		yatri.setDriverName("Santosh");
		System.out.println(yatri.getDriverName());

		yatri.setCustomerName("Harish");
		System.out.println(yatri.getCustomerName());

		yatri.setValidOTP(false);
		System.out.println(yatri.isValidOTP());

		yatri.setOnlinePayment(true);
		System.out.println(yatri.isOnlinePayment());

		yatri.setCashPayment(true);
		System.out.println(yatri.isCashPayment());

		yatri.setSourceAddress("Rajajinagar");
		System.out.println(yatri.getSourceAddress());

		yatri.setDestinationAddress("Yalahanka");
		System.out.println(yatri.getDestinationAddress());

		yatri.setAvailableAnyTime(true);
		System.out.println(yatri.isAvailableAnyTime());

		yatri.setAuto(true);
		System.out.println(yatri.isAuto());

		yatri.setAppVailable(true);
		System.out.println(yatri.isAppVailable());

	}
}
