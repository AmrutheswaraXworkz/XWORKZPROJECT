package com.xworkz.app.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Festival  {

	public static void main(String[] args) {
		
		
		List<String> strings = new ArrayList<>();
		strings.addAll(Arrays.asList("Shivaratri", "Ganesh chaturthy", "Deepawali", "Dasara", "Nagara panchami",
				"Independance day", "Republic day", "Kannada rajyostava", "Yugadi", "Varamahalaxmi pooja", "Moharam",
				"Eid milad", "Ramzan", "Bakrid", "Krishna Janmastami", "Onam", "Festivals", "FestivalS"));
		System.out.println(strings.size());

		strings.stream().filter((v) -> v.startsWith("D")).forEach((e) -> System.out.println(e));
		System.out.println();

		// more then 8 characters
		strings.stream().filter((len) -> len.length() > 8).forEach(l -> System.out.println(l));
		System.out.println();

		// less then 8 characters collect to another collection
		List<String> integers = strings.stream().filter((r) -> r.length() < 8).collect(Collectors.toList());
		System.err.println("Less than 8 characters:"+integers);

		// contains O or o
		List<String> list = strings.stream().filter((con) -> con.contains("O") || con.contains("o"))
				.collect(Collectors.toList());
		System.out.println("Contains O or o :" + list);

		// not contains g
		List<String> list2 = strings.stream().filter((con) -> !con.contains("g")).collect(Collectors.toList());
		System.err.println("Not contain 'g': " + list2);

		// ends with S or s
		System.out.println();
		strings.stream().filter((con) -> con.toLowerCase().endsWith("s") || con.toUpperCase().endsWith("S"))
				.collect(Collectors.toList()).forEach(s -> System.out.println(s));

		// contains R or Z
		System.out.println();
		List<String> list4 = strings.stream().filter((r) -> r.contains("R") || r.contains("Z"))
				.collect(Collectors.toList());
		System.out.println("Contains R or Z: " + list4);

		// contains Ram
		List<String> list5 = strings.stream().filter((r) -> r.contains("Ram")).collect(Collectors.toList());
		System.out.println("Contains Ram: " + list5);
	}
}