package association.example.equals.app;

public class Mechanic {

	private String name;
	private int age;
	private String specialization;
	private String certification;
	private String contactNumber;
	private String address;

	public Mechanic() {
		System.out.println("no parameter");
	}

	// Constructor
	public Mechanic(String name, int age, String specialization, String certification, String contactNumber,
			String address) {
		super();
		this.name = name;
		this.age = age;
		this.specialization = specialization;
		this.certification = certification;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Mechanic{" + "name='" + name + '\'' + ", age=" + age + ", specialization='" + specialization + '\''
				+ ", certification='" + certification + '\'' + ", contactNumber='" + contactNumber + '\''
				+ ", address='" + address + '\'' + '}';
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof Mechanic) {
				System.out.println("obj is instance of mechanic");
				Mechanic mechanic = (Mechanic) obj;
				if (mechanic.name.equals(this.name) && mechanic.contactNumber.equals(this.contactNumber)
						&& mechanic.specialization.equals(this.specialization)
						&& mechanic.certification.equals(this.certification)) {
					System.out.println("name ref and contents are same");
					return true;
				} else {
					System.out.println("name ref and contents are diff");
				}
			} else {
				System.out.println("obj ref not pointing to mechanic");
			}
		} else {
			System.out.println("obj is null");
		}
		return false;
	}

}
