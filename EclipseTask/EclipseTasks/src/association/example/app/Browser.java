package association.example.app;

public class Browser {
	Internet internet=new Internet();
	public void browser() {
		System.out.println("invoking browser from Browser");
		this.internet.connect();
		this.internet.service();
	}

}
