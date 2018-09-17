package system;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryManagementTest {
    private LibraryManagement libraryManagement;
    private Menu menu;

    @Before
    public void setup(){
        libraryManagement = new LibraryManagement();
        menu = new Menu();
    }

    @Test
    public void whenCheckedOutABookShouldRemoveItFromTheList () {
        libraryManagement.changeAvailability(2, true);
        String expected = "1 - A - Carlos - 1996\n";
        assertEquals(expected, menu.printBooks(libraryManagement.getBooks()));
    }

    @Test
    public void showSuccessfullMessageWhenCheckingOut(){
        assertEquals("Thank you! Enjoy the book", libraryManagement.showCheckoutMessage(true));
    }

    @Test
    public void showUnsucessfullMessageWhenCheckingout(){
        assertEquals("That book is not available", libraryManagement.showCheckoutMessage(false));
    }

    @Test
    public void whenReturnABookShowTheBookInTheList() {
        libraryManagement.changeAvailability(3, false);
        String expected = "1 - A - Carlos - 1996\n2 - B - Ju - 1987\n3 - C - Mirela - 1990\n";
        assertEquals(expected, menu.printBooks(libraryManagement.getBooks()));
    }


    @Test
    public void showSuccessfullMessageWhenReturn(){
        assertEquals("Thank you for returning the book", libraryManagement.showReturnMessage(true));
    }

    @Test
    public void showUnsucessfullMessageWhenReturn(){
        assertEquals("That is not a valid book to return", libraryManagement.showReturnMessage(false));
    }
}
