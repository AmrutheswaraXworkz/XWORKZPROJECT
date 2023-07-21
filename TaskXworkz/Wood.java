public class Wood{
	String woodSize;
	double price;
	String purpose;
	String woodName;
	boolean usedForBurning;
	
	Wood(String woodSize){
		this.woodSize = woodSize;
		System.out.println("woodSize is: " + woodSize);
	}
	
	Wood(String woodSize,double price){
		this(woodSize);
		this.price = price;
		System.out.println("price is: " + price);
	}
	
	Wood(String woodSize,double price,String purpose){
		this(woodSize,price);
		this.purpose = purpose;
		System.out.println("purpose is: " + purpose);
	}
	
	Wood(String woodSize,double price,String purpose,String woodName){
		this(woodSize,price, purpose);
		this.woodName = woodName;
		System.out.println("woodName is: " + woodName);
	}
	
	Wood(String woodSize,double price,String purpose,String woodName,boolean usedForBurning){
		this(woodSize,price, purpose,woodName);
		this.usedForBurning = usedForBurning;
		System.out.println("usedForBurning is: " + usedForBurning);
	}
}