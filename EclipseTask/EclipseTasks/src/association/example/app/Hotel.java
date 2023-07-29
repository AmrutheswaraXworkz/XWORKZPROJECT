package association.example.app;

public class Hotel {
	public Cook cook=new Cook();
	
	public void food() {
		System.out.println("invoking food in Hotel");
		if(this.cook!=null) {
			this.cook.cooking();
			this.cook.salary();
		}
	}

}
