package association.example.equals.app;

public class Sniper {
	 private String name;
	    private int age;
	    private String rifleModel;
	    private int shotsFired;
	    private double accuracy;
	    private String gun;

	    
	    public Sniper() {
	    	System.out.println("no parameter");
	    }
	    // Constructor
	    public Sniper(String name, int age, String rifleModel, int shotsFired, double accuracy, String gun) {
	        super();
	    	this.name = name;
	        this.age = age;
	        this.rifleModel = rifleModel;
	        this.shotsFired = shotsFired;
	        this.accuracy = accuracy;
	        this.gun = gun;
	    }
	    @Override
	    public String toString() {
	        return "Sniper{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                ", rifleModel='" + rifleModel + '\'' +
	                ", shotsFired=" + shotsFired +
	                ", accuracy=" + accuracy +
	                ", isVeteran=" + gun +
	                '}';
	    }
	    @Override
	    public boolean equals(Object obj) {
	    	if(obj!=null) {
	    		System.out.println("object is not null");
	    		if(obj instanceof Sniper) {
	    			System.out.println("obj is instance of snipers");
	    			Sniper sniper=(Sniper)obj;
	    			if(sniper.name.equals(this.name)&&sniper.rifleModel.equals(this.rifleModel)&&sniper.gun.equals(this.gun)) {
	    				System.out.println("name ref and contents are same");
	    				return true;
	    			}
	    			else {
	    				System.out.println("name ref and contents are diff");
	    			}
	    		}
	    		else {
	    			System.out.println("obj ref not pointing tp sniper");
	    		}
	    	}
	    		else {
	    			System.out.println("obj is null");
	    		}
	    		return false;
	    	}
	    
	   
}
