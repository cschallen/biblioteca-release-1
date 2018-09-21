package system;

public class Customer {
    private String libraryNumber;
    private String password;

    public Customer(String libraryNumber, String password){
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public boolean authenticatePassword(String password){
        return password.equals(this.password);
    }
}
