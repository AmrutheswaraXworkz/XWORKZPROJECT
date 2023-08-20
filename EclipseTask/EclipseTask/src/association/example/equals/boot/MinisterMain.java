package association.example.equals.boot;

import association.example.equals.app.Minister;

public class MinisterMain {
	public static void main(String[] args) {
//		Minister minister = new Minister();

		Minister minister2 = new Minister("BSY", 65, 10000, 23, "Shikaripura", null);
		System.out.println(minister2);

		Minister minister3 = new Minister("Vijay", 45, 10000, 13, "Shikaripura", "Education");
		System.out.println(minister3);

		Minister minister4 = new Minister("Vijay", 45, 10000, 13, "shivamogga", "Education");
		System.out.println(minister4);
		
		boolean same=minister2.equals(minister3);
		System.out.println("contents of the ministers oj2 and 3 are same:"+same);
		
		boolean same1=minister2.equals(minister4);
		System.out.println("contents of the ministers obj 2 and 4 are same:"+same1);
	}

}
