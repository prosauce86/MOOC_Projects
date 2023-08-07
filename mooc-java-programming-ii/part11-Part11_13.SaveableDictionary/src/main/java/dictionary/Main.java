package dictionary;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();

        dictionary.add("tietokone", "computer");
        dictionary.add("thanks", "gracias");
        dictionary.add("computer", "tietokone");

        dictionary.save();
    }
}