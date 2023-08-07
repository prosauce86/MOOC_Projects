import java.util.ArrayList;

public class Room {
    ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person p) {
        persons.add(p);
    }

    public Person take() {
        if (this.persons.isEmpty()) return null;
        Person person = shortest();
        persons.remove(person);
        return person;
    }

    public Person shortest() {
        if (persons.isEmpty()) return null;
        Person shortestPerson = persons.get(0);
        for (Person p : persons) {
            if (p.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = p;
            }
        }
        return shortestPerson;
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }
}