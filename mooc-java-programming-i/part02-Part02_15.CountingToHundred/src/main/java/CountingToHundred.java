import java.util.Scanner;

public class CountingToHundred {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.valueOf(input.nextLine());

        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }

        input.close();
    }
}
