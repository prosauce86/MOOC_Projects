import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner;
    private final ArrayList<Book> books;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.books = new ArrayList<>();
    }

    public void getBooks() {
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) break;

            System.out.print("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());

            books.add(new Book(name, age));
            System.out.println();
        }
    }

    public void sortByAgeAndName() {
        Comparator<Book> comparator =
                Comparator
                        .comparing(Book::getAgeRecommendation)
                        .thenComparing(Book::getName);

        Collections.sort(books, comparator);
    }

    public void printBooks() {
        System.out.println(books.size() + " books in total.\n\nBooks:");
        books.forEach(System.out::println);
    }
}