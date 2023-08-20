package association.example.equals.boot;

import association.example.equals.app.Cook;

public class CookMain {
public static void main(String[] args) {
	Cook cook1 = new Cook("Alice", "Baking", "Italian", "Intermediate", "+123456789", "Cityville");
    Cook cook2 = new Cook("Bob", "Grilling", "Barbecue", "Advanced", "+987654321", "Suburbia");
    Cook cook3 = new Cook("Catherine", "Sushi", "Japanese", "Expert", "+555555555", "Metropolis");
    Cook cook4 = new Cook("David", "Pastry", "French", "Beginner", "+111222333", "Countryside");
    Cook cook5 = new Cook("Bob", "Grilling", "Barbecue", "Advanced", "+987654321", "Suburbia");

    
    System.out.println(cook1);
    System.out.println(cook2);
    System.out.println(cook3);
    System.out.println(cook4);
    System.out.println(cook5);
    
    boolean same=cook1.equals(cook2);
    System.out.println("obj of 1 and 2 are:"+same);
    boolean same1=cook3.equals(cook2);
    System.out.println("obj of 3 and 2 are:"+same1);
    boolean same2=cook4.equals(cook2);
    System.out.println("obj of 2 and 2 are:"+same2);
    boolean same3=cook2.equals(cook3);
    System.out.println("obj of 2 and 3 are:"+same3);
    boolean same4=cook2.equals(cook5);
    System.out.println("obj of4 and 5 are:"+same4);
}
}
