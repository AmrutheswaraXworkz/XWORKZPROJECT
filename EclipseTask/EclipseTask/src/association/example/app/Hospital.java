package association.example.app;

public class Hospital {
	Doctor doctor=new Doctor();
	Nurse nurse=new Nurse();
	Patient patient=new Patient();
	public void hospital() {
		System.out.println("invoking hospital from Hospital");
		this.doctor.exp();
		this.doctor.speciality();
		this.nurse.id();
		this.nurse.qualification();
		this.patient.disease();
		this.patient.name();
		
	}

}

