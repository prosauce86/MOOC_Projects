
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here

        Timer timer = new Timer();
        int i = 0;
        while (i < 250) {
            timer.advance();
            i++;

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println(timer.toString());
        }
    }
}