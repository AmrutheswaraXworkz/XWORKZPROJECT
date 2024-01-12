package task;

public class StringRev {

	public static void main(String[] args) {
		String name = "gagan";
		String rev = "";
		char ch[] = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			rev = ch[i] + rev;
		}
		System.out.println(rev);
	}
}
