package com.xworkz.dto.boot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.app.dto.IceCreamDTO;

public class IceCreamRunner {

	public static void main(String[] args) {
		IceCreamDTO dto1 = new IceCreamDTO("StrawBerry", "Pink", 100, LocalDate.of(2023, 11, 2), "Cone");
		IceCreamDTO dto2 = new IceCreamDTO("Choclate", "Brown", 300, LocalDate.of(2023, 10, 2), "Candy");
		IceCreamDTO dto3 = new IceCreamDTO("BlackCurrent", "Purple", 200, LocalDate.of(2023, 11, 4), "Family Pack");
		IceCreamDTO dto4 = new IceCreamDTO("Vanila", "White", 200, LocalDate.of(2023, 8, 2), "Cone");
		IceCreamDTO dto5 = new IceCreamDTO("Pista", "Green", 75, LocalDate.of(2023, 1, 2), "Cup");

		Collection<IceCreamDTO> collection = Stream.of(dto1, dto2, dto3, dto4, dto5).collect(Collectors.toList());

		System.err.println("Sorting based on flavours");
		Comparator<IceCreamDTO> com = (t1, t2) -> t1.getFlavour().compareTo(t2.getFlavour());
		Stream.of(dto1, dto2, dto3, dto4, dto5).sorted(com).forEach(i -> System.out.println(i));

		System.out.println("================================");

		System.err.println("Sorting based on price");
		Comparator<IceCreamDTO> com1 = (t1, t2) -> t1.getPrice().compareTo(t2.getPrice());
		Stream.of(dto1, dto2, dto3, dto4, dto5).sorted(com1).forEach(i -> System.out.println(i));

		System.out.println("================================");
		System.err.println("Sorting based on date");
		Comparator<IceCreamDTO> com2 = (t1, t2) -> t2.getManDate().compareTo(t1.getManDate());
		Stream.of(dto1, dto2, dto3, dto4, dto5).sorted(com2).forEach(i -> System.out.println(i));

		System.out.println("================================");
		System.err.println("Sorting based on Color");
		Comparator<IceCreamDTO> com3 = (t1, t2) -> t1.getColor().compareTo(t2.getColor());
		Stream.of(dto1, dto2, dto3, dto4, dto5).sorted(com3).forEach(i -> System.out.println(i));

		System.out.println("================================");
		System.err.println("Sorting based on type");
		Comparator<IceCreamDTO> com4 = (t1, t2) -> t1.getType().compareTo(t2.getType());
		Stream.of(dto1, dto2, dto3, dto4, dto5).sorted(com4).forEach(i -> System.out.println(i));

		System.out.println("================================");
		System.err.println("Sorting based on both price and date (ascending order):");
		Comparator<IceCreamDTO> com6 = (t1, t2) -> t1.getPrice().compareTo(t2.getPrice());
		Comparator<IceCreamDTO> priceDateComparator = com6
				.thenComparing((t1, t2) -> t1.getManDate().compareTo(t2.getManDate()));

		Stream.of(dto1, dto2, dto3, dto4, dto5).sorted(priceDateComparator).forEach(i -> System.out.println(i));

	}
}
