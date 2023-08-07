
import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        boolean hasPositiveNumber = false;

        while (true) {
            System.out.println("Give a number:");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                sum += number;
                count++;
                hasPositiveNumber = true;
            }
        }

        if (hasPositiveNumber) {
            double average = (double) sum / count;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }

        input.close();
    }
}

