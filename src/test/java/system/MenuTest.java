package system;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MenuTest {

    private Menu menu;

    @Before
    public void setup(){
        menu = new Menu();
    }

    @Test
    public void welcomeMessage(){
        assertEquals("Welcome", menu.welcomeMessage());
    }

}