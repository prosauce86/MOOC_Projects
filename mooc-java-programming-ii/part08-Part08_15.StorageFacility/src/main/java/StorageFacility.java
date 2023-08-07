import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private final HashMap<String, ArrayList<String>> storage;

    public StorageFacility () {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String unit) {
        if (storage.get(unit) == null || storage.isEmpty()) {
            return new ArrayList<>();
        }
        return storage.get(unit);
    }

    public void remove(String unit, String item) {
        storage.get(unit).remove(item);

        if (storage.get(unit).isEmpty()) {
            storage.remove(unit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String s : storage.keySet()) {
            if (storage.get(s) != null) {
                units.add(s);
            }
        }
        return units;
    }
}