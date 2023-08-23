package association.example.implement.app;

public class EngineerImplement implements Engineer {

	public String wearId() {

		return "YES";
	}

	@Override
	public void attendence() {
		System.out.println("Attence method implementaion in EngEngineeringRules.....");

	}

	@Override
	public double fee() {

		return 25000;
	}
}
