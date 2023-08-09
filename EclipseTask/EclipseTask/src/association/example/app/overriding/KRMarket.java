package association.example.app.overriding;

public class KRMarket extends Market{
	@Override
	public void purchase() {
		System.out.println("Calling SUB class method with no-arg ");
	}

	@Override
	public void purchase(String name) {
		System.out.println("Calling SUB class method with String-arg ");
		System.out.println("NAME OF Veg : " + name);
	}

	@Override
	public void purchase(String name, double cost) {
		System.out.println("Calling SUB class method with String,double-arg ");
		System.out.println("NAME OF Veg : " + name);
		System.out.println("COST : " + name);
	}

	@Override
	public void purchase(double kg) {
		System.out.println("Calling SUB class method with double-arg ");
		System.out.println("KG : " + kg);
	}

	@Override
	public void purchase(int variety) {
		System.out.println("Calling SUB class method with int-arg ");
		System.out.println("Varieties : " + variety);
	}

	@Override
	public void purchase(String name, int variety) {
		System.out.println("Calling SUB class method with String,int-arg ");
		System.out.println("NAME OF Veg : " + name);
		System.out.println("variety : " + variety);
	}
}
