package association.example.app;

public class Player {
	public String name;
	public int exp;
	public Building building;
	public HomeTown town;

	public Player(String name, int exp, Building building, HomeTown town) {
		this.name = name;
		this.exp = exp;
		this.building = building;
		this.town = town;

	}

	public void printInfo() {
		System.out.println("Invoking printInfo in Player");
		System.out.println("Player Name is:" + name);
		System.out.println("Experience:" + exp);
		
		town.printInfo();
		building.printInfo();

	}

	

}
