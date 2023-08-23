package association.example.implement.app;

public class PGImplement implements PG {

	@Override
	public String noBoysAllowed() {

		return "BOYS NOT ALLOWED";
	}

	@Override
	public boolean hasWashingMachine() {

		return true;
	}

	@Override
	public double rent() {

		return 5000;	
	}
	
	
	

}
