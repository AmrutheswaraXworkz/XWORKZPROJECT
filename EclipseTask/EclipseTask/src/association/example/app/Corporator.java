package association.example.app;
public class Corporator {
	public Building[] buildings;
	public String name;

	public Corporator(String name, Building[] buildings) {
		this.name = name;
		this.buildings = buildings;
	}

	public void printInfo() {
		System.out.println("Invoking  Corporator info");
		System.out.println("Corporator Name is:" + name);
		for (int corp= 0; corp< this.buildings.length; corp++) {
			Building build = buildings[corp];
			build.printInfo();

		}
	}


}
