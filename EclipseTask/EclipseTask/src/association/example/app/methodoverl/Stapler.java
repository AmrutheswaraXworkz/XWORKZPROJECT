package association.example.app.methodoverl;

public class Stapler {
	public void stapler() {
		System.out.println("invoking stapler from Stapler without arguements");
		stapler(10);
		stapler("ironman");

	}
	public void stapler(int quantity) {
		System.out.println("invoking stapler with int");
		System.out.println("quantity is:"+quantity);
	}
	public void stapler(String name) {
		System.out.println("invoking stapler with String");
		System.out.println("name of the stapler"+name);
	}
	public void stapler(int quantity,String name) {
		System.out.println("invoking stapler with int and String");
		stapler(quantity);
		stapler(name);
	}
}
