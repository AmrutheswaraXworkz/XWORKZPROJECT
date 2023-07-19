class Dumbell{
	int pairs;
	int size;
	float weight;
	
	Dumbell(){
		System.out.println("invoking default constructor");
		System.out.println("PAIRS:"+this.pairs);
		System.out.println("SIZE:"+this.size);
		System.out.println("WEIGHT:"+this.weight);
		this.pairs=4;
		this.size=10;
		this.weight=50;
		
	}
	Dumbell(int pairs,int size,float weight){
		System.out.println("invoking parametarized constructor");
		this.pairs=pairs;
		this.size=size;
		this.weight=weight;
	}
}