package system;

public class ListBooks implements Option, Library {
    private LibraryManagement libraryManagement;

    @Override
    public void execute() {
        System.out.println(LibraryManagement.printBooks(libraryManagement.getBooks()));
    }

    @Override
    public void loadLibraryManagement(LibraryManagement libraryManagement) {
        this.libraryManagement = libraryManagement;
    }
}
