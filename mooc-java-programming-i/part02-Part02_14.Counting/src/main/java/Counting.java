
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("Enter a positive number:");
        int number = Integer.valueOf(input.nextLine());

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }

        input.close();
    }
}

