package association.example.app;

public class ToothPaste {
	public String pasteName;
	public String pasteBrand;
	public Company company;
	public Ingredient[] ingredients;

	public ToothPaste(String pasteName, String pasteBrand, Company company, Ingredient[] ingredients) {

		this.pasteName = pasteName;
		this.pasteBrand = pasteBrand;
		this.company = company;
		this.ingredients = ingredients;

	}

	public void toothPasteMethod() {
		System.out.println("paste name:" + pasteName);
		System.out.println("brand name:" + pasteBrand);
		company.companyMethod();
		for (int i = 0; i < ingredients.length; i++) {
			Ingredient ingredient = ingredients[i];
			ingredient.ingredientsMethod();
		}

	}

}
