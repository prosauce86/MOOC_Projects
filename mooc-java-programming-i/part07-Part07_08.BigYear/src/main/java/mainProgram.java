
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);

        // Print instructions
        System.out.println("This is an application to manage a database of birds!");
        System.out.println("Your options are: \n");
        System.out.println("Add - adds a new bird\n" + "Observation - add an observation to a bird\n" +
                "All - prints all birds in the database\n" + "One - prints a bird at random\n" +
                "Quit - exits the application");

        // Begin
        ui.start();

    }

}