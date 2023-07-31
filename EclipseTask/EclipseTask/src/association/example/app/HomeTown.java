package association.example.app;

public class HomeTown {
	public String name;
	public int pinCode;
	public Area[] area;

	public HomeTown(String name, int pinCode, Area[] area) {
		this.name = name;
		this.pinCode = pinCode;
		this.area = area;
	}

	public void printInfo() {
		System.out.println("Invoking hometown info");
		System.out.println("Building Name is:" + name);
		System.out.println("Pincode:" + pinCode);
		System.out.println("Areas are:");
		for (int home = 0; home< this.area.length; home++) {
			Area ref = area[home];
			ref.printInfo();

		}

	}


}
