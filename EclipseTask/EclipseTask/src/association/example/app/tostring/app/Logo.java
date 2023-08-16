package association.example.app.tostring.app;

public class Logo {
	private String name;
	private String color;
	private boolean good;
	private int year;
	private String location;
	
	public Logo() {
		System.out.println("no parameter");
	}
	public Logo(String name,String color,boolean good,int year,String location) {
		super();
		this.name=name;
		this.color=color;
		this.good=good;
		this.year=year;
		this.location=location;
	}
	@Override
	public String toString() {
		return "Logo [name="+name+"color="+color+"is it good="+good+"year of start="+year+"location="+location+"]";
		
	}
}
