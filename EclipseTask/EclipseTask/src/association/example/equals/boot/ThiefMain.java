package association.example.equals.boot;

import association.example.equals.app.Thief;

public class ThiefMain {
public static void main(String[] args) {
	Thief thief1 = new Thief("Jack Donovan", "The Shadow", "American", "Lockpicking", "The Crown Jewels", "Abandoned Warehouse");
    Thief thief2 = new Thief("Isabella Cruz", "Black Cat", "Brazilian", "Acrobatics", "Mona Lisa", "Rooftop Hideout");
    Thief thief3 = new Thief("Liam Patel", "Phantom", "British", "Hacking", "Bank of England", "Underground Lair");
    Thief thief4 = new Thief("Liam Patel", "Phantom", "British", "Hacking", "Bank of England", "Underground Lair");
    Thief thief5 = new Thief("Nikolai Petrov", "Red Fox", "Russian", "Explosives", "Hermitage Museum", "Secluded Cabin");
    Thief thief6 = new Thief("Nikolai Petrov", "Red Fox", "Russian", "Explosives", "Hermitage Museum", "Secluded Cabin");

    
    Thief thief=new Thief();
    System.out.println(thief);
    System.out.println(thief1);
    System.out.println(thief2);
    System.out.println(thief3);
    System.out.println(thief4);
    System.out.println(thief5);
    System.out.println(thief6);
    
    boolean same=thief1.equals(thief2);
    System.out.println("obj of 1 and 2 are same :"+same);
    boolean same1=thief1.equals(thief3);
    System.out.println("obj of 1 and 3 are same :"+same1);
    boolean same2=thief3.equals(thief2);
    System.out.println("obj of 3 and 2 are same :"+same2);
    boolean same3=thief3.equals(thief4);
    System.out.println("obj of 3 and 4 are same :"+same3);
    boolean same4=thief5.equals(thief2);
    System.out.println("obj of 5 and 2 are same :"+same4);
    boolean same5=thief5.equals(thief6);
    System.out.println("obj of 5 and 6 are same :"+same5);
    
    
}
}
