import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Container first, second;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.first = new Container();
        this.second = new Container();

    }

    public void  start() {

        while (true) {
            displayContainers();
            String input = scanner.nextLine();
            if (input.equals("quit")) break;

            String[] inputParts = input.split(" ");
            String command = inputParts[0];
            int amount = Integer.parseInt(inputParts[1]);

            switch (command) {
                case "add": {
                    first.add(amount);
                    break;
                }

                case "move": {
                    if (amount > first.contains()) {
                        second.add(first.contains());
                        first.remove(amount);
                    } else {
                        first.remove(amount);
                        second.add(amount);
                    }
                    break;
                }

                case "remove": {
                    second.remove(amount);
                    break;
                }

                default: break;
            }
        }
    }

    public void displayContainers() {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}