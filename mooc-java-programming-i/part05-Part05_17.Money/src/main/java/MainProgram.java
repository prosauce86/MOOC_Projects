
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(10,0);
        Money b = new Money(3, 50);
        //Money c = new Money(5, 0);

        //Money c = a.plus(b);
        /*
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = a.plus(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        System.out.println(a.lessThan(b));
        System.out.println(b.lessThan(c));
         */

        Money c = a.minus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        c = c.minus(a);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}