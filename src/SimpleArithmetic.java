public class SimpleArithmetic extends ArithmeticBaseVisitor<Integer> {

    @Override
    public Integer visitEvaluate(ArithmeticParser.EvaluateContext ctx) {
        Integer result = visit(ctx.level1());
        if (result != null) System.out.println(result);
        return result;
    }

    @Override
    public Integer visitAddition(ArithmeticParser.AdditionContext ctx) {
        return visit(ctx.level1()) + visit(ctx.level2());
    }

    @Override
    public Integer visitSubtraction(ArithmeticParser.SubtractionContext ctx) {
        return visit(ctx.level1()) - visit(ctx.level2());
    }

    @Override
    public Integer visitMultiplication(ArithmeticParser.MultiplicationContext ctx) {
        return visit(ctx.level2()) * visit(ctx.negate());
    }

    @Override
    public Integer visitModulo(ArithmeticParser.ModuloContext ctx) {
        return visit(ctx.level2()) % visit(ctx.negate());
    }

    @Override
    public Integer visitDivision(ArithmeticParser.DivisionContext ctx) {
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
    public Integer visitNegateSign(ArithmeticParser.NegateSignContext ctx) {
        return visit(ctx.negate()) * -1;
    }

    @Override
    public Integer visitNumber(ArithmeticParser.NumberContext ctx) {
        return Integer.parseInt(ctx.NUMBER().getText());
    }

    @Override
    public Integer visitParenthesize(ArithmeticParser.ParenthesizeContext ctx) {
        return visit(ctx.level1());
    }
}
