package system;

import java.util.HashMap;
import java.util.Scanner;

public class Login {
    private Scanner scanner = new Scanner(System.in);
    private HashMap<String, Customer> customers;

    public Login(HashMap<String, Customer> customers) {
        this.customers = customers;
    }

    public boolean userAuthenticated() {
        return validateLogin(askLibraryNumber(), askPassword());
    }

    private String askLibraryNumber() {
        System.out.println("Library Number: ");
        return scanner.nextLine();
    }

    private String askPassword() {
        System.out.println("Password: ");
        return scanner.nextLine();
    }

    public boolean validateLogin(String libraryNumber, String password){
        Customer customer = customers.get(libraryNumber);
        if(customer != null && customer.authenticatePassword(password)){
            return true;
        }
        System.out.println("Invalid password or library number!");
        return false;
    }
}
