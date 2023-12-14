package task;

import java.rmi.UnexpectedException;

public class SaturadyMock {

	
	public static void main(String[] args) throws UnexpectedException {
		int a=10;
		if(a<8) {
			System.out.println("wrong");
		}
		else {
			
			throw new UnexpectedException("value of a must be 10");
			
		}
	}
}
