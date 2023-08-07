

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);
        System.out.println("Adas total weight: " + adasCase.totalWeight());
        System.out.println("And the items in her suitcase are:");
        adasCase.printItems();

        System.out.println("===============================================");

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);
        pekkasCase.addItem(book);
        System.out.println("Pekka's total weight: " + pekkasCase.totalWeight());
        System.out.println("And the items in her suitcase are:");
        pekkasCase.printItems();

        System.out.println("===============================================");

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
        System.out.println(hold);
    }

}