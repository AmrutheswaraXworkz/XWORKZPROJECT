package association.example.app.overriding;

public class Mall {
	public void brand() {
		System.out.println("Calling Parent Class method of No-arg....");
	}

	public void brand(String name) {
		System.out.println("Calling Parent Class method of String-arg....");
		System.out.println("Mall NAME : " + name);
	}

	public void brand(String name, int floornumber) {
		System.out.println("Calling Parent Class method of String,int-arg....");
		System.out.println("BRAND NAME : " + name);
		System.out.println("Floor Number : " + floornumber);
	}

	public void brand(boolean hasFoodCourt) {
		System.out.println("Calling Parent Class method of boolean-arg....");
		System.out.println("HAS FOOD COURT : " + hasFoodCourt);
	}

	public void brand(String name, boolean hasTheater) {
		System.out.println("Calling Parent Class method of String,booelan-arg....");
		System.out.println("Mall NAME : " + name);
		System.out.println("HAS Theater : " + hasTheater);
	}

	public void brand(int totalNoOfFloor) {
		System.out.println("Calling Parent Class method of int-arg....");
		System.out.println("Total number of Floor  : " + totalNoOfFloor);
	}
}
