package association.example.boot;

import association.example.app.constructor.BlackDiamond;

public class DiamondMain {

	public static void main(String[] args) {

		BlackDiamond blackDiamond = new BlackDiamond();
		System.out.println("no argument constructor");
		System.out.println(blackDiamond.color);
		System.out.println(blackDiamond.difficultToCut);
		System.out.println(blackDiamond.hardestObject);
		System.out.println(blackDiamond.madeOff);

		BlackDiamond blackDiamond2 = new BlackDiamond("black", "Particles", true, true);
		System.out.println("parameterized constructor");
		System.out.println(blackDiamond2.color);
		System.out.println(blackDiamond2.difficultToCut);
		System.out.println(blackDiamond2.hardestObject);
		System.out.println(blackDiamond2.madeOff);

	}

}
