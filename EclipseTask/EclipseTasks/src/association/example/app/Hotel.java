package association.example.app;

public class Hotel {
	Cook cook=new Cook();
	public void hotel() {
		System.out.println("invoking hotel from Hotel");
		this.cook.cooking();
		this.cook.salary();
	}

}
