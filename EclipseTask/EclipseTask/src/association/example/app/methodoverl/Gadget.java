package association.example.app.methodoverl;

public class Gadget {
	public void gadget() {
		System.out.println("invoking gadget in Gadhet without arguements");
		gadget("Mobile");
		gadget(70000);
	}
	public void gadget(String name) {
		System.out.println("invoking gadget with String");
		System.out.println("name:"+name);
	}
	public void gadget(int price) {
		System.out.println("invoking gadget with int");
		System.out.println("price is:"+price);
	}
	public void gadget(String name,int price) {
		System.out.println("invoking gadget with String and int");
		gadget(name);
		gadget(price);
	}

}
