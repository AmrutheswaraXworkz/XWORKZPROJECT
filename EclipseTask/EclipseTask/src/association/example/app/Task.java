package association.example.app;
import java.util.Scanner;

public class Task {
	static String newStr;
	static String hi;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	while(n>0) {
		int r=n%10;
		int i=r*r;
		n=n/10;
		String str=String.valueOf(i);
		
		
		newStr=str+newStr;
		hi=newStr.substring(0, newStr.length()-4);
		
	}
	System.out.println(hi);
	
}
}
