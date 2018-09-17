package system;

import java.util.List;

public class OptionFactory {
    public static Option createOptionById(int id) {
        switch (id) {
            case 1:
                return new ListBooks();
            case 2:
                return new CheckoutBook();
            case 3:
                return new ReturnBook();
            case 4:
                return new Quit();
            default:
                return new InvalidOption();
        }
    }
}
