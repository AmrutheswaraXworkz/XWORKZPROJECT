package association.example.boot.override;

import association.example.app.overriding.IskconTemple;
import association.example.app.overriding.Temple;

public class TempleMain {
	public static void main(String[] args) {
		Temple temple=new Temple();
		temple.prayer();
		temple.prayer(9.30);
		temple.prayer("ISKON");
		temple.prayer(9.30, 7);
		temple.prayer("ISKCON", 0);
		temple.prayer("ISKCON", "MAHALAKSHMI LAYOUT");
		
		System.out.println(",,,,,,,,,override with parent ref,,,,,,,,,,,,,,");
		
		Temple temple1=new IskconTemple();
		temple1.prayer();
		temple1.prayer(9.30);
		temple1.prayer("MARUTHI MANDIRA");
		temple1.prayer(9.30, 7);
		temple1.prayer("MARUTHI MANDIRA", 0);
		temple1.prayer("MARUTHI MANDIRA", "VIJAYNAGARA");

		System.out.println(",,,,,,,,,override with CHILD ref,,,,,,,,,,,,,,");
		
		IskconTemple temple2=new IskconTemple();
		temple2.prayer();
		temple2.prayer(9.30);
		temple2.prayer("SAI BABA");
		temple2.prayer(9.30, 7);
		temple2.prayer("SAI BABA", 0);
		temple2.prayer("SAI BABA", "RAJAJINAGAR");


	}
}
