package association.example.app.overriding;

public class Hostel {
	public void roomFacility() {
		System.out.println("Calling PARENT class method with no-arg");
	}

	public void roomFacility(String hotelName) {
		System.out.println("Calling PARENT class method with String-arg");
		System.out.println("Name Of Hotel : " + hotelName);
	}

	public void roomFacility(int noOfRooms) {
		System.out.println("Calling PARENT class method with int-arg");
		System.out.println("Number OF Room : " + noOfRooms);
	}

	public void roomFacility(int noOfRooms, int roomNumber) {
		System.out.println("Calling PARENT class method with int,int-arg");
		System.out.println("NO of Rooms : " + noOfRooms);
		System.out.println("Room Number : " + roomNumber);
	}

	public void roomFacility(String hotelName, int noOfRooms, int roomNumber) {
		System.out.println("Calling PARENT class method with String,int,int-arg");
		System.out.println("Name Of Hotel : " + hotelName);
		System.out.println("NO of Rooms : " + noOfRooms);
		System.out.println("Room Number : " + roomNumber);
	}

	public boolean roomFacility(boolean hasSecurity) {
		System.out.println("Calling PARENT class method with boolean-arg");
		return true;
	}
}
