import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            // Item is already in the cart. Update the quantity
            Item item = cart.get(product);
            item.increaseQuantity();
            return;
        }
        cart.put(product, new Item(product, 1, price));
    }

    public int price() {
        int sum = 0;
        for (Item i : cart.values()) {
            sum += i.price();
        }
        return sum;
    }

    public void print() {
        for (Item i : cart.values()) {
            System.out.println(i);
        }
    }
}