package association.example.app.overriding;

public class Market {
	public void purchase() {
		System.out.println("Calling PARENT class method with no-arg ");
	}

	public void purchase(String name) {
		System.out.println("Calling PARENT class method with String-arg ");
		System.out.println("NAME OF Veg : " + name);
	}

	public void purchase(String name, double cost) {
		System.out.println("Calling PARENT class method with String,double-arg ");
		System.out.println("NAME OF Veg : " + name);
		System.out.println("COST : " + name);
	}

	public void purchase(double kg) {
		System.out.println("Calling PARENT class method with double-arg ");
		System.out.println("KG : " + kg);
	}

	public void purchase(int variety) {
		System.out.println("Calling PARENT class method with int-arg ");
		System.out.println("Varieties : " + variety);
	}

	public void purchase(String name, int variety) {
		System.out.println("Calling PARENT class method with String,int-arg ");
		System.out.println("NAME OF Veg : " + name);
		System.out.println("variety : " + variety);
	}
}
