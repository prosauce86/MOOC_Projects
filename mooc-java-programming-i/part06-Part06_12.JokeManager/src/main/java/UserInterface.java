import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:\n" +
                    "1 - add a joke\n" +
                    "2 - draw a joke\n" +
                    "3 - list jokes\n" +
                    "x - stop");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("x")) break;

            switch (input) {
                case "1": {
                    System.out.println("Write the joke to be added:");
                    String joke = scanner.nextLine();
                    manager.addJoke(joke);
                    break;
                }
                case "2": {
                    System.out.println("Drawing jokes:");
                    System.out.println(manager.drawJoke());
                    break;
                }
                case "3": {
                    System.out.println("Printing the jokes.");
                    manager.printJokes();
                    break;
                }
                default: break;

            }
        }
    }

}