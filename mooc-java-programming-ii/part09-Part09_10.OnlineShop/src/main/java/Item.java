public class Item {

    private final String PRODUCT;
    private int qty;
    private final int UNIT_PRICE;

    public Item(String product, int qty, int unitPrice) {
        this.PRODUCT = product;
        this.qty = qty;
        this.UNIT_PRICE = unitPrice;
    }

    public int price() {
        return qty * UNIT_PRICE;
    }

    public void increaseQuantity() {
        qty++;
    }

    @Override
    public String toString() {
        return PRODUCT + ": " + qty;
    }
}