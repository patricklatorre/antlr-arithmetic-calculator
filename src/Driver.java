import gen.CalculatorLexer;
import gen.CalculatorParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;

public class Driver {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ptrck\\Github\\antlr-arithmetic-calculator\\src\\input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.matches("\\s*\n")) break;
                InputStream stream = new ByteArrayInputStream((line+"\n").getBytes(StandardCharsets.UTF_8));
                CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
                lexer.removeErrorListeners();
                lexer.addErrorListener(new ThrowingErrorListener());
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CalculatorParser parser = new CalculatorParser(tokens);
                parser.removeErrorListeners();
                parser.addErrorListener(new ThrowingErrorListener());
                ParseTree tree = parser.expression();
                SimpleArithmetic calcVisitor = new SimpleArithmetic();
                calcVisitor.visit(tree);
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
