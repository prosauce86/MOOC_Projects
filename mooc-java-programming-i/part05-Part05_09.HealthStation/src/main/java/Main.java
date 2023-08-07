
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation healthStation = new HealthStation();

        Person james = new Person("James", 36, 183, 90);
        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println("weighings performed: " + healthStation.weighings());

        System.out.println(james.getName() + "'s weight: " + healthStation.weigh(james) + " kilos");
        System.out.println(ethan.getName() + "'s weight: " + healthStation.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + "'s weight: " + healthStation.weigh(peter) + " kilos");

        healthStation.feed(ethan);
        healthStation.feed(ethan);
        healthStation.feed(ethan);

        System.out.println();

        System.out.println(james.getName() + "'s weight: " + healthStation.weigh(james) + " kilos");
        System.out.println(ethan.getName() + "'s weight: " + healthStation.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + "'s weight: " + healthStation.weigh(peter) + " kilos");

        System.out.println("weighings performed: " + healthStation.weighings());
    }
}