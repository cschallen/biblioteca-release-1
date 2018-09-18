package system;

import java.util.Scanner;

public class CheckoutBook implements Option {

    private LibraryManagement libraryManagement;
    private Scanner scanner = new Scanner(System.in);

    public CheckoutBook(LibraryManagement libraryManagement){
        this.libraryManagement = libraryManagement;
    }

    @Override
    public void execute() {
        showBooksToUser();
        libraryManagement.changeAvailability(getBookIdToCheckout(), true);
    }

    private void showBooksToUser() {
        System.out.println(libraryManagement.printBooks());
    }
    
    private int getBookIdToCheckout() {
        System.out.printf("Choose the book's id: ");
        return scanner.nextInt();
    }
}
