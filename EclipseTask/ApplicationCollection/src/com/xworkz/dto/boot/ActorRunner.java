package com.xworkz.dto.boot;

import java.util.ArrayList;
import java.util.Collection;

public class ActorRunner {

	public static void main(String[] args) {
		Collection<String> actorName = new ArrayList<String>();
		actorName.add("Darshan");
		actorName.add("Sudeep");
		actorName.add("Puneeth Rajkumar");
		actorName.add("Yash");
		actorName.add("Vijay Thalapathy");
		actorName.add("Kamal Hasan");
		actorName.add("Rajnikanth");
		actorName.add("Shankar Nag");
		actorName.add("Ambareesh");
		actorName.add("Ananth Nag");
		actorName.add("Dhruva Sarja");

		String shiv = "Shivraj Kumar";
		String yash="Yash";
		Collection<String> kannadaActors = new ArrayList<String>();
		kannadaActors.add("Rakshith Shetty");
		kannadaActors.add("Rishab Shetty");
		System.out.println("Contains:" + actorName.contains(shiv));
		System.out.println("Contains Yash:"+actorName.contains(yash));
		System.out.println("Contains All:" + actorName.containsAll(kannadaActors));

		Collection<String> actorTest = new ArrayList<String>();
		actorTest.add("Yash");
		actorTest.add("Dhruva Sarja");
		System.out.println("Remove:" + actorName.remove(yash));
		System.out.println("Remove All:" + actorName.removeAll(actorTest));
	}

}
