
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                break;
            }
            numbers.add(num);
        }

        int sum = 0;
        int count = 0;
        for (int i : numbers) {
            if (i > 0) {
                sum += i;
                count++;
            }
        }

        if (numbers.size() == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sum / count);
        }
    }
}