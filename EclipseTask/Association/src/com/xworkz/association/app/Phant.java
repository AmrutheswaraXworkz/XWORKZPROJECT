package com.xworkz.association.app;

public class Phant {
	private Zip zip;
	private char size;

	public Phant(Zip zip, char size) {
		super();
		this.zip = zip;
		this.size = size;

		System.out.println("zip: " + zip);
		System.out.println("size: " + size);
	}

	public void color() {
		this.zip.zipMethod();
	}
}
