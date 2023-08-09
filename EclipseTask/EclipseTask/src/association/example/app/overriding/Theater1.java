package association.example.app.overriding;

public class Theater1 {
	public void show() {
		System.out.println("Calling Parent Classs method with NO-arg");
	}

	public void show(String movieName) {
		System.out.println("Calling Parent Classs method with String-arg");
		System.out.println("MOVIE NAME : " + movieName);
	}

	public void show(String hero, String heroin) {
		System.out.println("Calling Parent Classs method with String,String-arg");
		System.out.println("HERO NAME : " + hero);
		System.out.println("HEROIN NAME : " + heroin);
	}

	public void show(String movieName, String hero, String heroin) {
		System.out.println("Calling Parent Classs method with String,String,String-arg");
		System.out.println("MOVIE NAME : " + movieName);
		System.out.println("HERO NAME : " + hero);
		System.out.println("HEROIN NAME : " + heroin);
	}

	public void show(double budget) {
		System.out.println("Calling Parent Classs method with double-arg");
		System.out.println("BUDGET : " + budget);
	}

	public void show(String genere, double rating) {
		System.out.println("Calling Parent Classs method with String,double -arg");
		System.out.println("GENERE : " + genere);
		System.out.println("RATING : " + rating);
	}
}
