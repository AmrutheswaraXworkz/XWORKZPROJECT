package association.example.boot;

import association.example.app.constructor.Silver;

public class GoldMain {
public static void main(String[] args) {
	Silver silver=new Silver();
	System.out.println("default");
	System.out.println(silver.goldItem);
	System.out.println(silver.cost);
	System.out.println(silver.pureGold);
	System.out.println(silver.extractFrom);
	
	Silver silver2=new Silver("gejje",3000,24,"mine");
	System.out.println("parameter");
	System.out.println(silver2.goldItem);
	System.out.println(silver2.cost);
	System.out.println(silver2.pureGold);
	System.out.println(silver2.extractFrom);

	
}
}
