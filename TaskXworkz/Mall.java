public class Mall{
	String mallName;
	double closingTime;
	double openingTime;
	String mallLocation;
	boolean checkingBeforeEntry;
	char mallSize;
	boolean vehivleParkingSpace;
	
	Mall(String mallName){
		this.mallName = mallName;
		System.out.println("mallName: " + mallName);
	}
	
	Mall(String mallName,double closingTime){
		this(mallName);
		this.closingTime = closingTime;
		System.out.println("closingTime: " + closingTime);
	}
	
	Mall(String mallName,double closingTime,double openingTime){
		this(mallName, closingTime);
		this.openingTime = openingTime;
		System.out.println("openingTime: " + openingTime);
	}
	
	Mall(String mallName,double closingTime,double openingTime,String mallLocation){
		this(mallName, closingTime, openingTime);
		this.mallLocation = mallLocation;
		System.out.println("mallLocation: " + mallLocation);
	}
	
	Mall(String mallName,double closingTime,double openingTime,String mallLocation,boolean checkingBeforeEntry){
		this(mallName, closingTime, openingTime, mallLocation);
		this.checkingBeforeEntry = checkingBeforeEntry;
		System.out.println("checkingBeforeEntry: " + checkingBeforeEntry);
	}
	
	Mall(String mallName,double closingTime,double openingTime,String mallLocation,boolean checkingBeforeEntry,char mallSize){
		this(mallName, closingTime, openingTime, mallLocation,checkingBeforeEntry);
		this.mallSize = mallSize;
		System.out.println("mallSize: " + mallSize);
	}
	
	Mall(String mallName,double closingTime,double openingTime,String mallLocation,boolean checkingBeforeEntry,char mallSize,boolean vehivleParkingSpace){
		this(mallName, closingTime, openingTime, mallLocation,checkingBeforeEntry,mallSize);
		this.vehivleParkingSpace = vehivleParkingSpace;
		System.out.println("vehivleParkingSpace: " + vehivleParkingSpace);
	}
}