package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.model.DukeCooks;
import seedu.address.model.Model;

/**
 * Clears Duke Cooks.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "Duke Cooks has been cleared!";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.setDukeCooks(new DukeCooks());
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
