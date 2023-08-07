package application;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println();
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }

            // implement the functionality here
            int todoId = 0;
            switch (Integer.parseInt(command)) {
                case 1 : {
                    System.out.println("Listing the database contents");
                    List<Todo> todos = database.list();
                    todos.forEach(System.out::println);
                    break;
                }
                case 2 : {
                    System.out.println("Adding a new todo");
                    System.out.println("Enter name");
                    String todoName = scanner.nextLine();
                    System.out.println("Enter description");
                    String todoDesc = scanner.nextLine();
                    todoId++;
                    database.add(new Todo(todoId, todoName, todoDesc, false));
                    break;
                }
                case 3 : {
                    System.out.println("Which todo should be marked as done (give the id)?");
                    database.markAsDone(Integer.parseInt(scanner.nextLine()));
                    break;
                }
                case 4 : {
                    System.out.println("Which todo should be removed (give the id)?");
                    database.remove(Integer.parseInt(scanner.nextLine()));
                    break;
                }
                default : break;
            }
        }

        System.out.println("Thank you!");
    }

}