package system;

import java.util.Scanner;

public class ReturnBook implements Option, Library {
    private LibraryManagement libraryManagement;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void execute() {
        libraryManagement.changeAvailability(getBookIdToReturn(), false);
    }

    @Override
    public void loadLibraryManagement(LibraryManagement libraryManagement) {
        this.libraryManagement = libraryManagement;
    }

    private int getBookIdToReturn() {
        System.out.println("Enter the id of the book you want to return: ");
        return scanner.nextInt();
    }

}
