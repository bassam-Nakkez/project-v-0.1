// Generated from java-escape by ANTLR 4.11.1
package alter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DartParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_TYPE=1, STRING_TYPE=2, BOOL_TYPE=3, FLOAT_TYPE=4, DOUBLE_TYPE=5, CP=6, 
		DOT=7, E=8, EE=9, EGT=10, GT=11, LE=12, LL=13, LLE=14, LT=15, MIN=16, 
		MINMIN=17, MOD=18, MODE=19, MUL=20, MULE=21, NE=22, OB=23, OP=24, P=25, 
		PE=26, POUND=27, PP=28, Q=29, QD=30, QDD=31, QQ=32, MIE=33, SCO=34, DIV=35, 
		SLE=36, TE=37, POW=38, COT=39, START=40, END=41, AA=42, AND=43, ANDE=44, 
		AT=45, B=46, NOT=47, OR=48, BE=49, CB=50, CO=51, COM=52, ASSERT=53, BREAK=54, 
		CASE=55, CATCH=56, CLASS=57, CONST=58, CONTINUE=59, DEFAULT=60, DO=61, 
		ELSE=62, ENUM=63, EXTENDS=64, FALSE=65, FINAL=66, FINALLY=67, FOR=68, 
		IF=69, IN=70, IS=71, NEW=72, NULL=73, RETHROW=74, RETURN=75, SUPER=76, 
		SWITCH=77, THIS=78, THROW=79, TRUE=80, TRY=81, VAR=82, VOID=83, WHILE=84, 
		WITH=85, ABSTRACT=86, AS=87, COVARIANT=88, DEFERRED=89, DYNAMIC=90, EXPORT=91, 
		EXTENSION=92, EXTERNAL=93, FACTORY=94, FUNCTION=95, GET=96, IMPLEMENTS=97, 
		IMPORT=98, INTERFACE=99, LATE=100, LIBRARY=101, OPERATOR=102, MIXIN=103, 
		PART=104, REQUIRED=105, SET=106, STATIC=107, TYPEDEF=108, AWAIT=109, YIELD=110, 
		ASYNC=111, HIDE=112, OF=113, ON=114, SHOW=115, SYNC=116, NATIVE=117, INT_NUM=118, 
		FLOAT_NUM=119, STRING=120, STRING_singl=121, ID=122, COMMENT=123, MULTI_LINE_COMMENT=124, 
		WS=125;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_stat = 2, RULE_if_stat = 3, RULE_stat_block = 4, 
		RULE_loops = 5, RULE_while_stat = 6, RULE_do_while_stat = 7, RULE_obj_or_fun_or_Other = 8, 
		RULE_callFunction = 9, RULE_funOfObj = 10, RULE_incrementVar = 11, RULE_for_stat = 12, 
		RULE_forinitstatement = 13, RULE_condition = 14, RULE_decFun = 15, RULE_funName = 16, 
		RULE_returnType = 17, RULE_parameterPart = 18, RULE_parameter = 19, RULE_parameters = 20, 
		RULE_parameterPartDec = 21, RULE_parameterDec = 22, RULE_parametersDec = 23, 
		RULE_functionBody = 24, RULE_return = 25, RULE_switch_stat = 26, RULE_switch_key = 27, 
		RULE_switchBody = 28, RULE_classDeclaration = 29, RULE_propretes = 30, 
		RULE_property = 31, RULE_classMethods = 32, RULE_method = 33, RULE_constructor = 34, 
		RULE_superclass = 35, RULE_interfaces = 36, RULE_typeNotVoid = 37, RULE_typeNotVoidList = 38, 
		RULE_mixins = 39, RULE_metadata = 40, RULE_metadatum = 41, RULE_typeParameter = 42, 
		RULE_typeParameters = 43, RULE_qualifiedName = 44, RULE_classBody = 45, 
		RULE_decVar = 46, RULE_variableType = 47, RULE_expr = 48, RULE_atom = 49, 
		RULE_comparison = 50, RULE_boolValue = 51, RULE_logical = 52, RULE_assignment = 53, 
		RULE_type_ID = 54, RULE_identi = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "stat", "if_stat", "stat_block", "loops", "while_stat", 
			"do_while_stat", "obj_or_fun_or_Other", "callFunction", "funOfObj", "incrementVar", 
			"for_stat", "forinitstatement", "condition", "decFun", "funName", "returnType", 
			"parameterPart", "parameter", "parameters", "parameterPartDec", "parameterDec", 
			"parametersDec", "functionBody", "return", "switch_stat", "switch_key", 
			"switchBody", "classDeclaration", "propretes", "property", "classMethods", 
			"method", "constructor", "superclass", "interfaces", "typeNotVoid", "typeNotVoidList", 
			"mixins", "metadata", "metadatum", "typeParameter", "typeParameters", 
			"qualifiedName", "classBody", "decVar", "variableType", "expr", "atom", 
			"comparison", "boolValue", "logical", "assignment", "type_ID", "identi"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "')'", "'.'", "'='", "'=='", "'>='", 
			"'>'", "'<='", "'<<'", "'<<='", "'<'", "'-'", "'--'", "'%'", "'%='", 
			"'*'", "'*='", "'!='", "'['", "'('", "'+'", "'+='", "'#'", "'++'", "'?'", 
			"'?.'", "'?..'", "'??'", "'-='", "';'", "'/'", "'/='", "'^='", "'^'", 
			"'\"'", "'{'", "'}'", "'&&'", "'&'", "'&='", "'@'", "'|'", "'!'", "'||'", 
			"'|='", "']'", "':'", "','", "'assert'", "'break'", "'case'", "'catch'", 
			"'class'", "'const'", "'continue'", "'default'", "'do'", "'else'", "'enum'", 
			"'extends'", "'false'", "'final'", "'finally'", null, null, "'in'", "'is'", 
			"'new'", "'null'", "'rethrow'", null, "'super'", null, "'this'", "'throw'", 
			null, "'try'", "'var'", "'void'", "'while'", "'with'", "'abstract'", 
			"'as'", "'covariant'", "'deferred'", "'dynamic'", "'export'", "'extension'", 
			"'external'", "'factory'", "'Function'", "'get'", "'implements'", "'import'", 
			"'interface'", "'late'", "'library'", "'operator'", "'mixin'", "'part'", 
			"'required'", "'set'", "'static'", "'typedef'", "'await'", "'yield'", 
			"'async'", "'hide'", "'of'", "'on'", "'show'", "'sync'", "'native'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_TYPE", "STRING_TYPE", "BOOL_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", 
			"CP", "DOT", "E", "EE", "EGT", "GT", "LE", "LL", "LLE", "LT", "MIN", 
			"MINMIN", "MOD", "MODE", "MUL", "MULE", "NE", "OB", "OP", "P", "PE", 
			"POUND", "PP", "Q", "QD", "QDD", "QQ", "MIE", "SCO", "DIV", "SLE", "TE", 
			"POW", "COT", "START", "END", "AA", "AND", "ANDE", "AT", "B", "NOT", 
			"OR", "BE", "CB", "CO", "COM", "ASSERT", "BREAK", "CASE", "CATCH", "CLASS", 
			"CONST", "CONTINUE", "DEFAULT", "DO", "ELSE", "ENUM", "EXTENDS", "FALSE", 
			"FINAL", "FINALLY", "FOR", "IF", "IN", "IS", "NEW", "NULL", "RETHROW", 
			"RETURN", "SUPER", "SWITCH", "THIS", "THROW", "TRUE", "TRY", "VAR", "VOID", 
			"WHILE", "WITH", "ABSTRACT", "AS", "COVARIANT", "DEFERRED", "DYNAMIC", 
			"EXPORT", "EXTENSION", "EXTERNAL", "FACTORY", "FUNCTION", "GET", "IMPLEMENTS", 
			"IMPORT", "INTERFACE", "LATE", "LIBRARY", "OPERATOR", "MIXIN", "PART", 
			"REQUIRED", "SET", "STATIC", "TYPEDEF", "AWAIT", "YIELD", "ASYNC", "HIDE", 
			"OF", "ON", "SHOW", "SYNC", "NATIVE", "INT_NUM", "FLOAT_NUM", "STRING", 
			"STRING_singl", "ID", "COMMENT", "MULTI_LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DartParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DartParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			block();
			setState(113);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 2738188573441261630L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 72057594039437325L) != 0) {
				{
				{
				setState(115);
				stat();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SCO() { return getToken(DartParser.SCO, 0); }
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public DecFunContext decFun() {
			return getRuleContext(DecFunContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public DecVarContext decVar() {
			return getRuleContext(DecVarContext.class,0);
		}
		public Obj_or_fun_or_OtherContext obj_or_fun_or_Other() {
			return getRuleContext(Obj_or_fun_or_OtherContext.class,0);
		}
		public IncrementVarContext incrementVar() {
			return getRuleContext(IncrementVarContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public Switch_statContext switch_stat() {
			return getRuleContext(Switch_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				assignment();
				setState(122);
				match(SCO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				if_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				decFun();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				loops();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				decVar();
				setState(128);
				match(SCO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				obj_or_fun_or_Other();
				setState(131);
				match(SCO);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				incrementVar();
				setState(134);
				match(SCO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(136);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(137);
				switch_stat();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(DartParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(DartParser.IF, i);
		}
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public List<Stat_blockContext> stat_block() {
			return getRuleContexts(Stat_blockContext.class);
		}
		public Stat_blockContext stat_block(int i) {
			return getRuleContext(Stat_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(DartParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(DartParser.ELSE, i);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IF);
			setState(141);
			match(OP);
			setState(142);
			condition();
			setState(143);
			match(CP);
			setState(144);
			stat_block();
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					match(ELSE);
					setState(146);
					match(IF);
					setState(147);
					condition();
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(153);
				match(ELSE);
				setState(154);
				stat_block();
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(DartParser.START, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(DartParser.END, 0); }
		public TerminalNode BREAK() { return getToken(DartParser.BREAK, 0); }
		public TerminalNode SCO() { return getToken(DartParser.SCO, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stat_block);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(START);
				setState(158);
				block();
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(159);
					match(BREAK);
					setState(160);
					match(SCO);
					}
				}

				setState(163);
				match(END);
				}
				break;
			case INT_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CLASS:
			case CONST:
			case DO:
			case FINAL:
			case FOR:
			case IF:
			case SWITCH:
			case VAR:
			case VOID:
			case WHILE:
			case ABSTRACT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				stat();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopsContext extends ParserRuleContext {
		public Do_while_statContext do_while_stat() {
			return getRuleContext(Do_while_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitLoops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitLoops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loops);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				do_while_stat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				while_stat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				for_stat();
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(DartParser.WHILE, 0); }
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(WHILE);
			setState(174);
			match(OP);
			setState(175);
			condition();
			setState(176);
			match(CP);
			setState(177);
			stat_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Do_while_statContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(DartParser.DO, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(DartParser.WHILE, 0); }
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public Do_while_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterDo_while_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitDo_while_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitDo_while_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statContext do_while_stat() throws RecognitionException {
		Do_while_statContext _localctx = new Do_while_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_do_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(DO);
			setState(180);
			stat_block();
			setState(181);
			match(WHILE);
			setState(182);
			match(OP);
			setState(183);
			condition();
			setState(184);
			match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Obj_or_fun_or_OtherContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public TerminalNode DOT() { return getToken(DartParser.DOT, 0); }
		public FunNameContext funName() {
			return getRuleContext(FunNameContext.class,0);
		}
		public FunOfObjContext funOfObj() {
			return getRuleContext(FunOfObjContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public Obj_or_fun_or_OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_or_fun_or_Other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterObj_or_fun_or_Other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitObj_or_fun_or_Other(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitObj_or_fun_or_Other(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Obj_or_fun_or_OtherContext obj_or_fun_or_Other() throws RecognitionException {
		Obj_or_fun_or_OtherContext _localctx = new Obj_or_fun_or_OtherContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_obj_or_fun_or_Other);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(ID);
				setState(187);
				match(DOT);
				setState(188);
				funName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				funOfObj();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				callFunction();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_callFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ID);
			setState(194);
			match(OP);
			setState(195);
			parameters();
			setState(196);
			match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunOfObjContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DartParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DartParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(DartParser.DOT, 0); }
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public FunOfObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funOfObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterFunOfObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitFunOfObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFunOfObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunOfObjContext funOfObj() throws RecognitionException {
		FunOfObjContext _localctx = new FunOfObjContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funOfObj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ID);
			setState(199);
			match(DOT);
			setState(200);
			match(ID);
			setState(201);
			match(OP);
			setState(202);
			parameters();
			setState(203);
			match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public TerminalNode PP() { return getToken(DartParser.PP, 0); }
		public TerminalNode MINMIN() { return getToken(DartParser.MINMIN, 0); }
		public IncrementVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterIncrementVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitIncrementVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitIncrementVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementVarContext incrementVar() throws RecognitionException {
		IncrementVarContext _localctx = new IncrementVarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_incrementVar);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(ID);
				setState(206);
				match(PP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(ID);
				setState(208);
				match(MINMIN);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_statContext extends ParserRuleContext {
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
	 
		public For_statContext() { }
		public void copyFrom(For_statContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassicForStatementContext extends For_statContext {
		public TerminalNode FOR() { return getToken(DartParser.FOR, 0); }
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public List<TerminalNode> SCO() { return getTokens(DartParser.SCO); }
		public TerminalNode SCO(int i) {
			return getToken(DartParser.SCO, i);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public ForinitstatementContext forinitstatement() {
			return getRuleContext(ForinitstatementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncrementVarContext incrementVar() {
			return getRuleContext(IncrementVarContext.class,0);
		}
		public ClassicForStatementContext(For_statContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterClassicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitClassicForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitClassicForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_stat);
		int _la;
		try {
			_localctx = new ClassicForStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(FOR);
			setState(212);
			match(OP);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376151711806L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 72057594037993473L) != 0) {
				{
				setState(213);
				forinitstatement();
				}
			}

			setState(216);
			match(SCO);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 140737505198080L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 207165582859075585L) != 0) {
				{
				setState(217);
				condition();
				}
			}

			setState(220);
			match(SCO);
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(221);
				expr(0);
				}
				break;
			case 2:
				{
				setState(222);
				incrementVar();
				}
				break;
			}
			setState(225);
			match(CP);
			setState(226);
			stat_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForinitstatementContext extends ParserRuleContext {
		public DecVarContext decVar() {
			return getRuleContext(DecVarContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForinitstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinitstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterForinitstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitForinitstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitForinitstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForinitstatementContext forinitstatement() throws RecognitionException {
		ForinitstatementContext _localctx = new ForinitstatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forinitstatement);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CONST:
			case FINAL:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				decVar();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				assignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public Obj_or_fun_or_OtherContext obj_or_fun_or_Other() {
			return getRuleContext(Obj_or_fun_or_OtherContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				comparison();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				logical();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				boolValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				obj_or_fun_or_Other();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecFunContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunNameContext funName() {
			return getRuleContext(FunNameContext.class,0);
		}
		public ParameterPartDecContext parameterPartDec() {
			return getRuleContext(ParameterPartDecContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public DecFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterDecFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitDecFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitDecFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecFunContext decFun() throws RecognitionException {
		DecFunContext _localctx = new DecFunContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			returnType();
			setState(240);
			funName();
			setState(241);
			parameterPartDec();
			setState(242);
			functionBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public FunNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterFunName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitFunName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFunName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunNameContext funName() throws RecognitionException {
		FunNameContext _localctx = new FunNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTypeContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(DartParser.VOID, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnType);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				variableType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(VOID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterPartContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public ParameterPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterParameterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitParameterPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitParameterPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterPartContext parameterPart() throws RecognitionException {
		ParameterPartContext _localctx = new ParameterPartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameterPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(OP);
			setState(251);
			parameters();
			setState(252);
			match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public TerminalNode E() { return getToken(DartParser.E, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameter);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				variableType();
				setState(255);
				match(ID);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(256);
					match(E);
					setState(257);
					expr(0);
					}
				}

				}
				break;
			case CP:
			case MIN:
			case OP:
			case NOT:
			case COM:
			case FALSE:
			case TRUE:
			case INT_NUM:
			case FLOAT_NUM:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FALSE:
				case TRUE:
					{
					setState(260);
					boolValue();
					}
					break;
				case MIN:
				case OP:
				case NOT:
				case INT_NUM:
				case FLOAT_NUM:
				case STRING:
				case ID:
					{
					setState(261);
					expr(0);
					}
					break;
				case CP:
				case COM:
					break;
				default:
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(DartParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(DartParser.COM, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			parameter();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(267);
				match(COM);
				setState(268);
				parameter();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterPartDecContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public List<ParametersDecContext> parametersDec() {
			return getRuleContexts(ParametersDecContext.class);
		}
		public ParametersDecContext parametersDec(int i) {
			return getRuleContext(ParametersDecContext.class,i);
		}
		public ParameterPartDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterPartDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterParameterPartDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitParameterPartDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitParameterPartDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterPartDecContext parameterPartDec() throws RecognitionException {
		ParameterPartDecContext _localctx = new ParameterPartDecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameterPartDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(OP);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0 || _la==VAR || _la==ID) {
				{
				{
				setState(275);
				parametersDec();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDecContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public TerminalNode E() { return getToken(DartParser.E, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParameterDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterParameterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitParameterDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitParameterDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDecContext parameterDec() throws RecognitionException {
		ParameterDecContext _localctx = new ParameterDecContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameterDec);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				variableType();
				setState(284);
				match(ID);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==E) {
					{
					setState(285);
					match(E);
					setState(286);
					expr(0);
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersDecContext extends ParserRuleContext {
		public List<ParameterDecContext> parameterDec() {
			return getRuleContexts(ParameterDecContext.class);
		}
		public ParameterDecContext parameterDec(int i) {
			return getRuleContext(ParameterDecContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(DartParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(DartParser.COM, i);
		}
		public ParametersDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterParametersDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitParametersDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitParametersDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersDecContext parametersDec() throws RecognitionException {
		ParametersDecContext _localctx = new ParametersDecContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parametersDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			parameterDec();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(293);
				match(COM);
				setState(294);
				parameterDec();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(DartParser.START, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(DartParser.END, 0); }
		public List<ReturnContext> return_() {
			return getRuleContexts(ReturnContext.class);
		}
		public ReturnContext return_(int i) {
			return getRuleContext(ReturnContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(START);
			setState(301);
			block();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RETURN) {
				{
				{
				setState(302);
				return_();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(DartParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCO() { return getToken(DartParser.SCO, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(RETURN);
			setState(311);
			expr(0);
			setState(312);
			match(SCO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_statContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(DartParser.SWITCH, 0); }
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public Switch_keyContext switch_key() {
			return getRuleContext(Switch_keyContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public SwitchBodyContext switchBody() {
			return getRuleContext(SwitchBodyContext.class,0);
		}
		public Switch_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterSwitch_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitSwitch_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitSwitch_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statContext switch_stat() throws RecognitionException {
		Switch_statContext _localctx = new Switch_statContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switch_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(SWITCH);
			setState(315);
			match(OP);
			setState(316);
			switch_key();
			setState(317);
			match(CP);
			setState(318);
			switchBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_keyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public TerminalNode INT_NUM() { return getToken(DartParser.INT_NUM, 0); }
		public Switch_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterSwitch_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitSwitch_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitSwitch_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_keyContext switch_key() throws RecognitionException {
		Switch_keyContext _localctx = new Switch_keyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switch_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !(_la==INT_NUM || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBodyContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(DartParser.START, 0); }
		public TerminalNode END() { return getToken(DartParser.END, 0); }
		public List<TerminalNode> CASE() { return getTokens(DartParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(DartParser.CASE, i);
		}
		public List<TerminalNode> CO() { return getTokens(DartParser.CO); }
		public TerminalNode CO(int i) {
			return getToken(DartParser.CO, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(DartParser.DEFAULT, 0); }
		public List<TerminalNode> INT_NUM() { return getTokens(DartParser.INT_NUM); }
		public TerminalNode INT_NUM(int i) {
			return getToken(DartParser.INT_NUM, i);
		}
		public List<TerminalNode> STRING_singl() { return getTokens(DartParser.STRING_singl); }
		public TerminalNode STRING_singl(int i) {
			return getToken(DartParser.STRING_singl, i);
		}
		public List<TerminalNode> BREAK() { return getTokens(DartParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(DartParser.BREAK, i);
		}
		public List<TerminalNode> SCO() { return getTokens(DartParser.SCO); }
		public TerminalNode SCO(int i) {
			return getToken(DartParser.SCO, i);
		}
		public SwitchBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterSwitchBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitSwitchBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitSwitchBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBodyContext switchBody() throws RecognitionException {
		SwitchBodyContext _localctx = new SwitchBodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_switchBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(START);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(323);
				match(CASE);
				setState(324);
				_la = _input.LA(1);
				if ( !(_la==INT_NUM || _la==STRING_singl) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(325);
				match(CO);
				setState(326);
				block();
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BREAK) {
					{
					{
					setState(327);
					match(BREAK);
					setState(328);
					match(SCO);
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(339);
				match(DEFAULT);
				setState(340);
				match(CO);
				setState(341);
				block();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BREAK) {
					{
					{
					setState(342);
					match(BREAK);
					setState(343);
					match(SCO);
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(351);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DartParser.CLASS, 0); }
		public Type_IDContext type_ID() {
			return getRuleContext(Type_IDContext.class,0);
		}
		public TerminalNode START() { return getToken(DartParser.START, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(DartParser.END, 0); }
		public TerminalNode ABSTRACT() { return getToken(DartParser.ABSTRACT, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public InterfacesContext interfaces() {
			return getRuleContext(InterfacesContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(353);
				match(ABSTRACT);
				}
			}

			setState(356);
			match(CLASS);
			setState(357);
			type_ID();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(358);
				typeParameters();
				}
			}

			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==WITH) {
				{
				setState(361);
				superclass();
				}
			}

			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(364);
				interfaces();
				}
			}

			setState(367);
			match(START);
			setState(368);
			classBody();
			setState(369);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropretesContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropretesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propretes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterPropretes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitPropretes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPropretes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropretesContext propretes() throws RecognitionException {
		PropretesContext _localctx = new PropretesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_propretes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(371);
					property();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(374); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public DecVarContext decVar() {
			return getRuleContext(DecVarContext.class,0);
		}
		public TerminalNode SCO() { return getToken(DartParser.SCO, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			decVar();
			setState(377);
			match(SCO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMethodsContext extends ParserRuleContext {
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ClassMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterClassMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitClassMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitClassMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMethodsContext classMethods() throws RecognitionException {
		ClassMethodsContext _localctx = new ClassMethodsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classMethods);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(379);
					method();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(382); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunNameContext funName() {
			return getRuleContext(FunNameContext.class,0);
		}
		public ParameterPartContext parameterPart() {
			return getRuleContext(ParameterPartContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			returnType();
			setState(385);
			funName();
			setState(386);
			parameterPart();
			setState(387);
			functionBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorContext extends ParserRuleContext {
		public FunNameContext funName() {
			return getRuleContext(FunNameContext.class,0);
		}
		public ParameterPartContext parameterPart() {
			return getRuleContext(ParameterPartContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			funName();
			setState(390);
			parameterPart();
			setState(391);
			functionBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(DartParser.EXTENDS, 0); }
		public TypeNotVoidContext typeNotVoid() {
			return getRuleContext(TypeNotVoidContext.class,0);
		}
		public MixinsContext mixins() {
			return getRuleContext(MixinsContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitSuperclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_superclass);
		int _la;
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(EXTENDS);
				setState(394);
				typeNotVoid();
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(395);
					mixins();
					}
				}

				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				mixins();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfacesContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(DartParser.IMPLEMENTS, 0); }
		public TypeNotVoidListContext typeNotVoidList() {
			return getRuleContext(TypeNotVoidListContext.class,0);
		}
		public InterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacesContext interfaces() throws RecognitionException {
		InterfacesContext _localctx = new InterfacesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_interfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(IMPLEMENTS);
			setState(402);
			typeNotVoidList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNotVoidContext extends ParserRuleContext {
		public FunNameContext funName() {
			return getRuleContext(FunNameContext.class,0);
		}
		public TerminalNode Q() { return getToken(DartParser.Q, 0); }
		public TerminalNode COM() { return getToken(DartParser.COM, 0); }
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public TypeNotVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNotVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTypeNotVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTypeNotVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTypeNotVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNotVoidContext typeNotVoid() throws RecognitionException {
		TypeNotVoidContext _localctx = new TypeNotVoidContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeNotVoid);
		int _la;
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				funName();
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(405);
					match(Q);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				funName();
				setState(409);
				match(COM);
				setState(410);
				match(ID);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNotVoidListContext extends ParserRuleContext {
		public List<TypeNotVoidContext> typeNotVoid() {
			return getRuleContexts(TypeNotVoidContext.class);
		}
		public TypeNotVoidContext typeNotVoid(int i) {
			return getRuleContext(TypeNotVoidContext.class,i);
		}
		public TypeNotVoidListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNotVoidList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTypeNotVoidList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTypeNotVoidList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTypeNotVoidList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNotVoidListContext typeNotVoidList() throws RecognitionException {
		TypeNotVoidListContext _localctx = new TypeNotVoidListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeNotVoidList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			typeNotVoid();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(415);
				typeNotVoid();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class MixinsContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(DartParser.WITH, 0); }
		public TypeNotVoidListContext typeNotVoidList() {
			return getRuleContext(TypeNotVoidListContext.class,0);
		}
		public MixinsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixins; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterMixins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitMixins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitMixins(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinsContext mixins() throws RecognitionException {
		MixinsContext _localctx = new MixinsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_mixins);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(WITH);
			setState(422);
			typeNotVoidList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MetadataContext extends ParserRuleContext {
		public List<TerminalNode> AT() { return getTokens(DartParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(DartParser.AT, i);
		}
		public List<MetadatumContext> metadatum() {
			return getRuleContexts(MetadatumContext.class);
		}
		public MetadatumContext metadatum(int i) {
			return getRuleContext(MetadatumContext.class,i);
		}
		public MetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataContext metadata() throws RecognitionException {
		MetadataContext _localctx = new MetadataContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_metadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(424);
				match(AT);
				setState(425);
				metadatum();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class MetadatumContext extends ParserRuleContext {
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public MetadatumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadatum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterMetadatum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitMetadatum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitMetadatum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadatumContext metadatum() throws RecognitionException {
		MetadatumContext _localctx = new MetadatumContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_metadatum);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				identi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				qualifiedName();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(DartParser.EXTENDS, 0); }
		public TypeNotVoidContext typeNotVoid() {
			return getRuleContext(TypeNotVoidContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			metadata();
			setState(436);
			identi();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(437);
				match(EXTENDS);
				setState(438);
				typeNotVoid();
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(DartParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(DartParser.GT, 0); }
		public List<TerminalNode> COM() { return getTokens(DartParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(DartParser.COM, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(LT);
			setState(442);
			typeParameter();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(443);
				match(COM);
				setState(444);
				typeParameter();
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(450);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<Type_IDContext> type_ID() {
			return getRuleContexts(Type_IDContext.class);
		}
		public Type_IDContext type_ID(int i) {
			return getRuleContext(Type_IDContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(DartParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DartParser.DOT, i);
		}
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_qualifiedName);
		try {
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				type_ID();
				setState(453);
				match(DOT);
				setState(454);
				identi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				type_ID();
				setState(457);
				match(DOT);
				setState(458);
				type_ID();
				setState(459);
				match(DOT);
				setState(460);
				identi();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<PropretesContext> propretes() {
			return getRuleContexts(PropretesContext.class);
		}
		public PropretesContext propretes(int i) {
			return getRuleContext(PropretesContext.class,i);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public List<ClassMethodsContext> classMethods() {
			return getRuleContexts(ClassMethodsContext.class);
		}
		public ClassMethodsContext classMethods(int i) {
			return getRuleContext(ClassMethodsContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_classBody);
		int _la;
		try {
			int _alt;
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(464);
						propretes();
						}
						} 
					}
					setState(469);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(470);
					constructor();
					}
				}

				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0 || _la==VAR || _la==VOID) {
					{
					{
					setState(473);
					classMethods();
					}
					}
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(479);
					constructor();
					}
				}

				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376151711806L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 196609L) != 0) {
					{
					setState(484);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(482);
						propretes();
						}
						break;
					case 2:
						{
						setState(483);
						classMethods();
						}
						break;
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376151711806L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 196609L) != 0) {
					{
					setState(491);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						setState(489);
						propretes();
						}
						break;
					case 2:
						{
						setState(490);
						classMethods();
						}
						break;
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(496);
					constructor();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(499);
						classMethods();
						}
						} 
					}
					setState(504);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(505);
					constructor();
					}
				}

				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376151711806L) != 0 || _la==FINAL || _la==VAR) {
					{
					{
					setState(508);
					propretes();
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecVarContext extends ParserRuleContext {
		public DecVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVar; }
	 
		public DecVarContext() { }
		public void copyFrom(DecVarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarableDeclarationContext extends DecVarContext {
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public TerminalNode CONST() { return getToken(DartParser.CONST, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode E() { return getToken(DartParser.E, 0); }
		public TerminalNode FINAL() { return getToken(DartParser.FINAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public VarableDeclarationContext(DecVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterVarableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitVarableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVarableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecVarContext decVar() throws RecognitionException {
		DecVarContext _localctx = new DecVarContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_decVar);
		int _la;
		try {
			_localctx = new VarableDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(516);
				match(CONST);
				}
				break;
			case INT_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case FINAL:
			case VAR:
				{
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(517);
					match(FINAL);
					}
				}

				setState(520);
				variableType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(523);
			match(ID);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==E) {
				{
				setState(524);
				match(E);
				setState(527);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MIN:
				case OP:
				case NOT:
				case INT_NUM:
				case FLOAT_NUM:
				case STRING:
				case ID:
					{
					setState(525);
					expr(0);
					}
					break;
				case FALSE:
				case TRUE:
					{
					setState(526);
					boolValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableTypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(DartParser.INT_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(DartParser.BOOL_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(DartParser.STRING_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(DartParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(DartParser.DOUBLE_TYPE, 0); }
		public TerminalNode VAR() { return getToken(DartParser.VAR, 0); }
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVariableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variableType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0 || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(DartParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusExprContext extends ExprContext {
		public TerminalNode MIN() { return getToken(DartParser.MIN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitUnaryMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(DartParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(DartParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(DartParser.MOD, 0); }
		public MultiplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitMultiplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode P() { return getToken(DartParser.P, 0); }
		public TerminalNode MIN() { return getToken(DartParser.MIN, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(534);
				match(MIN);
				setState(535);
				expr(5);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(536);
				match(NOT);
				setState(537);
				expr(4);
				}
				break;
			case OP:
			case INT_NUM:
			case FLOAT_NUM:
			case STRING:
			case ID:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(538);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(549);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(547);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(541);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(542);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 34361049088L) != 0) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(543);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(544);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(545);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MIN || _la==P) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(546);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParExprContext extends AtomContext {
		public TerminalNode OP() { return getToken(DartParser.OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CP() { return getToken(DartParser.CP, 0); }
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntNumberContext extends AtomContext {
		public TerminalNode INT_NUM() { return getToken(DartParser.INT_NUM, 0); }
		public IntNumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterIntNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitIntNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitIntNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatNumberContext extends AtomContext {
		public TerminalNode FLOAT_NUM() { return getToken(DartParser.FLOAT_NUM, 0); }
		public FloatNumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterFloatNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitFloatNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFloatNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_atom);
		try {
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				match(OP);
				setState(553);
				expr(0);
				setState(554);
				match(CP);
				}
				break;
			case INT_NUM:
				_localctx = new IntNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				match(INT_NUM);
				}
				break;
			case FLOAT_NUM:
				_localctx = new FloatNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				match(FLOAT_NUM);
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(558);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(559);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	 
		public ComparisonContext() { }
		public void copyFrom(ComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualOperationContext extends ComparisonContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EE() { return getToken(DartParser.EE, 0); }
		public EqualOperationContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterEqualOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitEqualOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitEqualOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualContext extends ComparisonContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NE() { return getToken(DartParser.NE, 0); }
		public NotEqualContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterEqualContext extends ComparisonContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EGT() { return getToken(DartParser.EGT, 0); }
		public GreaterEqualContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterGreaterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitGreaterEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitGreaterEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessOperationContext extends ComparisonContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(DartParser.LT, 0); }
		public LessOperationContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterLessOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitLessOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitLessOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessEqualContext extends ComparisonContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(DartParser.LE, 0); }
		public LessEqualContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitLessEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterOperationContext extends ComparisonContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(DartParser.GT, 0); }
		public GreaterOperationContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterGreaterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitGreaterOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitGreaterOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_comparison);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				_localctx = new LessEqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				expr(0);
				setState(563);
				match(LE);
				setState(564);
				expr(0);
				}
				break;
			case 2:
				_localctx = new GreaterEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				expr(0);
				setState(567);
				match(EGT);
				setState(568);
				expr(0);
				}
				break;
			case 3:
				_localctx = new LessOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				expr(0);
				setState(571);
				match(LT);
				setState(572);
				expr(0);
				}
				break;
			case 4:
				_localctx = new GreaterOperationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(574);
				expr(0);
				setState(575);
				match(GT);
				setState(576);
				expr(0);
				}
				break;
			case 5:
				_localctx = new EqualOperationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(578);
				expr(0);
				setState(579);
				match(EE);
				setState(580);
				expr(0);
				}
				break;
			case 6:
				_localctx = new NotEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(582);
				expr(0);
				setState(583);
				match(NE);
				setState(584);
				expr(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(DartParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DartParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalContext extends ParserRuleContext {
		public Token op;
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<BoolValueContext> boolValue() {
			return getRuleContexts(BoolValueContext.class);
		}
		public BoolValueContext boolValue(int i) {
			return getRuleContext(BoolValueContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(DartParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DartParser.ID, i);
		}
		public TerminalNode AA() { return getToken(DartParser.AA, 0); }
		public TerminalNode OR() { return getToken(DartParser.OR, 0); }
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(590);
				comparison();
				}
				break;
			case 2:
				{
				setState(591);
				boolValue();
				}
				break;
			case 3:
				{
				setState(592);
				match(ID);
				}
				break;
			}
			setState(595);
			((LogicalContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==AA || _la==OR) ) {
				((LogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(596);
				comparison();
				}
				break;
			case 2:
				{
				setState(597);
				boolValue();
				}
				break;
			case 3:
				{
				setState(598);
				match(ID);
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public TerminalNode E() { return getToken(DartParser.E, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MULE() { return getToken(DartParser.MULE, 0); }
		public TerminalNode PE() { return getToken(DartParser.PE, 0); }
		public TerminalNode MODE() { return getToken(DartParser.MODE, 0); }
		public TerminalNode MIE() { return getToken(DartParser.MIE, 0); }
		public TerminalNode SLE() { return getToken(DartParser.SLE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_assignment);
		try {
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				match(ID);
				setState(602);
				match(E);
				setState(603);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(ID);
				setState(605);
				match(MULE);
				setState(606);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(607);
				match(ID);
				setState(608);
				match(PE);
				setState(609);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(610);
				match(ID);
				setState(611);
				match(MODE);
				setState(612);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(613);
				match(ID);
				setState(614);
				match(MIE);
				setState(615);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(616);
				match(ID);
				setState(617);
				match(SLE);
				setState(618);
				expr(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_IDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public TerminalNode ASYNC() { return getToken(DartParser.ASYNC, 0); }
		public TerminalNode HIDE() { return getToken(DartParser.HIDE, 0); }
		public TerminalNode OF() { return getToken(DartParser.OF, 0); }
		public TerminalNode ON() { return getToken(DartParser.ON, 0); }
		public TerminalNode SHOW() { return getToken(DartParser.SHOW, 0); }
		public TerminalNode SYNC() { return getToken(DartParser.SYNC, 0); }
		public TerminalNode AWAIT() { return getToken(DartParser.AWAIT, 0); }
		public TerminalNode YIELD() { return getToken(DartParser.YIELD, 0); }
		public TerminalNode DYNAMIC() { return getToken(DartParser.DYNAMIC, 0); }
		public TerminalNode NATIVE() { return getToken(DartParser.NATIVE, 0); }
		public TerminalNode FUNCTION() { return getToken(DartParser.FUNCTION, 0); }
		public Type_IDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_ID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterType_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitType_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitType_ID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_IDContext type_ID() throws RecognitionException {
		Type_IDContext _localctx = new Type_IDContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_type_ID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_la = _input.LA(1);
			if ( !((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 4562878497L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentiContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public TerminalNode ABSTRACT() { return getToken(DartParser.ABSTRACT, 0); }
		public TerminalNode AS() { return getToken(DartParser.AS, 0); }
		public TerminalNode COVARIANT() { return getToken(DartParser.COVARIANT, 0); }
		public TerminalNode DEFERRED() { return getToken(DartParser.DEFERRED, 0); }
		public TerminalNode DYNAMIC() { return getToken(DartParser.DYNAMIC, 0); }
		public TerminalNode EXPORT() { return getToken(DartParser.EXPORT, 0); }
		public TerminalNode EXTERNAL() { return getToken(DartParser.EXTERNAL, 0); }
		public TerminalNode EXTENSION() { return getToken(DartParser.EXTENSION, 0); }
		public TerminalNode FACTORY() { return getToken(DartParser.FACTORY, 0); }
		public TerminalNode FUNCTION() { return getToken(DartParser.FUNCTION, 0); }
		public TerminalNode GET() { return getToken(DartParser.GET, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(DartParser.IMPLEMENTS, 0); }
		public TerminalNode IMPORT() { return getToken(DartParser.IMPORT, 0); }
		public TerminalNode INTERFACE() { return getToken(DartParser.INTERFACE, 0); }
		public TerminalNode LATE() { return getToken(DartParser.LATE, 0); }
		public TerminalNode LIBRARY() { return getToken(DartParser.LIBRARY, 0); }
		public TerminalNode MIXIN() { return getToken(DartParser.MIXIN, 0); }
		public TerminalNode OPERATOR() { return getToken(DartParser.OPERATOR, 0); }
		public TerminalNode PART() { return getToken(DartParser.PART, 0); }
		public TerminalNode REQUIRED() { return getToken(DartParser.REQUIRED, 0); }
		public TerminalNode SET() { return getToken(DartParser.SET, 0); }
		public TerminalNode STATIC() { return getToken(DartParser.STATIC, 0); }
		public TerminalNode TYPEDEF() { return getToken(DartParser.TYPEDEF, 0); }
		public TerminalNode ASYNC() { return getToken(DartParser.ASYNC, 0); }
		public TerminalNode HIDE() { return getToken(DartParser.HIDE, 0); }
		public TerminalNode OF() { return getToken(DartParser.OF, 0); }
		public TerminalNode ON() { return getToken(DartParser.ON, 0); }
		public TerminalNode SHOW() { return getToken(DartParser.SHOW, 0); }
		public TerminalNode SYNC() { return getToken(DartParser.SYNC, 0); }
		public TerminalNode AWAIT() { return getToken(DartParser.AWAIT, 0); }
		public TerminalNode YIELD() { return getToken(DartParser.YIELD, 0); }
		public TerminalNode NATIVE() { return getToken(DartParser.NATIVE, 0); }
		public IdentiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterIdenti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitIdenti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitIdenti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentiContext identi() throws RecognitionException {
		IdentiContext _localctx = new IdentiContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_identi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_la = _input.LA(1);
			if ( !((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 73014444031L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		case 48:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001}\u0272\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001u"+
		"\b\u0001\n\u0001\f\u0001x\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u008b\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u0095\b\u0003\n\u0003\f\u0003\u0098\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u009c\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00a2\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00a7\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ac"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c0"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00d2\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00d7\b\f\u0001"+
		"\f\u0001\f\u0003\f\u00db\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e0\b\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u00e7\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ee\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00f9\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0103\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0107\b\u0013\u0003\u0013\u0109\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u010e\b\u0014\n\u0014\f\u0014\u0111\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u0115\b\u0015\n\u0015\f\u0015\u0118\t\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0120\b\u0016\u0001\u0016\u0003\u0016\u0123\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u0128\b\u0017\n\u0017\f\u0017\u012b"+
		"\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0130\b\u0018"+
		"\n\u0018\f\u0018\u0133\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u014a\b\u001c\n\u001c\f\u001c\u014d\t\u001c\u0005\u001c\u014f\b"+
		"\u001c\n\u001c\f\u001c\u0152\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u0159\b\u001c\n\u001c\f\u001c\u015c"+
		"\t\u001c\u0003\u001c\u015e\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0003\u001d\u0163\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0168\b\u001d\u0001\u001d\u0003\u001d\u016b\b\u001d\u0001\u001d\u0003"+
		"\u001d\u016e\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0004\u001e\u0175\b\u001e\u000b\u001e\f\u001e\u0176\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0004 \u017d\b \u000b \f \u017e\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0003#\u018d\b#\u0001#\u0003#\u0190\b#\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0003%\u0197\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u019d\b%\u0001"+
		"&\u0001&\u0005&\u01a1\b&\n&\f&\u01a4\t&\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0005(\u01ab\b(\n(\f(\u01ae\t(\u0001)\u0001)\u0003)\u01b2\b)"+
		"\u0001*\u0001*\u0001*\u0001*\u0003*\u01b8\b*\u0001+\u0001+\u0001+\u0001"+
		"+\u0005+\u01be\b+\n+\f+\u01c1\t+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u01cf\b,\u0001-\u0005"+
		"-\u01d2\b-\n-\f-\u01d5\t-\u0001-\u0003-\u01d8\b-\u0001-\u0005-\u01db\b"+
		"-\n-\f-\u01de\t-\u0001-\u0003-\u01e1\b-\u0001-\u0001-\u0005-\u01e5\b-"+
		"\n-\f-\u01e8\t-\u0001-\u0001-\u0005-\u01ec\b-\n-\f-\u01ef\t-\u0001-\u0003"+
		"-\u01f2\b-\u0001-\u0005-\u01f5\b-\n-\f-\u01f8\t-\u0001-\u0003-\u01fb\b"+
		"-\u0001-\u0005-\u01fe\b-\n-\f-\u0201\t-\u0003-\u0203\b-\u0001.\u0001."+
		"\u0003.\u0207\b.\u0001.\u0003.\u020a\b.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u0210\b.\u0003.\u0212\b.\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00030\u021c\b0\u00010\u00010\u00010\u00010\u00010\u00010\u0005"+
		"0\u0224\b0\n0\f0\u0227\t0\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00031\u0231\b1\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u024b\b2\u0001"+
		"3\u00013\u00014\u00014\u00014\u00034\u0252\b4\u00014\u00014\u00014\u0001"+
		"4\u00034\u0258\b4\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00035\u026c\b5\u00016\u00016\u00017\u00017\u00017\u0000\u0001`8\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjln\u0000\t\u0002\u0000v"+
		"vzz\u0002\u0000vvyy\u0002\u0000\u0001\u0005RR\u0003\u0000\u0012\u0012"+
		"\u0014\u0014##\u0002\u0000\u0010\u0010\u0019\u0019\u0002\u0000AAPP\u0002"+
		"\u0000**00\u0004\u0000ZZ__muzz\u0002\u0000Vuzz\u029c\u0000p\u0001\u0000"+
		"\u0000\u0000\u0002v\u0001\u0000\u0000\u0000\u0004\u008a\u0001\u0000\u0000"+
		"\u0000\u0006\u008c\u0001\u0000\u0000\u0000\b\u00a6\u0001\u0000\u0000\u0000"+
		"\n\u00ab\u0001\u0000\u0000\u0000\f\u00ad\u0001\u0000\u0000\u0000\u000e"+
		"\u00b3\u0001\u0000\u0000\u0000\u0010\u00bf\u0001\u0000\u0000\u0000\u0012"+
		"\u00c1\u0001\u0000\u0000\u0000\u0014\u00c6\u0001\u0000\u0000\u0000\u0016"+
		"\u00d1\u0001\u0000\u0000\u0000\u0018\u00d3\u0001\u0000\u0000\u0000\u001a"+
		"\u00e6\u0001\u0000\u0000\u0000\u001c\u00ed\u0001\u0000\u0000\u0000\u001e"+
		"\u00ef\u0001\u0000\u0000\u0000 \u00f4\u0001\u0000\u0000\u0000\"\u00f8"+
		"\u0001\u0000\u0000\u0000$\u00fa\u0001\u0000\u0000\u0000&\u0108\u0001\u0000"+
		"\u0000\u0000(\u010a\u0001\u0000\u0000\u0000*\u0112\u0001\u0000\u0000\u0000"+
		",\u0122\u0001\u0000\u0000\u0000.\u0124\u0001\u0000\u0000\u00000\u012c"+
		"\u0001\u0000\u0000\u00002\u0136\u0001\u0000\u0000\u00004\u013a\u0001\u0000"+
		"\u0000\u00006\u0140\u0001\u0000\u0000\u00008\u0142\u0001\u0000\u0000\u0000"+
		":\u0162\u0001\u0000\u0000\u0000<\u0174\u0001\u0000\u0000\u0000>\u0178"+
		"\u0001\u0000\u0000\u0000@\u017c\u0001\u0000\u0000\u0000B\u0180\u0001\u0000"+
		"\u0000\u0000D\u0185\u0001\u0000\u0000\u0000F\u018f\u0001\u0000\u0000\u0000"+
		"H\u0191\u0001\u0000\u0000\u0000J\u019c\u0001\u0000\u0000\u0000L\u019e"+
		"\u0001\u0000\u0000\u0000N\u01a5\u0001\u0000\u0000\u0000P\u01ac\u0001\u0000"+
		"\u0000\u0000R\u01b1\u0001\u0000\u0000\u0000T\u01b3\u0001\u0000\u0000\u0000"+
		"V\u01b9\u0001\u0000\u0000\u0000X\u01ce\u0001\u0000\u0000\u0000Z\u0202"+
		"\u0001\u0000\u0000\u0000\\\u0209\u0001\u0000\u0000\u0000^\u0213\u0001"+
		"\u0000\u0000\u0000`\u021b\u0001\u0000\u0000\u0000b\u0230\u0001\u0000\u0000"+
		"\u0000d\u024a\u0001\u0000\u0000\u0000f\u024c\u0001\u0000\u0000\u0000h"+
		"\u0251\u0001\u0000\u0000\u0000j\u026b\u0001\u0000\u0000\u0000l\u026d\u0001"+
		"\u0000\u0000\u0000n\u026f\u0001\u0000\u0000\u0000pq\u0003\u0002\u0001"+
		"\u0000qr\u0005\u0000\u0000\u0001r\u0001\u0001\u0000\u0000\u0000su\u0003"+
		"\u0004\u0002\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0003\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0003j5\u0000z{\u0005\"\u0000"+
		"\u0000{\u008b\u0001\u0000\u0000\u0000|\u008b\u0003\u0006\u0003\u0000}"+
		"\u008b\u0003\u001e\u000f\u0000~\u008b\u0003\n\u0005\u0000\u007f\u0080"+
		"\u0003\\.\u0000\u0080\u0081\u0005\"\u0000\u0000\u0081\u008b\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0003\u0010\b\u0000\u0083\u0084\u0005\"\u0000"+
		"\u0000\u0084\u008b\u0001\u0000\u0000\u0000\u0085\u0086\u0003\u0016\u000b"+
		"\u0000\u0086\u0087\u0005\"\u0000\u0000\u0087\u008b\u0001\u0000\u0000\u0000"+
		"\u0088\u008b\u0003:\u001d\u0000\u0089\u008b\u00034\u001a\u0000\u008ay"+
		"\u0001\u0000\u0000\u0000\u008a|\u0001\u0000\u0000\u0000\u008a}\u0001\u0000"+
		"\u0000\u0000\u008a~\u0001\u0000\u0000\u0000\u008a\u007f\u0001\u0000\u0000"+
		"\u0000\u008a\u0082\u0001\u0000\u0000\u0000\u008a\u0085\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u0005\u0001\u0000\u0000\u0000\u008c\u008d\u0005E\u0000\u0000"+
		"\u008d\u008e\u0005\u0018\u0000\u0000\u008e\u008f\u0003\u001c\u000e\u0000"+
		"\u008f\u0090\u0005\u0006\u0000\u0000\u0090\u0096\u0003\b\u0004\u0000\u0091"+
		"\u0092\u0005>\u0000\u0000\u0092\u0093\u0005E\u0000\u0000\u0093\u0095\u0003"+
		"\u001c\u000e\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0095\u0098\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u009b\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005>\u0000\u0000\u009a\u009c\u0003\b"+
		"\u0004\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u0007\u0001\u0000\u0000\u0000\u009d\u009e\u0005(\u0000"+
		"\u0000\u009e\u00a1\u0003\u0002\u0001\u0000\u009f\u00a0\u00056\u0000\u0000"+
		"\u00a0\u00a2\u0005\"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0005)\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a7"+
		"\u0003\u0004\u0002\u0000\u00a6\u009d\u0001\u0000\u0000\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\t\u0001\u0000\u0000\u0000\u00a8\u00ac\u0003"+
		"\u000e\u0007\u0000\u00a9\u00ac\u0003\f\u0006\u0000\u00aa\u00ac\u0003\u0018"+
		"\f\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u000b\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005T\u0000\u0000\u00ae\u00af\u0005\u0018\u0000\u0000"+
		"\u00af\u00b0\u0003\u001c\u000e\u0000\u00b0\u00b1\u0005\u0006\u0000\u0000"+
		"\u00b1\u00b2\u0003\b\u0004\u0000\u00b2\r\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0005=\u0000\u0000\u00b4\u00b5\u0003\b\u0004\u0000\u00b5\u00b6"+
		"\u0005T\u0000\u0000\u00b6\u00b7\u0005\u0018\u0000\u0000\u00b7\u00b8\u0003"+
		"\u001c\u000e\u0000\u00b8\u00b9\u0005\u0006\u0000\u0000\u00b9\u000f\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0005z\u0000\u0000\u00bb\u00bc\u0005\u0007"+
		"\u0000\u0000\u00bc\u00c0\u0003 \u0010\u0000\u00bd\u00c0\u0003\u0014\n"+
		"\u0000\u00be\u00c0\u0003\u0012\t\u0000\u00bf\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u0011\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005z\u0000\u0000\u00c2"+
		"\u00c3\u0005\u0018\u0000\u0000\u00c3\u00c4\u0003(\u0014\u0000\u00c4\u00c5"+
		"\u0005\u0006\u0000\u0000\u00c5\u0013\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0005z\u0000\u0000\u00c7\u00c8\u0005\u0007\u0000\u0000\u00c8\u00c9\u0005"+
		"z\u0000\u0000\u00c9\u00ca\u0005\u0018\u0000\u0000\u00ca\u00cb\u0003(\u0014"+
		"\u0000\u00cb\u00cc\u0005\u0006\u0000\u0000\u00cc\u0015\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0005z\u0000\u0000\u00ce\u00d2\u0005\u001c\u0000\u0000"+
		"\u00cf\u00d0\u0005z\u0000\u0000\u00d0\u00d2\u0005\u0011\u0000\u0000\u00d1"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2"+
		"\u0017\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005D\u0000\u0000\u00d4\u00d6"+
		"\u0005\u0018\u0000\u0000\u00d5\u00d7\u0003\u001a\r\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00da\u0005\"\u0000\u0000\u00d9\u00db\u0003\u001c"+
		"\u000e\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00df\u0005\"\u0000"+
		"\u0000\u00dd\u00e0\u0003`0\u0000\u00de\u00e0\u0003\u0016\u000b\u0000\u00df"+
		"\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0005\u0006\u0000\u0000\u00e2\u00e3\u0003\b\u0004\u0000\u00e3\u0019"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e7\u0003\\.\u0000\u00e5\u00e7\u0003"+
		"j5\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u001b\u0001\u0000\u0000\u0000\u00e8\u00ee\u0003d2\u0000\u00e9"+
		"\u00ee\u0003h4\u0000\u00ea\u00ee\u0003f3\u0000\u00eb\u00ee\u0005z\u0000"+
		"\u0000\u00ec\u00ee\u0003\u0010\b\u0000\u00ed\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ed\u00e9\u0001\u0000\u0000\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ee\u001d\u0001\u0000\u0000\u0000\u00ef\u00f0\u0003\"\u0011\u0000\u00f0"+
		"\u00f1\u0003 \u0010\u0000\u00f1\u00f2\u0003*\u0015\u0000\u00f2\u00f3\u0003"+
		"0\u0018\u0000\u00f3\u001f\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005z\u0000"+
		"\u0000\u00f5!\u0001\u0000\u0000\u0000\u00f6\u00f9\u0003^/\u0000\u00f7"+
		"\u00f9\u0005S\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f9#\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		"\u0018\u0000\u0000\u00fb\u00fc\u0003(\u0014\u0000\u00fc\u00fd\u0005\u0006"+
		"\u0000\u0000\u00fd%\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003^/\u0000"+
		"\u00ff\u0102\u0005z\u0000\u0000\u0100\u0101\u0005\b\u0000\u0000\u0101"+
		"\u0103\u0003`0\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u0109\u0001\u0000\u0000\u0000\u0104\u0107\u0003"+
		"f3\u0000\u0105\u0107\u0003`0\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0105\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000"+
		"\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u00fe\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0109\'\u0001\u0000\u0000\u0000\u010a"+
		"\u010f\u0003&\u0013\u0000\u010b\u010c\u00054\u0000\u0000\u010c\u010e\u0003"+
		"&\u0013\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000"+
		"\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110)\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000"+
		"\u0000\u0112\u0116\u0005\u0018\u0000\u0000\u0113\u0115\u0003.\u0017\u0000"+
		"\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000"+
		"\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0005\u0006\u0000\u0000\u011a+\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0003^/\u0000\u011c\u011f\u0005z\u0000\u0000\u011d\u011e\u0005"+
		"\b\u0000\u0000\u011e\u0120\u0003`0\u0000\u011f\u011d\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000"+
		"\u0000\u0121\u0123\u0005z\u0000\u0000\u0122\u011b\u0001\u0000\u0000\u0000"+
		"\u0122\u0121\u0001\u0000\u0000\u0000\u0123-\u0001\u0000\u0000\u0000\u0124"+
		"\u0129\u0003,\u0016\u0000\u0125\u0126\u00054\u0000\u0000\u0126\u0128\u0003"+
		",\u0016\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000"+
		"\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012a/\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0005(\u0000\u0000\u012d\u0131\u0003\u0002\u0001\u0000"+
		"\u012e\u0130\u00032\u0019\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130"+
		"\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0001\u0000\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133"+
		"\u0131\u0001\u0000\u0000\u0000\u0134\u0135\u0005)\u0000\u0000\u01351\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005K\u0000\u0000\u0137\u0138\u0003`0"+
		"\u0000\u0138\u0139\u0005\"\u0000\u0000\u01393\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0005M\u0000\u0000\u013b\u013c\u0005\u0018\u0000\u0000\u013c"+
		"\u013d\u00036\u001b\u0000\u013d\u013e\u0005\u0006\u0000\u0000\u013e\u013f"+
		"\u00038\u001c\u0000\u013f5\u0001\u0000\u0000\u0000\u0140\u0141\u0007\u0000"+
		"\u0000\u0000\u01417\u0001\u0000\u0000\u0000\u0142\u0150\u0005(\u0000\u0000"+
		"\u0143\u0144\u00057\u0000\u0000\u0144\u0145\u0007\u0001\u0000\u0000\u0145"+
		"\u0146\u00053\u0000\u0000\u0146\u014b\u0003\u0002\u0001\u0000\u0147\u0148"+
		"\u00056\u0000\u0000\u0148\u014a\u0005\"\u0000\u0000\u0149\u0147\u0001"+
		"\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014f\u0001"+
		"\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u0143\u0001"+
		"\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u015d\u0001"+
		"\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0154\u0005"+
		"<\u0000\u0000\u0154\u0155\u00053\u0000\u0000\u0155\u015a\u0003\u0002\u0001"+
		"\u0000\u0156\u0157\u00056\u0000\u0000\u0157\u0159\u0005\"\u0000\u0000"+
		"\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000"+
		"\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000"+
		"\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000"+
		"\u015d\u0153\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0005)\u0000\u0000\u0160"+
		"9\u0001\u0000\u0000\u0000\u0161\u0163\u0005V\u0000\u0000\u0162\u0161\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u00059\u0000\u0000\u0165\u0167\u0003l6"+
		"\u0000\u0166\u0168\u0003V+\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169"+
		"\u016b\u0003F#\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001"+
		"\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u016e\u0003"+
		"H$\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0005(\u0000\u0000"+
		"\u0170\u0171\u0003Z-\u0000\u0171\u0172\u0005)\u0000\u0000\u0172;\u0001"+
		"\u0000\u0000\u0000\u0173\u0175\u0003>\u001f\u0000\u0174\u0173\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177=\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0003\\.\u0000\u0179\u017a\u0005\"\u0000\u0000\u017a"+
		"?\u0001\u0000\u0000\u0000\u017b\u017d\u0003B!\u0000\u017c\u017b\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017c\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017fA\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0003\"\u0011\u0000\u0181\u0182\u0003 \u0010"+
		"\u0000\u0182\u0183\u0003$\u0012\u0000\u0183\u0184\u00030\u0018\u0000\u0184"+
		"C\u0001\u0000\u0000\u0000\u0185\u0186\u0003 \u0010\u0000\u0186\u0187\u0003"+
		"$\u0012\u0000\u0187\u0188\u00030\u0018\u0000\u0188E\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0005@\u0000\u0000\u018a\u018c\u0003J%\u0000\u018b"+
		"\u018d\u0003N\'\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0001\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u0190"+
		"\u0003N\'\u0000\u018f\u0189\u0001\u0000\u0000\u0000\u018f\u018e\u0001"+
		"\u0000\u0000\u0000\u0190G\u0001\u0000\u0000\u0000\u0191\u0192\u0005a\u0000"+
		"\u0000\u0192\u0193\u0003L&\u0000\u0193I\u0001\u0000\u0000\u0000\u0194"+
		"\u0196\u0003 \u0010\u0000\u0195\u0197\u0005\u001d\u0000\u0000\u0196\u0195"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u019d"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0003 \u0010\u0000\u0199\u019a\u0005"+
		"4\u0000\u0000\u019a\u019b\u0005z\u0000\u0000\u019b\u019d\u0001\u0000\u0000"+
		"\u0000\u019c\u0194\u0001\u0000\u0000\u0000\u019c\u0198\u0001\u0000\u0000"+
		"\u0000\u019dK\u0001\u0000\u0000\u0000\u019e\u01a2\u0003J%\u0000\u019f"+
		"\u01a1\u0003J%\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a3M\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0005U\u0000\u0000\u01a6\u01a7\u0003L&\u0000"+
		"\u01a7O\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005-\u0000\u0000\u01a9\u01ab"+
		"\u0003R)\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000"+
		"\u0000\u0000\u01adQ\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000"+
		"\u0000\u01af\u01b2\u0003n7\u0000\u01b0\u01b2\u0003X,\u0000\u01b1\u01af"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2S\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0003P(\u0000\u01b4\u01b7\u0003n7\u0000"+
		"\u01b5\u01b6\u0005@\u0000\u0000\u01b6\u01b8\u0003J%\u0000\u01b7\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8U\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0005\u000f\u0000\u0000\u01ba\u01bf\u0003"+
		"T*\u0000\u01bb\u01bc\u00054\u0000\u0000\u01bc\u01be\u0003T*\u0000\u01bd"+
		"\u01bb\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u0005\u000b\u0000\u0000\u01c3W\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0003l6\u0000\u01c5\u01c6\u0005\u0007\u0000\u0000\u01c6\u01c7\u0003n"+
		"7\u0000\u01c7\u01cf\u0001\u0000\u0000\u0000\u01c8\u01c9\u0003l6\u0000"+
		"\u01c9\u01ca\u0005\u0007\u0000\u0000\u01ca\u01cb\u0003l6\u0000\u01cb\u01cc"+
		"\u0005\u0007\u0000\u0000\u01cc\u01cd\u0003n7\u0000\u01cd\u01cf\u0001\u0000"+
		"\u0000\u0000\u01ce\u01c4\u0001\u0000\u0000\u0000\u01ce\u01c8\u0001\u0000"+
		"\u0000\u0000\u01cfY\u0001\u0000\u0000\u0000\u01d0\u01d2\u0003<\u001e\u0000"+
		"\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d8\u0003D\"\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d8\u01dc\u0001\u0000\u0000\u0000\u01d9"+
		"\u01db\u0003@ \u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01db\u01de\u0001"+
		"\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001"+
		"\u0000\u0000\u0000\u01dd\u0203\u0001\u0000\u0000\u0000\u01de\u01dc\u0001"+
		"\u0000\u0000\u0000\u01df\u01e1\u0003D\"\u0000\u01e0\u01df\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e5\u0003<\u001e\u0000\u01e3\u01e5\u0003@ \u0000"+
		"\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e8\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u0203\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e9\u01ec\u0003<\u001e\u0000\u01ea"+
		"\u01ec\u0003@ \u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001"+
		"\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001"+
		"\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f2\u0003"+
		"D\"\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f2\u0203\u0001\u0000\u0000\u0000\u01f3\u01f5\u0003@ \u0000"+
		"\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000"+
		"\u01f7\u01fa\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fb\u0003D\"\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fb\u01ff\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fe\u0003<\u001e\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fe\u0201"+
		"\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201\u01ff"+
		"\u0001\u0000\u0000\u0000\u0202\u01d3\u0001\u0000\u0000\u0000\u0202\u01e0"+
		"\u0001\u0000\u0000\u0000\u0202\u01ed\u0001\u0000\u0000\u0000\u0202\u01f6"+
		"\u0001\u0000\u0000\u0000\u0203[\u0001\u0000\u0000\u0000\u0204\u020a\u0005"+
		":\u0000\u0000\u0205\u0207\u0005B\u0000\u0000\u0206\u0205\u0001\u0000\u0000"+
		"\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000"+
		"\u0000\u0208\u020a\u0003^/\u0000\u0209\u0204\u0001\u0000\u0000\u0000\u0209"+
		"\u0206\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b"+
		"\u0211\u0005z\u0000\u0000\u020c\u020f\u0005\b\u0000\u0000\u020d\u0210"+
		"\u0003`0\u0000\u020e\u0210\u0003f3\u0000\u020f\u020d\u0001\u0000\u0000"+
		"\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u0210\u0212\u0001\u0000\u0000"+
		"\u0000\u0211\u020c\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000"+
		"\u0000\u0212]\u0001\u0000\u0000\u0000\u0213\u0214\u0007\u0002\u0000\u0000"+
		"\u0214_\u0001\u0000\u0000\u0000\u0215\u0216\u00060\uffff\uffff\u0000\u0216"+
		"\u0217\u0005\u0010\u0000\u0000\u0217\u021c\u0003`0\u0005\u0218\u0219\u0005"+
		"/\u0000\u0000\u0219\u021c\u0003`0\u0004\u021a\u021c\u0003b1\u0000\u021b"+
		"\u0215\u0001\u0000\u0000\u0000\u021b\u0218\u0001\u0000\u0000\u0000\u021b"+
		"\u021a\u0001\u0000\u0000\u0000\u021c\u0225\u0001\u0000\u0000\u0000\u021d"+
		"\u021e\n\u0003\u0000\u0000\u021e\u021f\u0007\u0003\u0000\u0000\u021f\u0224"+
		"\u0003`0\u0004\u0220\u0221\n\u0002\u0000\u0000\u0221\u0222\u0007\u0004"+
		"\u0000\u0000\u0222\u0224\u0003`0\u0003\u0223\u021d\u0001\u0000\u0000\u0000"+
		"\u0223\u0220\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000\u0000\u0000"+
		"\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000"+
		"\u0226a\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0005\u0018\u0000\u0000\u0229\u022a\u0003`0\u0000\u022a\u022b\u0005"+
		"\u0006\u0000\u0000\u022b\u0231\u0001\u0000\u0000\u0000\u022c\u0231\u0005"+
		"v\u0000\u0000\u022d\u0231\u0005w\u0000\u0000\u022e\u0231\u0005z\u0000"+
		"\u0000\u022f\u0231\u0005x\u0000\u0000\u0230\u0228\u0001\u0000\u0000\u0000"+
		"\u0230\u022c\u0001\u0000\u0000\u0000\u0230\u022d\u0001\u0000\u0000\u0000"+
		"\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u022f\u0001\u0000\u0000\u0000"+
		"\u0231c\u0001\u0000\u0000\u0000\u0232\u0233\u0003`0\u0000\u0233\u0234"+
		"\u0005\f\u0000\u0000\u0234\u0235\u0003`0\u0000\u0235\u024b\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0003`0\u0000\u0237\u0238\u0005\n\u0000\u0000"+
		"\u0238\u0239\u0003`0\u0000\u0239\u024b\u0001\u0000\u0000\u0000\u023a\u023b"+
		"\u0003`0\u0000\u023b\u023c\u0005\u000f\u0000\u0000\u023c\u023d\u0003`"+
		"0\u0000\u023d\u024b\u0001\u0000\u0000\u0000\u023e\u023f\u0003`0\u0000"+
		"\u023f\u0240\u0005\u000b\u0000\u0000\u0240\u0241\u0003`0\u0000\u0241\u024b"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0003`0\u0000\u0243\u0244\u0005\t"+
		"\u0000\u0000\u0244\u0245\u0003`0\u0000\u0245\u024b\u0001\u0000\u0000\u0000"+
		"\u0246\u0247\u0003`0\u0000\u0247\u0248\u0005\u0016\u0000\u0000\u0248\u0249"+
		"\u0003`0\u0000\u0249\u024b\u0001\u0000\u0000\u0000\u024a\u0232\u0001\u0000"+
		"\u0000\u0000\u024a\u0236\u0001\u0000\u0000\u0000\u024a\u023a\u0001\u0000"+
		"\u0000\u0000\u024a\u023e\u0001\u0000\u0000\u0000\u024a\u0242\u0001\u0000"+
		"\u0000\u0000\u024a\u0246\u0001\u0000\u0000\u0000\u024be\u0001\u0000\u0000"+
		"\u0000\u024c\u024d\u0007\u0005\u0000\u0000\u024dg\u0001\u0000\u0000\u0000"+
		"\u024e\u0252\u0003d2\u0000\u024f\u0252\u0003f3\u0000\u0250\u0252\u0005"+
		"z\u0000\u0000\u0251\u024e\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000"+
		"\u0000\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000"+
		"\u0000\u0000\u0253\u0257\u0007\u0006\u0000\u0000\u0254\u0258\u0003d2\u0000"+
		"\u0255\u0258\u0003f3\u0000\u0256\u0258\u0005z\u0000\u0000\u0257\u0254"+
		"\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0257\u0256"+
		"\u0001\u0000\u0000\u0000\u0258i\u0001\u0000\u0000\u0000\u0259\u025a\u0005"+
		"z\u0000\u0000\u025a\u025b\u0005\b\u0000\u0000\u025b\u026c\u0003`0\u0000"+
		"\u025c\u025d\u0005z\u0000\u0000\u025d\u025e\u0005\u0015\u0000\u0000\u025e"+
		"\u026c\u0003`0\u0000\u025f\u0260\u0005z\u0000\u0000\u0260\u0261\u0005"+
		"\u001a\u0000\u0000\u0261\u026c\u0003`0\u0000\u0262\u0263\u0005z\u0000"+
		"\u0000\u0263\u0264\u0005\u0013\u0000\u0000\u0264\u026c\u0003`0\u0000\u0265"+
		"\u0266\u0005z\u0000\u0000\u0266\u0267\u0005!\u0000\u0000\u0267\u026c\u0003"+
		"`0\u0000\u0268\u0269\u0005z\u0000\u0000\u0269\u026a\u0005$\u0000\u0000"+
		"\u026a\u026c\u0003`0\u0000\u026b\u0259\u0001\u0000\u0000\u0000\u026b\u025c"+
		"\u0001\u0000\u0000\u0000\u026b\u025f\u0001\u0000\u0000\u0000\u026b\u0262"+
		"\u0001\u0000\u0000\u0000\u026b\u0265\u0001\u0000\u0000\u0000\u026b\u0268"+
		"\u0001\u0000\u0000\u0000\u026ck\u0001\u0000\u0000\u0000\u026d\u026e\u0007"+
		"\u0007\u0000\u0000\u026em\u0001\u0000\u0000\u0000\u026f\u0270\u0007\b"+
		"\u0000\u0000\u0270o\u0001\u0000\u0000\u0000Ev\u008a\u0096\u009b\u00a1"+
		"\u00a6\u00ab\u00bf\u00d1\u00d6\u00da\u00df\u00e6\u00ed\u00f8\u0102\u0106"+
		"\u0108\u010f\u0116\u011f\u0122\u0129\u0131\u014b\u0150\u015a\u015d\u0162"+
		"\u0167\u016a\u016d\u0176\u017e\u018c\u018f\u0196\u019c\u01a2\u01ac\u01b1"+
		"\u01b7\u01bf\u01ce\u01d3\u01d7\u01dc\u01e0\u01e4\u01e6\u01eb\u01ed\u01f1"+
		"\u01f6\u01fa\u01ff\u0202\u0206\u0209\u020f\u0211\u021b\u0223\u0225\u0230"+
		"\u024a\u0251\u0257\u026b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}