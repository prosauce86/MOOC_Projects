
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentTerminal cafe = new PaymentTerminal(); // Creates a new register $1000 in till

        PaymentCard card = new PaymentCard(2); // Creates new card with balance

        System.out.println(cafe);

        System.out.println("amount of money on the card is " + card.balance() + " euros");

        //double change = cafe.eatAffordably(10);

        //System.out.println("Remaining change: " + change);

        System.out.println("there was enough money: : " + cafe.eatHeartily(card));

        cafe.addMoneyToCard(card, 100);

        System.out.println("there was enough money: " + cafe.eatHeartily(card));
        System.out.println("amount of money on the card is " + card.balance() + " euros");

        System.out.println(cafe);


    }
}