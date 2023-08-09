package association.example.boot.override;

import association.example.app.overriding.Hospital;
import association.example.app.overriding.NewHospital;

public class HospitalMain {
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.hospital();
		hospital.hospital(true);
		hospital.hospital(25);
		hospital.hospital("manipal");
		hospital.hospital(25000, "kidneystone");
		hospital.hospital("jayanagar", 11);
		System.out.println("=====================");
		Hospital hospital2=new NewHospital();
		hospital2.hospital();
		hospital2.hospital(true);
		hospital2.hospital(35);
		hospital2.hospital("jayadeva");
		hospital2.hospital(125000, "heart attacke");
		hospital2.hospital("jayanagar",2);
		
		
	}

}
