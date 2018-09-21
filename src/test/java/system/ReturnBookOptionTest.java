package system;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReturnBookOptionTest {
    private ReturnBookOption returnBookOption;
    private LibraryManagement libraryManagement;

    @Before
    public void setup() {
        libraryManagement = new LibraryManagement();
        returnBookOption = new ReturnBookOption(libraryManagement);
    }

    @Test
    public void whenReturnABookShowTheBookInTheList() {
        returnBookOption.returnBook(3);
        String expected = "1 - A - Carlos - 1996\n2 - B - Ju - 1987\n3 - C - Mirela - 1990\n";
        assertEquals(expected, libraryManagement.printBooks());
    }

    @Test
    public void showUnsuccessfullMessageWhenReturningABook(){
        returnBookOption.returnBook(2);
        assertEquals("That is not a valid book to return", returnBookOption.getReturnMessage());
    }

    @Test
    public void showSuccessfullMessageWhenReturningABook(){
        returnBookOption.returnBook(3);
        assertEquals("Thank you for returning the book", returnBookOption.getReturnMessage());
    }


}


