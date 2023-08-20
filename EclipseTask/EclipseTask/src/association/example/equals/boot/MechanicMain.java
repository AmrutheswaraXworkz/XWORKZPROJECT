package association.example.equals.boot;

import association.example.equals.app.Mechanic;

public class MechanicMain {
	public static void main(String[] args) {
		Mechanic mechanic1 = new Mechanic( "John Smith", 30, "Engine Repair", "ASE Certified", "123-456-7890",
				"789 Oak Ave");
		Mechanic mechanic2 = new Mechanic( "Jane Doe", 25, "Brake Service", "Master Mechanic", "987-654-3210",
				"456 Elm St");
		Mechanic mechanic3 = new Mechanic( "John Smith", 40, "Transmission Repair", "ASE Certified",
				"123-456-7890", "789 Oak Ave");
		Mechanic mechanic4 = new Mechanic( "Emily Williams", 28, "Electrical Systems", "Certified Technician",
				"888-777-9999", "567 Pine Rd");
		Mechanic mechanic5 = new Mechanic( "John Smith", 40, "Transmission Repair", "ASE Certified",
				"123-456-7890", "789 Oak Ave");
		
		System.out.println(mechanic1);
		System.out.println(mechanic2);
		System.out.println(mechanic3);
		System.out.println(mechanic4);
		
		boolean same=mechanic1.equals(mechanic3);
		System.out.println(same);
		boolean same1=mechanic1.equals(mechanic2);
		System.out.println(same1);
		boolean same2=mechanic1.equals(mechanic3);
		System.out.println(same2);
		boolean same3=mechanic5.equals(mechanic3);
		System.out.println(same3);
		
		

	}

}
