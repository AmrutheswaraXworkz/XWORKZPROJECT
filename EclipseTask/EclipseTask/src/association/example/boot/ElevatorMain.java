package association.example.boot;

import association.example.app.methodoverl.Elevator;

public class ElevatorMain {
	public static void main(String[] args) {
		Elevator elevator=new Elevator();
		elevator.elevator();
		elevator.elevator("bosch",10);
	}

}
