package system;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CheckoutBookOptionTest {

    private CheckoutBookOption checkoutBookOption;
    private LibraryManagement libraryManagement;
    private List<Book> books;

    @Before
    public void setup(){
        libraryManagement = new LibraryManagement();
        books = Arrays.asList(
                new Book(1, "A", "Carlos", 1996, true),
                new Book(2, "B", "Ju", 1987, true),
                new Book(3, "C", "Mirela", 1990, false)
        );
        libraryManagement.setBooks(books);
        checkoutBookOption = new CheckoutBookOption(libraryManagement);
    }

    @Test
    public void whenCheckedOutABookShouldRemoveItFromTheList () {
        checkoutBookOption.checkout(2);
        String expected = "1 - A - Carlos - 1996\n";
        assertEquals(expected, libraryManagement.printBooks());
    }

    @Test
    public void showSuccessfullMessageWhenCheckingOut(){
        checkoutBookOption.checkout(2);
        assertEquals("Thank you! Enjoy the book", checkoutBookOption.getCheckoutMessage());
    }

    @Test
    public void showUnsucessfullMessageWhenCheckingout(){
        checkoutBookOption.checkout(3);
        assertEquals("That book is not available", checkoutBookOption.getCheckoutMessage());
    }

}