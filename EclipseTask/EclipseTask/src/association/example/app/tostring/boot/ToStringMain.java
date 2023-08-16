package association.example.app.tostring.boot;

import association.example.app.tostring.app.Cave;
import association.example.app.tostring.app.Flag;
import association.example.app.tostring.app.Karcheif;
import association.example.app.tostring.app.Logo;
import association.example.app.tostring.app.Pendant;

public class ToStringMain {
public static void main(String[] args) {
	Flag flag=new Flag();
	System.out.println(flag.toString());
	System.out.println(flag);
	Flag flag2=new Flag("Karnataka",2,"India");
	System.out.println(flag2);
	Flag flag3=new Flag("karnataka",3,"India");
	System.out.println(flag3);
	
	System.out.println("++++++++++++++++++++++++++++++++");
	Logo logo=new Logo();
	System.out.println(logo);
	Logo logo2=new Logo("Benz", "silver", true, 2017, "california");
	System.out.println(logo2);
	Logo logo3=new Logo("bmw", "gold", true, 2003, "england");
	System.out.println(logo3);
	
	System.out.println("==================================");
	Karcheif karcheif=new Karcheif();
	System.out.println(karcheif);
	Karcheif karcheif2=new Karcheif("raymond", "cotton", "sqaure", true, 'm', "white", 25);
	System.out.println(karcheif2);
	Karcheif karcheif3=new Karcheif("raymond", "cotton", "circle", true, 'm', "blue", 35);
	System.out.println(karcheif3);
	Karcheif karcheif4=new Karcheif("raymond", "wollen", "rectangle", true, 's', "red", 25);
	System.out.println(karcheif4);
	
	System.out.println("-----------------------------------");
	Cave cave=new Cave();
	System.out.println(cave);
	Cave cave2 = new Cave("Mystic Cave", 15.5, 200, true, false, true, 10, 5, true, false);
    System.out.println(cave2);
    Cave cave3 = new Cave("Ajanta Caves", 16.25, 300, false, true, true, 15, 15, true, false);
    System.out.println(cave3);
    
    System.out.println("''''''''''''''''''''''''''''''''''''");
    Pendant pendant=new Pendant();
    System.out.println(pendant);
    Pendant pendant1 = new Pendant("Silver", "Sapphire", 3.5, 1.2, 0.8, 0.4,"Cable Chain", "Sterling Silver", "Heart Shape", true, true,"Glow in the dark");
    System.out.println(pendant1);
    Pendant pendant2 = new Pendant("Gold", "Ruby", 3.5, 1.2, 0.8, 0.4,"Cable Chain", "Sterling Silver", "Round", true, true,"Glow in the night");
    System.out.println(pendant2);
    
    
	}
}
