package association.example.app.overriding;

public class Temple {
	public void prayer() {
		System.out.println("Calling PARENT class method with no-arg");
	}

	public void prayer(String templeName) {
		System.out.println("Calling PARENT class method with String-arg");
		System.out.println("Temple Name : " + templeName);
	}

	public void prayer(String templeName, String location) {
		System.out.println("Calling PARENT class method with String,String-arg");
		System.out.println("Temple Name : " + templeName);
		System.out.println("Temple Location : " + location);
	}

	public void prayer(double openTiming) {
		System.out.println("Calling PARENT class method with double-arg");
		System.out.println("Temple Open Timings : " + openTiming);
	}

	public void prayer(double openTiming, double closeTiming) {
		System.out.println("Calling PARENT class method with double,double-arg");
		System.out.println("Temple Open Timings : " + openTiming);
		System.out.println("Temple close Timings : " + closeTiming);
	}

	public void prayer(String templeName, double entranceFee) {
		System.out.println("Calling PARENT class method with String,double-arg");
		System.out.println("Temple Name : " + templeName);
		System.out.println("Entrance Fee : " + entranceFee);
		
	}
}
