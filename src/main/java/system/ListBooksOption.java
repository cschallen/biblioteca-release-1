package system;

public class ListBooksOption implements Option {
    private LibraryManagement libraryManagement;

    public ListBooksOption(LibraryManagement libraryManagement) {
        this.libraryManagement = libraryManagement;
    }

    @Override
    public void execute() {
        System.out.println(libraryManagement.printBooks());
    }
}
