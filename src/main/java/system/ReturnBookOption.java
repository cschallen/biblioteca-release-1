package system;

import java.util.Scanner;

public class ReturnBookOption implements Option {

    private LibraryManagement libraryManagement;
    private Scanner scanner = new Scanner(System.in);
    private boolean returnSuccess = false;

    public ReturnBookOption(LibraryManagement libraryManagement) {
        this.libraryManagement = libraryManagement;
    }

    @Override
    public void execute() {
        returnBook(getIdFromUser());
        showMessage();
    }

    private void showMessage() {
        System.out.println(getReturnMessage());
    }

    public void returnBook(int id){
        Book book = libraryManagement.getBookById(id);
        if(book != null && !book.isAvailable()){
            book.returnBook();
            returnSuccess = true;
        }
    }

    private int getIdFromUser() {
        System.out.println("Enter the id of the book you want to return: ");
        return scanner.nextInt();
    }

    public String getReturnMessage() {
        return returnSuccess ? "Thank you for returning the book" : "That is not a valid book to return";
    }

}
