import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
//        if (new Checker().isDayOfWeek(scanner.nextLine())) {
//            System.out.println("The form is correct");
//        } else {
//            System.out.println("The form is incorrect");
//        }

//        if (new Checker().allVowels(scanner.nextLine())) {
//            System.out.println("The form is correct");
//        } else {
//            System.out.println("The form is incorrect");
//        }

        if (new Checker().timeOfDay(scanner.nextLine())) {
            System.out.println("The form is correct");
        } else {
            System.out.println("The form is incorrect");
        }
    }
}