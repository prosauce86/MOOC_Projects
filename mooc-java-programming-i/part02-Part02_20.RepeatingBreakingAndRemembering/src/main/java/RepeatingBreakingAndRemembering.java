
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int sum = 0, count = 0, evens = 0, odds = 0;
        while (true) {
            int n = Integer.valueOf(scanner.nextLine());
            if (n == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (n % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
            sum += n;
            count++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (double) sum/count);
        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odds);

    }
}
