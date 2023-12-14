package association.example.app.task;

public class Initial {

	public void vargs(int a, String... values) {
		for (String s : values) {
			System.out.println(s);
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		Initial in = new Initial();
		in.vargs(2, "amruth", "gagan", "santosh");

		String name = "Amrutheswara Mallurmath";

		String initial = name.substring(name.indexOf(" ")+1, name.length());
		
		if(initial.length()<3)
			System.out.println(initial);
		else
		    System.out.println(initial.charAt(0));

	}

}
