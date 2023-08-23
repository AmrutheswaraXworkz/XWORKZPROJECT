package association.example.implement.app;

public class EngineerImplement implements Engineer {

	@Override
	public void attendence() {
		System.out.println("invoking attendence in EngineerImplement");
	}

	@Override
	public void dress(boolean isGood) {
		System.out.println("invoking dress in EngineerImplement");

	}

	@Override
	public void decency(boolean isDecent) {
		System.out.println("invoking decency in EngineerImplement");

	}

	@Override
	public void marks(int marks) {
		System.out.println("invoking marks in EngineerImplement");

	}

	@Override
	public void fees(long fees) {
		System.out.println("invoking fees in EngineerImplement");

	}

}
