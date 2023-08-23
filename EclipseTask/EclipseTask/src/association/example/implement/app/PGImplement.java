package association.example.implement.app;

public class PGImplement implements PG {

	@Override
	public void timings() {
		System.out.println("invoking timings in PGImplement");
	}

	@Override
	public void rent(int rent) {
		System.out.println("invoking rent in PGImplement");		
	}

	@Override
	public void smoking(boolean isSmoke) {
		System.out.println("invoking smoking in PGImplement");		
	}

	@Override
	public void drinking(boolean isDrink) {
		System.out.println("invoking drinking in PGImplement");		
	}

	@Override
	public void advance(int advance) {
		System.out.println("invoking advance in PGImplement");		
	}
	
	
	

}
