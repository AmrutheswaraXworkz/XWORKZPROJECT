package association.example.app.methodoverl;

public class Uta {
	public void hotel() {
		System.out.println("invoking hotel in Hotel with no arguments");
		hotel("kottureswara benne dose hotel");
		hotel(50);
	}
	public void hotel(String name) {
		System.out.println("invoking hotel with String");
		System.out.println("name of the hotel is:"+name);
	}
	public void hotel(int price) {
		System.out.println("invoking hotel with int");
		System.out.println("price at the hotel:"+price);
	}
	public void hotel(String name,int price) {
		System.out.println("invoking hotel with String and int");
		hotel(name);
		hotel(price);
	}

}
