package association.example.app;

public class PowerBank {
	Battery battery=new Battery();
	public void power() {
		System.out.println("invoking power from PowerBank");
		this.battery.capacity();
		this.battery.stores();
	}

}
