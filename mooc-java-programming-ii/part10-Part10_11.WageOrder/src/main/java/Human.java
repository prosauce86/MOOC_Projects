
public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

    @Override
    public int compareTo(Human human) {
        // sorts from largest to smallest because "this" object is on the right
        return human.getWage() - this.getWage();
        //return this.getWage() - human.getWage(); // this would sort smallest to largest as "this" is before the compared object
    }

}