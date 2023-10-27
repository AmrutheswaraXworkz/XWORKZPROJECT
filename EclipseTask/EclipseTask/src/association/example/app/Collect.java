package association.example.app;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;

public class Collect {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList<String>();
		collection.add("Virat");
		collection.add("Rohit");
		collection.add("Jadeja");
		collection.add("Raina");
		collection.add("Dhoni");
		collection.add("Sachin");
		collection.add("Siraj");

		System.out.println("Players:" + collection.size());

		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("names are:" + name);
		}
		
		
		
		
		System.err.println("removing sachin");
		collection.remove("Sachin");
		Iterator<String> itr1 = collection.iterator();

		while (itr1.hasNext()) {
			String name1 = itr1.next();
			System.out.println("names are:" + name1);
		}
		
		
		
		

		System.out.println(collection.contains("Siraj"));
		System.err.println("adding all");

		Collection<String> collect = new ArrayList<String>();
		collect.add("Zaheer");
		collect.add("Bhumrah");
		collection.addAll(collect);

		Iterator<String> itr2 = collection.iterator();

		while (itr2.hasNext()) {
			String name2 = itr2.next();
			System.out.println("names are:" + name2);
		}
		
		
		
		
		
		System.err.println("removing collect arraylist");
		collection.removeAll(collect);
		Iterator<String> itr3 = collection.iterator();

		while (itr3.hasNext()) {
			String name3 = itr3.next();
			System.out.println("names are:" + name3);
		}

		
		System.err.println(collection.isEmpty());
		collection.clear();
		
		
		System.err.println(collection.isEmpty());
		System.out.println("BYE");
		
	}

}
