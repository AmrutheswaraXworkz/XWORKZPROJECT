package association.example.boot.getsetmain;

import association.example.app.getset.Rapido;

public class RapidoMain {
	public static void main(String[] args) {
		Rapido rapido = new Rapido();
		rapido.setHeadQuaters("Bengalore");
		System.out.println(rapido.getHeadQuaters());

		rapido.setFounder("Aravind Sanka");
		System.out.println(rapido.getFounder());

		rapido.setStartYear(2015);
		System.out.println(rapido.getStartYear());

		rapido.setCeo("Aravind Sanka");
		System.out.println(rapido.getCeo());

		rapido.setBookRide(true);
		System.out.println(rapido.isBookRide());

		rapido.setDriverName("Santosh");
		System.out.println(rapido.getDriverName());

		rapido.setCustomerName("Amruth");
		System.out.println(rapido.getCustomerName());

		rapido.setValidOTP(true);
		System.out.println(rapido.isValidOTP());

		rapido.setOnlinePayment(true);
		System.out.println(rapido.isOnlinePayment());

		rapido.setCashPayment(true);
		System.out.println(rapido.isCashPayment());

		rapido.setAvailableAnyTime(true);
		System.out.println(rapido.isAvailableAnyTime());

		rapido.setTwoWheeler(true);
		System.out.println(rapido.isTwoWheeler());

		rapido.setSourceAddress("Jayanagar");
		System.out.println(rapido.getSourceAddress());

		rapido.setDestinationAddress("Rajajinagar");
		System.out.println(rapido.getDestinationAddress());

	}
}
