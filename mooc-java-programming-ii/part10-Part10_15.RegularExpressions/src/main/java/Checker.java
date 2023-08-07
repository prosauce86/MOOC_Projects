

public class Checker {

    public Checker() {

    }

    public boolean isDayOfWeek(String string) {
        return string.toLowerCase().matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public boolean allVowels(String string) {
        return string.toLowerCase().matches("[aeiou]*");
    }

    public boolean timeOfDay(String string) {
        return string.matches("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
    }

}