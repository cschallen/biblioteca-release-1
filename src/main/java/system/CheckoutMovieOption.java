package system;

public class CheckoutMovieOption implements Option {
    private LibraryManagement libraryManagement;

    public CheckoutMovieOption(LibraryManagement libraryManagement){
        this.libraryManagement = libraryManagement;
    }

    @Override
    public void execute() {

    }
}
