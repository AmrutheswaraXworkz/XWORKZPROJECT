package com.xworkz.chandrayana.boot;

import com.xworkz.chandrayana.app.repository.ArtistRepositoryImpl;

public class ArtistRunner {
	public static void main(String[] args) {
		String[] features = { "good", "portrait", "sketch", "shades" };
		ArtistRepositoryImpl x = new ArtistRepositoryImpl();
		for (int j = 0; j < features.length; j++) {
			x.features(features[j]);

		}
	}
}
