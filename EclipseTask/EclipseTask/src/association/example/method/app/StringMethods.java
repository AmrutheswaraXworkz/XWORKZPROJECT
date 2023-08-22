package association.example.method.app;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Hi,every Prends";
		System.out.println("given string is:" + str);
		char a = str.charAt(5);
		System.out.println("char at index 5 is:" + a);

		String[] b = str.split("e");
		System.out.println("after splitting");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		String[] c = str.split("e", 3);
		System.out.println("after splitting");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		String str1 = "hello friends";
		str1 = str1.concat(" good morning");
		System.out.println("new string is:" + str1);

		int compare = str1.compareTo("hi good morning");
		System.out.println(compare);

		String str2 = str1.substring(3);
		System.out.println("substring is:" + str2);

		str1 = str1.substring(2, 5);
		System.out.println("substring is:" + str1);

		boolean is = str1.isEmpty();
		System.out.println("is empty:" + is);

		int length = str1.length();
		System.out.println("lenght of " + str1 + "is:" + length);

		boolean start = str1.startsWith("l");
		System.out.println("starts with l is:" + start);

		System.out.println("ends with is:" + str1.endsWith("g"));
		
		String str3="Xworkz";
		boolean equals=str3.equalsIgnoreCase("xworkz");
		System.out.println("is equal irrespective of case:"+equals);
		
		str3=str3.toUpperCase();
		System.out.println(str3);
		
		str3=str3.toLowerCase();
		System.out.println(str3);
		
		boolean blank=str3.isBlank();
		System.out.println("is blank:"+blank);
		
		int index=str3.indexOf(3);
		System.out.println("index is:"+index);
		
		str3="X workz odc";
		str3=str3.trim();
		System.out.println("trim is:"+str3);

	}
}
