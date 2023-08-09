package association.example.app.overriding;

public class Town extends City {
	@Override
	public void city() {
		System.out.println("city method in derived class");
	}

	@Override
	public void city(String name) {
		System.out.println("city name in derived class: " + name);
	}

	@Override
	public void city(String name, boolean population) {
		System.out.println("city name in derived class: " + name);
		System.out.println("city population in derived class: " + population);
	}

	@Override
	public void city(String name, boolean population, String district) {
		System.out.println("city name in derived class: " + name);
		System.out.println("city population in derived class: " + population);
		System.out.println("city disctrict in derived class: " + district);
	}

	@Override
	public void city(String name, boolean population, String district, String state) {
		System.out.println("city name in derived class: " + name);
		System.out.println("city population in derived class: " + population);
		System.out.println("city disctrict in derived class: " + district);
		System.out.println("city state in derived class: " + state);
	}

	@Override
	public void city(String name, boolean population, String district, String state, boolean houses) {
		System.out.println("city name in derived class: " + name);
		System.out.println("city population in derived class: " + population);
		System.out.println("city disctrict in derived class: " + district);
		System.out.println("city state in derived class: " + state);
		System.out.println("city has houses in derived class: " + houses);
	}

}
