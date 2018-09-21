package system;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LibraryManagement {

    private List<Book> books;
    private List<Movie> movies;
    private HashMap<String, Customer> customers;

    public LibraryManagement () {
        fillLibrary();
    }

    public void setBooks(List<Book> books){
        this.books = books;
    }

    public void setCustomers(HashMap<String, Customer> customers) {
        this.customers = customers;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void fillLibrary() {
        this.books = Arrays.asList(
                new Book(1, "A", "Carlos", 1996, true),
                new Book(2, "B", "Ju", 1987, true),
                new Book(3, "C", "Mirela", 1990, false)
        );
        this.movies = Arrays.asList(
                new Movie(1, "The brother", 1996, "Carlos", 10, true),
                new Movie(2, "The cousin", 1969, "Nanai", 0, true),
                new Movie(3, "The sister", 1999, "Milera", 2, false)
        );
        this.customers = new HashMap<String, Customer>(){{
            put("142-4444", new Customer("143-4444", "1t34"));
            put("010-1001", new Customer("010-1001", "12r4"));
            put("111-1111", new Customer("111-1111", "1111"));
        }};
    }

    public String printBooks() {
        StringBuilder print = new StringBuilder();
        for (Book book : books) {
            if (book.isAvailable()) {
                print.append(book.toString()).append("\n");
            }
        }
        return print.toString();
    }

    public String printMovies() {
        StringBuilder print = new StringBuilder();
        for (Movie movie : movies) {
            if (movie.isAvailable()) {
                print.append(movie.toString()).append("\n");
            }
        }
        return print.toString();
    }

    public Book getBookById(int id) {
        for (Book book : books){
            if(book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public Movie getMovieById(int id) {
        for (Movie movie : movies){
            if(movie.getId().equals(id)) {
                return movie;
            }
        }
        return null;
    }

    public HashMap<String, Customer> getCustomers() {
        return customers;
    }
}
