package association.example.implement.boot;

import association.example.implement.app.*;


public class ImplementMain {
public static void main(String[] args) {
	Metro metroRules = new MetroImplement();
	metroRules.announcement('F');
	metroRules.payment(14.25);
	metroRules.timings(11);
	
	System.out.println("==========================");
	Temple rules = new TempleImplement();
	rules.openTimings(11);
	rules.NoMobile();
	rules.noSmoking();
	
	System.out.println("++++++++++++++++++++++++++");
	PG pgRules=new PGImplement();
	System.out.println("Note : "+pgRules.noBoysAllowed());
	System.out.println("HAS Washing Machine : "+pgRules.hasWashingMachine());
	System.out.println("RENT : "+pgRules.rent());

	
	System.out.println("---------------------------");
	Engineer engineeringRules=new EngineerImplement();
	System.out.println("Wear Id : "+engineeringRules.wearId());
	engineeringRules.attendence();
	System.out.println("FEE : "+engineeringRules.fee());

	
	System.out.println(":::::::::::::::::::::::::::");
	Military militaryRules=new MilitaryImplement();
	System.out.println("Wear Uniform : "+militaryRules.wearUniform());
	System.out.println("UNIT NUMBER : "+militaryRules.unitNumber());
	System.out.println("Service : "+militaryRules.service());
	
	
}
}
