
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many time?");
        int num = Integer.valueOf(scanner.nextLine());
        int count = 1;
        while (count <= num) {
            printText();
            count++;
        }
        scanner.close();
    }

    public static void printText() {
        // Write some code in here
        System.out.println("In a hole in the ground there lived a method");
        //System.out.println();
    }
}
