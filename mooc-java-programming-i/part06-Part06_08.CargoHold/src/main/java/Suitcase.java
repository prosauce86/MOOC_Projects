import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;


    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item i : items) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) return null;
        Item heaviestItem = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    public String toString() {
        if (items.size() == 0) return "no items (0 kg)";
        String s = "";
        if (items.size() > 1) s = "s";
        return items.size() + " item" + s + " (" + totalWeight() + " kg)";
    }
}