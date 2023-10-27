package association.example.app;

public class AssociateRunner {
	private Associate associate = new Associate();

	public void car() {
		associate.add();
		System.out.println("added");
	}

	public static void main(String[] args) {
		AssociateRunner associateRunner = new AssociateRunner();
		associateRunner.car();

	}
}
