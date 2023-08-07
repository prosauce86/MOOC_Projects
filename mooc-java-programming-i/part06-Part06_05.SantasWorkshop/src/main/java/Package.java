import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift g) {
        gifts.add(g);
    }

    public int totalWeight() {
        int weight = 0;
        for (Gift g : gifts) {
            weight += g.getWeight();
        }
        return weight;
    }
}