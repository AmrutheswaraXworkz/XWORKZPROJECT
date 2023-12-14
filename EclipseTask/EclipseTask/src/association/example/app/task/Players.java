package association.example.app.task;

public class Players {

	private String name;
	private String age;
	private String location;

	public Players(String name, String age, String location) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;

	}

	public void association() {
		System.out.println("Running association in Players");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Players [name=" + name + ", age=" + age + ", location=" + location + "]";
	}

}
