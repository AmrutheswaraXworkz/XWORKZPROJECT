package com.xworkz.exceptions.event.boot;

import java.io.IOException;

import com.xworkz.exceptions.event.Fest;

public class FestRunner {

	public static void main(String[] args) {
		Fest fest = new Fest();

		try {
			fest.dasara();
			Class.forName("com.just.not.work");
		} catch (IOException e) {
			System.err.println("handled IOException");

		} catch (ClassNotFoundException e) {
			System.err.println("handled ClassNotFoundException" + e.getMessage());

		}
	}
}
