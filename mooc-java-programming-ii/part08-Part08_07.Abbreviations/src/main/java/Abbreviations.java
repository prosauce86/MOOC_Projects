import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> map;

    public Abbreviations() {
        this.map = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String meaning) {
        map.put(abbreviation, meaning);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return (map.containsKey(abbreviation));
    }

    public String findExplanationFor(String abbreviation) {
        return map.get(abbreviation);
    }
}