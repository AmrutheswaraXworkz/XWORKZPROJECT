package association.example.app.inheritance.util;

import association.example.app.inheritance.zoo.*;

public class ZooUtil extends Zoo {
	public void zooUtilMethod(Zoo zoo) {
		Zoo zoo2 = new Zoo();
		zoo2.zooMethod();
		
		if(zoo instanceof StateZoo) {
			Zoo zoo3 = new StateZoo();
			StateZoo stateZoo = (StateZoo)zoo3;
			stateZoo.stateZoo();
		}
		
		if(zoo instanceof NationalZoo) {
			Zoo zoo4 = new NationalZoo();
			NationalZoo nationalZoo = (NationalZoo)zoo4;
			nationalZoo.nationalZooMethod();
		}
	}
}
