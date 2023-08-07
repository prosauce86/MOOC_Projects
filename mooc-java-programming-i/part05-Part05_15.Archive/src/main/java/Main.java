
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList<>();
        Item item;

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) break;

            System.out.println("Name? (Empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) break;

            item = new Item(id, name);
            if (!(list.contains(item))) {
                list.add(item);
            }
        }

        System.out.println("==Items==");
        for (Item i : list) {
            System.out.println(i);
        }
    }
}