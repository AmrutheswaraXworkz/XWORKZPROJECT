package association.example.app;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 7;
		boolean flag = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i != 0) {
				flag = false;

			}
			
		}
		if(flag) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}
}
