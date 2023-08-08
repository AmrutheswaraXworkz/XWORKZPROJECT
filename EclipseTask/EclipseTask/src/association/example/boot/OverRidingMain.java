package association.example.boot;

import association.example.app.overriding.*;

public class OverRidingMain {
	public static void main(String[] args) {
		Amoeba newAmoeba=new NewAmoeba();
		newAmoeba.shape();
		System.out.println();
		Dinosaur dinosaur=new NewDinosaur();
		dinosaur.extinct();
		System.out.println();
		Flex hii=new NewFlex();
		hii.flex();
		System.out.println();
		Gate gate=new NewGate();
		gate.secure();
		System.out.println();
		Mic song=new NewMic();
		song.receiver();
		System.out.println();
		Drum sound=new NewDrum();
		sound.beats();
		System.out.println();
		Theater movie=new NewTheater();
		movie.film();
		System.out.println();
		Ticket charge=new NewTicket();
		charge.bus();
	
		
	}

}
