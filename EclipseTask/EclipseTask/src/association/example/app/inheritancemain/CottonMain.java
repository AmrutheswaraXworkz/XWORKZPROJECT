package association.example.app.inheritancemain;

import association.example.app.inheritance.*;

public class CottonMain {
	public static void main(String[] args) {
		Cotton shirt = new Shirt();
		Cotton pant = new Pant();
		Cotton jacket = new Jacket();
		Cotton pullOver = new PullOver();
		shirt.cotton();
		pant.cotton();
		jacket.cotton();
		pullOver.cotton();
		System.out.println("shirt is made of:" + shirt.type);
		System.out.println("pant is made of:" + pant.type);
		System.out.println("jacket is made of:" + jacket.type);
		System.out.println("pullover is made of:" + pullOver.type);
	}

}
