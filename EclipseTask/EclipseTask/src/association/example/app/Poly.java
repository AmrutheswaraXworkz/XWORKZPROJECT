package association.example.app;

public class Poly extends TaskPoly{
	
	@Override
	public void addition(int num1, int num2) {
		int sub=num1-num2;
		System.out.println("substraction using overriding is:"+sub);
	}
	
	public static void main(String[] args) {
		Poly poly=new Poly();
		poly.addition(12, 10);
	}

}
