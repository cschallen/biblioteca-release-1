package system;

public class OptionFactory {
    public static Option createOptionById(int id,  LibraryManagement libraryManagement) {
        switch (id) {
            case 1:
                return new ListBooks(libraryManagement);
            case 2:
                return new CheckoutBook(libraryManagement);
            case 3:
                return new ReturnBook(libraryManagement);
            case 4:
                return new Quit();
            default:
                return new InvalidOption();
        }
    }
}
