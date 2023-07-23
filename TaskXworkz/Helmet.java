public class Helmet{
	double price;
	char helmetSize;
	static String name;
	static String manufState;
	
	public void helmetInstance(){
		System.out.println("price:"+price);
		System.out.println("helmetSize:"+helmetSize);
	}
	static void helmetStatic(){
		System.out.println("name:"+name);
		System.out.println("manufState:"+manufState);
	}
	Helmet(double price,char helmetSize){
		this.price=price;
		this.helmetSize=helmetSize;
	}
	static{
		name="steelbird";
		manufState="karnataka";
	}
}