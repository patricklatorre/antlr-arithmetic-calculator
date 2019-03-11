import gen.CalculatorBaseVisitor;
import gen.CalculatorParser;

public class SimpleArithmetic extends CalculatorBaseVisitor<Integer> {

    @Override
    public Integer visitEvaluate(CalculatorParser.EvaluateContext ctx) {
        Integer result = visit(ctx.level1());
        if (result != null) System.out.println(result);
        return result;
    }

    @Override
    public Integer visitAddition(CalculatorParser.AdditionContext ctx) {
        return visit(ctx.level1()) + visit(ctx.level2());
    }

    @Override
    public Integer visitSubtraction(CalculatorParser.SubtractionContext ctx) {
        return visit(ctx.level1()) - visit(ctx.level2());
    }

    @Override
    public Integer visitMultiplication(CalculatorParser.MultiplicationContext ctx) {
        return visit(ctx.level2()) * visit(ctx.negate());
    }

    @Override
    public Integer visitModulo(CalculatorParser.ModuloContext ctx) {
        return visit(ctx.level2()) % visit(ctx.negate());
    }

    @Override
    public Integer visitDivision(CalculatorParser.DivisionContext ctx) {
        Integer dividend = visit(ctx.level2());
        Integer divisor = visit(ctx.negate());

        if (divisor != 0) {
            return dividend / divisor;
        } else {
            System.out.print("ERROR: division by zero >> consumed=");
            return 1;
        }
    }

    @Override
    public Integer visitNegateSign(CalculatorParser.NegateSignContext ctx) {
        return visit(ctx.negate()) * -1;
    }

    @Override
    public Integer visitNumber(CalculatorParser.NumberContext ctx) {
        return Integer.parseInt(ctx.NUMBER().getText());
    }

    @Override
    public Integer visitParenthesize(CalculatorParser.ParenthesizeContext ctx) {
        return visit(ctx.level1());
    }
}
