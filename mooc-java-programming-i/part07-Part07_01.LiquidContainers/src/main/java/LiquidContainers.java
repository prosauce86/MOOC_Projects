
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstCurrent = 0;
        int secondCurrent = 0;
        int max = 100;


        while (true) {
            //System.out.print("> ");
            System.out.println("First: " + firstCurrent + "/" + max);
            System.out.println("Second: " + secondCurrent + "/" + max);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inputParts = input.split(" ");
            String command = inputParts[0];
            int amount = Integer.parseInt(inputParts[1]);
            if (command.equals("add") && amount >= 0) {
                firstCurrent += Integer.parseInt(inputParts[1]);
                if (firstCurrent > max) firstCurrent = max; // should not exceed maximum
            }

            if (command.equals("move") && amount >= 0) {
                if (amount >= firstCurrent && firstCurrent > 0) {
                    secondCurrent = firstCurrent;
                    firstCurrent = 0;
                } else if (firstCurrent != 0){
                    secondCurrent += amount;
                    firstCurrent -= amount;
                }
                if (secondCurrent > max) secondCurrent = max;
                if (firstCurrent < 0) firstCurrent = 0;
            }

            if (command.equals("remove") && amount >= 0) {
                if (secondCurrent >= 0) {
                    secondCurrent -= amount;
                }
                if (secondCurrent < 0) secondCurrent = 0;
            }
        }
    }
}