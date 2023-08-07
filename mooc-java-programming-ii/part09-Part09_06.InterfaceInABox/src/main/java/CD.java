public class CD implements Packable {
    private String artist;
    private String name;
    private int year;
    private final double WEIGHT;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
        this.WEIGHT = 0.1;
    }

    @Override
    public double weight() {
        return WEIGHT;
    }

    @Override
    public String toString() {
        return artist + ": " + name + " (" + year + ")";
    }
}