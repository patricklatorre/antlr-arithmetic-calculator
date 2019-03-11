// Generated from C:/Users/ptrck/Github/antlr-arithmetic-calculator/src\Arithmetic.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithmeticParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, NEWLINE=2, WHITESPACE=3, PLUS=4, MINUS=5, MULTIPLY=6, DIVIDE=7, 
		MODULO=8, LPAREN=9, RPAREN=10;
	public static final int
		RULE_expression = 0, RULE_level1 = 1, RULE_level2 = 2, RULE_negate = 3, 
		RULE_unit = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "level1", "level2", "negate", "unit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\n'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "NEWLINE", "WHITESPACE", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "MODULO", "LPAREN", "RPAREN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Arithmetic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithmeticParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoNothingContext extends ExpressionContext {
		public TerminalNode NEWLINE() { return getToken(ArithmeticParser.NEWLINE, 0); }
		public DoNothingContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterDoNothing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitDoNothing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitDoNothing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EvaluateContext extends ExpressionContext {
		public Level1Context level1() {
			return getRuleContext(Level1Context.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ArithmeticParser.NEWLINE, 0); }
		public EvaluateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterEvaluate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitEvaluate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitEvaluate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case MINUS:
			case LPAREN:
				_localctx = new EvaluateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				level1(0);
				setState(11);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				_localctx = new DoNothingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Level1Context extends ParserRuleContext {
		public Level1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level1; }
	 
		public Level1Context() { }
		public void copyFrom(Level1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionContext extends Level1Context {
		public Level1Context level1() {
			return getRuleContext(Level1Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(ArithmeticParser.PLUS, 0); }
		public Level2Context level2() {
			return getRuleContext(Level2Context.class,0);
		}
		public AdditionContext(Level1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends Level1Context {
		public Level1Context level1() {
			return getRuleContext(Level1Context.class,0);
		}
		public TerminalNode MINUS() { return getToken(ArithmeticParser.MINUS, 0); }
		public Level2Context level2() {
			return getRuleContext(Level2Context.class,0);
		}
		public SubtractionContext(Level1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToLevel2Context extends Level1Context {
		public Level2Context level2() {
			return getRuleContext(Level2Context.class,0);
		}
		public ToLevel2Context(Level1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterToLevel2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitToLevel2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitToLevel2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level1Context level1() throws RecognitionException {
		return level1(0);
	}

	private Level1Context level1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Level1Context _localctx = new Level1Context(_ctx, _parentState);
		Level1Context _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_level1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToLevel2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(17);
			level2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(25);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new Level1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_level1);
						setState(19);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(20);
						match(PLUS);
						setState(21);
						level2(0);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionContext(new Level1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_level1);
						setState(22);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(23);
						match(MINUS);
						setState(24);
						level2(0);
						}
						break;
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Level2Context extends ParserRuleContext {
		public Level2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level2; }
	 
		public Level2Context() { }
		public void copyFrom(Level2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToNegateContext extends Level2Context {
		public NegateContext negate() {
			return getRuleContext(NegateContext.class,0);
		}
		public ToNegateContext(Level2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterToNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitToNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitToNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends Level2Context {
		public Level2Context level2() {
			return getRuleContext(Level2Context.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(ArithmeticParser.MULTIPLY, 0); }
		public NegateContext negate() {
			return getRuleContext(NegateContext.class,0);
		}
		public MultiplicationContext(Level2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloContext extends Level2Context {
		public Level2Context level2() {
			return getRuleContext(Level2Context.class,0);
		}
		public TerminalNode MODULO() { return getToken(ArithmeticParser.MODULO, 0); }
		public NegateContext negate() {
			return getRuleContext(NegateContext.class,0);
		}
		public ModuloContext(Level2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitModulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends Level2Context {
		public Level2Context level2() {
			return getRuleContext(Level2Context.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(ArithmeticParser.DIVIDE, 0); }
		public NegateContext negate() {
			return getRuleContext(NegateContext.class,0);
		}
		public DivisionContext(Level2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level2Context level2() throws RecognitionException {
		return level2(0);
	}

	private Level2Context level2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Level2Context _localctx = new Level2Context(_ctx, _parentState);
		Level2Context _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_level2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToNegateContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(31);
			negate();
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(42);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new Level2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_level2);
						setState(33);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(34);
						match(MULTIPLY);
						setState(35);
						negate();
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new Level2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_level2);
						setState(36);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(37);
						match(DIVIDE);
						setState(38);
						negate();
						}
						break;
					case 3:
						{
						_localctx = new ModuloContext(new Level2Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_level2);
						setState(39);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(40);
						match(MODULO);
						setState(41);
						negate();
						}
						break;
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NegateContext extends ParserRuleContext {
		public NegateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate; }
	 
		public NegateContext() { }
		public void copyFrom(NegateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegateSignContext extends NegateContext {
		public TerminalNode MINUS() { return getToken(ArithmeticParser.MINUS, 0); }
		public NegateContext negate() {
			return getRuleContext(NegateContext.class,0);
		}
		public NegateSignContext(NegateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterNegateSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitNegateSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitNegateSign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToUnitPriorityContext extends NegateContext {
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public ToUnitPriorityContext(NegateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterToUnitPriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitToUnitPriority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitToUnitPriority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegateContext negate() throws RecognitionException {
		NegateContext _localctx = new NegateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_negate);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new NegateSignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(MINUS);
				setState(48);
				negate();
				}
				break;
			case NUMBER:
			case LPAREN:
				_localctx = new ToUnitPriorityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				unit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitContext extends ParserRuleContext {
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
	 
		public UnitContext() { }
		public void copyFrom(UnitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberContext extends UnitContext {
		public TerminalNode NUMBER() { return getToken(ArithmeticParser.NUMBER, 0); }
		public NumberContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizeContext extends UnitContext {
		public TerminalNode LPAREN() { return getToken(ArithmeticParser.LPAREN, 0); }
		public Level1Context level1() {
			return getRuleContext(Level1Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ArithmeticParser.RPAREN, 0); }
		public ParenthesizeContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).enterParenthesize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticListener ) ((ArithmeticListener)listener).exitParenthesize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticVisitor ) return ((ArithmeticVisitor<? extends T>)visitor).visitParenthesize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unit);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(NUMBER);
				}
				break;
			case LPAREN:
				_localctx = new ParenthesizeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(LPAREN);
				setState(54);
				level1(0);
				setState(55);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return level1_sempred((Level1Context)_localctx, predIndex);
		case 2:
			return level2_sempred((Level2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean level1_sempred(Level1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean level2_sempred(Level2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f>\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\5\2\21\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\5\3\5\3\5\5\5\65"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\5\6<\n\6\3\6\2\4\4\6\7\2\4\6\b\n\2\2\2@\2\20"+
		"\3\2\2\2\4\22\3\2\2\2\6 \3\2\2\2\b\64\3\2\2\2\n;\3\2\2\2\f\r\5\4\3\2\r"+
		"\16\7\4\2\2\16\21\3\2\2\2\17\21\7\4\2\2\20\f\3\2\2\2\20\17\3\2\2\2\21"+
		"\3\3\2\2\2\22\23\b\3\1\2\23\24\5\6\4\2\24\35\3\2\2\2\25\26\f\5\2\2\26"+
		"\27\7\6\2\2\27\34\5\6\4\2\30\31\f\4\2\2\31\32\7\7\2\2\32\34\5\6\4\2\33"+
		"\25\3\2\2\2\33\30\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36"+
		"\5\3\2\2\2\37\35\3\2\2\2 !\b\4\1\2!\"\5\b\5\2\".\3\2\2\2#$\f\6\2\2$%\7"+
		"\b\2\2%-\5\b\5\2&\'\f\5\2\2\'(\7\t\2\2(-\5\b\5\2)*\f\4\2\2*+\7\n\2\2+"+
		"-\5\b\5\2,#\3\2\2\2,&\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2"+
		"\2/\7\3\2\2\2\60.\3\2\2\2\61\62\7\7\2\2\62\65\5\b\5\2\63\65\5\n\6\2\64"+
		"\61\3\2\2\2\64\63\3\2\2\2\65\t\3\2\2\2\66<\7\3\2\2\678\7\13\2\289\5\4"+
		"\3\29:\7\f\2\2:<\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2<\13\3\2\2\2\t\20\33\35"+
		",.\64;";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}