package association.example.boot.override;

import association.example.app.overriding.Library;
import association.example.app.overriding.PublicLibrary;

public class LibraryMain {
	public static void main(String[] args) {
		System.out.println("\n-------printing overload methods in parent class------------------\n");
		
		Library library=new Library();
		library.bookStore();
		library.bookStore(350.9);
		library.bookStore("IT ENDS WITH US");
		library.bookStore("IT ENDS WITH US","Colleen Hoover");
		library.bookStore("RAJAINAGAR", 577501);
		library.bookStore("IT ENDS WITH US", "Colleen Hoover", 10);
		
		
		System.out.println("\n-------Override methods using PARENT class ref------------------\n");
		Library library2=new PublicLibrary();
		library2.bookStore();
		library2.bookStore(250.9);
		library2.bookStore("THINK LIKE A MONK");
		library2.bookStore("THINK LIKE A MONK","JAY SHETTY");
		library2.bookStore("MG ROAD", 577502);
		library2.bookStore("THINK LIKE A MONK", "JAY SHETTY", 20);
		
		System.out.println("\n-------Override methods using CHILD class ref------------------\n");
		PublicLibrary library3=new PublicLibrary();
		library3.bookStore();
		library3.bookStore(450.9);
		library3.bookStore("Atomic Habits");
		library3.bookStore("Atomic habits","James Clear");
		library3.bookStore("rv road", 577501);
		library3.bookStore("Atomic HAbits", "James Clear", 5);


	}
}
