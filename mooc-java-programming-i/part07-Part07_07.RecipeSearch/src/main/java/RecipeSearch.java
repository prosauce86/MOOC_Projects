import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read:");
        String fileName = scanner.nextLine();
        ArrayList<Recipe> recipes = readRecipeFile(fileName);

        printCommands();

        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("stop")) break;

            getCommand(command, recipes, scanner);
        }
    }

    public static void getCommand(String command, ArrayList<Recipe> recipes, Scanner scanner) {
        String searchWord, ingredient;
        int max = 0;
        if (command.equalsIgnoreCase("list")) {
            System.out.println("Recipes:");
            for (Recipe r : recipes) {
                r.printRecipes();
            }
        } else if (command.equalsIgnoreCase("find name")) {
            System.out.println("Searched word: ");
            searchWord = scanner.nextLine();
            for (Recipe r : recipes) {
                r.findRecipe(searchWord, max, null);
            }
        } else if (command.equalsIgnoreCase("find cooking time")) {
            System.out.println("Max cooking time:");
            max = Integer.parseInt(scanner.nextLine());
            for (Recipe r : recipes) {
                r.findRecipe(null, max, null);
            }
        } else if (command.equalsIgnoreCase("find ingredient")) {
            System.out.println("Ingredient:");
            ingredient = scanner.nextLine();
            for (Recipe r : recipes) {
                r.findRecipe(null, max, ingredient);
            }
        } else {
            printCommands();
        }
    }

    public static void printCommands() {
        System.out.println("Commands: \nlist - lists the recipes " +
                "\nfind name - searches recipes by name" +
                "\nfind cooking time - searches recipes by cooking time" +
                "\nfind ingredient - searches recipes by ingredient" +
                "\nstop - stops the program");
    }

    public static ArrayList<Recipe> readRecipeFile(String fileName) {
        ArrayList<String> recipeParts = new ArrayList<>();
        ArrayList<Recipe> recipes = new ArrayList<>();
        String recipeName;
        int cookTime;

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            // Add each line to an index in recipe ArrayList
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (!line.isEmpty()) {
                    // Recipes are grouped in file and separated by a blank line
                    // Add all lines for this group to the ArrayList
                    recipeParts.add(line);
                } else {
                    // Recipe group was added to ArrayList
                    // Now set necessary variables
                    recipeName = recipeParts.get(0);
                    cookTime = Integer.parseInt(recipeParts.get(1));
                    // Now remove recipe name and cook time from recipe for this iteration
                    recipeParts.remove(0); // removes name
                    recipeParts.remove(0); // removes cook time
                    // Add instance of Recipes object to ArrayList
                    recipes.add(new Recipe(recipeName, cookTime, recipeParts));
                    recipeParts.clear();
                }
            }
            // This is necessary to get the last group left in file
            if (!recipeParts.isEmpty()) {
                recipeName = recipeParts.get(0);
                cookTime = Integer.parseInt(recipeParts.get(1));
                // Now remove recipe name and cook time from recipe for this iteration
                recipeParts.remove(0); // removes name
                recipeParts.remove(0); // removes cook time
                // Add instance of Recipes object to ArrayList
                recipes.add(new Recipe(recipeName, cookTime, recipeParts));
                recipeParts.clear();
            }
        }
        catch (IOException e) {
            System.out.println("Error: check that " + e.getMessage() + " exists");
            System.out.println("Exiting");
            System.exit(-1);
        }
        catch (Exception e) {
            System.out.println("Error: " + Arrays.toString(e.getStackTrace()));
            System.out.println("Exiting");
            System.exit(-1);
        }
        return recipes;
    }
}