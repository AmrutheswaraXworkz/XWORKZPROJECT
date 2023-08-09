package association.example.boot.override;

import association.example.app.overriding.NewRestaurant;
import association.example.app.overriding.Restaurant;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant restaurant=new Restaurant();
		restaurant.restaurant();
		restaurant.restaurant("food land");
		restaurant.restaurant("food land","davangere");
		restaurant.restaurant("chicken biriyani", 200);
		restaurant.restaurant(10);
		restaurant.restaurant("dont know", true);
		
		System.out.println("==========================");
		
		Restaurant restaurant2=new NewRestaurant();
		restaurant2.restaurant();
		restaurant2.restaurant("anathbhavana");
		restaurant2.restaurant("ananthbhavana","davangere");
		restaurant2.restaurant("dose", 50);
		restaurant2.restaurant(9);
		restaurant2.restaurant("dont know", false);
	}

}
