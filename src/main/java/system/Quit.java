package system;

public class Quit implements Option {
    @Override
    public void execute() {
        System.exit(0);
    }
}
