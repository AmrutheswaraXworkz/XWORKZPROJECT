package com.xworkz.dto.boot;


import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.app.dto.HardwareDTO;


public class HardwareMain {

	public static void main(String[] args) {
		HardwareDTO hardware1 = new HardwareDTO("Laptop", "Personal Computer", "Dell", true);
		HardwareDTO hardware2 = new HardwareDTO("Smartphone", "Mobile Device", "Samsung", true);
		HardwareDTO hardware3 = new HardwareDTO("Printer", "Peripheral", "HP", true);
		HardwareDTO hardware4 = new HardwareDTO("Router", "Networking Device", "Cisco", true);
		HardwareDTO hardware5 = new HardwareDTO("Graphics Card", "Computer Component", "NVIDIA", true);
		HardwareDTO hardware6 = new HardwareDTO("Hard Drive", "Storage Device", "Seagate", true);
		HardwareDTO hardware7 = new HardwareDTO("Router", "Networking Device", "Cisco", true);

		Collection<HardwareDTO> collection = new HashSet<HardwareDTO>();

		collection.add(hardware1);
		collection.add(hardware2);
		collection.add(hardware3);
		collection.add(hardware4);
		collection.add(hardware5);
		collection.add(hardware6);
		collection.add(hardware7);

		System.out.println(collection.stream().sorted().count());
		collection.stream().collect(Collectors.toSet()).forEach(a -> System.out.println(a));
	}
}
