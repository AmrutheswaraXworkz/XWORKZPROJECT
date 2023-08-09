package association.example.app.overriding;

public class PoliceStation {
	public void station() {
		System.out.println("statiion in super class");
	}

	public void station(String name) {
		System.out.println("statiion name in super class: " + name);
	}

	public void station(String name, String area) {
		System.out.println("statiion name in super class: " + name);
		System.out.println("statiion area in super class: " + area);
	}

	public void station(String name, String area, int noOfPolice) {
		System.out.println("statiion name in super class: " + name);
		System.out.println("statiion area in super class: " + area);
		System.out.println("statiion noOfPolice in super class: " + noOfPolice);
	}

	public void station(String name, String area, int noOfPolice, String state) {
		System.out.println("statiion name in super class: " + name);
		System.out.println("statiion area in super class: " + area);
		System.out.println("statiion noOfPolice in super class: " + noOfPolice);
		System.out.println("statiion state in super class: " + state);
	}

	public void station(String name, String area, int noOfPolice, String state, boolean govtEmployee) {
		System.out.println("statiion name in super class: " + name);
		System.out.println("statiion area in super class: " + area);
		System.out.println("statiion noOfPolice in super class: " + noOfPolice);
		System.out.println("statiion state in super class: " + state);
		System.out.println("sgovtEmployee in super class: " + govtEmployee);
	}

}
