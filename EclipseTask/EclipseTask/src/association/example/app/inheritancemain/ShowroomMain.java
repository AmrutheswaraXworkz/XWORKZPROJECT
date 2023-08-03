package association.example.app.inheritancemain;

import association.example.app.inheritance.showroom.*;
import association.example.app.inheritance.util.ShowroomUtil;

public class ShowroomMain {

	public static void main(String[] args) {
		Showroom showroom = new Showroom();
		System.out.println(showroom.openTiming);

		ShowroomUtil showroomUtil = new ShowroomUtil();
		showroomUtil.showroomUtil(showroom);

		WatchShowroom showroom2 = new WatchShowroom();
		showroomUtil.showroomUtil(showroom2);
		System.out.println(showroom2.watchName);

		MobileShowroom mobileShowroom = new MobileShowroom();
		showroomUtil.showroomUtil(mobileShowroom);
		System.out.println(mobileShowroom.price);
	}

}
