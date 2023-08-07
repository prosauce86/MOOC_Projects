import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> itemsInBox;
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemsInBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() > capacity) {
            return;
        }
        itemsInBox.add(item);
        capacity -= item.getWeight();
    }

    @Override
    public boolean isInBox(Item item) {
        return itemsInBox.contains(item);
    }

}