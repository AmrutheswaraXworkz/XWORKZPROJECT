package association.example.app.methodoverl;

public class Mouse {
	public void mouse() {
		System.out.println("invoking mouse in Mouse without arguements");
		mouse(true);
		mouse("lenova");
	}

	public void mouse(boolean scroll) {
		System.out.println("invoking scroll with boolean");
		System.out.println("does mouse scroll:" + scroll);

	}

	public void mouse(String name) {
		System.out.println("invoking scroll with String");
		System.out.println("name ofthe mouse:" + name);

	}

	public void mouse(boolean scroll,String name) {
		System.out.println("invoking scroll with boolean and String");
		mouse(scroll);
		mouse(name);
	}

}
