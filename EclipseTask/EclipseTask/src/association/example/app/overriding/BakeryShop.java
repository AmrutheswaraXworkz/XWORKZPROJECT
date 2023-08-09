package association.example.app.overriding;

public class BakeryShop extends Bakery{
	@Override
	public void bakery() {
		System.out.println("bakery method in derived class");
	}
	@Override
	public void bakery(String name) {
		System.out.println("name of the bakery in derived is:"+name);
	}
	@Override
	public void bakery(String name,String location) {
		System.out.println("name and location of the bakery in derived is:"+name+" "+location);
	}
	@Override
	public void bakery(int time) {
		System.out.println("bakery in derived is opens at:"+time);
	}
	@Override
	public void bakery(int time,int closingTime) {
		System.out.println("in derived opens at:"+time+" closing at:"+closingTime);
	}@Override
	
	public void bakery(double price) {
		System.out.println("price at the bakery in derived is:"+price);

}
}
