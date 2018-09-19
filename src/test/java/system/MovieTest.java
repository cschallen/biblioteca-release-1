package system;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MovieTest {

    private Movie movie;

    @Before
    public void setup(){
        movie = new Movie(1, "The brother", 1996, "Carlos", 10, true);
    }

    @Test
    public void shouldReturnFormattedStringWithBookAttributesWhenToStringIsCalled(){
        assertEquals("1 - The brother - 1996 - Carlos - 10", movie.toString());
    }

    @Test
    public void shouldReturnFormattedStringWithBookAttributesAndUnratedWhenToStringIsCalledAndRatingIsZero(){
        Movie movieNoRated = new Movie(2, "The cousin", 1969, "Nanai", 0, true);
        assertEquals("2 - The cousin - 1969 - Nanai - Unrated", movieNoRated.toString());
    }

}