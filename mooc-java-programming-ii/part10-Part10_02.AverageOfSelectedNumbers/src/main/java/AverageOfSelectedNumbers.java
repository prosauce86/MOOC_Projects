
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> numbers = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            numbers.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String filter = scanner.nextLine();

        if (filter.equalsIgnoreCase("n")) {
            System.out.println("Average of the numbers: " +
                    numbers.stream().mapToInt(s -> Integer.parseInt(s)).filter(s -> s < 0).average().getAsDouble());
        } else if (filter.equalsIgnoreCase("p")){
            System.out.println("Average of the numbers: " +
                    numbers.stream().mapToInt(s -> Integer.parseInt(s)).filter(s -> s > 0).average().getAsDouble());
        }
    }
}