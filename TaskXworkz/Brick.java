class Brick{
	static String soilUsed;
	static boolean brickBurn;
	String shape;
	String brickUsedFor;
	
	public void brickInstanceMethod(){
		System.out.println("shape:"+shape+"brickUsedFor:"+brickUsedFor);
	}
	static void brickStaticMethod(){
		System.out.println("\n soilUsed:"+soilUsed+ "brickBurn:"+brickBurn);
	}
	Brick(String shape,String brickUsedFor){
		this.shape=shape;
		this.brickUsedFor=brickUsedFor;
	}
	static{
		soilUsed="red and black";
		brickBurn=true;
	}
}