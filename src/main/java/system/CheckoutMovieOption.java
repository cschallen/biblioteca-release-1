package system;

import java.util.Scanner;

public class CheckoutMovieOption implements Option {
    private LibraryManagement libraryManagement;
    private boolean checkoutSuccess = false;
    private Scanner scanner = new Scanner(System.in);

    public CheckoutMovieOption(LibraryManagement libraryManagement){
        this.libraryManagement = libraryManagement;
    }

    @Override
    public void execute() {
        showMoviesToUser();
        checkout(getIdFromUser());
        showMessage();
    }

    public void checkout(int id){
        Movie movie = libraryManagement.getMovieById(id);
        if(movie != null && movie.isAvailable()){
            movie.checkoutItem();
            this.checkoutSuccess = true;
        }
    }

    private void showMessage() {
        System.out.println(getCheckoutMessage());
    }

    public String getCheckoutMessage() {
        return checkoutSuccess ? "Thank you! Enjoy the movie" : "That movie is not available";
    }

    private void showMoviesToUser() {
        System.out.println(libraryManagement.printMovies());
    }

    private int getIdFromUser() {
        System.out.println("Choose the movie's id: ");
        return scanner.nextInt();
    }
}
