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
        System.out.println(LibraryManagement.printBooks(libraryManagement.getBooks()));
        System.out.printf("Choose the book's id: ");
        int idToCheckout = getOptionFromUser();
        libraryManagement.changeAvailability(idToCheckout, true);
    }

    private int getOptionFromUser() {
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}
