package association.example.app.overriding;

public class IskconTemple extends Temple {
	public void prayer() {
		System.out.println("Calling SUB class method with no-arg");
	}

	@Override
	public void prayer(String templeName) {
		System.out.println("Calling SUB class method with String-arg");
		System.out.println("Temple Name : " + templeName);
	}

	@Override
	public void prayer(String templeName, String location) {
		System.out.println("Calling SUB class method with String,String-arg");
		System.out.println("Temple Name : " + templeName);
		System.out.println("Temple Location : " + location);
	}

	@Override
	public void prayer(double openTiming) {
		System.out.println("Calling SUB class method with double-arg");
		System.out.println("Temple Open Timings : " + openTiming);
	}

	@Override
	public void prayer(double openTiming, double closeTiming) {
		System.out.println("Calling SUB class method with double,double-arg");
		System.out.println("Temple Open Timings : " + openTiming);
		System.out.println("Temple close Timings : " + closeTiming);
	}

	@Override
	public void prayer(String templeName, double entranceFee) {
		System.out.println("Calling SUB class method with String,double-arg");
	}
}
