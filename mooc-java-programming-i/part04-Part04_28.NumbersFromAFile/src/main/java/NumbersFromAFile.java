
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                int lineNum = Integer.valueOf(reader.nextLine());
                if (lineNum >= lowerBound && lineNum <= upperBound) count++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Numbers: " + count);
    }

}