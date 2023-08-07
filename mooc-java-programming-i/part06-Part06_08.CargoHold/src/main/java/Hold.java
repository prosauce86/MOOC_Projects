import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> hold;
    private int totalWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + totalWeight <= maxWeight) {
            hold.add(suitcase);
            totalWeight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for (Suitcase s : hold) {
            s.printItems();
        }
    }

    public String toString() {
        return hold.size() + " suitcases (" + totalWeight + " kg)";
    }
}