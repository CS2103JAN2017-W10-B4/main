package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.IncorrectCommand;
import seedu.address.logic.commands.ShowCommand;

//@@author A0121668A
/**
 * Parses input arguments and creates a new ShowCommand object
 */
public class ShowCommandParser {

    /**
     * Parses the given {@code String} of arguments in the context of the ShowCommand
     * and returns an ShowCommand object for execution.
     */

    public Command parse(String args) {

        String status = ParserUtil.parseStatus(args);

        if (!status.equals("com") && !status.equals("pend") && !status.equals("")) {
            return new IncorrectCommand(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, ShowCommand.MESSAGE_USAGE));
        }

        return new ShowCommand(status);
    }
}