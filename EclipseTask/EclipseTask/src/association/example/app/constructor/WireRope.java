package association.example.app.constructor;

public class WireRope extends Rope {
	
	public WireRope() {
		super(200,20,'S',"tying");
	}

	public WireRope(int meters, double cost, char thickness, String usedFor) {
		super(meters, cost, thickness, usedFor);
		
	}
	

}
