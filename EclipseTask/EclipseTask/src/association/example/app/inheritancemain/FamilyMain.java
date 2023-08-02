package association.example.app.inheritancemain;

import association.example.app.inheritance.Father;
import association.example.app.inheritance.GrandFather;
import association.example.app.inheritance.Son;

public class FamilyMain {
	public static void main(String[] args) {
		GrandFather big=new Father();
		Father med=new Son();
		big.grandFather();
		med.father();
		System.out.println("grand father name is:"+big.gName);
		System.out.println("father name is:"+med.fName);
	}

}
