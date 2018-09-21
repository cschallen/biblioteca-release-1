package system;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OptionFactoryTest {

    private LibraryManagement libraryManagement = new LibraryManagement();

    @Test
    public void shouldReturnAListBooksObjectWhenOptionIsOne() {
        assertTrue(OptionFactory.createOptionById(1, libraryManagement) instanceof ListBooksOption);
    }

    @Test
    public void shouldReturnACheckoutBookObjectWhenOptionIsTwo() {
        assertTrue(OptionFactory.createOptionById(2, libraryManagement) instanceof CheckoutBookOption);
    }

    @Test
    public void shouldReturnAReturnBooksObjectWhenOptionIsThree() {
        assertTrue(OptionFactory.createOptionById(3, libraryManagement) instanceof ReturnBookOption);
    }

    @Test
    public void shouldReturnAListMoviesObjectWhenOptionIsFour() {
        assertTrue(OptionFactory.createOptionById(4, libraryManagement) instanceof ListMoviesOption);
    }

    @Test
    public void shouldReturnACheckOutMovieObjectWhenOptionIsFive() {
        assertTrue(OptionFactory.createOptionById(5, libraryManagement) instanceof CheckoutMovieOption);
    }

    @Test
    public void shouldReturnAQuitObjectWhenOptionIsSix() {
        assertTrue(OptionFactory.createOptionById(6, libraryManagement) instanceof QuitOption);
    }

    @Test
    public void shouldReturnAInvalidOptionObjectWhenOptionIsInvalid() {
        assertTrue(OptionFactory.createOptionById(243, libraryManagement) instanceof InvalidOption);
    }
}