package association.example.app;
public class Building {
	public Floor[] floors;
	public Lift[] lifts;

	public Building(Floor[] floors, Lift[] lifts) {
		this.floors = floors;
		this.lifts = lifts;
	}

	public void printInfo() {
		System.out.println("Invoking Buildding info");
		System.out.println("Floors in the  building are");
		for (int floor = 0; floor < this.floors.length; floor++) {
			Floor ref = floors[floor];
			ref.printInfo();
		}
		System.out.println("Lifts in the building are");
		for (int lift = 0; lift< this.lifts.length; lift++) {
			Lift ref1= lifts[lift];
			ref1.printInfo();
		}

	}

}
