package association.example.app;

public class Store {
	public Salesman salesman=new Salesman();
	public void store() {
		System.out.println("invoking store from Store");
		if(this.salesman!=null) {
			this.salesman.product();
			this.salesman.id();
		}
		
	}

}
