package association.example.app.overriding;

public class NewTheater extends Theater {
	@Override
	public void film() {
		System.out.println("invoking film in NewTheater");
	}

}
