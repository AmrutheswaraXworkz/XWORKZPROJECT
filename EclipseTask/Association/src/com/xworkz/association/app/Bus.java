package com.xworkz.association.app;

public class Bus {
	private Passenger passenger;
	private double busNumber;

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
		System.out.println("passengers has tickets: " + passenger);
	}

	public void setBusNumber(double busNumber) {
		this.busNumber = busNumber;
		System.out.println("Bus number: " + busNumber);
	}

	public void busName() {
		System.out.println("Bus name");
		this.passenger.ticket();
	}
}
