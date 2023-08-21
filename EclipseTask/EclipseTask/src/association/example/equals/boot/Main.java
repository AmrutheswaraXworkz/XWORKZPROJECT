package association.example.equals.boot;

import association.example.equals.app.ExampleInteger;
import association.example.equals.app.ExampleString;
import association.example.equals.app.ExampleUtility;

public class Main {
	public static void main(String[] args) {
		ExampleString exampleString=new ExampleString("Hello,Java");
		exampleString.printValue();
		System.out.println("Length:"+exampleString.length());
		System.out.println("Concatenated:"+exampleString.concat(" Welcome"));
		System.out.println("Is empty:"+exampleString.isEmpty());
		System.out.println("Character at index 7 is:"+exampleString.charAt(7));
		System.out.println("Compare result:"+ExampleString.compare("Apple", "Banana"));
		
		ExampleInteger exampleInteger=new ExampleInteger(42);
		exampleInteger.printValue();
		System.out.println("Is even:"+exampleInteger.isEven());
		System.out.println("Is positive:"+exampleInteger.isPositive());
		System.out.println("Sum:"+ExampleInteger.sum(10, 20));
		
		ExampleUtility.printThreadInfo();
		ExampleUtility.printSystemProperties();
		System.out.println("Current Date:"+ExampleUtility.getCurrentDate());
		System.out.println("Current Date and Time:"+ExampleUtility.getCurrentDateTime());
		ExampleUtility.executeGC();
	}

}
