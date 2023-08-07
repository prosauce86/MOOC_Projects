import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;
    private final ArrayList<Bird> birdsList;
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birdsList = new ArrayList<>();

    }

    public void start() {
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("quit")) break;
            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equalsIgnoreCase("add")) {
            System.out.println("Name:");
            String commonName = scanner.nextLine();
            System.out.println("Name in Latin:");
            String latinName = scanner.nextLine();
            this.birdsList.add(new Bird(commonName, latinName));

        } else if (command.equalsIgnoreCase("observation")) {
            System.out.println("Bird?");
            String bird = scanner.nextLine();
            Bird selection = null;
            if (!birdsList.isEmpty()) {
                for (Bird b : birdsList) {
                    // Search if common or latin name is used
                    if (b.getCommonName().equalsIgnoreCase(bird) || b.getLatinName().equalsIgnoreCase(bird)) {
                        selection = b;
                    }
                }
                if (selection != null) {
                    selection.incrementObservations();
                } else {
                    System.out.println("Not a bird!");
                }
            } else {
                System.out.println("Make sure to add some birds first :)");
            }
        } else if (command.equalsIgnoreCase("one")) {
            if (birdsList.size() > 0) {
                System.out.println("Bird?");
                String bird = scanner.nextLine();
                for (Bird b : birdsList) {
                    if (b.getCommonName().equalsIgnoreCase(bird) || b.getLatinName().equalsIgnoreCase(bird)) {
                        System.out.println(b);
                    }
                }
            }
        } else if (command.equalsIgnoreCase("all")) {
            printBirds();
        } else {
            System.out.println("Invalid entry");
        }
    }

    public void printBirds() {
        for (Bird b : birdsList) {
            System.out.println(b);
        }
    }
}