package system;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private LibraryManagement library = new LibraryManagement();
    private List<Book> books = library.getBooks();

    public void startApp() {
        System.out.println(welcomeMessage());

        while(true) {
            showOptions();
            int option = getOptionFromUser();

            if (option == 4) {
                break;
            }

            callOption(option);
        }
    }

    private void callOption(int option) {
        switch (option) {
            case 1:
                listBooks();
                break;
            case 2:
                checkoutBook();
                break;
            case 3:
                returnBook();
                break;
            default:
                System.out.println("Select a valid option!");
                break;
        }
    }

    private void returnBook() {
        System.out.println("Enter the id of the book you want to return: ");
        int idToReturn = getOptionFromUser();
        library.changeAvailability(idToReturn, false);
    }

    private void checkoutBook() {
        listBooks();
        System.out.printf("Choose the book's id: ");
        int idToCheckout = getOptionFromUser();
        library.changeAvailability(idToCheckout, true);
    }

    private void listBooks() {
        System.out.println(printBooks(books));
    }

    private int getOptionFromUser() {
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private void showOptions() {
        System.out.println("1) List Books");
        System.out.println("2) Checkout Book");
        System.out.println("3) Return Book");
        System.out.println("4) Quit");
    }

    public String welcomeMessage() {
        return "Welcome";
    }

    public String printBooks(List<Book> books) {
        StringBuilder print = new StringBuilder();
        for (Book book : books) {
            if (book.isAvailable())
                print.append(book.toString()).append("\n");
        }
        return print.toString();
    }
}
