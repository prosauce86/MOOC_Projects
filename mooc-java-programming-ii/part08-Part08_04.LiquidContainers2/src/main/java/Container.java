public class Container {
    private final int MAX;
    private int liquid;
    public Container() {
        this.MAX = 100;
        this.liquid = 0;
    }

    public int contains() {
        return liquid;
    }

    public void add(int amount) {
        if (amount >= 0) {
            liquid += amount;
        }

        if (liquid > MAX) {
            liquid = MAX;
        }
    }

    public void remove(int amount) {
        if (amount >= 0) {
            liquid -= amount;
        }

        if (liquid < 0) {
            liquid = 0;
        }
    }

    @Override
    public String toString() {
        return liquid + "/" + MAX;
    }
}