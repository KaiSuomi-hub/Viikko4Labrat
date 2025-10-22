package viikko4.lab;

public class Book {

    private final String name;
    private final String author;
    private final int year;

    public Book(String name, String author, Integer year) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Väärä arvo!");
        }
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Väärä arvo!");
        }
        if (year == null || year < 0) {
            throw new IllegalArgumentException("Väärä arvo!");
        }
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String toDisplay() {
        return author + ": " + name + " (" + year + ")";
    }

    public String getName() { return name; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
}
