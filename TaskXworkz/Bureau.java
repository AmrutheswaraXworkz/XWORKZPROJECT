class Bureau{
	int noOfDoors;
	char size;
	static String madeFrom;
	static boolean storesItems;
	
	public void instanceVarMethod(){
		System.out.printf("noOfDoors: %d \nSize: %c", noOfDoors, size);
	}
	
	static void staticVarMethod(){
		System.out.printf("\nmadeFrom: %s \nstoresItems: %b", madeFrom, storesItems);
	}
	
	Bureau(int noOfDoors, char size){
		this.noOfDoors = noOfDoors;
		this.size = size;
	}
	
	static{
		madeFrom = "Metalic";
		storesItems = true;
	}
}