package association.example.app.overriding;

public class NewGate extends Gate {
	@Override
	public void secure() {
		System.out.println("invoking secure in NewGate that gate is used to secure");
		
	}
	

}
