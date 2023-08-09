package association.example.app.overriding;

public class NewHospital extends Hospital{
	public void hospital() {
		System.out.println("invoking hodpital in derived class");
	}

	public void hospital(String name) {
		System.out.println("name of the hospital in derived is:" + name);

	}
	public void hospital(String location,int distance) {
		System.out.println("location in derived is:"+location+ "distance in derived is:"+distance) ;
	}
	public void hospital(int amount,String disease) {
		System.out.println("amount in derived is:"+amount+ "disease in derived is:"+disease);
		
	}
	public void hospital(boolean good) {
		System.out.println("is treatment in derived is good:"+good);
	}
	public void hospital(int exp) {
		System.out.println("experience of doc in derived is:"+exp);
	}
}
