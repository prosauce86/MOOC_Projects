import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {


    private ArrayList<Card> hand;
    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public ArrayList<Card> getCards() {
        return hand;
    }

    public void sort() {
        Collections.sort(hand);
    }

    public void print() {
        hand.forEach(System.out::println);
    }

    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand hand) {
        return (this.hand.stream().mapToInt(card -> card.getValue()).sum()) -
                hand.getCards().stream().mapToInt(card -> card.getValue()).sum();
    }
}