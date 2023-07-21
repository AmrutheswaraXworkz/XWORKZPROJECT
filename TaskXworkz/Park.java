public class Park{
	String parkName;
	String parkLocation;
	double openingTime;
	double closingTime;
	int entryPointNumbers;
	boolean sittingChairs;
	boolean playingItems;
	boolean parkHasWorkers;
	boolean parkHasTrees;
	
	Park(String parkName){
		this.parkName = parkName;
		System.out.println("parkName: " + parkName);
	}
	
	Park(String parkName,String parkLocation){
		this(parkName);
		this.parkLocation = parkLocation;
		System.out.println("parkLocation: " + parkLocation);
	}
	
	Park(String parkName,String parkLocation,double openingTime){
		this(parkName,parkLocation);
		this.openingTime = openingTime;
		System.out.println("openingTime: " + openingTime + "am");
	}
	
	Park(String parkName,String parkLocation,double openingTime,double closingTime){
		this(parkName,parkLocation,openingTime);
		this.closingTime = closingTime;
		System.out.println("closingTime: " + closingTime + "pm");
	}
	
	Park(String parkName,String parkLocation,double openingTime,double closingTime,int entryPointNumbers){
		this(parkName,parkLocation,openingTime,closingTime);
		this.entryPointNumbers = entryPointNumbers;
		System.out.println("entryPointNumbers: " + entryPointNumbers);
	}
	
	Park(String parkName,String parkLocation,double openingTime,double closingTime,int entryPointNumbers,boolean sittingChairs){
		this(parkName,parkLocation,openingTime,closingTime,entryPointNumbers);
		this.sittingChairs = sittingChairs;
		System.out.println("sittingChairs: " + sittingChairs);
	}
	
	Park(String parkName,String parkLocation,double openingTime,double closingTime,int entryPointNumbers,boolean sittingChairs,
			boolean playingItems){
		this(parkName,parkLocation,openingTime,closingTime,entryPointNumbers,sittingChairs);
		this.playingItems = playingItems;
		System.out.println("playingItems: " + playingItems);
	}
	
	Park(String parkName,String parkLocation,double openingTime,double closingTime,int entryPointNumbers,boolean sittingChairs,
			boolean playingItems,boolean parkHasWorkers){
		this(parkName,parkLocation,openingTime,closingTime,entryPointNumbers,sittingChairs,playingItems);
		this.parkHasWorkers = parkHasWorkers;
		System.out.println("parkHasWorkers: " + parkHasWorkers);
	}
	
	Park(String parkName,String parkLocation,double openingTime,double closingTime,int entryPointNumbers,boolean sittingChairs,
			boolean playingItems,boolean parkHasWorkers,boolean parkHasTrees){
		this(parkName,parkLocation,openingTime,closingTime,entryPointNumbers,sittingChairs,playingItems,parkHasWorkers);
		this.parkHasTrees = parkHasTrees;
		System.out.println("parkHasTrees: " + parkHasTrees);
	}
}