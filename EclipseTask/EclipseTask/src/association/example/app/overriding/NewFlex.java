package association.example.app.overriding;

public class NewFlex extends Flex {
	@Override
	public void flex() {
		System.out.println("invoking flex in NewFlex");
	}

}
