package mapExamplescom.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import mapExamplescom.xworkz.map.dto.CountryDTO;
import mapExamplescom.xworkz.map.dto.PresidentDTO;

public class CountryPresidentMap {

	public static void main(String[] args) {
		CountryDTO country1 = new CountryDTO(1, "India");
		CountryDTO country2 = new CountryDTO(2, "Srilanka");
		CountryDTO country3 = new CountryDTO(3, "Pakistan");
		CountryDTO country4 = new CountryDTO(4, "Russia");
		CountryDTO country5 = new CountryDTO(5, "USA");

		PresidentDTO president1 = new PresidentDTO(1, "Modi");
		PresidentDTO president2 = new PresidentDTO(2, "Murulidharan");
		PresidentDTO president3 = new PresidentDTO(3, "Irfan Khan");
		PresidentDTO president4 = new PresidentDTO(4, "Putin");
		PresidentDTO president5 = new PresidentDTO(5, "Rishi");

		Map<PresidentDTO, CountryDTO> map = new HashMap<PresidentDTO, CountryDTO>();
		map.put(president1, country1);
		map.put(president2, country2);
		map.put(president3, country3);
		map.put(president4, country4);
		map.put(president5, country5);

		System.out.println("only keys!!!");
		Set<PresidentDTO> key = map.keySet();
		key.forEach(c -> System.out.println(c));

		System.out.println("++++++++++++++++++++");

		System.out.println("only values!!!");
		Collection<CountryDTO> value = map.values();
		value.forEach(d -> System.out.println(d));

		System.out.println("++++++++++++++++++++");

		System.out.println("using for each");
		Set<Entry<PresidentDTO, CountryDTO>> entries = map.entrySet();
		entries.forEach(e -> System.out.println(e));

		System.out.println("++++++++++++++++++++");

		System.out.println("using iterator !!!");
		Iterator<Entry<PresidentDTO, CountryDTO>> itr = entries.iterator();

		while (itr.hasNext()) {
			Entry<PresidentDTO, CountryDTO> hi = itr.next();
			System.out.println("Key:" + hi.getKey());
			System.out.println("Values:" + hi.getValue());
		}
		System.out.println("++++++++++++++++++++");

		System.out.println("using foreach!!!");
		map.forEach((k, v) -> System.out.println(k + "=" + v));
	}
}
