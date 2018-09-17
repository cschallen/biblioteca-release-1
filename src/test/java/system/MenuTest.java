package system;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MenuTest {

    private Menu menu;
    private List<Book> books;
    private LibraryManagement libraryManagement;

    @Before
    public void setup(){
        menu = new Menu();
        libraryManagement = new LibraryManagement();
        books = libraryManagement.getBooks();
    }

    @Test
    public void welcomeMessage(){
        assertEquals("Welcome", menu.welcomeMessage());
    }

    @Test
    public void whenListingBooksTheSizeHasToBeThree () {
        assertEquals(3, books.size());
    }

    @Test
    public void returnFormattedBookDetails() {
        assertEquals(books.get(0).toString(), "1 - A - Carlos - 1996");
    }

    @Test
    public void whenListingBooksShowOnlyAvailableBooks () {
        String expected = "1 - A - Carlos - 1996\n2 - B - Ju - 1987\n";
        assertEquals(expected, libraryManagement.printBooks(books));
    }

}