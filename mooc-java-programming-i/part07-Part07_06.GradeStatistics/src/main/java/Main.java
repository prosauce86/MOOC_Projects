
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);

        ui.start();

        Grades grades = new Grades(ui.getGrades());
        System.out.println(grades);
    }
}