package association.example.equals.app;

public class ExampleString {
	private String value;

	public ExampleString(String value) {
		this.value = value;
	}

	public void printValue() {
		System.out.println(value);
	}

	public int length() {
		return value.length();
	}

	public String concat(String other) {
		return value.concat(other);
	}

	public boolean isEmpty() {
		return value.isEmpty();
	}

	public char charAt(int index) {
		return value.charAt(index);
	}

	public static int compare(String str1, String str2) {
		return str1.compareTo(str2);
	}

}
