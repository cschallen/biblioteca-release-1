package system;

public class QuitOption implements Option {
    @Override
    public void execute() {
        System.exit(0);
    }
}
