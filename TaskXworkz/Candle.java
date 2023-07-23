public class Candle{
	static String fuelUsed;
	static String wickPosition;
	char candelSize;
	double price;
	
	public void candleInstance(){
		System.out.println("candelSize:"+candelSize+" price:" +price);
	}
	static void candleStatic(){
		System.out.println("fuel used:"+fuelUsed);
		System.out.println("wick position:"+wickPosition);
	}
	
	Candle(char candelSize,double price){
		this.candelSize=candelSize;
		this.price=price;
	}
	static{
		fuelUsed="candle wax";
		wickPosition="centre";
	}
}