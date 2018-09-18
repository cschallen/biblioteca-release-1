package system;

import org.junit.Test;

import static org.junit.Assert.*;

public class OptionFactoryTest {

    private LibraryManagement libraryManagement = new LibraryManagement();

    @Test
    public void shouldReturnAListBooksObjectWhenOptionIsOne() {
        assertTrue(OptionFactory.createOptionById(1, libraryManagement) instanceof ListBooks);
    }

    @Test
    public void shouldReturnACheckoutBookObjectWhenOptionIsTwo() {
        assertTrue(OptionFactory.createOptionById(2, libraryManagement) instanceof CheckoutBook);
    }

    @Test
    public void shouldReturnAReturnBooksObjectWhenOptionIsThree() {
        assertTrue(OptionFactory.createOptionById(3, libraryManagement) instanceof ReturnBook);
    }

    @Test
    public void shouldReturnAQuitObjectWhenOptionIsFour() {
        assertTrue(OptionFactory.createOptionById(4, libraryManagement) instanceof Quit);
    }

    @Test
    public void shouldReturnAInvalidOptionObjectWhenOptionIsInvalid() {
        assertTrue(OptionFactory.createOptionById(243, libraryManagement) instanceof InvalidOption);
    }
}