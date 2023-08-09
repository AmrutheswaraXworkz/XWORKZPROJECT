package association.example.boot.override;

import association.example.app.overriding.ForumMall;
import association.example.app.overriding.Mall;

public class MallMain {
	public static void main(String[] args) {
		Mall mall=new Mall();
		mall.brand();
		mall.brand(true);
		mall.brand(6);
		mall.brand("ORION");
		mall.brand("MANTRI MALL", false);
		mall.brand("ZUDIO", 3);
		
		System.out.println("\n-------Override methods using PARENT class ref------------------\n");

		Mall mall2=new ForumMall();
		mall2.brand();
		mall2.brand(true);
		mall2.brand(4);
		mall2.brand("CENTRAL");
		mall2.brand("GT", false);
		mall2.brand("PANTALOONS", 2);
		
		System.out.println("\n-------Override methods using SUB class ref------------------\n");

		ForumMall mall3=new ForumMall();
		mall3.brand();
		mall3.brand(false);
		mall3.brand(5);
		mall3.brand("SS");
		mall3.brand("D-Mark", false);
		mall3.brand("groceries", 1);
	}
}
