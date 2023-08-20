package association.example.equals.boot;

import association.example.equals.app.CEO;

public class CEOMain {
	public static void main(String[] args) {
		CEO ceo1 = new CEO("John Doe", 45, "XYZ Inc", 1000000.0, "MBA", 20);
        CEO ceo2 = new CEO("Jane Smith", 50, "XYZ Inc", 1200000.0, "PhD", 25);
        CEO ceo3 = new CEO("John Doe", 45, "XYZ Inc", 1000000.0, "MBA", 20);
        System.out.println(ceo1);
        System.out.println(ceo2);
        System.out.println(ceo3);
        
        boolean same=ceo1.equals(ceo2);
        System.out.println("contents of ceo obj 1 and 2 are"+same);
        boolean same1=ceo1.equals(ceo3);
        System.out.println("contents of ceo obj 1 and 3 are"+same1);
        
        

	}

}
