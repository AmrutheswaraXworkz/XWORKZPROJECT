package association.example.app.constructor;

public class Stadium extends Ground {
	public Stadium() {
		super("chinnaswamy","banglore",300,true);
		
	}
	public Stadium(String name,String location,double sqrFeet,boolean chairs) {
		super(name,location,sqrFeet,chairs);
	}

}
