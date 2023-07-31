package association.example.app;
public class Area {
	public String name;
	public Corporator corporator;
	
	public Area(String name,Corporator corporator)
	{
		this.name=name;
		this.corporator=corporator;
	}
	
	public void printInfo()
	{
		System.out.println("Invoking area Info");
		System.out.println("Area Name is:"+name);
		corporator.printInfo();

	}

}
