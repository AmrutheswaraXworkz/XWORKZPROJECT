package association.example.app.task;

public class CricketRunner {

	public static void main(String[] args) {
		Players player1 = new Players("Virat", "35", "Delhi");
		Cricket cricket = new Cricket();
		cricket.setPlayers(player1);
		System.out.println(cricket.getPlayers());
		player1.association();
	}

}
