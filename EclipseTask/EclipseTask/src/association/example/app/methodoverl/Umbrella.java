package association.example.app.methodoverl;

public class Umbrella {
	public void umbrella() {
		System.out.println("invoking umbrella in Umbrella without arguments");
		umbrella(true);
    	umbrella("555 monkey");
		
	}

	public void umbrella(boolean waterProof) {
		System.out.println("invoking umbrella with boolean");
		System.out.println("does umbrella is water proof:" + waterProof);
	}

	public void umbrella(String name) {
		System.out.println("invoking umbrella with String");
		System.out.println("name of the umbrella:" + name);

	}
    public void umbrella(boolean waterProof,String name) {
    	System.out.println("invoking with both boolean and String");
    	umbrella(waterProof);
		umbrella(name);
    	
    }
}
