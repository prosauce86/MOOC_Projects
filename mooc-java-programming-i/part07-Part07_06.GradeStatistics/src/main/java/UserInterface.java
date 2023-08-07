import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Integer> grades;
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.grades = new ArrayList<>();
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) break;

            if (input >= 0 && input <= 100) {
                this.grades.add(input);
            }
        }
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
}