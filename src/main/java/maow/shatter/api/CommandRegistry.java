package maow.shatter.api;

import maow.shatter.api.util.SimpleRegistry;

public class CommandRegistry extends SimpleRegistry<Command> {
    private static CommandRegistry INSTANCE;

    private CommandRegistry() {}

    public static CommandRegistry getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CommandRegistry();
        }
        return INSTANCE;
    }
}
