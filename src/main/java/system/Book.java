package system;

import java.util.Objects;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private Integer yearPublished;
    private Boolean available;

    public Book(Integer id, String title, String author, Integer yearPublished, Boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.available = available;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) { return false; }
        Book book = (Book) o;
        return Objects.equals(getId(), book.getId());
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + author + " - " + yearPublished;
    }

    public Boolean isAvailable() {
        return available;
    }

    private void setAvailable(Boolean available) {
        this.available = available;
    }

    public void checkoutBook() {
        setAvailable(false);
    }

    public void returnBook() {
        setAvailable(true);
    }
}
