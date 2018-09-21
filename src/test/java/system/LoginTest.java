package system;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LoginTest {

    private Login login;
    private HashMap<String, Customer> customers;
    private LibraryManagement libraryManagement;

    @Before
    public void setup(){
        customers = new HashMap<String, Customer>(){{
            put("143-4444", new Customer("143-4444", "1t34"));
        }};
        libraryManagement = new LibraryManagement();
        libraryManagement.setCustomers(customers);
        login = new Login(customers);
    }

    @Test
    public void whenLoginWithValidLibraryNumberAndPasswordShouldReturnTrue() {
        assertTrue(login.validateLogin("143-4444", "1t34"));
    }

    @Test
    public void whenLoginWithAnInvalidLibraryNumberShouldReturnFalse(){
        assertFalse(login.validateLogin("141-4444", "1t34"));
    }

    @Test
    public void whenLoginWithAnInvalidPasswordShouldReturnFalse(){
        assertFalse(login.validateLogin("143-4444", "1t345"));
    }
}