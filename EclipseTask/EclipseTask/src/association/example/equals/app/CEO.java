package association.example.equals.app;

public class CEO {
	 private String name;
	    private int age;
	    private String company;
	    private double salary;
	    private String education;
	    private int yearsOfExperience;
	    
	    public CEO() {
	    	System.out.println("no parameters");
	    }

	    
	    public CEO(String name, int age, String company, double salary, String education, int yearsOfExperience) {
	        super();
	    	this.name = name;
	        this.age = age;
	        this.company = company;
	        this.salary = salary;
	        this.education = education;
	        this.yearsOfExperience = yearsOfExperience;

}
	    @Override
	    public String toString() {
	    	return "CEO[name="+name+",age="+age+",company="+company+
	    			",salary="+salary+",education="+education+",years of exp="+yearsOfExperience+"]";
	    	
	    }
	    
	    @Override
	    public boolean equals(Object obj) {
	    	if(obj!=null) {
	    		System.out.println("object is not null");
	    		if(obj instanceof CEO) {
	    			System.out.println("obj is instance of ceo");
	    			CEO ceo=(CEO)obj;
	    			if(ceo.company.equals(this.company)&&ceo.education.equals(this.education)) {
	    				System.out.println("company ref and contents are same");
	    				return true;
	    			}
	    			else {
	    				System.out.println("company ref and contents are diff");
	    			}
	    		}
	    		else {
	    			System.out.println("obj ref not pointing tp CEO");
	    		}
	    	}
	    		else {
	    			System.out.println("obj is null");
	    		}
	    		return false;
	    	}
	    
}


