public class Country {

    private final String name;
    private final String gender;
    private final int year;
    private final String literacyPercentage;

    public Country(String name, String gender, int year, String literacyPercentage) {
        this.name = name;
        this.gender = gender;
        this.year = year;
        this.literacyPercentage = literacyPercentage;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getYear() {
        return year;
    }

    public String getLiteracyPercentage() {
        return literacyPercentage;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getYear() + "), " + this.getGender().replace("(%)", "").trim() + ", " + this.getLiteracyPercentage();
    }
}