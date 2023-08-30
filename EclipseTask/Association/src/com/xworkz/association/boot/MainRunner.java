package com.xworkz.association.boot;

import com.xworkz.association.app.Bus;
import com.xworkz.association.app.Button;
import com.xworkz.association.app.Charger;
import com.xworkz.association.app.Laptop;
import com.xworkz.association.app.LaptopProcessor;
import com.xworkz.association.app.Mobile;
import com.xworkz.association.app.Passenger;
import com.xworkz.association.app.Phant;
import com.xworkz.association.app.Processor;
import com.xworkz.association.app.Shirt;
import com.xworkz.association.app.Trainer;
import com.xworkz.association.app.Zip;

class MainRunner {
	public static void main(String[] args) {
		Trainer trainer = new Trainer("amruth");
		Laptop laptop = new Laptop();

		trainer.setLaptop(laptop);

		System.out.println();

		Shirt shirt = new Shirt('M');
		Button button = new Button();

		shirt.setButton(button);

		shirt.color();

		System.out.println();
		Bus bus = new Bus();
		Passenger passenger = new Passenger();

		bus.setBusNumber(187);
		bus.setPassenger(passenger);

		bus.busName();

		System.out.println();

		Mobile mobile = new Mobile("mi", 10000, 13, 64);

		Charger charger = new Charger();

		mobile.setCharger(charger);

		System.out.println();
		LaptopProcessor laptopProcessor = new LaptopProcessor("hp", 512, 10000, 250);

		Processor processor = new Processor();

		laptopProcessor.setProcess(processor);

		System.out.println();

		Zip zip = new Zip();
		Phant phant = new Phant(zip, 'M');

		phant.color();

	}
}
