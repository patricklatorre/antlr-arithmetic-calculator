// Generated from C:/Users/ptrck/Github/antlr-arithmetic-calculator/src\Arithmetic.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticParser}.
 */
public interface ArithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Evaluate}
	 * labeled alternative in {@link ArithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEvaluate(ArithmeticParser.EvaluateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Evaluate}
	 * labeled alternative in {@link ArithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEvaluate(ArithmeticParser.EvaluateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoNothing}
	 * labeled alternative in {@link ArithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDoNothing(ArithmeticParser.DoNothingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoNothing}
	 * labeled alternative in {@link ArithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDoNothing(ArithmeticParser.DoNothingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link ArithmeticParser#level1}.
	 * @param ctx the parse tree
	 */
	void enterAddition(ArithmeticParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link ArithmeticParser#level1}.
	 * @param ctx the parse tree
	 */
	void exitAddition(ArithmeticParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link ArithmeticParser#level1}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(ArithmeticParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link ArithmeticParser#level1}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(ArithmeticParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToLevel2}
	 * labeled alternative in {@link ArithmeticParser#level1}.
	 * @param ctx the parse tree
	 */
	void enterToLevel2(ArithmeticParser.ToLevel2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ToLevel2}
	 * labeled alternative in {@link ArithmeticParser#level1}.
	 * @param ctx the parse tree
	 */
	void exitToLevel2(ArithmeticParser.ToLevel2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ToNegate}
	 * labeled alternative in {@link ArithmeticParser#level2}.
	 * @param ctx the parse tree
	 */
	void enterToNegate(ArithmeticParser.ToNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToNegate}
	 * labeled alternative in {@link ArithmeticParser#level2}.
	 * @param ctx the parse tree
	 */
	void exitToNegate(ArithmeticParser.ToNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link ArithmeticParser#level2}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(ArithmeticParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link ArithmeticParser#level2}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(ArithmeticParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link ArithmeticParser#level2}.
	 * @param ctx the parse tree
	 */
	void enterModulo(ArithmeticParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link ArithmeticParser#level2}.
	 * @param ctx the parse tree
	 */
	void exitModulo(ArithmeticParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link ArithmeticParser#level2}.
	 * @param ctx the parse tree
	 */
	void enterDivision(ArithmeticParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link ArithmeticParser#level2}.
	 * @param ctx the parse tree
	 */
	void exitDivision(ArithmeticParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegateSign}
	 * labeled alternative in {@link ArithmeticParser#negate}.
	 * @param ctx the parse tree
	 */
	void enterNegateSign(ArithmeticParser.NegateSignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegateSign}
	 * labeled alternative in {@link ArithmeticParser#negate}.
	 * @param ctx the parse tree
	 */
	void exitNegateSign(ArithmeticParser.NegateSignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToUnitPriority}
	 * labeled alternative in {@link ArithmeticParser#negate}.
	 * @param ctx the parse tree
	 */
	void enterToUnitPriority(ArithmeticParser.ToUnitPriorityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToUnitPriority}
	 * labeled alternative in {@link ArithmeticParser#negate}.
	 * @param ctx the parse tree
	 */
	void exitToUnitPriority(ArithmeticParser.ToUnitPriorityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ArithmeticParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ArithmeticParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ArithmeticParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ArithmeticParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesize}
	 * labeled alternative in {@link ArithmeticParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterParenthesize(ArithmeticParser.ParenthesizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesize}
	 * labeled alternative in {@link ArithmeticParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitParenthesize(ArithmeticParser.ParenthesizeContext ctx);
}