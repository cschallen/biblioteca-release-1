package system;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LibraryManagementTest {
    private LibraryManagement libraryManagement;
    private List<Book> books;
    private List<Movie> movies;

    @Before
    public void setup(){
        libraryManagement = new LibraryManagement();
        books = Arrays.asList(
                new Book(1, "A", "Carlos", 1996, true),
                new Book(2, "B", "Ju", 1987, true),
                new Book(3, "C", "Mirela", 1990, false)
        );
        movies = Arrays.asList(
                new Movie(1, "The brother", 1996, "Carlos", 10, true),
                new Movie(2, "The cousin", 1969, "Nanai", 0, true),
                new Movie(3, "The sister", 1999, "Milera", 2, false)
        );
        libraryManagement.setBooks(books);
        libraryManagement.setMovies(movies);
    }

    @Test
    public void whenListingBooksTheSizeHasToBeThree () {
        assertEquals(3, libraryManagement.getBooks().size());
    }

    @Test
    public void whenListingBooksShowOnlyAvailableBooks () {
        String expected = "1 - A - Carlos - 1996\n2 - B - Ju - 1987\n";
        assertEquals(expected, libraryManagement.printBooks());
    }

    @Test
    public void whenHaveNoAvailableBooksShouldReturnAEmptyString(){
        books = Arrays.asList(
                new Book(1, "A", "Carlos", 1996, false),
                new Book(2, "B", "Ju", 1987, false),
                new Book(3, "C", "Mirela", 1990, false)
        );
        libraryManagement.setBooks(books);
        assertEquals("", libraryManagement.printBooks());
    }

    @Test
    public void whenHaveNoAvailableMoviesShouldReturnAEmptyString(){
        movies = Arrays.asList(
                new Movie(1, "The brother", 1996, "Carlos", 10, false),
                new Movie(2, "The cousin", 1969, "Nanai", 0, false),
                new Movie(3, "The sister", 1999, "Milera", 2, false)
        );
        libraryManagement.setMovies(movies);
        assertEquals("", libraryManagement.printMovies());
    }

    @Test
    public void whenListingMoviesShowOnlyAvailableMovies () {
        String expected = "1 - The brother - 1996 - Carlos - 10\n2 - The cousin - 1969 - Nanai - Unrated\n";
        assertEquals(expected, libraryManagement.printMovies());
    }

    @Test
    public void whenGettingBookByValidIdShouldReturnTheObject() {
        assertEquals(books.get(2), libraryManagement.getBookById(3));
    }

    @Test
    public void whenGettingBookWithInvalidIDShouldReturnNull(){
        assertNull(libraryManagement.getBookById(14));
    }

    @Test
    public void whenListingMoviesTheSizeHasToBeThree () {
        assertEquals(3, libraryManagement.getMovies().size());
    }
}
