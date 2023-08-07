import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        if (history.size() == 0) {
            return 0.0;
        }

        double largest = history.get(0);
        for (double d : history) {
            if (d > largest) {
                largest = d;
            }
        }
        return largest;
    }

    public double minValue() {
        if (history.size() == 0) {
            return 0.0;
        }

        double smallest = history.get(0);
        for (double d : history) {
            if (d < smallest) {
                smallest = d;
            }
        }
        return smallest;
    }

    public double average() {
        if (history.size() == 0) {
            return 0.0;
        }

        double sum = 0;
        for (double d : history) {
            sum += d;
        }
        return sum / history.size();
    }

    public String toString() {
        return history.toString();
    }
}