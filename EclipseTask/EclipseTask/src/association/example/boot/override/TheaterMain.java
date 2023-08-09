package association.example.boot.override;

import association.example.app.overriding.PVR;
import association.example.app.overriding.Theater1;

public class TheaterMain {
	public static void main(String[] args) {
		System.out.println("\n-------printing overload methods in parent class------------------\n");
		
		Theater1 theater=new Theater1();
		
		theater.show();
		theater.show(1000000000);
		theater.show("OM");
		theater.show("ACTION", 5);
		theater.show("SHIVRAJKUMAR", "PREMA");
		theater.show("OM", "SHIVRAJKUMAR", "PREMA");
		
		System.out.println("\n-------Override methods using PARENT class ref------------------\n");
		
		Theater1 theater2=new PVR();
		
		theater2.show();
		theater2.show(200000000);
		theater2.show("KIRIK PARTY");
		theater2.show("COMEDY", 5);
		theater2.show("RAKSHITH SHETTY", "RASHMIKA MANDANNA");
		theater2.show("KIRIK PARTY", "RAKSHITH SHETTY", "RASHMIKA MANDANNA");
		
		System.out.println("\n-------Override methods using CHILD class ref------------------\n");
		
		PVR theater3=new PVR();
		
		theater3.show();
		theater3.show(90000000);
		theater3.show("TITANIC");
		theater3.show("TRAGEDY,DRAMA", 4.8);
		theater3.show("Leonardo DiCaprio", "Kate Winslet");
		theater3.show("TITANIC", "Leonardo DiCaprio", "Kate Winslet");


	}
}
