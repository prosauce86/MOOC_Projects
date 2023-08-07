
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compared) {

        // might not need this for name/year comparison
        if (this == compared) return true; // compare reference memory location

        // Check object type
        if (!(compared instanceof Book)) return false;

        Book comparedBook = (Book) compared;
        return name.equals(comparedBook.name) && publicationYear == comparedBook.publicationYear;

    }

}