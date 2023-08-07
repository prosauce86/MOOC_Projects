import java.util.ArrayList;

public class Bird {
    private final String commonName;
    private final String latinName;
    private int observations = 0;

    public Bird(String commonName, String latinName) {
        this.commonName = commonName;
        this.latinName = latinName;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getLatinName() {
        return latinName;
    }

    public void incrementObservations() {
        this.observations++;
    }

    @Override
    public String toString() {

        return commonName+ " (" + latinName + "): " + observations + " observations";
    }
}