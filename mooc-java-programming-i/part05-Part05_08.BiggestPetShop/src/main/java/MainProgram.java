
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Hulda", "Golden retriever");
        Pet onyx = new Pet("Onyx", "German Shepherd");
        Person leo = new Person("Leo", hulda);
        Person james = new Person("James", onyx);

        System.out.println(leo);
        System.out.println(new Person());
        System.out.println(new Person("Spongebob"));
        System.out.println(james);
    }
}