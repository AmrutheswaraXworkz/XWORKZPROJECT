package association.example.equals.boot;

import association.example.equals.app.Sniper;

public class SniperMain {
	public static void main(String[] args) {
		Sniper sniper1 = new Sniper("Alex Parker", 32, "M24", 150, 0.95, "kar98");
		Sniper sniper3 = new Sniper("Alex Parker", 32, "M24", 150, 0.95, "kar98");
		Sniper sniper2 = new Sniper("Emily Johnson", 28, "M24", 200, 0.92, "kar98");
		System.out.println(sniper1);
		System.out.println(sniper2);
		
		boolean same=sniper1.equals(sniper2);
		System.out.println("contents of sniper obj 1 and 2 are:"+same);
		boolean same1=sniper1.equals(sniper2);
		System.out.println("contents of sniper obj 1 and 2 are:"+same1);
		boolean same2=sniper1.equals(sniper3);
		System.out.println("contents of sniper obj 1 and 3 are:"+same2);
		
		

	}
}
