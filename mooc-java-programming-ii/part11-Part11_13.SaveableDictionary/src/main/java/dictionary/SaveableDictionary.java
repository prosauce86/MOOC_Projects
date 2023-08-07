package dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this(); // need to call default constructor
        this.file = file;
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] lineParts = line.split(":");
                add(lineParts[0], lineParts[1]);

            }

            return true;

        } catch (IOException e) {
            System.out.println("File doesn't exist");
            return false;

        }
    }

    public boolean save() {
        try (FileWriter writer = new FileWriter(file)) {
            for (String s : dictionary.keySet()) {
                writer.write(s + ":" + dictionary.get(s) + "\n");
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public void add(String words, String translation) {
        if (!dictionary.containsKey(words) && !dictionary.containsKey(translation)) {
            dictionary.putIfAbsent(words, translation);
        }
    }

    public String translate(String word) {
        for (String s : dictionary.keySet()) {
            if (s.equalsIgnoreCase(word)) { // scan keySets
                return dictionary.get(s);
            } else if (dictionary.get(s).equalsIgnoreCase(word)) { // scan values
                return s;
            }
        }
        return null;
    }

    public void delete(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        } else if (dictionary.containsValue(word)) {
            dictionary.values().remove(word);
        }
    }
}