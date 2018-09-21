package system;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckoutBookOptionTest {

    private CheckoutBookOption checkoutBookOption;
    private LibraryManagement libraryManagement;

    @Before
    public void setup(){
        libraryManagement = new LibraryManagement();
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