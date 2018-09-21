package system;

import java.util.Objects;

public class Book extends Item{
    private String title;
    private String author;
    private Integer yearPublished;

    public Book(Integer id, String title, String author, Integer yearPublished, Boolean available) {
        super(id, available);
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) { return false; }
        Book book = (Book) o;
        return Objects.equals(getId(), book.getId());
    }

    @Override
    public String toString() {
        return getId() + " - " + title + " - " + author + " - " + yearPublished;
    }

}
