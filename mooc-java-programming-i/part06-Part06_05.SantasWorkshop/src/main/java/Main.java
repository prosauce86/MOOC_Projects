
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift pc = new Gift("Gaming PC", 10);

        //System.out.println(book.getName());
        //System.out.println(book.getWeight());

        System.out.println(book);
        System.out.println(pc);

        Package gifts = new Package();
        gifts.addGift(book);
        gifts.addGift(pc);
        System.out.println(gifts.totalWeight());

    }
}