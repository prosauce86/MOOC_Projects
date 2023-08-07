
public class Main {

    public static void main(String[] args) {
        // Test your program here!
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc lol";

        for (String s : text.split(" ")) {
            if (abbreviations.hasAbbreviation(s)) {
                s = abbreviations.findExplanationFor(s);

            }

            System.out.print(s);
            System.out.print(" ");
        }
    }
}