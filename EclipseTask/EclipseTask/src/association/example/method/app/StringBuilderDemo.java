package association.example.method.app;

public class StringBuilderDemo {
	
	public static void main(String[] args) {

		String string = "Learning ";
		StringBuilder builder = new StringBuilder(string);
		System.out.println(builder.append("Java"));

		StringBuilder builder2 = new StringBuilder(10);
		System.out.println(builder2.capacity());

		String string2 = "Santosh";
		StringBuilder builder3 = new StringBuilder(string2);
		System.out.println(builder3.append('A'));

		StringBuilder builder4 = new StringBuilder(string2);
		System.out.println(builder4.compareTo(builder));

		String string3 = "Programing";
		StringBuilder builder5 = new StringBuilder(string3);
		System.out.println(builder5.charAt(2));

	}

}
