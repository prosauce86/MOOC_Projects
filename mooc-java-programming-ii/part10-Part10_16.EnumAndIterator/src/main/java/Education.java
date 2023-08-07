public enum Education {
    // constructor parameters are defined as
    // the constants are enumerated
    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");

    private String s;
    private Education(String s) {
        this.s = s;
    }
}