package task;

public class PrimeNumber {

	public void prime(int n) {
		if(n==1||n==2) {
			System.out.println("is prime");
		}

		for (int j = 2; j < n ; j++) {
			if (n % j == 0) {
				System.out.println("not prime");
				break;
			} else {
				System.out.println("is prime");
				break;

			}
		}
	}

	public static void main(String[] args) {
		PrimeNumber n = new PrimeNumber();
		n.prime(14);
	}
}
