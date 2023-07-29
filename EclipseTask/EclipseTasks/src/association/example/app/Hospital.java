package association.example.app;

public class Hospital {
	public Doctor doctor=new Doctor();
	public Nurse nurse=new Nurse();
	public Patient patient=new Patient();
	 
	public void hospital() {
		System.out.println("invoking hospital from Hospital");
	    this.doctor.specality();
	    this.doctor.specality();
	    this.nurse.qualification();
	    this.nurse.id();
	    this.patient.disease();
	    this.patient.name();
	    
	
	}
}
