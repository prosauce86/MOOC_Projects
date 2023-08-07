
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int nameLength = 0;
        int birthYearSum = 0;
        int personCount = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            String name = parts[0];
            int birthYear = Integer.valueOf(parts[1]);

            if (name.length() > nameLength) {
                longestName = name;
                nameLength = name.length();
            }

            birthYearSum += birthYear;
            personCount++;
        }

        double averageBirthYear = (double) birthYearSum / personCount;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYear);

        scanner.close();
    }
}