package association.example.app.methodoverl;

public class Elevator {
	public void elevator() {
		System.out.println("invoking elevator in Elevator without arguments");
		elevator("hindusthan");
		elevator(5);
	}
	public void elevator(String name) {
		System.out.println("invoking elevator with String");
		System.out.println("name:"+name);
	}
	public void elevator(int floors) {
		System.out.println("invoking elevator with int");
		System.out.println("no of floors:"+floors);
	}
	public void elevator(String name,int floors) {
		System.out.println("invoking elevator with String and int");
		elevator(name);
		elevator(floors);
	}

}
