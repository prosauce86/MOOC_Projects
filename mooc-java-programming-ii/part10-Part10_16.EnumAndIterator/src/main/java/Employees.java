import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person person) {
        employees.add(person);
    }

    public void add(List<Person> people) {
        employees.addAll(people);
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getEducation().equals(education)) {
                System.out.println(p);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}