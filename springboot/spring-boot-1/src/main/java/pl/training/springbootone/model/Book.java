package pl.training.springbootone.model;

import static java.util.UUID.randomUUID;

public class Book {

    private String id;
    private String title;
    private String author;
    private String year;

    public Book(String title, String author, Integer year) {
        this.id = randomUUID().toString();
        this.title = title;
        this.author = author;
        this.year = (year == null) ? "N/A" : year.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book details: " +
                ", id=" + id +
                ", title='" + title + "'" +
                ", author='" + author + "'" +
                ", year='" + year + "'" +
                "";
    }
}
