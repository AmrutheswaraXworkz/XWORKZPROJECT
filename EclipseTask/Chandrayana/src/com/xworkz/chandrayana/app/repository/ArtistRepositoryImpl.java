package com.xworkz.chandrayana.app.repository;

public class ArtistRepositoryImpl implements ArtistRepository{
	
	int i;
	String[] features=new String[N];
	@Override
	public void features(String features) {
		System.out.println("invoking features in ArtistRepositoryImpl");
		if(this.i<N) {
			this.features[i]=features;
			System.out.println("features are "+features+" at position "+this.i);
			this.i++;
			
		}
		else {
			System.err.println("out of memory");
		}
		
	}

}
