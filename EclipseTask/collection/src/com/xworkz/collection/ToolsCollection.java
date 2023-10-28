package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ToolsCollection {

	public static void main(String[] args) {
		Collection<String> tools = new ArrayList<String>();
		tools.add("Plier");
		tools.add("Spanner");
		tools.add("Hammer");
		tools.add("Saw");
		tools.add("Screw Driver");
		tools.add("Jack");
		tools.add("Cutter");

		Collection<String> item = new ArrayList<String>();
		item.add("Flash Light");
		item.add("Wrench");

		System.out.println(tools.addAll(item));

		Collection<String> newTools = new ArrayList<String>();
		newTools.add("Saw");
		newTools.add("Cutter");

		Collection<String> newItems = new ArrayList<String>();
		newItems.add("Screw");
		newItems.add("Spanner");

		System.out.println("containsAll:" + tools.containsAll(newTools));

		System.out.println("removeAll:" + tools.removeAll(newItems));
	}

}
