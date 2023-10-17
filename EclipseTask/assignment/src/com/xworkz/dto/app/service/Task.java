package com.xworkz.dto.app.service;
import java.util.Scanner;
public class Task {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		double numberDouble=sc.nextDouble();
		sc.nextLine();
		String str=sc.nextLine();
		sc.nextLine();
		
		System.out.println("integer:"+num);
		System.out.println("double:"+numberDouble);
		System.out.println("String:"+str);
		
	}

}
