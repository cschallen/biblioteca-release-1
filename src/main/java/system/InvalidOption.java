package system;

public class InvalidOption implements Option {
    @Override
    public void execute() {
        System.out.println("Select a valid option!");
    }
}
