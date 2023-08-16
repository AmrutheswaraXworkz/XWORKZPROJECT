package association.example.app.tostring.app;

public class Karcheif {
	private String name;
	private String type;
	private String shape;
	private boolean quality;
	private char size;
	private String color;
	private int price;

	public Karcheif() {
		System.out.println("no parameters");
	}
	public Karcheif(String name,String type,String shape,boolean quality,char size,String color,int price) {
		super();
		this.name=name;
		this.type=type;
		this.shape=shape;
		this.quality=quality;
		this.size=size;
		this.color=color;
		this.price=price;
	}
	
	@Override
	
	public String toString() {
		return "Karcheif [name is="+name+"type="+type+"shape="+shape+"quality="+quality+"size="+size+"color="+color+"price="+price+"]";
	}
}
