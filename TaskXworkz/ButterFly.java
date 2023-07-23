class ButterFly{
	static int legs;
	static int wings;
	int noOfAntena;
	String digestiveTract;
	
	public void instanceVarMethod(){
		System.out.printf("Number of Antena: %d \ndigestiveTract: %s",noOfAntena, digestiveTract);
	}
	
	static void staticVarMethod(){
		System.out.printf("\nlegs: %d \nwings : %d",legs, wings);
	}
	
	ButterFly(int noOfAntena, String digestiveTract){
		this.noOfAntena = noOfAntena;
		this.digestiveTract = digestiveTract;
	}
	
	static{
		legs = 6;
		wings = 4;
	}
}