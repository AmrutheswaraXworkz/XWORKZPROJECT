package association.example.app;

public class Hotel {
	Cook cook=new Cook();
	public void hotel(String string, int i) {
		System.out.println("invoking hotel from Hotel");
		this.cook.cooking();
		this.cook.salary();
	}

}

