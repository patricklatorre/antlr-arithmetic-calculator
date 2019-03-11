package gen;// Generated from C:/Users/ptrck/Github/antlr-arithmetic-calculator/src\Calculator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Evaluate}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluate(CalculatorParser.EvaluateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoNothing}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoNothing(CalculatorParser.DoNothingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link CalculatorParser#level1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(CalculatorParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link CalculatorParser#level1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(CalculatorParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToLevel2}
	 * labeled alternative in {@link CalculatorParser#level1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToLevel2(CalculatorParser.ToLevel2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ToNegate}
	 * labeled alternative in {@link CalculatorParser#level2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToNegate(CalculatorParser.ToNegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculatorParser#level2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(CalculatorParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link CalculatorParser#level2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(CalculatorParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalculatorParser#level2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(CalculatorParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegateSign}
	 * labeled alternative in {@link CalculatorParser#negate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateSign(CalculatorParser.NegateSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToUnitPriority}
	 * labeled alternative in {@link CalculatorParser#negate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToUnitPriority(CalculatorParser.ToUnitPriorityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculatorParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CalculatorParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesize}
	 * labeled alternative in {@link CalculatorParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesize(CalculatorParser.ParenthesizeContext ctx);
}