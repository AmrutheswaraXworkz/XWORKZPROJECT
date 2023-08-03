package association.example.app.inheritancemain;

import association.example.app.inheritance.chacolate.*;
import association.example.app.inheritance.util.ChacolateUtil;

public class ChacolateMain {
	public static void main(String[] args) {
		ChacolateUtil chacolateUtil = new ChacolateUtil();

		Chacolate chacolate = new Chacolate();
		System.out.println(chacolate.chacolateName);
		chacolateUtil.chacolateUtilMethod(chacolate);

		DarkChacolate darkChacolate = new DarkChacolate();
		System.out.println(darkChacolate.darkChacolateMinerals);
		chacolateUtil.chacolateUtilMethod(darkChacolate);

		CaramelChacolate caramelChacolate = new CaramelChacolate();
		System.out.println(caramelChacolate.mixedWith);
		chacolateUtil.chacolateUtilMethod(caramelChacolate);

	}

}
