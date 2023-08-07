import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> itemBox;

    public MisplacingBox() {
        this.itemBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        this.itemBox.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}