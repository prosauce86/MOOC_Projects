import java.util.ArrayList;

public class Recipe {
    private final String recipeName;
    private final int cookTime;
    private final ArrayList<String> ingredients = new ArrayList<>();

    public Recipe(String recipeName, int cookTime, ArrayList<String> ingredients) {
        this.recipeName = recipeName;
        this.cookTime = cookTime;
        // populate "ingredients" ArrayList
        this.ingredients.addAll(ingredients); // addAll replaces need for foreach loop
    }

    public void findRecipe(String searchWord, int maxCookTime, String searchIngredient) {

        if (searchWord != null) {
            if (recipeName.contains(searchWord)) {
                printRecipes();
            }
        } else if (searchIngredient != null) {
            for (String i : ingredients) {
                if (i.equalsIgnoreCase(searchIngredient)) {
                    printRecipes();
                }
            }
        } else {
            if (cookTime <= maxCookTime ) {
                printRecipes();
            }
        }
    }

    public void printRecipes() {
        System.out.println(recipeName + ", cooking time: " + cookTime);
    }
}