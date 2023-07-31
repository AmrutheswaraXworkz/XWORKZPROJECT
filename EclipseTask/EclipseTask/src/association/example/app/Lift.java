package association.example.app;

public class Lift {

	public int number;

	public Lift(int number) 
	{
      this.number = number;
	}

	public void printInfo() {
			System.out.println("Invoking lift info");

			System.out.println("No :" + number);
	}
	
}


