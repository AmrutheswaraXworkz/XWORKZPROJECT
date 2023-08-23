package association.example.implement.app;

public class MetroImplement implements Metro {

	@Override
	public void time() {
		System.out.println("invoking time in MetroImplement.....");
		
		
	}

	@Override
	public void train(int no) {
		System.out.println("invoking train in MetroImplement");
	
		
		
	}

	@Override
	public void ticket(long price) {
		System.out.println("invoking ticket in MetroImplement");
		
		
	}

	@Override
	public void silence(boolean isSilence) {
		System.out.println("invoking silence in MetroImplement");
		
	}

	@Override
	public void route() {
		System.out.println("invoking route in MetroImplement");
		
	}
	
	

}
