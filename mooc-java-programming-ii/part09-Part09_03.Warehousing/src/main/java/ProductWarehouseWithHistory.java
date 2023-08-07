import java.util.ArrayList;
import java.util.Collections;

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        changeHistory.add(initialBalance);
    }


    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        changeHistory.add(getBalance());
        return taken;
    }

    public String history() {
        return changeHistory.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName() +
                "\nHistory: " + history() +
                "\nLargest amount of product: " + changeHistory.maxValue() +
                "\nSmallest amount of product: " + changeHistory.minValue() +
                "\nAverage: " + changeHistory.average());
    }
}