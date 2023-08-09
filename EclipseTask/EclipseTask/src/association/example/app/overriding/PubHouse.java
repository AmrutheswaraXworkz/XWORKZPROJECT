package association.example.app.overriding;

public class PubHouse extends Pub {
	@Override
	public void pub() {
		System.out.println("pub method in derived class");
	}

	@Override
	public void pub(String name) {
		System.out.println("pub name in derived class: " + name);
	}

	@Override
	public void pub(String name, int pubOpeningTime) {
		System.out.println("pub name in derived class: " + name);
		System.out.println("pub opening time in derived class: " + name);
	}

	@Override
	public void pub(String name, int pubOpeningTime, String location) {
		System.out.println("pub name in derived class: " + name);
		System.out.println("pub opening time in derived class: " + name);
		System.out.println("pub location time in derived class: " + location);
	}

	@Override
	public void pub(String name, int pubOpeningTime, String location, String city) {
		System.out.println("pub name in derived class: " + name);
		System.out.println("pub opening time in derived class: " + name);
		System.out.println("pub location in derived class: " + location);
		System.out.println("pub city in derived class: " + city);
	}

	@Override
	public void pub(String name, int pubOpeningTime, String location, String city, int ageEligible) {
		System.out.println("pub name in derived class: " + name);
		System.out.println("pub opening time in derived class: " + name);
		System.out.println("pub location in derived class: " + location);
		System.out.println("pub city in derived class: " + city);
		System.out.println("pub ageEligible in derived class: " + ageEligible);
	}

}
