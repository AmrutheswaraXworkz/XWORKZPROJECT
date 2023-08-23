package association.example.implement.app;

public class TempleImplement implements Temple  {

	@Override
	public void NoMobile() {
		System.out.println("NoMobile method implemention in Class....");

	}

	@Override
	public int openTimings(int time) {
		System.out.println("OpenTimings method implemention in Class....");
		System.out.println("Open Timings : " + time);
		return 1;
	}

	@Override
	public void noSmoking() {
		System.out.println("NoSmoking method implemention in Class....");
	}
	
	

}
