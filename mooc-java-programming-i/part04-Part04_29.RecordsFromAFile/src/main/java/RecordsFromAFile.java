
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String[] line = reader.nextLine().split(",");
                if (line[1].equals("1")) {
                    System.out.println(line[0] + ", age: " + line[1] + " year");
                } else {
                    System.out.println(line[0] + ", age: " + line[1] + " years");
                }
            }
        }
        catch (IOException e) {
            System.out.println("No such file");
        }
    }
}