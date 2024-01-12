package kantharacom.xworkz.kanthara.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




@Configuration
public class ConfigClass {

	@Bean
	public Long mobile1() {
		System.out.println("mobile1");
		return 6360504953L;
	}

	@Bean
	public Long mobile2() {
		System.out.println("mobile2");
		return 9341298015L;
	}

	@Bean
	public String email() {
		System.out.println("email");
		return "amrutheswara2001@gmail.com";
	}

	@Bean
	public Collection<String> names() {
		Collection<String> collection = new ArrayList<String>();
		collection.add("Amruth");
		collection.add("Gagan");
		System.out.println("collection");
		return collection;
	}

	@Bean
	public String[] college() {
		String[] college = { "ubdt", "biet", "gmit" };
		System.out.println("string array");
		return college;
	}
	
	@Bean
	public ArrayList<Integer> number(){
		ArrayList<Integer> no=new ArrayList<Integer>();
		no.add(1);
		no.add(2);
		System.out.println("arraylist");
		return no;
	}
	
	@Bean
	public TreeSet<String> hello(){
		TreeSet<String> tree=new TreeSet<String>();
		tree.add("tree");
		tree.add("branch");
		System.out.println("tree set");
		return tree;
	}
	
	@Bean
	public HashMap<Integer, String> map(){
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Amruth");
		map.put(2, "Gagan");
		System.out.println("map");
		return map;
	}

}
