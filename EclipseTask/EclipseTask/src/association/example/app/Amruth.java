package association.example.app;

public class Amruth {

	public static void main(String[] args) {
		String name="Amrutheswara2001@gmail.com";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch=='2') {
				System.out.println(i);
			}
			
		
		}
		for(int j=0;j<name.length();j++) {
			char ch1=name.charAt(j);
			System.out.println(ch1);
		}
	}
}
