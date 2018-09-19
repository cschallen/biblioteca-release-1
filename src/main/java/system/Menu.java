package system;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private LibraryManagement libraryManagement = new LibraryManagement();
    private static String WELCOME_MESSAGE = "Welcome";

    public void startApp() {
        showWelcomeMessage();
        keepRunningSystemUntilQuit();
    }

    private void keepRunningSystemUntilQuit() {
        while(true) {
            executeAction(getOptionFromUser());
        }
    }

    private void executeAction(int id) {
        Option option = OptionFactory.createOptionById(id, libraryManagement);
        option.execute();
    }

    private int getOptionFromUser() {
        showOptions();
        return scanner.nextInt();
    }

    private void showOptions() {
        System.out.println("1) List Books");
        System.out.println("2) Checkout Book");
        System.out.println("3) Return Book");
        System.out.println("4) Quit");
        System.out.println("Choose an option: ");
    }

    private void showWelcomeMessage(){
        System.out.println(WELCOME_MESSAGE);
    }


}
