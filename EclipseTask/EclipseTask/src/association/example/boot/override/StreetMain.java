package association.example.boot.override;

import association.example.app.overriding.Street;
import association.example.app.overriding.StreetRoad;

public class StreetMain {
	public static void main(String[] args) {
		Street street = new Street();
		street.street();
		street.street("Shivanagar");
		street.street("Shivanagar",3000);
		street.street("Shivanagar",3000,"Karnataka");
		street.street("Shivanagar",3000,"Karnataka","Shivajinagar");
		street.street("Shivanagar",3000,"Karnataka","Shivajinagar",2000);
		
		System.out.println("\n");
		
		Street street2 = new StreetRoad();
		street2.street();
		street2.street("Rajajinagar");
		street2.street("Rajajinagar",4000);
		street2.street("Rajajinagar",4000,"Karnataka");
		street2.street("Rajajinagar",4000,"Karnataka","Bashamsham circle");
		street2.street("Rajajinagar",4000,"Karnataka","Bashamsham circle",3000);
	}
}
