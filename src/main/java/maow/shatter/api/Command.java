package maow.shatter.api;

public interface Command {
    String getName();
    String getDescription();
    String getSyntax();
    void run();
}
