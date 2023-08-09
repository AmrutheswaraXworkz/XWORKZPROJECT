package association.example.boot.override;

import association.example.app.overriding.Hostel;
import association.example.app.overriding.LadiesHostel;

public class HostelMain {
	public static void main(String[] args) {
		Hostel hostel = new Hostel();

		hostel.roomFacility();
		hostel.roomFacility(5000);
		hostel.roomFacility("UBDT");
		hostel.roomFacility(1000, 90);
		hostel.roomFacility("UBDT", 2000, 109);
		System.out.println("HAS Security : " + hostel.roomFacility(true));
		
		System.out.println("..........override with PARENT class ref.................");

		Hostel hostel1 = new LadiesHostel();

		hostel1.roomFacility();
		hostel1.roomFacility(300);
		hostel1.roomFacility("BIET");
		hostel1.roomFacility(100, 80);
		hostel1.roomFacility("BIET", 2000, 205);
		System.out.println("HAS Security : " + hostel1.roomFacility(false));
		
		System.out.println("..........override with SUB class ref.................");

		LadiesHostel hostel2 = new LadiesHostel();

		hostel2.roomFacility();
		hostel2.roomFacility(100);
		hostel2.roomFacility("GMIT");
		hostel2.roomFacility(780, 90);
		hostel2.roomFacility("GMIT", 907, 505);
		System.out.println("HAS Security : " + hostel2.roomFacility(true));

	}
}
