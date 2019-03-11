package generated;// Generated from C:/Users/ptrck/Github/antlr-arithmetic-calculator/src\Arithmetic.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArithmeticParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArithmeticVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Evaluate}
	 * labeled alternative in {@link ArithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluate(ArithmeticParser.EvaluateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoNothing}
	 * labeled alternative in {@link ArithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoNothing(ArithmeticParser.DoNothingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link ArithmeticParser#level1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(ArithmeticParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link ArithmeticParser#level1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(ArithmeticParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToLevel2}
	 * labeled alternative in {@link ArithmeticParser#level1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToLevel2(ArithmeticParser.ToLevel2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ToNegate}
	 * labeled alternative in {@link ArithmeticParser#level2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToNegate(ArithmeticParser.ToNegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link ArithmeticParser#level2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(ArithmeticParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link ArithmeticParser#level2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(ArithmeticParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link ArithmeticParser#level2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(ArithmeticParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegateSign}
	 * labeled alternative in {@link ArithmeticParser#negate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateSign(ArithmeticParser.NegateSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToUnitPriority}
	 * labeled alternative in {@link ArithmeticParser#negate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToUnitPriority(ArithmeticParser.ToUnitPriorityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ArithmeticParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ArithmeticParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesize}
	 * labeled alternative in {@link ArithmeticParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesize(ArithmeticParser.ParenthesizeContext ctx);
}