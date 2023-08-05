package association.example.boot;

import association.example.app.constructor.BlackCoffee;

public class CoffeeMain {
	public static void main(String[] args) {
		BlackCoffee blackCoffee=new BlackCoffee();
		System.out.println("default constructor");
		System.out.println(blackCoffee.company);
		System.out.println(blackCoffee.price);
		System.out.println(blackCoffee.quantity);
		System.out.println(blackCoffee.tasty);
		
		BlackCoffee blackCoffee2=new BlackCoffee("bru",200,1,true);
		System.out.println("parameterized constructor");
		System.out.println(blackCoffee2.company);
		System.out.println(blackCoffee2.price);
		System.out.println(blackCoffee2.quantity);
		System.out.println(blackCoffee2.tasty);


	}

}
