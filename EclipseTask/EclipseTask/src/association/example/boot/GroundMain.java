package association.example.boot;

import association.example.app.constructor.Stadium;

public class GroundMain {
public static void main(String[] args) {
	Stadium stadium=new Stadium();
	System.out.println("default");
	System.out.println(stadium.name);
	System.out.println(stadium.location);
	System.out.println(stadium.sqrFeet);
	System.out.println(stadium.chairs);
	
	Stadium stadium2=new Stadium("wankede","mumbai",400,true);
	System.out.println("parameterised");
	System.out.println(stadium2.name);
	System.out.println(stadium2.location);
	System.out.println(stadium2.sqrFeet);
	System.out.println(stadium2.chairs);

}
}
