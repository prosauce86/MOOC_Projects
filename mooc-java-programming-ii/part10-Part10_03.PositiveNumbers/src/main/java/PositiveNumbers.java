
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            numbers.add(Integer.parseInt(input));
        }

        List<Integer> parsed = positive(numbers);
        System.out.println(parsed);
    }

    public static List<Integer> positive(List<Integer> numbers) {
        // BOTH ways achieve same result
        // --- .collect(Collectors.toList())
        // --- .collect(Collectors.toCollection(ArrayList::new))

        //return numbers.stream().filter(value -> value > 0).collect(Collectors.toList());
        return numbers.stream().filter(value -> value > 0).collect(Collectors.toCollection(ArrayList::new));
    }

}