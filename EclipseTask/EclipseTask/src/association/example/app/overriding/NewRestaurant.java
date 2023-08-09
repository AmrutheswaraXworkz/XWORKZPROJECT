package association.example.app.overriding;

public class NewRestaurant extends Restaurant {
	public void restaurant() {
		System.out.println("invoking restaurant in derived class");
	}
	public void restaurant(String name) {
		System.out.println("name of the restaurant in derived is :"+name);
	}
	public void restaurant(String name,String location) {
		System.out.println("name in derived is:"+name+" location in derived is:"+location);
	}
	public void restaurant(String item,int price) {
		System.out.println("item name in derived:"+item+ "price in derived is:"+price);
	}
	public void restaurant(int time) {
		System.out.println("opening time in derived is:"+time);
	}
	public void restaurant(String owner,boolean tasty) {
		System.out.println("owner name in derived is:"+owner+"is tasty:"+tasty);
		
	}
}
