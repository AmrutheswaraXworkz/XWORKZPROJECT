package association.example.method.app;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		StringBuffer buffer=new StringBuffer("Santhosh");
		System.out.println(buffer.capacity());
		
		String string="Java";
		StringBuffer buffer2=new StringBuffer(string);
		System.out.println(buffer2.charAt(0));
		
		System.out.println(buffer2.codePointAt(1));
		
		String string2="Amruth";
		StringBuffer buffer3=new StringBuffer(string2);
		System.out.println(buffer3.codePointCount(0, 2));
		
		String string3="amruth";
		StringBuffer buffer4=new StringBuffer(string3);
		System.out.println(buffer4.compareTo(buffer2));
	}

}
