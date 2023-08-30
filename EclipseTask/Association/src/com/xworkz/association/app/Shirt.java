package com.xworkz.association.app;

public class Shirt {
	private Button button;
	private char size;

	public Shirt(char size) {
		super();
		this.size = size;
		System.out.println("Size of the shirt: " + size);
	}

	public void setButton(Button button) {
		this.button = button;
		System.out.println("Button shape is: " + button);
	}

	public void color() {
		System.out.println("Color shirt");
		button.buttonShape();
	}
}
