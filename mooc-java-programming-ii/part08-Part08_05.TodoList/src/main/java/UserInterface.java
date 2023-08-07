import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;

    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("stop")) {
                break;
            }

            if (command.equalsIgnoreCase("add")) {
                System.out.print("To add: ");
                list.add(scanner.nextLine());
            }

            if (command.equalsIgnoreCase("list")) {
                list.print();
            }

            if (command.equalsIgnoreCase("remove")) {
                System.out.print("Which one is removed? ");
                list.remove(Integer.parseInt(scanner.nextLine()));
            }

        }
    }
}