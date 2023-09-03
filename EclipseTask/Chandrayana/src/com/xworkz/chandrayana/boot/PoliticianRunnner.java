package com.xworkz.chandrayana.boot;

import com.xworkz.chandrayana.app.repository.PolticianRepositoryImpl;

public class PoliticianRunnner {
	public static void main(String[] args) {
		PolticianRepositoryImpl poli = new PolticianRepositoryImpl();
		String[] hello = { "bsy", "siddramaiya", "hdk", "modi" };
		for (int x = 0; x < hello.length; x++) {
			poli.name(hello[x]);
		}
		
	}
}
