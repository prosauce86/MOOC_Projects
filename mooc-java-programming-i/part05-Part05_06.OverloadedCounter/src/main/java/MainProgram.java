
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c = new Counter();
        System.out.println(c.value());
        c.increase();
        c.increase();
        c.increase();
        System.out.println(c.value());
        c.increase(25);
        System.out.println(c.value());
        c.decrease();
        System.out.println(c.value());
        c.decrease(10);
        System.out.println(c.value());
        c.decrease(-1);
        System.out.println(c.value());
    }
}