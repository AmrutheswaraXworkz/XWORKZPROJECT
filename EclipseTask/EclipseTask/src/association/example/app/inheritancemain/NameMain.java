package association.example.app.inheritancemain;

import association.example.app.inheritance.Meaning;
import association.example.app.inheritance.Name;

public class NameMain {
	public static void main(String[] args) {
		Name hi=new Meaning();
		hi.call();
		System.out.println("name in Name is:"+hi.name);
	}

}
