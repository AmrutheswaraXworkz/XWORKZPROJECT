package mapExamplescom.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NameAdharMap {

	public static void main(String[] args) {
		Map<Double, String> adharName = new HashMap<Double, String>();
		System.out.println(adharName.isEmpty());
		adharName.put(6360504953D, "Amruth");
		adharName.put(6360504954D, "Gagan");
		adharName.put(6360504955D, "Nitish");
		adharName.put(6360504956D, "Amaresh");
		adharName.put(6360504957D, "Santosh");
		adharName.put(6360504958D, "Bindhu");
		adharName.put(6360504959D, "Devaraj");
		adharName.put(6360504950D, "Sachin");
		adharName.put(6360504960D, "Manoj");
		adharName.put(6360504961D, "Darshan");
		System.out.println(adharName.isEmpty());
		System.out.println(adharName.size());

		Set<Double> keyValues = adharName.keySet();
		keyValues.forEach(c -> System.out.println(c));
		System.err.println("--------------------------");
		Collection<String> values = adharName.values();
		values.forEach(c -> System.out.println(c));
		System.err.println("--------------------------");
		Set<Entry<Double, String>> entries = adharName.entrySet();
		entries.forEach(c -> System.out.println(c));

	}
}
