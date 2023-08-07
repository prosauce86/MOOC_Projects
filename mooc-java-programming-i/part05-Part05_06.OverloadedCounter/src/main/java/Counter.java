public class Counter {
    private int counter;

    public Counter(int startValue) {
        this.counter = startValue;
    }

    public Counter() {
        this.counter = 0;
    }

    public int value() { return counter; }

    public void increase() { counter++; }
    public void increase(int x) {
        if (x >= 0) counter += x;
    }

    public void decrease() { counter--; }
    public void decrease(int x) {
        if (x >= 0) counter -= x;
    }
}