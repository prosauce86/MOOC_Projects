
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inputParts = input.split(" ");
            String command = inputParts[0];
            int amount = Integer.parseInt(inputParts[1]);

            if (command.equalsIgnoreCase("add")) {
                first.add(amount);
            }

            if (command.equalsIgnoreCase("move")) {
                if (first.contains() > 0) {
                    if (first.contains() < amount) {
                        second.add(first.contains());
                        first.remove(amount);
                    } else {
                        first.remove(amount);
                        second.add(amount);
                    }
                }
            }

            if (command.equalsIgnoreCase("remove")) {
                second.remove(amount);
            }

        }
    }

}