package association.example.app.constructor;

public class BlackCoffee extends Coffee {
	
	public BlackCoffee() {
		super("nescafe", 100, 2, true);
		
	}
	public BlackCoffee(String company,double price,int quantity,boolean tasty) {
		super(company,price,quantity,tasty);
	}

}
