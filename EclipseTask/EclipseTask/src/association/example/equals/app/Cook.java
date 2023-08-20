package association.example.equals.app;

public class Cook {
	private String name;
    private String specialization;
    private String cuisinePreference;
    private String experienceLevel;
    private String contactNumber;
    private String location;
    
    public Cook() {
    	
    	System.out.println("no parameter");
    }

    // Constructor
    public Cook(String name, String specialization, String cuisinePreference,
                String experienceLevel, String contactNumber, String location) {
        super();
    	this.name = name;
        this.specialization = specialization;
        this.cuisinePreference = cuisinePreference;
        this.experienceLevel = experienceLevel;
        this.contactNumber = contactNumber;
        this.location = location;
    }
    public String toString() {
        return "Cook{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", cuisinePreference='" + cuisinePreference + '\'' +
                ", experienceLevel='" + experienceLevel + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof Cook) {
				System.out.println("obj is instance of cook");
				Cook cook=(Cook)obj;
				if (cook.name.equals(this.name) && cook.contactNumber.equals(this.contactNumber)
						&& cook.location.equals(this.location)
						&& cook.experienceLevel.equals(this.experienceLevel)&& cook.cuisinePreference.equals(this.cuisinePreference)) {
					System.out.println("name ref and contents are same");
					return true;
				} else {
					System.out.println("name ref and contents are diff");
				}
			} else {
				System.out.println("obj ref not pointing to cook");
			}
		} else {
			System.out.println("obj is null");
		}
		return false;
	}
}
