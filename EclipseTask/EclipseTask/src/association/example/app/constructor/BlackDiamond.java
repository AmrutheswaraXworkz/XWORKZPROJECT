package association.example.app.constructor;

public class BlackDiamond extends Diamond {
	public BlackDiamond() {
		// TODO Auto-generated constructor stub
		super("white", "stones", true, true);
	}
	
	public BlackDiamond(String color,String madeOff,boolean hardestObject,boolean difficultToCut) {
		super(color, madeOff, hardestObject, difficultToCut);
	}
}
