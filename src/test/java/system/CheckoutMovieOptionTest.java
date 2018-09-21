package system;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CheckoutMovieOptionTest {

    private CheckoutMovieOption checkoutMovieOption;
    private LibraryManagement libraryManagement;
    private List<Movie> movies;

    @Before
    public void setup(){
        libraryManagement = new LibraryManagement();
        movies = Arrays.asList(
                new Movie(1, "The brother", 1996, "Carlos", 10, true),
                new Movie(2, "The cousin", 1969, "Nanai", 0, true),
                new Movie(3, "The sister", 1999, "Milera", 2, false)
        );
        libraryManagement.setMovies(movies);
        checkoutMovieOption = new CheckoutMovieOption(libraryManagement);
    }


    @Test
    public void whenCheckedOutABookShouldRemoveItFromTheList () {
        checkoutMovieOption.checkout(2);
        String expected = "1 - The brother - 1996 - Carlos - 10\n";
        assertEquals(expected, libraryManagement.printMovies());
    }

    @Test
    public void showSuccessfullMessageWhenCheckingOut(){
        checkoutMovieOption.checkout(2);
        assertEquals("Thank you! Enjoy the movie", checkoutMovieOption.getCheckoutMessage());
    }

    @Test
    public void showUnsucessfullMessageWhenCheckingout(){
        checkoutMovieOption.checkout(3);
        assertEquals("That movie is not available", checkoutMovieOption.getCheckoutMessage());
    }

}