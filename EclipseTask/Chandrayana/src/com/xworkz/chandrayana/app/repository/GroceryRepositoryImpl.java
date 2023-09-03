package com.xworkz.chandrayana.app.repository;

public class GroceryRepositoryImpl implements GroceryRepository {

	
	private int position;
	String[] grocery = new String[TOTAL_ITEMS];

	@Override
	public void save(String grocery) {

		System.out.println("invoking save in GroceryRepositoryImpl");
		if (this.position < 10) {
			this.grocery[position] = grocery;
			System.out.println("Storing " + grocery + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("storage full can't Store further");
		}

	}

}
