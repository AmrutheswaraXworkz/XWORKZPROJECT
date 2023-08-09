package association.example.app.overriding;

public class ForumMall extends Mall{
	@Override
	public void brand() {
		System.out.println("Calling SUB Class method of No-arg....");
	}

	@Override
	public void brand(String name) {
		System.out.println("Calling SUB Class method of String-arg....");
		System.out.println("MALL NAME : " + name);
	}

	@Override
	public void brand(String name, int floornumber) {
		System.out.println("Calling SUB Class method of String,int-arg....");
		System.out.println("BRAND NAME : " + name);
		System.out.println("Floor Number : " + floornumber);
	}

	@Override
	public void brand(boolean hasFoodCourt) {
		System.out.println("Calling SUB Class method of boolean-arg....");
		System.out.println("HAS FOOD COURT : " + hasFoodCourt);
	}

	@Override
	public void brand(String name, boolean hasTheater) {
		System.out.println("Calling SUB Class method of String,booelan-arg....");
		System.out.println("MALL NAME : " + name);
		System.out.println("HAS Theater : " + hasTheater);
	}

	@Override
	public void brand(int totalNoOfFloor) {
		System.out.println("Calling SUB Class method of int-arg....");
		System.out.println("Total number of Floor  : " + totalNoOfFloor);
	}
}
