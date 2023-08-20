package association.example.boot.getsetmain;

import association.example.app.getset.Uber;

public class UberMain {
	public static void main(String[] args) {
		Uber uber = new Uber();
		uber.setHeadQuaters("San Francisco");
		System.out.println(uber.getHeadQuaters());

		uber.setFounder("Travis Kalanick");
		System.out.println(uber.getFounder());

		uber.setStartYear(2009);
		System.out.println(uber.getStartYear());

		uber.setCeo("Dara Khosrowshahi");
		System.out.println(uber.getCeo());

		uber.setCfo("Nelson Chai");
		System.out.println(uber.getCfo());

		uber.setBookRide(true);
		System.out.println(uber.isBookRide());

		uber.setBookRide(true);
		System.out.println(uber.isBookRide());

		uber.setValidOTP(true);
		System.out.println(uber.isValidOTP());

		uber.setOnlinePayment(true);
		System.out.println(uber.isOnlinePayment());

		uber.setCashPayment(true);
		System.out.println(uber.isCashPayment());

		uber.setAvailableAnyTime(true);
		System.out.println(uber.isAvailableAnyTime());

		uber.setDriverName("Santosh");
		System.out.println(uber.getDriverName());

		uber.setCustomerName("Santosh");
		System.out.println(uber.getCustomerName());

		uber.setSourceAddress("rajajinagar");
		System.out.println(uber.getSourceAddress());

		uber.setDestinationAddress("Mejestic");
		System.out.println(uber.getDestinationAddress());

	}
}
