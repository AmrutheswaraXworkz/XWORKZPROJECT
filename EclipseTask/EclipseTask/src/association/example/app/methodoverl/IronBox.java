package association.example.app.methodoverl;

public class IronBox {
public void ironBox() {
	System.out.println("invoking ironBox in IronBox with no arguments");
	ironBox(70);
	ironBox("Germany");
}
public void ironBox(int power) {
	System.out.println("invoking ironBox with int");
	System.out.println("power is:"+power);
}
public void ironBox(String country) {
	System.out.println("invoking ironBox with String");
	System.out.println("origin of the country is:"+country);
}
public void ironBox(int power,String origin) {
	System.out.println("invoking ironBox with int and String");
	ironBox(power);
	ironBox(origin);
}
}
