package association.example.app;

public class Store {
	Salesman salesman=new Salesman();
	public void store() {
		System.out.println("invoking store form Store");
		this.salesman.product();
		this.salesman.travel();
	}

}
