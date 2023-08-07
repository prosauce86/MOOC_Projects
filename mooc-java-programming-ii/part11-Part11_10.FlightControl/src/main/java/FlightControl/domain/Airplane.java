package FlightControl.domain;

public class Airplane {
    private final String id;
    private final int capacity;

    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " (" + capacity + " capacity)";
    }
}