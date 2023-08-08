package association.example.app.overriding;

public class NewDinosaur extends Dinosaur {
	@Override
	public void extinct() {
		System.out.println("invoking extinct in NewDinosaur that dinosaur extincted");
		
	}

}
