import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("end")) { // exit condition
                System.out.println("Bye bye!");
                break;
            }

            // Add word to dictionary
            if (input.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
                continue;
            }

            // Search for a word in the dictionary
            if (input.equals("search")) {
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                if (simpleDictionary.translate(word) == null) { // search returned null
                    System.out.println("Word " + word + " was not found");
                    continue;
                }
                System.out.println("Translation: " + simpleDictionary.translate(word));
                continue;
            }

            System.out.println("Unknown command");
        }

    }
}