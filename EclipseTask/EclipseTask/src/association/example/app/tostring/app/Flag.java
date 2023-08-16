package association.example.app.tostring.app;

public class Flag {
	private String manufacturer;
	private int noOfColors;
	private String country;
		
	public Flag() {
		System.out.println("no parameters");
	}
	public Flag(String manufacturer,int noOfColors,String country) {
		super();
		this.manufacturer=manufacturer;
		this.noOfColors=noOfColors;
		this.country=country;
	}
	
	@Override
	public String toString() {
		return "Flag pmanufactured at="+manufacturer+"no of colors="+noOfColors+"country="+country+"]";
	}
	

}
