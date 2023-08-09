package association.example.app.overriding;

public class StreetRoad extends Street {
	@Override
	public void street() {
		System.out.println("street method in derived clsss");
	}

	@Override
	public void street(String streetName) {
		System.out.println("street name in derived clsss: " + streetName);
	}

	@Override
	public void street(String streetName, double streetLength) {
		System.out.println("street name in derived clsss: " + streetName);
		System.out.println("street length in derived clsss: " + streetLength);
	}

	@Override
	public void street(String streetName, double streetLength, String state) {
		System.out.println("street name in derived clsss: " + streetName);
		System.out.println("street length in derived clsss: " + streetLength);
		System.out.println("street state in derived clsss: " + state);
	}

	@Override
	public void street(String streetName, double streetLength, String state, String streetArea) {
		System.out.println("street name in derived clsss: " + streetName);
		System.out.println("street length in derived clsss: " + streetLength);
		System.out.println("street state in derived clsss: " + state);
		System.out.println("street area in derived clsss: " + streetArea);
	}

	@Override
	public void street(String streetName, double streetLength, String state, String streetArea, double squareFeet) {
		System.out.println("street name in derived clsss: " + streetName);
		System.out.println("street length in derived clsss: " + streetLength);
		System.out.println("street state in derived clsss: " + state);
		System.out.println("street area in derived clsss: " + streetArea);
		System.out.println("street square feet in derived clsss: " + squareFeet);
	}
}
