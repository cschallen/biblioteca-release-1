package system;

import java.util.Arrays;
import java.util.List;

public class LibraryManagement {

    private List<Book> books;

    public LibraryManagement () {
        fillBooksFromLibrary();
    }

    public void fillBooksFromLibrary() {
        this.books = Arrays.asList(
                new Book(1, "A", "Carlos", 1996, true),
                new Book(2, "B", "Ju", 1987, true),
                new Book(3, "C", "Mirela", 1990, false)
        );
    }

    public String printBooks() {
        StringBuilder print = new StringBuilder();
        for (Book book : books) {
            if (book.isAvailable())
                print.append(book.toString()).append("\n");
        }
        return print.toString();
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBookById(int id) {
        for (Book book : books){
            if(book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }
}
