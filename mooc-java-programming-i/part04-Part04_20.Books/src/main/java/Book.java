public class Book {
    private String title;
    private int pages, year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return title + ", " + pages + " pages, " + year;
    }
}