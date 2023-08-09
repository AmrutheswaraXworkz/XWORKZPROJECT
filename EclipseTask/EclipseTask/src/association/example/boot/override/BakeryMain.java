package association.example.boot.override;

import association.example.app.overriding.Bakery;
import association.example.app.overriding.BakeryShop;

public class BakeryMain {
	public static void main(String[] args) {
		Bakery bakery=new Bakery();
		bakery.bakery();
		bakery.bakery("iyengar");
		bakery.bakery("varier","rajajingar");
		bakery.bakery(9);
		bakery.bakery(9, 22);
		bakery.bakery(100);
		
		
		System.out.println("==================");
		
		Bakery bakery2=new BakeryShop();
		bakery2.bakery();
		bakery2.bakery("davangere");
		bakery2.bakery("iyengar","davangere");
		bakery2.bakery(10);
		bakery2.bakery(10, 22);
		bakery2.bakery(200);
	}

}
