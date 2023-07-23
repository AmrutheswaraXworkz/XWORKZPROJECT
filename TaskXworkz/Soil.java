class Soil{
	static String soilTexture;
	static String soilChem;
	String soilColor;
	String minerals;
	
	public void soilInstance(){
		System.out.println("soil colour:"+soilColor);
		System.out.println("minerals:"+minerals);
	}
	static void soilStatic(){
		System.out.println("soil texture:"+soilTexture);
		System.out.println("soil chem:"+soilChem);
	}
	Soil(String soilColor,String minerals){
		this.soilColor=soilColor;
		this.minerals=minerals;
	}
	static{
		soilTexture="sand,stone";
		soilChem="clay";
	}
}