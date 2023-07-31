package association.example.app;

public class Sports {
	public String name;
	public Player[] players;

	public Sports(String name, Player[] players) {
		this.name = name;
		this.players = players;

	}

	public void printInfo() {
		System.out.println("Running sports info");
		System.out.println("Name :" + this.name);

		

		for (int sport = 0; sport < this.players.length; sport++) {
			Player ref = players[sport];
			ref.printInfo();
			
			
		}
	}


}
