package association.example.app.task;

public class Cricket {
	private Players players;

	public Cricket() {
		System.out.println("Task on association!!!");
	}

	public Players getPlayers() {
		return players;
	}

	public void setPlayers(Players players) {
		this.players = players;
	}

}
