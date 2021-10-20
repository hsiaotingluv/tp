package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.DeleteByIndexCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new DeleteByIndexCommand object
 */
public class DeleteByIndexCommandParser implements Parser<DeleteByIndexCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the DeleteByIndexCommand
     * and returns a DeleteByIndexCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public DeleteByIndexCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args);
            return new DeleteByIndexCommand(index);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, DeleteByIndexCommand.MESSAGE_USAGE), pe);
        }
    }

}
