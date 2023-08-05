package association.example.boot;

import association.example.app.constructor.WireRope;

public class RopeMain {
	public static void main(String[] args) {
		WireRope wireRope=new WireRope();
		System.out.println("default");
		System.out.println(wireRope.meters);
		System.out.println(wireRope.cost);
		System.out.println(wireRope.thickness);
		System.out.println(wireRope.usedFor);
		
		WireRope wireRope2=new WireRope(25,300,'M',"hanging");
		System.out.println("parameter");
		System.out.println(wireRope2.meters);
		System.out.println(wireRope2.cost);
		System.out.println(wireRope2.thickness);
		System.out.println(wireRope2.usedFor);

	}

}
