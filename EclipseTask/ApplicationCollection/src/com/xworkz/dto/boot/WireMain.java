package com.xworkz.dto.boot;


import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.WireDTO;


public class WireMain {

	public static void main(String[] args) {
		Collection<WireDTO> dtos = new HashSet<WireDTO>();
		dtos.add(new WireDTO("Copper wire", 100, "ELectronics", 1.5));
		dtos.add(new WireDTO("Fiber Optic Cable", 110, "audio amplifiers", 1.8));
		dtos.add(new WireDTO("Copper wire", 120, "ELectronics", 1.5));
		dtos.add(new WireDTO("Armored Cable", 100, "transmitting signals", 1.2));
		dtos.add(new WireDTO("Portable Cord", 110, "alarm systems", 1.4));
		dtos.add(new WireDTO("High-Temperature Wire", 130, "submersible pumps", 1.55));
		dtos.add(new WireDTO("Low Voltage Wire", 170, "reeze protection", 1.58));

		System.out.println(dtos.stream().sorted().count());

		dtos.stream().collect(Collectors.toSet()).forEach(a -> System.out.println(a));
//		dtos.stream().sorted().collect(Collectors.toSet()).forEach(a -> System.out.println(a));
//		System.out.println();

	}
}
