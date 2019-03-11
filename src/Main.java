import generated.ArithmeticLexer;
import generated.ArithmeticParser;
import implementation.ArithmeticEvaluator;
import implementation.OneLineErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // path of input.txt relative to Main.java
        String inputPath = String.valueOf(Main.class.getResource("/input.txt")).substring("file:/".length());

        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            String line;

            // Evaluate per line of file
            while ((line = br.readLine()) != null) {

                // take line<string> into stream and feed into lexer
                InputStream stream = new ByteArrayInputStream((line+"\n").getBytes(StandardCharsets.UTF_8));
                ArithmeticLexer lexer = new ArithmeticLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));

                // set lexer custom error checkers
                lexer.removeErrorListeners();
                lexer.addErrorListener(new OneLineErrorListener());

                // tokenize
                CommonTokenStream tokens = new CommonTokenStream(lexer);

                // parse
                ArithmeticParser parser = new ArithmeticParser(tokens);

                // set parser custom error checkers
                parser.removeErrorListeners();
                parser.addErrorListener(new OneLineErrorListener());

                // evaluate
                ParseTree tree = parser.expression();
                ArithmeticEvaluator calcVisitor = new ArithmeticEvaluator();
                calcVisitor.visit(tree);

                // for safety
                lexer.reset();
                parser.reset();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
