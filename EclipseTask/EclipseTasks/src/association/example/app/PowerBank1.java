package association.example.app;

public class PowerBank1 {
	public Battery battery=new Battery();
	
	public void charge() {
		System.out.println("invoking charge in PowerBank");
		if(this.battery!=null) {
			this.battery.capacity();
			this.battery.heat();
		}
		else {
			System.out.println("this.battery is null");
		}
	}

}