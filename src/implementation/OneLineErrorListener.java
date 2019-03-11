package implementation;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class OneLineErrorListener extends BaseErrorListener {

    public static final OneLineErrorListener INSTANCE = new OneLineErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                            int charPositionInLine, String msg, RecognitionException e) {
        System.out.print("ERROR: " + msg.replaceAll("\n", "NEWLINE") + " >> consumed=");
    }
}