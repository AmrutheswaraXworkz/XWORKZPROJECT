package com.xworkz.dto.app.main;

public class Main {

	int x;
	
	public Main(int x) {
		this.x=x;
	}
	public static void main(String[] args) {
		Main a=new Main(20);
	
		System.out.println(a.x);
	}
}
