package com.xworkz.assignment24.boot;

import com.xworkz.assignme24.encapsulation.app.metro.Metro;

public class MetroMain {
	public static void main(String[] args) {
		Metro metro = new Metro();
		metro.setName("Bengalore metro");
		System.out.println(metro.getName());

		metro.setLocation("Mejestic");
		System.out.println(metro.getLocation());

		metro.setStartPoint("Mejestic");
		System.out.println(metro.getStartPoint());

		metro.setStartPoint("Rajajinager");
		System.out.println(metro.getDestinationPoint());

		metro.setStartYear(2015);
		System.out.println(metro.getStartYear());

		metro.setOpenTime(7);
		System.out.println(metro.getOpenTime());

		metro.setCloseTime(11);
		System.out.println(metro.getCloseTime());

		metro.setState("Karnata");
		System.out.println(metro.getState());

		metro.setMetroCity("Bengalore");
		System.out.println(metro.getMetroCity());

		metro.setStartYear(2015);
		System.out.println(metro.getStartYear());

		metro.setPrice(30);
		System.out.println(metro.getPrice());

		metro.setStartYear(2015);
		System.out.println(metro.getStartYear());

		metro.setTrainColor("White");
		System.out.println(metro.getTrainColor());

		metro.setWorkers(true);
		System.out.println(metro.isWorkers());

		metro.setOnlinePayment(true);
		System.out.println(metro.isOnlinePayment());

		metro.setTimeSaving(true);
		System.out.println(metro.isTimeSaving());

	}
}
