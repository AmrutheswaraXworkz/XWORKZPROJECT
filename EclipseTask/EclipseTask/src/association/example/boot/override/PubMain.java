package association.example.boot.override;

import association.example.app.overriding.Pub;
import association.example.app.overriding.PubHouse;

public class PubMain {
	public static void main(String[] args) {
		Pub pub = new Pub();
		pub.pub();
		pub.pub("Josh");
		pub.pub("Josh",7);
		pub.pub("Josh",7,"Shivanagar");
		pub.pub("Josh",7,"Shivanagar","Bengalore");
		pub.pub("Josh",7,"Shivanagar","Bengalore",21);
		
		System.out.println("\n");
		
		Pub pub2 = new PubHouse();
		pub2.pub();
		pub2.pub("Mathira");
		pub2.pub("Mathira",6);
		pub2.pub("Mathira",6,"rajajinagar");
		pub2.pub("Mathira",6,"rajajinagar","Bengalore");
		pub2.pub("Mathira",6,"rajajinagar","Bengalore",21);
	}

}
