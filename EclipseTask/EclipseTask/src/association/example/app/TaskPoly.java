package association.example.app;

public class TaskPoly {
	public void addition(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum of two number is:" + sum);
	}
	
	public void addition(int num1,int num2,int num3) {
		int sum=num1+num2+num3;
		System.out.println("sum of three numbers is:"+sum);
	}
	public static void main(String[] args) {
		TaskPoly poly=new TaskPoly();
		poly.addition(10, 11);
		poly.addition(10, 11, 12);
	}
}
