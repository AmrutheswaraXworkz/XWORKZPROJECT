package association.example.boot;

import association.example.app.constructor.PoisonMushroom;

public class MushroomMain {
public static void main(String[] args) {
	PoisonMushroom poisonMushroom = new PoisonMushroom();
	System.out.println("no argument constructor");
	System.out.println(poisonMushroom.foundLocation);
	System.out.println(poisonMushroom.price);
	System.out.println(poisonMushroom.growArtificialy);
	System.out.println(poisonMushroom.size);
	
	PoisonMushroom poisonMushroom2 = new PoisonMushroom("Forest",200,false,'L');
	System.out.println("parameterized constructor");
	System.out.println(poisonMushroom2.foundLocation);
	System.out.println(poisonMushroom2.price);
	System.out.println(poisonMushroom2.growArtificialy);
	System.out.println(poisonMushroom2.size);
}
}
