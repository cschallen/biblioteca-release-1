package system;

public class ListBooks implements Option {
    private LibraryManagement libraryManagement;

    public ListBooks(LibraryManagement libraryManagement) {
        this.libraryManagement = libraryManagement;
    }

    @Override
    public void execute() {
        System.out.println(libraryManagement.printBooks());
    }
}
