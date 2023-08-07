
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli Coconut Chicken");
        menu.addMeal("Chilli Coconut Chicken");
        menu.addMeal("Smoked salmon, white wine and butter sauce with basil");
        menu.addMeal("Seasonal green salad with apple-honey vinegarette");
        menu.addMeal("Roasted lamb in a red wine sauce");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();

        menu.clearMenu();

        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }
}