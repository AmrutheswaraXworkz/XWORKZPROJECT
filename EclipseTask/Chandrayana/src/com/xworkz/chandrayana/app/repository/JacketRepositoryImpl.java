package com.xworkz.chandrayana.app.repository;

public class JacketRepositoryImpl implements JacketRepository {

	int j;
	String[] styles = new String[ITEMS];

	@Override
	public void style(String styles) {
		System.out.println("invoking style in JacketRepositoryImpl");
		if (this.j < ITEMS) {
			this.styles[j] = styles;
			System.out.println("storing " + styles + " at position " + j);
			j++;

		}

	}

}
