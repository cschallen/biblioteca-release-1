package system;

import java.util.Scanner;

public class CheckoutBookOption implements Option {

    private LibraryManagement libraryManagement;
    private Scanner scanner = new Scanner(System.in);
    private boolean checkoutSuccess = false;
    private Login login;

    public CheckoutBookOption(LibraryManagement libraryManagement){
        this.libraryManagement = libraryManagement;
        this.login = new Login(libraryManagement.getCustomers());
    }

    @Override
    public void execute() {
        if(login.userAuthenticated()) {
            showBooksToUser();
            checkout(getIdFromUser());
            showMessage();
        }
    }

    public void checkout(int id){
        Book book = libraryManagement.getBookById(id);
        if(book != null && book.isAvailable()){
            book.checkoutItem();
            this.checkoutSuccess = true;
        }
    }

    private void showMessage() {
        System.out.println(getCheckoutMessage());
    }

    public String getCheckoutMessage() {
        return checkoutSuccess ? "Thank you! Enjoy the book" : "That book is not available";
    }

    private void showBooksToUser() {
        System.out.println(libraryManagement.printBooks());
    }
    
    private int getIdFromUser() {
        System.out.println("Choose the book's id: ");
        return scanner.nextInt();
    }
}
