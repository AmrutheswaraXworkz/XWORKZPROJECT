package association.example.app.overriding;

public class Zoo {
	public void zoo() {
		System.out.println("zoo in super class");
	}

	public void zoo(String name) {
		System.out.println("zoo name in super class: " + name);
	}

	public void zoo(String name, int openingTime) {
		System.out.println("zoo name in super class: " + name);
		System.out.println("zoo opening time in super class: " + openingTime);
	}

	public void zoo(String name, int openingTime, int closingTime) {
		System.out.println("zoo name in super class: " + name);
		System.out.println("zoo opening time in super class: " + openingTime);
		System.out.println("zoo closingTime in super class: " + closingTime);
	}

	public void zoo(String name, int openingTime, int closingTime, String state) {
		System.out.println("zoo name in super class: " + name);
		System.out.println("zoo opening time in super class: " + openingTime);
		System.out.println("zoo closingTime in super class: " + closingTime);
		System.out.println("zoo state in super class: " + state);
	}

	public void zoo(String name, int openingTime, int closingTime, String state, boolean animals) {
		System.out.println("zoo name in super class: " + name);
		System.out.println("zoo opening time in super class: " + openingTime);
		System.out.println("zoo closingTime in super class: " + closingTime);
		System.out.println("zoo state in super class: " + state);
		System.out.println("zoo contains animals in super class: " + animals);
	}

}
