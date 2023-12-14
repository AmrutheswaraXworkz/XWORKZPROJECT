package com.xworkz.dto.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.app.dto.OceanDTO;

public class OceanRunner {

	public static void main(String[] args) {

		OceanDTO ocean = new OceanDTO("Pacific Ocean", 63784077, "Salmon", "India");
		OceanDTO ocean1 = new OceanDTO("Atlantic Ocean", 106460000, "Haddock", "Americas");
		OceanDTO ocean2 = new OceanDTO("Indian Ocean", 27240000, "Snapper", "Asia");
		OceanDTO ocean3 = new OceanDTO("Southern Ocean", 20327000, "Antarctic toothfish", "Antartica");
		OceanDTO ocean4 = new OceanDTO("Arctic Ocean", 14056000, "Arctic char", "North Pole");

		Collection<OceanDTO> oceans = new LinkedList<OceanDTO>();
		oceans.add(ocean);
		oceans.add(ocean1);
		oceans.add(ocean2);
		oceans.add(ocean3);
		oceans.add(ocean4);
		
		oceans.stream().sorted().forEach(oc->System.out.println(oc));
	}
}
