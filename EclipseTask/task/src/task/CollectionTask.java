package task;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;

public class CollectionTask {

	public static void main(String[] args) {
		Collection<String> collection1 = new LinkedList<String>();
		collection1.add("Amruth");
		collection1.add("Gagan");
		collection1.add("Amaresh");
		collection1.add("Sachin");
		collection1.add("Devraj");
		collection1.add("Nitish");
		collection1.add("Darshan");
		collection1.add("Manoj");
		collection1.add("Santosh");
		collection1.add("SaiGanesh");

		Collection<String> collection2 = new LinkedList<String>();
		collection2.add("Amruth");
		collection2.add("Amruth");
		collection2.add("Amaresh");
		collection2.add("Amaresh");
		collection2.add("Devraj");
		collection2.add("Nitish");
		collection2.add("Darshan");
		collection2.add("Manoj");
		collection2.add("Santosh");
		collection2.add("SaiGanesh");

		collection1.retainAll(collection2);
		System.out.println(collection1);

		collection2.removeAll(collection1);
		System.out.println(collection2);

	}
}
