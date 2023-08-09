package association.example.app.overriding;

public class FireStation extends PoliceStation {
	@Override
	public void station() {
		System.out.println("statiion in derived class");
	}

	@Override
	public void station(String name) {
		System.out.println("statiion name in derived class: " + name);
	}

	@Override
	public void station(String name, String area) {
		System.out.println("statiion name in derived class: " + name);
		System.out.println("statiion area in derived class: " + area);
	}

	@Override
	public void station(String name, String area, int noOfPolice) {
		System.out.println("statiion name in derived class: " + name);
		System.out.println("statiion area in derived class: " + area);
		System.out.println("statiion noOfPolice in derived class: " + noOfPolice);
	}

	@Override
	public void station(String name, String area, int noOfPolice, String state) {
		System.out.println("statiion name in derived class: " + name);
		System.out.println("statiion area in derived class: " + area);
		System.out.println("statiion noOfPolice in derived class: " + noOfPolice);
		System.out.println("statiion state in derived class: " + state);
	}

	@Override
	public void station(String name, String area, int noOfPolice, String state, boolean govtEmployee) {
		System.out.println("statiion name in derived class: " + name);
		System.out.println("statiion area in derived class: " + area);
		System.out.println("statiion noOfPolice in derived class: " + noOfPolice);
		System.out.println("statiion state in derived class: " + state);
		System.out.println("sgovtEmployee in derived class: " + govtEmployee);
	}

}
