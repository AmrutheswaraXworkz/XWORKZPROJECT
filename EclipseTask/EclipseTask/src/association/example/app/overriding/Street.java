package association.example.app.overriding;

public class Street {
	public void street() {
		System.out.println("street method in super clsss");
	}

	public void street(String streetName) {
		System.out.println("street name in super clsss: " + streetName);
	}

	public void street(String streetName, double streetLength) {
		System.out.println("street name in super clsss: " + streetName);
		System.out.println("street length in super clsss: " + streetLength);
	}

	public void street(String streetName, double streetLength, String state) {
		System.out.println("street name in super clsss: " + streetName);
		System.out.println("street length in super clsss: " + streetLength);
		System.out.println("street state in super clsss: " + state);
	}

	public void street(String streetName, double streetLength, String state, String streetArea) {
		System.out.println("street name in super clsss: " + streetName);
		System.out.println("street length in super clsss: " + streetLength);
		System.out.println("street state in super clsss: " + state);
		System.out.println("street area in super clsss: " + streetArea);
	}

	public void street(String streetName, double streetLength, String state, String streetArea, double squareFeet) {
		System.out.println("street name in super clsss: " + streetName);
		System.out.println("street length in super clsss: " + streetLength);
		System.out.println("street state in super clsss: " + state);
		System.out.println("street area in super clsss: " + streetArea);
		System.out.println("street square feet in super clsss: " + squareFeet);
	}
}
