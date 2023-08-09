package association.example.boot.override;

import association.example.app.overriding.City;
import association.example.app.overriding.Town;

public class CityMain {
	public static void main(String[] args) {
		City city = new City();
		city.city();
		city.city("Bengalore");
		city.city("Bengalore",true);
		city.city("Bengalore",true,"Bengalore");
		city.city("Bengalore",true,"Bengalore","Karnataka");
		city.city("Bengalore",true,"Bengalore","Karnataka",true);
		
		System.out.println("\n");
		
		City city2 = new Town();
		city2.city();
		city2.city("davanagere");
		city2.city("davanagere",true);
		city2.city("davanagere",true,"davanagere");
		city2.city("davanagere",true,"davanagere","Karnataka");
		city2.city("davanagere",true,"davanagere","Karnataka",true);
	}
}
