package association.example.app.overriding;


	public class NationalPark extends Zoo {
		@Override
		public void zoo() {
			System.out.println("zoo in derived class");
		}

		@Override
		public void zoo(String name) {
			System.out.println("zoo name in derived class: " + name);
		}

		@Override
		public void zoo(String name, int openingTime) {
			System.out.println("zoo name in derived class: " + name);
			System.out.println("zoo opening time in derived class: " + openingTime);
		}

		@Override
		public void zoo(String name, int openingTime, int closingTime) {
			System.out.println("zoo name in derived class: " + name);
			System.out.println("zoo opening time in derived class: " + openingTime);
			System.out.println("zoo closingTime in derived class: " + closingTime);
		}

		@Override
		public void zoo(String name, int openingTime, int closingTime, String state) {
			System.out.println("zoo name in derived class: " + name);
			System.out.println("zoo opening time in derived class: " + openingTime);
			System.out.println("zoo closingTime in derived class: " + closingTime);
			System.out.println("zoo state in derived class: " + state);
		}

		@Override
		public void zoo(String name, int openingTime, int closingTime, String state, boolean animals) {
			System.out.println("zoo name in derived class: " + name);
			System.out.println("zoo opening time in derived class: " + openingTime);
			System.out.println("zoo closingTime in derived class: " + closingTime);
			System.out.println("zoo state in derived class: " + state);
			System.out.println("zoo contains animals in derived class: " + animals);
		}
}
