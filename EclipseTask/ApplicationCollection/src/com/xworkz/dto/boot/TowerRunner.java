package com.xworkz.dto.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.app.dto.TowerDTO;

public class TowerRunner {

	public static void main(String[] args) {
		TowerDTO tower=new TowerDTO("Burj Khalifa", 828, "Dubai", 1.5);
		TowerDTO tower1=new TowerDTO("Eiffel Tower", 324, "Paris", 0.78);
		TowerDTO tower2=new TowerDTO("Tokyo Skytree", 634, "Tokyo", 6);
		TowerDTO tower3=new TowerDTO("CN Tower", 553, "Toronto", 2.5);
		TowerDTO tower4=new TowerDTO("Shanghai Tower", 632, "Shanghai", 2.4);
		
		
		Collection<TowerDTO> towers=new LinkedList<TowerDTO>();
		towers.add(tower);
		towers.add(tower1);
		towers.add(tower2);
		towers.add(tower3);
		towers.add(tower4);
		
		towers.stream().sorted().forEach(c->System.out.println(c));
	}
}
