package system;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setup(){
        customer = new Customer("123-1234", "abc");
    }

    @Test
    public void returnTrueWhenPasswordIsCorrect() {
        assertTrue(customer.authenticatePassword("abc"));
    }

    @Test
    public void returnFalseWhenPasswrodIsNotCorrect(){
        assertFalse(customer.authenticatePassword("abcd"));
    }
}