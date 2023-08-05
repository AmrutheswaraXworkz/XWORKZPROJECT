package association.example.app.constructor;

public class Ground {
	public String name;
	public String location;
	public double sqrFeet;
	public boolean chairs;

	public Ground(String name, String location, double sqrFeet, boolean chairs) {
		this.name = name;

		this.location = location;

		this.sqrFeet = sqrFeet;
		this.chairs = chairs;
	}

}
