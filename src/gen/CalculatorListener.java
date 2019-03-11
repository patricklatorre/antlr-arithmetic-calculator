package gen;// Generated from C:/Users/ptrck/Github/antlr-arithmetic-calculator/src\Calculator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Evaluate}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEvaluate(CalculatorParser.EvaluateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Evaluate}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEvaluate(CalculatorParser.EvaluateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoNothing}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDoNothing(CalculatorParser.DoNothingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoNothing}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDoNothing(CalculatorParser.DoNothingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link CalculatorParser#level1}.
	 * @param ctx the parse tree
	 */
	void enterAddition(CalculatorParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link CalculatorParser#level1}.
	 * @param ctx the parse tree
	 */
	void exitAddition(CalculatorParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link CalculatorParser#level1}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(CalculatorParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link CalculatorParser#level1}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(CalculatorParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToLevel2}
	 * labeled alternative in {@link CalculatorParser#level1}.
	 * @param ctx the parse tree
	 */
	void enterToLevel2(CalculatorParser.ToLevel2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ToLevel2}
	 * labeled alternative in {@link CalculatorParser#level1}.
	 * @param ctx the parse tree
	 */
	void exitToLevel2(CalculatorParser.ToLevel2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ToNegate}
	 * labeled alternative in {@link CalculatorParser#level2}.
	 * @param ctx the parse tree
	 */
	void enterToNegate(CalculatorParser.ToNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToNegate}
	 * labeled alternative in {@link CalculatorParser#level2}.
	 * @param ctx the parse tree
	 */
	void exitToNegate(CalculatorParser.ToNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculatorParser#level2}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(CalculatorParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculatorParser#level2}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(CalculatorParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link CalculatorParser#level2}.
	 * @param ctx the parse tree
	 */
	void enterModulo(CalculatorParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link CalculatorParser#level2}.
	 * @param ctx the parse tree
	 */
	void exitModulo(CalculatorParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalculatorParser#level2}.
	 * @param ctx the parse tree
	 */
	void enterDivision(CalculatorParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalculatorParser#level2}.
	 * @param ctx the parse tree
	 */
	void exitDivision(CalculatorParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegateSign}
	 * labeled alternative in {@link CalculatorParser#negate}.
	 * @param ctx the parse tree
	 */
	void enterNegateSign(CalculatorParser.NegateSignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegateSign}
	 * labeled alternative in {@link CalculatorParser#negate}.
	 * @param ctx the parse tree
	 */
	void exitNegateSign(CalculatorParser.NegateSignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToUnitPriority}
	 * labeled alternative in {@link CalculatorParser#negate}.
	 * @param ctx the parse tree
	 */
	void enterToUnitPriority(CalculatorParser.ToUnitPriorityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToUnitPriority}
	 * labeled alternative in {@link CalculatorParser#negate}.
	 * @param ctx the parse tree
	 */
	void exitToUnitPriority(CalculatorParser.ToUnitPriorityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculatorParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CalculatorParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculatorParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CalculatorParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesize}
	 * labeled alternative in {@link CalculatorParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterParenthesize(CalculatorParser.ParenthesizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesize}
	 * labeled alternative in {@link CalculatorParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitParenthesize(CalculatorParser.ParenthesizeContext ctx);
}