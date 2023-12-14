package com.xworkz.app.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FestiavlCollection {

	
	
	
	
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.addAll(Arrays.asList("Shivaratri", "Ganesh chaturthy", "Deepawali", "Dasara", "Nagara panchami",
				"Independance day", "Republic day", "Kannada rajyostava", "Yugadi", "Varamahalaxmi pooja", "Moharam",
				"Eid milad", "Ramjan", "Bakrid", "Krishna Janmastami", "Onam", "Festivals", "FestivalS"));
		System.out.println(strings.size());
		
		strings.stream().filter((v)->v.startsWith("D")).forEach((e)->System.out.println(e));
		System.out.println();
		
		strings.stream().filter((len) -> len.length() > 8).forEach(l -> System.out.println(l));
		System.out.println();
		
		List<String> integers=strings.stream().filter((r)->r.length()<8).collect(Collectors.toList());
		System.err.println(integers);
		
		List<String> list=strings.stream().filter((con)->con.contains("O")||con.contains("o")).collect(Collectors.toList());
		System.out.println(list);
		
		
	}
}
