package system;

import java.util.Scanner;

public class ReturnBook implements Option {

    private LibraryManagement libraryManagement;
    private Scanner scanner = new Scanner(System.in);

    public ReturnBook(LibraryManagement libraryManagement) {
        this.libraryManagement = libraryManagement;
    }

    @Override
    public void execute() {
        libraryManagement.changeAvailability(getBookIdToReturn(), false);
    }

    private int getBookIdToReturn() {
        System.out.println("Enter the id of the book you want to return: ");
        return scanner.nextInt();
    }

}
