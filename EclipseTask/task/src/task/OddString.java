package task;

public class OddString {

	public static void main(String[] args) {

		String str = "Veeresh will not participate in xworkz anniverssary";
		String strOdd = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 != 0) {
				strOdd = strOdd + str.charAt(i);
			}
		}
		System.out.println(strOdd);

	}
}
