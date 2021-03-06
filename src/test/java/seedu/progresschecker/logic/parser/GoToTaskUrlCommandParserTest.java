package seedu.progresschecker.logic.parser;

import static seedu.progresschecker.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.progresschecker.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.progresschecker.logic.parser.ParserUtil.MESSAGE_INVALID_INDEX_OR_FORMAT;
import static seedu.progresschecker.testutil.TypicalTaskArgs.INDEX_FIRST_TASK;
import static seedu.progresschecker.testutil.TypicalTaskArgs.INDEX_FIRST_TASK_INT;
import static seedu.progresschecker.testutil.TypicalTaskArgs.INVALID_CHARSET;
import static seedu.progresschecker.testutil.TypicalTaskArgs.INVALID_NEGATIVE;
import static seedu.progresschecker.testutil.TypicalTaskArgs.INVALID_ZERO;

import org.junit.Test;

import seedu.progresschecker.logic.commands.GoToTaskUrlCommand;

//@@author EdwardKSG
public class GoToTaskUrlCommandParserTest {

    private GoToTaskUrlCommandParser parser = new GoToTaskUrlCommandParser();

    @Test
    public void parse_validArgsFirstTask_returnsGoToTaskUrlCommand() {
        assertParseSuccess(parser, INDEX_FIRST_TASK, new GoToTaskUrlCommand(INDEX_FIRST_TASK_INT));
    }

    @Test
    public void parse_invalidArgsNegative_throwsParseException() {
        assertParseFailure(parser, INVALID_NEGATIVE, String.format(MESSAGE_INVALID_INDEX_OR_FORMAT,
                GoToTaskUrlCommand.MESSAGE_USAGE));
    }

    @Test
    public void parse_invalidArgsZero_throwsParseException() {
        assertParseFailure(parser, INVALID_ZERO, String.format(MESSAGE_INVALID_INDEX_OR_FORMAT,
                GoToTaskUrlCommand.MESSAGE_USAGE));
    }

    @Test
    public void parse_invalidArgsCharset_throwsParseException() {
        assertParseFailure(parser, INVALID_CHARSET, String.format(MESSAGE_INVALID_INDEX_OR_FORMAT,
                GoToTaskUrlCommand.MESSAGE_USAGE));
    }
}
