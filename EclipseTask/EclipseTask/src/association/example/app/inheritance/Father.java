package association.example.app.inheritance;

public class Father extends GrandFather {
	public String fName = "appa";

	public void father() {
		System.out.println("invoking father from Father through Son");

	}

}
