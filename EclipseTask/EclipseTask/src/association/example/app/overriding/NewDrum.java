package association.example.app.overriding;

public class NewDrum extends Drum {
	@Override
	public void beats() {
		System.out.println("invoking beats in NewDrum");
	}

}
