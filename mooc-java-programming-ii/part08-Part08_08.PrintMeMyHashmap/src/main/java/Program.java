
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "I");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".E");
    }

    public static void printKeys(HashMap<String, String> hashMap) {
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashMap, String text) {
        for (String key : hashMap.keySet()) {
            if (key.toLowerCase().contains(text.toLowerCase())) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.toLowerCase().contains(text.toLowerCase())) {
                System.out.println(hashmap.get(key));
            }
        }
    }

}