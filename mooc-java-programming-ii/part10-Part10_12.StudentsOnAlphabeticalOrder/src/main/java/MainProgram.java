import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        Student third = new Student("James");
        Student fourth = new Student("jaMal");

        System.out.println(first.compareTo(second));

        ArrayList<Student> students = new ArrayList<>();
        students.add(first);
        students.add(second);
        students.add(third);
        students.add(fourth);

        Collections.sort(students);
        System.out.println(students);

    }
}