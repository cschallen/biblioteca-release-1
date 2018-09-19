package system;

public class OptionFactory {
    public static Option createOptionById(int id, LibraryManagement libraryManagement) {
        switch (id) {
            case 1:
                return new ListBooksOption(libraryManagement);
            case 2:
                return new CheckoutBookOption(libraryManagement);
            case 3:
                return new ReturnBookOption(libraryManagement);
            case 4:
                return new QuitOption();
            default:
                return new InvalidOption();
        }
    }
}
