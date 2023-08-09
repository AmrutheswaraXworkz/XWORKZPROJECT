package association.example.app.overriding;

public class Hospital {
	public void hospital() {
		System.out.println("invoking hodpital in super class");
	}

	public void hospital(String name) {
		System.out.println("name of the hospital is:" + name);

	}
	public void hospital(String location,int distance) {
		System.out.println("location is:"+location+ "distance is:"+distance) ;
	}
	public void hospital(int amount,String disease) {
		System.out.println("amount is:"+amount+ "disease is:"+disease);
		
	}
	public void hospital(boolean good) {
		System.out.println("is treatment is good:"+good);
	}
	public void hospital(int exp) {
		System.out.println("experience of doc is:"+exp);
	}

}
