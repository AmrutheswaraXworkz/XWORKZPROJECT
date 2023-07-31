package association.example.boot;

import association.example.app.*;

public class ToothpasteMain {
	public static void main(String[] args) {
		String nameOfPaste = "colgate";
		String brand = "Indian colgate";
		Company company = new Company("Colgate", "santu", "india");

		Ingredient ingredientSalt = new Ingredient("salt", 25, 30);
		Ingredient ingredientGarlic = new Ingredient("garlic", 35, 60);
		Ingredient ingredientCalcium = new Ingredient("calcium", 45, 70);

		Ingredient[] ingredients = { ingredientSalt, ingredientGarlic, ingredientCalcium };

		ToothPaste paste = new ToothPaste(nameOfPaste, brand, company, ingredients);
		paste.toothPasteMethod();

	}

}
