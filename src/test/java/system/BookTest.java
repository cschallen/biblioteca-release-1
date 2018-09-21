package system;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BookTest {

    private Book book;

    @Before
    public void setup(){
        book = new Book(1, "Hey!", "Carlos Schallenberger", 1996, true);
    }

    @Test
    public void equalsShouldReturnTrueWhenBooksWithSameID() {
        Book bookWithSameID = new Book(1, "Hello!", "Milera", 1964, false);
        assertTrue(book.equals(book));
        assertTrue(book.equals(bookWithSameID));
    }

    @Test
    public void equalsShouldReturnFalseWhenTwoDifferentObjects(){
        Book bookWithAnotherID = new Book(2, "Hello!", "Milera", 1964, false);
        assertFalse(book.equals(null));
        assertFalse(book.equals(new Object()));
        assertFalse(book.equals(bookWithAnotherID));
    }

    @Test
    public void toStringTest() {
        assertEquals("1 - Hey! - Carlos Schallenberger - 1996", book.toString());
    }

    @Test
    public void checkoutBookTest() {
        book.checkoutBook();
        assertFalse(book.isAvailable());
    }

    @Test
    public void returnBookTest() {
        book.returnBook();
        assertTrue(book.isAvailable());
    }
}