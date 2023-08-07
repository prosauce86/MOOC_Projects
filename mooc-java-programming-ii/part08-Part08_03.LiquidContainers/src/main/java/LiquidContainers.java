
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int max = 100;
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/" + max);
            System.out.println("Second: " + second + "/" + max);
            String input = scanner.nextLine();

            // exit condition
            if (input.equalsIgnoreCase("quit") || input.isEmpty()) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            // Validation
            if (!"addmoveremove".contains(command)) {
                continue;
            }

            if (command.equalsIgnoreCase("add")) {
                if (amount >= 0) {
                    first += amount;
                    if (first > max) {
                        first = 100;
                    }
                }
            } else if (command.equalsIgnoreCase("move")) {
                if (amount >= 0  && first != 0) {
                    if (amount >= first) {
                        second = first;
                        first = 0;
                    } else if (first <= max) {
                        second += amount;
                        first -= amount;
                        if (second > max) {
                            second = max;
                        }
                    }
                }
            } else if (command.equalsIgnoreCase("remove")) {
                if (amount >= 0 && second > 0) {
                    second -= amount;
                    if (second < 0) {
                        second = 0;
                    }
                }
            }
            System.out.println();
        }
    }
}