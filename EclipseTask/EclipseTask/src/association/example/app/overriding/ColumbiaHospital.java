package association.example.app.overriding;

public class ColumbiaHospital extends Hospital1 {
	@Override
	public void treats() {
		System.out.println("Calling SUB class method with no-arg");
	}

	@Override
	public void treats(String nameOfHospital) {
		System.out.println("Calling SUB class method with String-arg");
		System.out.println("Name Of Hospital : " + nameOfHospital);
	}

	@Override
	public void treats(double costOfRegistration) {
		System.out.println("Calling SUB class method with double-arg");
		System.out.println("Cost of Registration : " + costOfRegistration);
	}

	@Override
	public void treats(int noOfPatients) {
		System.out.println("Calling SUB class method with int-arg");
		System.out.println("No Of Patients : " + noOfPatients);
	}

	@Override
	public void treats(String nameOfPatient, String disease) {
		System.out.println("Calling SUB class method String,String no-arg");
		System.out.println("Disease : " + disease);
		System.out.println("Name of Patient : " + nameOfPatient);
	}

	@Override
	public void treats(String nameOfHospital, String nameOfPatient, double cost) {
		System.out.println("Calling SUB class method with String,String,double-arg");
		System.out.println("Hospital : " + nameOfHospital);
		System.out.println("Name of  patient : " + nameOfPatient);
		System.out.println("Cost : " + cost);
	}
}
