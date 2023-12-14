package com.xworkz.dto.boot;

import java.util.LinkedList;
import java.util.List;

public class StringList {
	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("Amruth");
		list.add("Gagan");
		list.add("Nitish");
		list.add("Sachin");
		list.add("Amaresh");
		list.add("Darshan");
		
		list.add(3, "Saiganesh");
		list.forEach(s->System.out.println(s));
		System.out.println("=====");
		List<String> list1=new LinkedList<String>();
		list1.addAll(0, list);
		list1.forEach(c->System.out.println(c));
		System.out.println("================");
		System.out.println(list1.get(3));
		System.out.println("================");
		System.out.println(list1.indexOf("Amruth"));
		System.out.println("================");
		list1.remove(2);
		list1.forEach(s->System.out.println(s));
		System.out.println("================");
		list1.subList(0, 3).forEach(s->System.out.println(s));
		System.out.println("================");
		System.out.println(list1.set(0, "Amaresh"));
		
	}
}
