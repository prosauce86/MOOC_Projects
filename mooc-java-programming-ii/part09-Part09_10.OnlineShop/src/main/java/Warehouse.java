import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private final Map<String, Integer> product;
    private final Map<String, Integer> stock;

    public Warehouse() {
        this.product = new HashMap<>();
        this.stock = new HashMap<>();
    }
    public void addProduct(String product, int price, int stock) {
        this.product.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (this.product.containsKey(product)) {
            return this.product.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stock.containsKey(product)) {
            return this.stock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (stock.containsKey(product) && stock.get(product) > 0) {
            stock.replace(product, stock.get(product), stock.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return new HashSet<>(product.keySet());
    }
}