public class Container {

    private int current;
    private int max;
    public Container() {
        this.current = 0;
        this.max = 100;
    }

    public void add(int amount) {
        if (amount >= 0) {
            current += amount;
        }
        if (current > 100) current = max;
    }

    public void remove(int amount) {
        if (amount >= 0) {
            current -= amount;
        }
        if (current < 0) current = 0;
    }

    public int contains() {
        return current;
    }


    @Override
    public String toString() {
        return contains() + "/" + max;
    }
}