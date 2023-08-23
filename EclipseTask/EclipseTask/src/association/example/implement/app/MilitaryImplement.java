package association.example.implement.app;

public class MilitaryImplement implements Military {

	@Override
	public boolean wearUniform() {
		return true;
	}

	@Override
	public String service() {
		return "Security";
	}

	@Override
	public int unitNumber() {
		return 100;
	}

}
