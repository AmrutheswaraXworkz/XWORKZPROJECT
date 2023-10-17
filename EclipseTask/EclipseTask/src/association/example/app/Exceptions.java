package association.example.app;

import java.awt.color.ProfileDataException;

public class Exceptions {

	public void college() {
		System.out.println("running college in Exceptions");
		student();
	}

	public void student() {
		System.out.println("running student in Exceptions");
		notes();
	}

	public void notes() {
		System.out.println("running notes in Exceptions");
		try {
			pen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("exception event is handled");
		}
		System.out.println("after handling");
	}

	public void pen() {
		System.out.println("running pen in Exceptions");
		exam();
	}

	public void exam() {
		System.out.println("running exam in Exceptions");

		throw new ProfileDataException("this is ProfileDataException which is unchecked");

	}

	public static void main(String[] args) {
		Exceptions exceptions = new Exceptions();
		exceptions.college();
	}

}
