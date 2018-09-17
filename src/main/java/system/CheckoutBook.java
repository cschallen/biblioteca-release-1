package system;

import java.util.Scanner;

public class CheckoutBook implements Option, Library {

    private LibraryManagement libraryManagement;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void execute() {
        System.out.println(LibraryManagement.printBooks(libraryManagement.getBooks()));
        System.out.printf("Choose the book's id: ");
        int idToCheckout = getOptionFromUser();
        libraryManagement.changeAvailability(idToCheckout, true);
    }

    @Override
    public void loadLibraryManagement(LibraryManagement libraryManagement) {
        this.libraryManagement = libraryManagement;
    }

    private int getOptionFromUser() {
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}
