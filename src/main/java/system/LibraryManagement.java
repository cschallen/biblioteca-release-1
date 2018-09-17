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

    public List<Book> getBooks() {
        return books;
    }

    public void changeAvailability(int id, boolean isCheckingOut) {
        boolean changed = false;
        for (Book book : books){
            boolean isAvailable = book.isAvailable() == isCheckingOut;
            if (book.getId().equals(id) && isAvailable) {
                book.setAvailable(!isCheckingOut);
                changed = true;
            }
        }
        System.out.println(showMessage(changed, isCheckingOut));
    }

    private String showMessage(boolean changed, boolean isCheckingOut){
        if(isCheckingOut){
            return showCheckoutMessage(changed);
        }
        return showReturnMessage(changed);
    }


    public String showCheckoutMessage(boolean changed) {
        return changed ? "Thank you! Enjoy the book" : "That book is not available";
    }

    public String showReturnMessage(boolean changed) {
        return changed ? "Thank you for returning the book" : "That is not a valid book to return";
    }
}
