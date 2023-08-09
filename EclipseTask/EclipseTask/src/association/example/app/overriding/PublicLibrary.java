package association.example.app.overriding;

public class PublicLibrary extends Library{
	@Override
	public void bookStore() {
		System.out.println("Calling SUB class method with no-arg");
	}

	@Override
	public void bookStore(String bookName) {
		System.out.println("Calling SUB class method with String-arg");
		System.out.println("NAME OF THE BOOK : " + bookName);
	}

	@Override
	public void bookStore(String bookName, String author) {
		System.out.println("Calling SUB class method with String,String-arg");
		System.out.println("NAME OF THE BOOK : " + bookName);
		System.out.println("NAME OF THE AUTHOR : " + author);
	}

	@Override
	public void bookStore(String bookName, String author, int noOfCopies) {
		System.out.println("Calling SUB class method with String,String,int-arg");
		System.out.println("NAME OF THE BOOK : " + bookName);
		System.out.println("NAME OF THE AUTHOR : " + author);
		System.out.println("No OF Copies : " + noOfCopies);
	}

	@Override
	public void bookStore(String location, int pincode) {
		System.out.println("Calling SUB class method with String,int-arg");
		System.out.println("LIBRARY LOCATION : " + location);
		System.out.println("PINCODE : " + pincode);
	}

	@Override
	public void bookStore(double cost) {
		System.out.println("Calling SUB class method with double-arg");
		System.out.println("COST : " + cost);
	}
}
