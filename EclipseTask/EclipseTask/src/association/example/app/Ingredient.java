package association.example.app;

public class Ingredient {
	public String name;
	public int quantity;
	public int cost;

	public Ingredient(String name, int quantity, int cost) {

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;

	}

	public void ingredientsMethod() {
		System.out.println("name of ingredient:" + name);
		System.out.println("quantity:" + quantity);
		System.out.println("cost:" + cost);
	}

}
