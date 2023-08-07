
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop");
        List<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            list.add(input);
        }

        double average = list.stream().mapToInt(s -> Integer.parseInt(s)).average().getAsDouble();
        System.out.println("Average of the numbers: " + average);
    }
}