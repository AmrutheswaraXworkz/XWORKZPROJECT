package association.example.app.overriding;

public class Bakery {
public void bakery() {
	System.out.println("bakery method super class");
}
public void bakery(String name) {
	System.out.println("name of the bakery is:"+name);
}
public void bakery(String name,String location) {
	System.out.println("name and location of the bakery is:"+name+" "+location);
}
public void bakery(int time) {
	System.out.println("bakery opens at:"+time);
}
public void bakery(int time,int closingTime) {
	System.out.println("opens at:"+time+" closing at:"+closingTime);
}
public void bakery(double price) {
	System.out.println("peice at the bakery is:"+price);
}
}
