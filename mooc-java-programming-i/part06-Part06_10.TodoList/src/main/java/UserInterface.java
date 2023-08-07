import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) break; // exit condition

            if (command.equals("add")) {
                System.out.println("To add:");
                String task = scanner.nextLine();
                todoList.add(task);
            }

            if (command.equals("list")) {
                todoList.print();
            }

            if (command.equalsIgnoreCase("remove")) {
                System.out.println("Which one is removed");
                int number = Integer.parseInt(scanner.nextLine());
                todoList.remove(number);
            }
        }
    }
}