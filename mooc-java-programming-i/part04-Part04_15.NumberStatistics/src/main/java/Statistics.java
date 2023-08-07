
public class Statistics {

    private int count;
    private int sum;
    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        count++;
        sum += number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return (count > 0) ? (double) sum / count : 0;
    }
}