package association.example.boot.override;

import association.example.app.overriding.NationalPark;
import association.example.app.overriding.Zoo;

public class ZooMain {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.zoo();
		zoo.zoo("Mysore Zoo");
		zoo.zoo("Mysore Zoo",10);
		zoo.zoo("Mysore Zoo",10,6);
		zoo.zoo("Mysore Zoo",10,6,"Karnatak");
		zoo.zoo("Mysore Zoo",10,6,"Karnatak",true);
		
		System.out.println("\n");
		
		Zoo zoo2 = new NationalPark();
		zoo2.zoo();
		zoo2.zoo("Mysore zoo");
		zoo.zoo("Mysore Zoo",11);
		zoo.zoo("Mysore Zoo",11,6);
		zoo.zoo("Mysore Zoo",11,6,"Karnatak");
		zoo.zoo("Mysore Zoo",11,6,"Karnatak",true);
		
	}
}
