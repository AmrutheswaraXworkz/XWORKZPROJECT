package com.xworkz.dto.boot;


import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.PlayGroundDTO;


public class PlayGroundMain {

	public static void main(String[] args) {
		PlayGroundDTO playground1 = new PlayGroundDTO("City Mall Play Area", "Indoor", 50, true);
		PlayGroundDTO playground2 = new PlayGroundDTO("City Mall Play Area", "Indoor", 50, true);
		PlayGroundDTO playground3 = new PlayGroundDTO("Sunset Park Playground", "Outdoor", 80, false);
		PlayGroundDTO playground4 = new PlayGroundDTO("Adventure Zone", "Indoor", 200, true);
		PlayGroundDTO playground5 = new PlayGroundDTO("Community Sports Field", "Outdoor", 150, false);
		PlayGroundDTO playground6 = new PlayGroundDTO("Play and Learn Center", "Indoor", 30, true);
		PlayGroundDTO playground7 = new PlayGroundDTO("Neighborhood Park", "Outdoor", 60, false);

		Collection<PlayGroundDTO> collection = new HashSet<PlayGroundDTO>();
		collection.add(playground1);
		collection.add(playground2);
		collection.add(playground3);
		collection.add(playground4);
		collection.add(playground5);
		collection.add(playground6);
		collection.add(playground7);

		System.out.println(collection.stream().sorted().count());
		collection.stream().collect(Collectors.toSet()).forEach(a -> System.out.println(a));
	}
}
