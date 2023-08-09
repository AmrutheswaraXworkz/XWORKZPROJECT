package association.example.app.overriding;

public class Library {
	public void bookStore() {
		System.out.println("Calling parent class method with no-arg");
	}

	public void bookStore(String bookName) {
		System.out.println("Calling parent class method with String-arg");
		System.out.println("NAME OF THE BOOK : " + bookName);
	}

	public void bookStore(String bookName, String author) {
		System.out.println("Calling parent class method with String,String-arg");
		System.out.println("NAME OF THE BOOK : " + bookName);
		System.out.println("NAME OF THE AUTHOR : " + author);
	}

	public void bookStore(String bookName, String author, int noOfCopies) {
		System.out.println("Calling parent class method with String,String,int-arg");
		System.out.println("NAME OF THE BOOK : " + bookName);
		System.out.println("NAME OF THE AUTHOR : " + author);
		System.out.println("No OF Copies : " + noOfCopies);
	}

	public void bookStore(String location, int pincode) {
		System.out.println("Calling parent class method with String,int-arg");
		System.out.println("LOCATION : " + location);
		System.out.println("PINCODE : " + pincode);
	}

	public void bookStore(double cost) {
		System.out.println("Calling parent class method with double-arg");
		System.out.println("COST : " + cost);
	}
}
