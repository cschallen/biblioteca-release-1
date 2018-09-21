package system;

public class ListMoviesOption implements Option {

    private LibraryManagement libraryManagement;

    public ListMoviesOption(LibraryManagement libraryManagement) {
        this.libraryManagement = libraryManagement;
    }

    @Override
    public void execute() {
        System.out.println(libraryManagement.printMovies());
    }
}
