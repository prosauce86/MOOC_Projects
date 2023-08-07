
public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();

        /*
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("First Value");
        s.add("Latest Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println();
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
        */

        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
    }
}