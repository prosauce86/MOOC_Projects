
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        readBooks(fileName).stream().forEach(book -> System.out.println(book.getName() + ": " + book.getAuthor()));

    }

    public static List<Book> readBooks(String file) {
        try {
            return Files.lines(Paths.get(file)) // read file line by line
                    .map(line -> line.split(",")) // split each line into array
                    .filter(parts -> parts.length >= 4) // filter out lines with more than 4 parts
                    .map(book -> new Book(book[0], Integer.parseInt(book[1]), Integer.parseInt(book[2]), book[3])) // create new Book objects
                    .collect(Collectors.toList()); // add Book objects to collection
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return new ArrayList<>();
    }
}