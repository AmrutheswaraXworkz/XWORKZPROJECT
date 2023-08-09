package association.example.app.overriding;

public class Restaurant {
	public void restaurant() {
		System.out.println("invoking restaurant in super class");
	}
	public void restaurant(String name) {
		System.out.println("name of the restaurant is :"+name);
	}
	public void restaurant(String name,String location) {
		System.out.println("name is:"+name+" location is:"+location);
	}
	public void restaurant(String item,int price) {
		System.out.println("item name:"+item+ "price is:"+price);
	}
	public void restaurant(int time) {
		System.out.println("opening time is:"+time);
	}
	public void restaurant(String owner,boolean tasty) {
		System.out.println("owner name is:"+owner+"is tasty:"+tasty);
		
	}

}
