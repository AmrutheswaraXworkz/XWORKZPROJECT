package association.example.app;

public class Garage {
	Mechanic mechanic=new Mechanic();
	public void garage() {
		System.out.println("invoking garage from Garage");
		this.mechanic.name();
		this.mechanic.exp();
		
		
	}

}
