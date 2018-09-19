package system;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryManagementTest {
    private LibraryManagement libraryManagement;

    @Before
    public void setup(){
        libraryManagement = new LibraryManagement();
    }

    @Test
    public void whenListingBooksTheSizeHasToBeThree () {
        assertEquals(3, libraryManagement.getBooks().size());
    }

    @Test
    public void returnFormattedBookDetails() {
        assertEquals(libraryManagement.getBooks().get(0).toString(), "1 - A - Carlos - 1996");
    }

    @Test
    public void whenListingBooksShowOnlyAvailableBooks () {
        String expected = "1 - A - Carlos - 1996\n2 - B - Ju - 1987\n";
        assertEquals(expected, libraryManagement.printBooks());
    }

    @Test
    public void getBookByIdTest() {
        assertEquals(libraryManagement.getBooks().get(2), libraryManagement.getBookById(3));
        assertNull(libraryManagement.getBookById(14));
    }
}
