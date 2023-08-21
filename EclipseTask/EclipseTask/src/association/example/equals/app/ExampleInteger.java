package association.example.equals.app;

public class ExampleInteger {
	private int value;

	public ExampleInteger(int value) {
		this.value = value;
	}

	public void printValue() {
		System.out.println(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int newValue) {
		value = newValue;
	}

	public boolean isEven() {
		return value % 2 == 0;
	}

	public boolean isPositive() {
		return value > 0;
	}

	public static int sum(int a, int b) {
		return a + b;
	}
}
