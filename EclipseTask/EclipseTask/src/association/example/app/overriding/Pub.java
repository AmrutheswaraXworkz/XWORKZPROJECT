package association.example.app.overriding;

public class Pub {
	public void pub() {
		System.out.println("pub method in super class");
	}

	public void pub(String name) {
		System.out.println("pub name in super class: " + name);
	}

	public void pub(String name, int pubOpeningTime) {
		System.out.println("pub name in super class: " + name);
		System.out.println("pub opening time in super class: " + name);
	}

	public void pub(String name, int pubOpeningTime, String location) {
		System.out.println("pub name in super class: " + name);
		System.out.println("pub opening time in super class: " + name);
		System.out.println("pub location time in super class: " + location);
	}

	public void pub(String name, int pubOpeningTime, String location, String city) {
		System.out.println("pub name in super class: " + name);
		System.out.println("pub opening time in super class: " + name);
		System.out.println("pub location in super class: " + location);
		System.out.println("pub city in super class: " + city);
	}

	public void pub(String name, int pubOpeningTime, String location, String city, int ageEligible) {
		System.out.println("pub name in super class: " + name);
		System.out.println("pub opening time in super class: " + name);
		System.out.println("pub location in super class: " + location);
		System.out.println("pub city in super class: " + city);
		System.out.println("pub ageEligible in super class: " + ageEligible);
	}

}
