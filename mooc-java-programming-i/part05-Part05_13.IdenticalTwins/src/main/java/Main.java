
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program

        SimpleDate date1 = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(24, 3, 2017);

        Person leo = new Person("Leo", date1, 62, 9);
        Person lily = new Person("Lily", date2, 62, 9);

        if (leo.equals(lily)) System.out.println("Is this quite correct?");

        Person leoWithDifferentWeight = new Person("Leo", date1, 62, 9);

        if (leo.equals(leoWithDifferentWeight)) System.out.println("Is this quite correct?");
        
    }
}