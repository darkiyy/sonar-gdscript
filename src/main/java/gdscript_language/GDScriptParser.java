package gdscript_language;// Generated from java-escape by ANTLR 4.11.1
import gdscript_language.listener.GDScriptParserListener;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GDScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, EXTENDS=3, CLASS_NAME=4, ONREADY=5, VAR=6, SETGET=7, 
		EXPORT=8, CONST=9, SIGNAL=10, ENUM=11, STATIC=12, FUNC=13, REMOTE=14, 
		MASTER=15, PUPPET=16, REMOTESYNC=17, MASTERSYNC=18, PUPPETSYNC=19, CLASS=20, 
		BREAKPOINT=21, PASS=22, IF=23, ELIF=24, WHILE=25, FOR=26, IN=27, MATCH=28, 
		CONTINUE=29, BREAK=30, RETURN=31, ASSERT=32, YIELD=33, PRELOAD=34, AS=35, 
		ELSE=36, OR=37, AND=38, NOT=39, IS=40, TRUE=41, FALSE=42, NULL=43, SELF=44, 
		TOOL=45, NEWLINE=46, IDENTIFIER=47, BUILTINTYPE=48, CONSTANT=49, STRING=50, 
		INTEGER=51, FLOAT=52, DOT=53, COMMA=54, COLON=55, ASSIGN=56, COLON_ASSIGN=57, 
		ADD_ASSIGN=58, MINUS_ASSIGN=59, MUL_ASSIGN=60, DIV_ASSIGN=61, MOD_ASSIGN=62, 
		AND_ASSIGN=63, OR_ASSIGN=64, XOR_ASSIGN=65, OPEN_PAREN=66, CLOSE_PAREN=67, 
		OPEN_BRACE=68, CLOSE_BRACE=69, ARROW=70, UNDERSCORE=71, OPEN_BRACK=72, 
		CLOSE_BRACK=73, DOTDOT=74, SEMI_COLON=75, LOGIC_OR=76, LOGIC_AND=77, LOGIC_NOT=78, 
		LESS_THAN=79, GREATER_THAN=80, EQUALS=81, GT_EQ=82, LT_EQ=83, NOT_EQ=84, 
		OR_OP=85, XOR=86, AND_OP=87, LEFT_SHIFT=88, RIGHT_SHIFT=89, ADD=90, MINUS=91, 
		STAR=92, DIV=93, MOD=94, NOT_OP=95, DOLLAR=96, SKIP_=97;
	public static final int
		RULE_program = 0, RULE_inheritance = 1, RULE_className = 2, RULE_topLevelDecl = 3, 
		RULE_classVarDecl = 4, RULE_setget = 5, RULE_export = 6, RULE_typeHint = 7, 
		RULE_constDecl = 8, RULE_signalDecl = 9, RULE_signalParList = 10, RULE_enumDecl = 11, 
		RULE_methodDecl = 12, RULE_parList = 13, RULE_parameter = 14, RULE_rpc = 15, 
		RULE_constructorDecl = 16, RULE_argList = 17, RULE_innerClass = 18, RULE_stmtOrSuite = 19, 
		RULE_suite = 20, RULE_stmt = 21, RULE_stmtEnd = 22, RULE_ifStmt = 23, 
		RULE_whileStmt = 24, RULE_forStmt = 25, RULE_matchStmt = 26, RULE_matchBlock = 27, 
		RULE_patternList = 28, RULE_pattern = 29, RULE_bindingPattern = 30, RULE_arrayPattern = 31, 
		RULE_dictPattern = 32, RULE_keyValuePattern = 33, RULE_flowStmt = 34, 
		RULE_assignmentStmt = 35, RULE_varDeclStmt = 36, RULE_assertStmt = 37, 
		RULE_yieldStmt = 38, RULE_preloadStmt = 39, RULE_exprStmt = 40, RULE_expression = 41, 
		RULE_literal = 42, RULE_keyValue = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "inheritance", "className", "topLevelDecl", "classVarDecl", 
			"setget", "export", "typeHint", "constDecl", "signalDecl", "signalParList", 
			"enumDecl", "methodDecl", "parList", "parameter", "rpc", "constructorDecl", 
			"argList", "innerClass", "stmtOrSuite", "suite", "stmt", "stmtEnd", "ifStmt", 
			"whileStmt", "forStmt", "matchStmt", "matchBlock", "patternList", "pattern", 
			"bindingPattern", "arrayPattern", "dictPattern", "keyValuePattern", "flowStmt", 
			"assignmentStmt", "varDeclStmt", "assertStmt", "yieldStmt", "preloadStmt", 
			"exprStmt", "expression", "literal", "keyValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'extends'", "'class_name'", "'onready'", "'var'", 
			"'setget'", "'export'", "'const'", "'signal'", "'enum'", "'static'", 
			"'func'", "'remote'", "'master'", "'puppet'", "'remotesync'", "'mastersync'", 
			"'puppetsync'", "'class'", "'breakpoint'", "'pass'", "'if'", "'elif'", 
			"'while'", "'for'", "'in'", "'match'", "'continue'", "'break'", "'return'", 
			"'assert'", "'yield'", "'preload'", "'as'", "'else'", "'or'", "'and'", 
			"'not'", "'is'", "'true'", "'false'", "'null'", "'self'", "'tool'", null, 
			null, null, null, null, null, null, "'.'", "','", "':'", "'='", "':='", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'('", 
			"')'", "'{'", "'}'", "'->'", "'_'", "'['", "']'", "'..'", "';'", "'||'", 
			"'&&'", "'!'", "'<'", "'>'", "'=='", "'>='", "'<='", "'!='", "'|'", "'^'", 
			"'&'", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "EXTENDS", "CLASS_NAME", "ONREADY", "VAR", 
			"SETGET", "EXPORT", "CONST", "SIGNAL", "ENUM", "STATIC", "FUNC", "REMOTE", 
			"MASTER", "PUPPET", "REMOTESYNC", "MASTERSYNC", "PUPPETSYNC", "CLASS", 
			"BREAKPOINT", "PASS", "IF", "ELIF", "WHILE", "FOR", "IN", "MATCH", "CONTINUE", 
			"BREAK", "RETURN", "ASSERT", "YIELD", "PRELOAD", "AS", "ELSE", "OR", 
			"AND", "NOT", "IS", "TRUE", "FALSE", "NULL", "SELF", "TOOL", "NEWLINE", 
			"IDENTIFIER", "BUILTINTYPE", "CONSTANT", "STRING", "INTEGER", "FLOAT", 
			"DOT", "COMMA", "COLON", "ASSIGN", "COLON_ASSIGN", "ADD_ASSIGN", "MINUS_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACE", "CLOSE_BRACE", 
			"ARROW", "UNDERSCORE", "OPEN_BRACK", "CLOSE_BRACK", "DOTDOT", "SEMI_COLON", 
			"LOGIC_OR", "LOGIC_AND", "LOGIC_NOT", "LESS_THAN", "GREATER_THAN", "EQUALS", 
			"GT_EQ", "LT_EQ", "NOT_EQ", "OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", 
			"ADD", "MINUS", "STAR", "DIV", "MOD", "NOT_OP", "DOLLAR", "SKIP_"
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

	public GDScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GDScriptParser.EOF, 0); }
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<TopLevelDeclContext> topLevelDecl() {
			return getRuleContexts(TopLevelDeclContext.class);
		}
		public TopLevelDeclContext topLevelDecl(int i) {
			return getRuleContext(TopLevelDeclContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public List<InheritanceContext> inheritance() {
			return getRuleContexts(InheritanceContext.class);
		}
		public InheritanceContext inheritance(int i) {
			return getRuleContext(InheritanceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						{
						setState(88);
						inheritance();
						setState(92);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(89);
								match(NEWLINE);
								}
								} 
							}
							setState(94);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
						}
						}
						}
						break;
					case 2:
						{
						setState(95);
						className();
						}
						break;
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					topLevelDecl();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(107);
				match(NEWLINE);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class InheritanceContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(GDScriptParser.EXTENDS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GDScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GDScriptParser.IDENTIFIER, i);
		}
		public TerminalNode STRING() { return getToken(GDScriptParser.STRING, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public TerminalNode DOT() { return getToken(GDScriptParser.DOT, 0); }
		public InheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterInheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitInheritance(this);
		}
	}

	public final InheritanceContext inheritance() throws RecognitionException {
		InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inheritance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(115);
				match(NEWLINE);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(EXTENDS);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(122);
				match(NEWLINE);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(129);
				match(DOT);
				setState(130);
				match(IDENTIFIER);
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
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(GDScriptParser.CLASS_NAME, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public TerminalNode COMMA() { return getToken(GDScriptParser.COMMA, 0); }
		public TerminalNode STRING() { return getToken(GDScriptParser.STRING, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_className);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(133);
				match(NEWLINE);
				}
			}

			setState(136);
			match(CLASS_NAME);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(137);
				match(NEWLINE);
				}
			}

			setState(140);
			match(IDENTIFIER);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(141);
				match(COMMA);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(142);
					match(NEWLINE);
					}
				}

				setState(145);
				match(STRING);
				}
			}

			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148);
					match(NEWLINE);
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class TopLevelDeclContext extends ParserRuleContext {
		public ClassVarDeclContext classVarDecl() {
			return getRuleContext(ClassVarDeclContext.class,0);
		}
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public SignalDeclContext signalDecl() {
			return getRuleContext(SignalDeclContext.class,0);
		}
		public EnumDeclContext enumDecl() {
			return getRuleContext(EnumDeclContext.class,0);
		}
		public MethodDeclContext methodDecl() {
			return getRuleContext(MethodDeclContext.class,0);
		}
		public ConstructorDeclContext constructorDecl() {
			return getRuleContext(ConstructorDeclContext.class,0);
		}
		public InnerClassContext innerClass() {
			return getRuleContext(InnerClassContext.class,0);
		}
		public TerminalNode TOOL() { return getToken(GDScriptParser.TOOL, 0); }
		public TopLevelDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterTopLevelDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitTopLevelDecl(this);
		}
	}

	public final TopLevelDeclContext topLevelDecl() throws RecognitionException {
		TopLevelDeclContext _localctx = new TopLevelDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_topLevelDecl);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				classVarDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				constDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				signalDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				enumDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				methodDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				constructorDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				innerClass();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
				match(TOOL);
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
	public static class ClassVarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GDScriptParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public TerminalNode ONREADY() { return getToken(GDScriptParser.ONREADY, 0); }
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public SetgetContext setget() {
			return getRuleContext(SetgetContext.class,0);
		}
		public TerminalNode COLON_ASSIGN() { return getToken(GDScriptParser.COLON_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public TerminalNode ASSIGN() { return getToken(GDScriptParser.ASSIGN, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public ClassVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterClassVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitClassVarDecl(this);
		}
	}

	public final ClassVarDeclContext classVarDecl() throws RecognitionException {
		ClassVarDeclContext _localctx = new ClassVarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classVarDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					match(NEWLINE);
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONREADY) {
				{
				setState(170);
				match(ONREADY);
				}
			}

			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(173);
				export();
				}
			}

			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(176);
				match(NEWLINE);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(VAR);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(183);
				match(NEWLINE);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(IDENTIFIER);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					match(NEWLINE);
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(196);
						match(NEWLINE);
						}
						}
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(202);
					match(COLON);
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(203);
						match(NEWLINE);
						}
						}
						setState(208);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(209);
					typeHint();
					}
					break;
				}
				setState(226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(212);
						match(NEWLINE);
						}
						}
						setState(217);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(218);
					match(ASSIGN);
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(219);
						match(NEWLINE);
						}
						}
						setState(224);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(225);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLON_ASSIGN:
					{
					setState(228);
					match(COLON_ASSIGN);
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(229);
						match(NEWLINE);
						}
						}
						setState(234);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(235);
					expression(0);
					}
					break;
				case COLON:
					{
					setState(236);
					match(COLON);
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(237);
						match(NEWLINE);
						}
						}
						setState(242);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(243);
					match(ASSIGN);
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(244);
						match(NEWLINE);
						}
						}
						setState(249);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(250);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETGET) {
				{
				setState(255);
				setget();
				}
			}

			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(258);
					match(NEWLINE);
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
	public static class SetgetContext extends ParserRuleContext {
		public TerminalNode SETGET() { return getToken(GDScriptParser.SETGET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GDScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GDScriptParser.IDENTIFIER, i);
		}
		public TerminalNode COMMA() { return getToken(GDScriptParser.COMMA, 0); }
		public SetgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterSetget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitSetget(this);
		}
	}

	public final SetgetContext setget() throws RecognitionException {
		SetgetContext _localctx = new SetgetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(SETGET);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(265);
				match(IDENTIFIER);
				}
			}

			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(268);
				match(COMMA);
				setState(269);
				match(IDENTIFIER);
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
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(GDScriptParser.EXPORT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public TerminalNode BUILTINTYPE() { return getToken(GDScriptParser.BUILTINTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GDScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GDScriptParser.COMMA, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitExport(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_export);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(EXPORT);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(273);
				match(OPEN_PAREN);
				setState(283);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BUILTINTYPE:
					{
					setState(274);
					match(BUILTINTYPE);
					}
					break;
				case IDENTIFIER:
					{
					setState(275);
					match(IDENTIFIER);
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(276);
						match(COMMA);
						setState(277);
						literal();
						}
						}
						setState(282);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case CLOSE_PAREN:
					break;
				default:
					break;
				}
				setState(285);
				match(CLOSE_PAREN);
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
	public static class TypeHintContext extends ParserRuleContext {
		public TerminalNode BUILTINTYPE() { return getToken(GDScriptParser.BUILTINTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public TypeHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeHint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterTypeHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitTypeHint(this);
		}
	}

	public final TypeHintContext typeHint() throws RecognitionException {
		TypeHintContext _localctx = new TypeHintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeHint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==BUILTINTYPE) ) {
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
	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GDScriptParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(GDScriptParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON_ASSIGN() { return getToken(GDScriptParser.COLON_ASSIGN, 0); }
		public List<TerminalNode> COLON() { return getTokens(GDScriptParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GDScriptParser.COLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitConstDecl(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(290);
				match(NEWLINE);
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(CONST);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(297);
				match(NEWLINE);
				}
			}

			setState(300);
			match(IDENTIFIER);
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(301);
					match(NEWLINE);
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(307);
				match(COLON);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(308);
					match(NEWLINE);
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				typeHint();
				}
				break;
			}
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(317);
					match(NEWLINE);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
				match(ASSIGN);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(324);
					match(NEWLINE);
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				expression(0);
				}
				break;
			case 2:
				{
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(331);
					match(NEWLINE);
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(337);
				match(COLON_ASSIGN);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(338);
					match(NEWLINE);
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(344);
				expression(0);
				}
				break;
			case 3:
				{
				setState(345);
				match(COLON);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(346);
					match(NEWLINE);
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(352);
				match(ASSIGN);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(353);
					match(NEWLINE);
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(359);
				expression(0);
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
	public static class SignalDeclContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(GDScriptParser.SIGNAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public SignalParListContext signalParList() {
			return getRuleContext(SignalParListContext.class,0);
		}
		public SignalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signalDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterSignalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitSignalDecl(this);
		}
	}

	public final SignalDeclContext signalDecl() throws RecognitionException {
		SignalDeclContext _localctx = new SignalDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_signalDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(SIGNAL);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(363);
				match(NEWLINE);
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
			match(IDENTIFIER);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(370);
				signalParList();
				}
			}

			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					match(NEWLINE);
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
	public static class SignalParListContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GDScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GDScriptParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GDScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GDScriptParser.COMMA, i);
		}
		public SignalParListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signalParList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterSignalParList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitSignalParList(this);
		}
	}

	public final SignalParListContext signalParList() throws RecognitionException {
		SignalParListContext _localctx = new SignalParListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signalParList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(OPEN_PAREN);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(380);
				match(IDENTIFIER);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(381);
					match(COMMA);
					setState(382);
					match(IDENTIFIER);
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(390);
			match(CLOSE_PAREN);
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
	public static class EnumDeclContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(GDScriptParser.ENUM, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(GDScriptParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(GDScriptParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GDScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GDScriptParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(GDScriptParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(GDScriptParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GDScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GDScriptParser.COMMA, i);
		}
		public EnumDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterEnumDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitEnumDecl(this);
		}
	}

	public final EnumDeclContext enumDecl() throws RecognitionException {
		EnumDeclContext _localctx = new EnumDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(392);
				match(NEWLINE);
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			match(ENUM);
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(399);
				match(NEWLINE);
				}
				break;
			}
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(402);
				match(IDENTIFIER);
				}
			}

			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(405);
				match(NEWLINE);
				}
			}

			setState(408);
			match(OPEN_BRACE);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(409);
				match(NEWLINE);
				}
			}

			{
			setState(412);
			match(IDENTIFIER);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(413);
				match(ASSIGN);
				setState(414);
				expression(0);
				}
			}

			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(417);
					match(COMMA);
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(418);
						match(NEWLINE);
						}
					}

					setState(421);
					match(IDENTIFIER);
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(422);
						match(ASSIGN);
						setState(423);
						expression(0);
						}
					}

					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(431);
				match(COMMA);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(432);
					match(NEWLINE);
					}
				}

				}
			}

			}
			setState(437);
			match(CLOSE_BRACE);
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
	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GDScriptParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public StmtOrSuiteContext stmtOrSuite() {
			return getRuleContext(StmtOrSuiteContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public RpcContext rpc() {
			return getRuleContext(RpcContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(GDScriptParser.STATIC, 0); }
		public ParListContext parList() {
			return getRuleContext(ParListContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(GDScriptParser.ARROW, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitMethodDecl(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(439);
				match(NEWLINE);
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0) {
				{
				setState(445);
				rpc();
				}
			}

			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(448);
				match(STATIC);
				}
			}

			setState(451);
			match(FUNC);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(452);
				match(NEWLINE);
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(458);
			match(IDENTIFIER);
			setState(459);
			match(OPEN_PAREN);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 211106232533056L) != 0) {
				{
				setState(460);
				parList();
				}
			}

			setState(463);
			match(CLOSE_PAREN);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE || _la==ARROW) {
				{
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(464);
					match(NEWLINE);
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(470);
				match(ARROW);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(471);
					match(NEWLINE);
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(477);
				typeHint();
				}
			}

			setState(480);
			match(COLON);
			setState(481);
			stmtOrSuite();
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
	public static class ParListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GDScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GDScriptParser.COMMA, i);
		}
		public ParListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterParList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitParList(this);
		}
	}

	public final ParListContext parList() throws RecognitionException {
		ParListContext _localctx = new ParListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					match(NEWLINE);
					}
					} 
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(489);
			parameter();
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(490);
						match(NEWLINE);
						}
						}
						setState(495);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(496);
					match(COMMA);
					setState(500);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(497);
							match(NEWLINE);
							}
							} 
						}
						setState(502);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					}
					setState(503);
					parameter();
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(509);
				match(NEWLINE);
				}
				}
				setState(514);
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public TerminalNode VAR() { return getToken(GDScriptParser.VAR, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GDScriptParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(515);
				match(VAR);
				}
			}

			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(518);
				match(NEWLINE);
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524);
			match(IDENTIFIER);
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(525);
					match(NEWLINE);
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(531);
				match(COLON);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(532);
					match(NEWLINE);
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(538);
				typeHint();
				}
			}

			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(541);
					match(NEWLINE);
					}
					}
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(547);
				match(ASSIGN);
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(548);
					match(NEWLINE);
					}
					}
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(554);
				expression(0);
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
	public static class RpcContext extends ParserRuleContext {
		public TerminalNode REMOTE() { return getToken(GDScriptParser.REMOTE, 0); }
		public TerminalNode MASTER() { return getToken(GDScriptParser.MASTER, 0); }
		public TerminalNode PUPPET() { return getToken(GDScriptParser.PUPPET, 0); }
		public TerminalNode REMOTESYNC() { return getToken(GDScriptParser.REMOTESYNC, 0); }
		public TerminalNode MASTERSYNC() { return getToken(GDScriptParser.MASTERSYNC, 0); }
		public TerminalNode PUPPETSYNC() { return getToken(GDScriptParser.PUPPETSYNC, 0); }
		public RpcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterRpc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitRpc(this);
		}
	}

	public final RpcContext rpc() throws RecognitionException {
		RpcContext _localctx = new RpcContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rpc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0) ) {
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
	public static class ConstructorDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GDScriptParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(GDScriptParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(GDScriptParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(GDScriptParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(GDScriptParser.CLOSE_PAREN, i);
		}
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public StmtOrSuiteContext stmtOrSuite() {
			return getRuleContext(StmtOrSuiteContext.class,0);
		}
		public ParListContext parList() {
			return getRuleContext(ParListContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GDScriptParser.DOT, 0); }
		public TerminalNode PASS() { return getToken(GDScriptParser.PASS, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ConstructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterConstructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitConstructorDecl(this);
		}
	}

	public final ConstructorDeclContext constructorDecl() throws RecognitionException {
		ConstructorDeclContext _localctx = new ConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constructorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(559);
				match(NEWLINE);
				}
			}

			setState(562);
			match(FUNC);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(563);
				match(NEWLINE);
				}
			}

			setState(566);
			match(IDENTIFIER);
			setState(567);
			match(OPEN_PAREN);
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 211106232533056L) != 0) {
				{
				setState(568);
				parList();
				}
			}

			setState(571);
			match(CLOSE_PAREN);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(572);
				match(DOT);
				setState(573);
				match(OPEN_PAREN);
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709373L) != 0) {
					{
					setState(574);
					argList();
					}
				}

				setState(577);
				match(CLOSE_PAREN);
				}
			}

			setState(580);
			match(COLON);
			setState(581);
			match(NEWLINE);
			setState(582);
			stmtOrSuite();
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASS) {
				{
				setState(583);
				match(PASS);
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
	public static class ArgListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GDScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GDScriptParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitArgList(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(586);
				match(NEWLINE);
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(592);
			expression(0);
			setState(609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(596);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(593);
						match(NEWLINE);
						}
						}
						setState(598);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(599);
					match(COMMA);
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(600);
						match(NEWLINE);
						}
						}
						setState(605);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(606);
					expression(0);
					}
					} 
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(612);
				match(NEWLINE);
				}
				}
				setState(617);
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
	public static class InnerClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(GDScriptParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public TerminalNode INDENT() { return getToken(GDScriptParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(GDScriptParser.DEDENT, 0); }
		public List<InheritanceContext> inheritance() {
			return getRuleContexts(InheritanceContext.class);
		}
		public InheritanceContext inheritance(int i) {
			return getRuleContext(InheritanceContext.class,i);
		}
		public List<TopLevelDeclContext> topLevelDecl() {
			return getRuleContexts(TopLevelDeclContext.class);
		}
		public TopLevelDeclContext topLevelDecl(int i) {
			return getRuleContext(TopLevelDeclContext.class,i);
		}
		public InnerClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterInnerClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitInnerClass(this);
		}
	}

	public final InnerClassContext innerClass() throws RecognitionException {
		InnerClassContext _localctx = new InnerClassContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_innerClass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(618);
				match(NEWLINE);
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(624);
			match(CLASS);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(625);
				match(NEWLINE);
				}
				}
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(631);
			match(IDENTIFIER);
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==NEWLINE) {
				{
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(632);
						match(NEWLINE);
						}
						} 
					}
					setState(637);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				setState(638);
				inheritance();
				}
			}

			setState(641);
			match(COLON);
			setState(642);
			match(NEWLINE);
			setState(643);
			match(INDENT);
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(644);
				inheritance();
				setState(645);
				match(NEWLINE);
				}
				break;
			}
			setState(650); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(649);
				topLevelDecl();
				}
				}
				setState(652); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 105553118363488L) != 0 );
			setState(654);
			match(DEDENT);
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
	public static class StmtOrSuiteContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode INDENT() { return getToken(GDScriptParser.INDENT, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(GDScriptParser.DEDENT, 0); }
		public StmtOrSuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtOrSuite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterStmtOrSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitStmtOrSuite(this);
		}
	}

	public final StmtOrSuiteContext stmtOrSuite() throws RecognitionException {
		StmtOrSuiteContext _localctx = new StmtOrSuiteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stmtOrSuite);
		int _la;
		try {
			int _alt;
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(656);
						match(NEWLINE);
						}
						} 
					}
					setState(661);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				setState(665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(662);
						stmt();
						}
						} 
					}
					setState(667);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(668);
					match(NEWLINE);
					}
					}
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(674);
				match(INDENT);
				setState(675);
				suite();
				setState(676);
				match(DEDENT);
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
	public static class SuiteContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitSuite(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(680);
				stmt();
				}
				}
				setState(683); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 17977599076597824L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1660948549L) != 0 );
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
	public static class StmtContext extends ParserRuleContext {
		public VarDeclStmtContext varDeclStmt() {
			return getRuleContext(VarDeclStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public MatchStmtContext matchStmt() {
			return getRuleContext(MatchStmtContext.class,0);
		}
		public FlowStmtContext flowStmt() {
			return getRuleContext(FlowStmtContext.class,0);
		}
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public AssertStmtContext assertStmt() {
			return getRuleContext(AssertStmtContext.class,0);
		}
		public YieldStmtContext yieldStmt() {
			return getRuleContext(YieldStmtContext.class,0);
		}
		public PreloadStmtContext preloadStmt() {
			return getRuleContext(PreloadStmtContext.class,0);
		}
		public TerminalNode BREAKPOINT() { return getToken(GDScriptParser.BREAKPOINT, 0); }
		public StmtEndContext stmtEnd() {
			return getRuleContext(StmtEndContext.class,0);
		}
		public TerminalNode PASS() { return getToken(GDScriptParser.PASS, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stmt);
		try {
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				varDeclStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				ifStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				forStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(688);
				whileStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(689);
				matchStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(690);
				flowStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(691);
				assignmentStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(692);
				exprStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(693);
				assertStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(694);
				yieldStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(695);
				preloadStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(696);
				match(BREAKPOINT);
				setState(697);
				stmtEnd();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(698);
				match(PASS);
				setState(699);
				stmtEnd();
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
	public static class StmtEndContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public TerminalNode SEMI_COLON() { return getToken(GDScriptParser.SEMI_COLON, 0); }
		public StmtEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterStmtEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitStmtEnd(this);
		}
	}

	public final StmtEndContext stmtEnd() throws RecognitionException {
		StmtEndContext _localctx = new StmtEndContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stmtEnd);
		try {
			int _alt;
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case DEDENT:
			case ONREADY:
			case VAR:
			case EXPORT:
			case CONST:
			case SIGNAL:
			case ENUM:
			case STATIC:
			case FUNC:
			case REMOTE:
			case MASTER:
			case PUPPET:
			case REMOTESYNC:
			case MASTERSYNC:
			case PUPPETSYNC:
			case CLASS:
			case BREAKPOINT:
			case PASS:
			case IF:
			case ELIF:
			case WHILE:
			case FOR:
			case MATCH:
			case CONTINUE:
			case BREAK:
			case RETURN:
			case ASSERT:
			case YIELD:
			case PRELOAD:
			case ELSE:
			case NOT:
			case TRUE:
			case FALSE:
			case NULL:
			case SELF:
			case TOOL:
			case NEWLINE:
			case IDENTIFIER:
			case BUILTINTYPE:
			case CONSTANT:
			case STRING:
			case INTEGER:
			case FLOAT:
			case DOT:
			case OPEN_PAREN:
			case OPEN_BRACE:
			case UNDERSCORE:
			case OPEN_BRACK:
			case LOGIC_NOT:
			case ADD:
			case MINUS:
			case NOT_OP:
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(702);
						match(NEWLINE);
						}
						} 
					}
					setState(707);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				}
				}
				break;
			case SEMI_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				match(SEMI_COLON);
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
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GDScriptParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(GDScriptParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GDScriptParser.COLON, i);
		}
		public List<StmtOrSuiteContext> stmtOrSuite() {
			return getRuleContexts(StmtOrSuiteContext.class);
		}
		public StmtOrSuiteContext stmtOrSuite(int i) {
			return getRuleContext(StmtOrSuiteContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(GDScriptParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(GDScriptParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(GDScriptParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(GDScriptParser.CLOSE_PAREN, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(GDScriptParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(GDScriptParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(GDScriptParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(711);
				match(NEWLINE);
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717);
			match(IF);
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(718);
				match(NEWLINE);
				}
				}
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(727);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(724);
					match(OPEN_PAREN);
					}
					} 
				}
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			setState(730);
			expression(0);
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSE_PAREN) {
				{
				{
				setState(731);
				match(CLOSE_PAREN);
				}
				}
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(737);
				match(NEWLINE);
				}
				}
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(743);
			match(COLON);
			setState(747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(744);
					match(NEWLINE);
					}
					} 
				}
				setState(749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			setState(750);
			stmtOrSuite();
			setState(776);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(754);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(751);
						match(NEWLINE);
						}
						}
						setState(756);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(757);
					match(ELIF);
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(758);
						match(NEWLINE);
						}
						}
						setState(763);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(764);
					expression(0);
					setState(765);
					match(COLON);
					setState(769);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(766);
							match(NEWLINE);
							}
							} 
						}
						setState(771);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
					}
					setState(772);
					stmtOrSuite();
					}
					} 
				}
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(779);
					match(NEWLINE);
					}
					}
					setState(784);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(785);
				match(ELSE);
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(786);
					match(NEWLINE);
					}
					}
					setState(791);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(792);
				match(COLON);
				setState(796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(793);
						match(NEWLINE);
						}
						} 
					}
					setState(798);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
				setState(799);
				stmtOrSuite();
				}
				break;
			}
			setState(805);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(802);
					match(NEWLINE);
					}
					} 
				}
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
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
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GDScriptParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public StmtOrSuiteContext stmtOrSuite() {
			return getRuleContext(StmtOrSuiteContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitWhileStmt(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whileStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(808);
				match(NEWLINE);
				}
				}
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(814);
			match(WHILE);
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(815);
				match(NEWLINE);
				}
				}
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(821);
			expression(0);
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(822);
				match(NEWLINE);
				}
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(828);
			match(COLON);
			setState(832);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(829);
					match(NEWLINE);
					}
					} 
				}
				setState(834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			setState(835);
			stmtOrSuite();
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
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GDScriptParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(GDScriptParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public StmtOrSuiteContext stmtOrSuite() {
			return getRuleContext(StmtOrSuiteContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitForStmt(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(837);
				match(NEWLINE);
				}
				}
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(843);
			match(FOR);
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(844);
				match(NEWLINE);
				}
				}
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(850);
			match(IDENTIFIER);
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(851);
				match(NEWLINE);
				}
				}
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(857);
			match(IN);
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(858);
				match(NEWLINE);
				}
				}
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(864);
			expression(0);
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(865);
				match(NEWLINE);
				}
				}
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(871);
			match(COLON);
			setState(875);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(872);
					match(NEWLINE);
					}
					} 
				}
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(878);
			stmtOrSuite();
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
	public static class MatchStmtContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(GDScriptParser.MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(GDScriptParser.INDENT, 0); }
		public MatchBlockContext matchBlock() {
			return getRuleContext(MatchBlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(GDScriptParser.DEDENT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public MatchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterMatchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitMatchStmt(this);
		}
	}

	public final MatchStmtContext matchStmt() throws RecognitionException {
		MatchStmtContext _localctx = new MatchStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_matchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(880);
				match(NEWLINE);
				}
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(886);
			match(MATCH);
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(887);
				match(NEWLINE);
				}
				}
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(893);
			expression(0);
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(894);
				match(NEWLINE);
				}
				}
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(900);
			match(COLON);
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(901);
				match(NEWLINE);
				}
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(907);
			match(INDENT);
			setState(908);
			matchBlock();
			setState(909);
			match(DEDENT);
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
	public static class MatchBlockContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(GDScriptParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GDScriptParser.COLON, i);
		}
		public List<StmtOrSuiteContext> stmtOrSuite() {
			return getRuleContexts(StmtOrSuiteContext.class);
		}
		public StmtOrSuiteContext stmtOrSuite(int i) {
			return getRuleContext(StmtOrSuiteContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public MatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterMatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitMatchBlock(this);
		}
	}

	public final MatchBlockContext matchBlock() throws RecognitionException {
		MatchBlockContext _localctx = new MatchBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_matchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(927); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(911);
					match(NEWLINE);
					}
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(917);
				pattern();
				setState(918);
				match(COLON);
				setState(922);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(919);
						match(NEWLINE);
						}
						} 
					}
					setState(924);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				setState(925);
				stmtOrSuite();
				}
				}
				setState(929); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 8936830510563392L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 25L) != 0 );
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
	public static class PatternListContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GDScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GDScriptParser.COMMA, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public PatternListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterPatternList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitPatternList(this);
		}
	}

	public final PatternListContext patternList() throws RecognitionException {
		PatternListContext _localctx = new PatternListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_patternList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			pattern();
			setState(942);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(932);
						match(NEWLINE);
						}
						}
						setState(937);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(938);
					match(COMMA);
					setState(939);
					pattern();
					}
					} 
				}
				setState(944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(945);
				match(NEWLINE);
				}
				}
				setState(950);
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
	public static class PatternContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode BUILTINTYPE() { return getToken(GDScriptParser.BUILTINTYPE, 0); }
		public TerminalNode CONSTANT() { return getToken(GDScriptParser.CONSTANT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(GDScriptParser.UNDERSCORE, 0); }
		public BindingPatternContext bindingPattern() {
			return getRuleContext(BindingPatternContext.class,0);
		}
		public ArrayPatternContext arrayPattern() {
			return getRuleContext(ArrayPatternContext.class,0);
		}
		public DictPatternContext dictPattern() {
			return getRuleContext(DictPatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_pattern);
		try {
			setState(958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				match(BUILTINTYPE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(953);
				match(CONSTANT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(954);
				match(UNDERSCORE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(955);
				bindingPattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(956);
				arrayPattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(957);
				dictPattern();
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
	public static class BindingPatternContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GDScriptParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public BindingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterBindingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitBindingPattern(this);
		}
	}

	public final BindingPatternContext bindingPattern() throws RecognitionException {
		BindingPatternContext _localctx = new BindingPatternContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bindingPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(VAR);
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(961);
				match(NEWLINE);
				}
				}
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(967);
			match(IDENTIFIER);
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
	public static class ArrayPatternContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACK() { return getToken(GDScriptParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(GDScriptParser.CLOSE_BRACK, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GDScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GDScriptParser.COMMA, i);
		}
		public TerminalNode DOTDOT() { return getToken(GDScriptParser.DOTDOT, 0); }
		public ArrayPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterArrayPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitArrayPattern(this);
		}
	}

	public final ArrayPatternContext arrayPattern() throws RecognitionException {
		ArrayPatternContext _localctx = new ArrayPatternContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(OPEN_BRACK);
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8866461766385728L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 25L) != 0) {
				{
				setState(970);
				pattern();
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(971);
					match(COMMA);
					setState(972);
					pattern();
					}
					}
					setState(977);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOTDOT) {
					{
					setState(978);
					match(DOTDOT);
					}
				}

				}
			}

			setState(983);
			match(CLOSE_BRACK);
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
	public static class DictPatternContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(GDScriptParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(GDScriptParser.CLOSE_BRACE, 0); }
		public List<KeyValuePatternContext> keyValuePattern() {
			return getRuleContexts(KeyValuePatternContext.class);
		}
		public KeyValuePatternContext keyValuePattern(int i) {
			return getRuleContext(KeyValuePatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GDScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GDScriptParser.COMMA, i);
		}
		public TerminalNode DOTDOT() { return getToken(GDScriptParser.DOTDOT, 0); }
		public DictPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterDictPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitDictPattern(this);
		}
	}

	public final DictPatternContext dictPattern() throws RecognitionException {
		DictPatternContext _localctx = new DictPatternContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dictPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(OPEN_BRACE);
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(986);
				keyValuePattern();
				}
			}

			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(989);
				match(COMMA);
				setState(990);
				keyValuePattern();
				}
				}
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(996);
				match(DOTDOT);
				}
			}

			setState(999);
			match(CLOSE_BRACE);
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
	public static class KeyValuePatternContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GDScriptParser.STRING, 0); }
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public KeyValuePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValuePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterKeyValuePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitKeyValuePattern(this);
		}
	}

	public final KeyValuePatternContext keyValuePattern() throws RecognitionException {
		KeyValuePatternContext _localctx = new KeyValuePatternContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_keyValuePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(STRING);
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1002);
				match(COLON);
				setState(1003);
				pattern();
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
	public static class FlowStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(GDScriptParser.CONTINUE, 0); }
		public StmtEndContext stmtEnd() {
			return getRuleContext(StmtEndContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public TerminalNode BREAK() { return getToken(GDScriptParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(GDScriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FlowStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flowStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterFlowStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitFlowStmt(this);
		}
	}

	public final FlowStmtContext flowStmt() throws RecognitionException {
		FlowStmtContext _localctx = new FlowStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_flowStmt);
		try {
			int _alt;
			setState(1033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1006);
				match(CONTINUE);
				setState(1010);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1007);
						match(NEWLINE);
						}
						} 
					}
					setState(1012);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				}
				setState(1013);
				stmtEnd();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				match(BREAK);
				setState(1018);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1015);
						match(NEWLINE);
						}
						} 
					}
					setState(1020);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				}
				setState(1021);
				stmtEnd();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1022);
				match(RETURN);
				setState(1026);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1023);
						match(NEWLINE);
						}
						} 
					}
					setState(1028);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				}
				setState(1030);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1029);
					expression(0);
					}
					break;
				}
				setState(1032);
				stmtEnd();
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
	public static class AssignmentStmtContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StmtEndContext stmtEnd() {
			return getRuleContext(StmtEndContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GDScriptParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(GDScriptParser.ADD_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(GDScriptParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(GDScriptParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(GDScriptParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(GDScriptParser.MOD_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(GDScriptParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(GDScriptParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(GDScriptParser.XOR_ASSIGN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitAssignmentStmt(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assignmentStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			expression(0);
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1036);
				match(NEWLINE);
				}
				}
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1042);
			_la = _input.LA(1);
			if ( !((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1021L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1043);
				match(NEWLINE);
				}
				}
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1049);
			expression(0);
			setState(1050);
			stmtEnd();
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
	public static class VarDeclStmtContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GDScriptParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public StmtEndContext stmtEnd() {
			return getRuleContext(StmtEndContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public TerminalNode COLON_ASSIGN() { return getToken(GDScriptParser.COLON_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public TerminalNode ASSIGN() { return getToken(GDScriptParser.ASSIGN, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public VarDeclStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterVarDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitVarDeclStmt(this);
		}
	}

	public final VarDeclStmtContext varDeclStmt() throws RecognitionException {
		VarDeclStmtContext _localctx = new VarDeclStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_varDeclStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1052);
				match(NEWLINE);
				}
				}
				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1058);
			match(VAR);
			setState(1062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1059);
				match(NEWLINE);
				}
				}
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1065);
			match(IDENTIFIER);
			setState(1069);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1066);
					match(NEWLINE);
					}
					} 
				}
				setState(1071);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			setState(1129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1086);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1075);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(1072);
						match(NEWLINE);
						}
						}
						setState(1077);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1078);
					match(COLON);
					setState(1082);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(1079);
						match(NEWLINE);
						}
						}
						setState(1084);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1085);
					typeHint();
					}
					break;
				}
				setState(1102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1091);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(1088);
						match(NEWLINE);
						}
						}
						setState(1093);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1094);
					match(ASSIGN);
					setState(1098);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(1095);
						match(NEWLINE);
						}
						}
						setState(1100);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1101);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1127);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLON_ASSIGN:
					{
					setState(1104);
					match(COLON_ASSIGN);
					setState(1108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(1105);
						match(NEWLINE);
						}
						}
						setState(1110);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1111);
					expression(0);
					}
					break;
				case COLON:
					{
					setState(1112);
					match(COLON);
					setState(1116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(1113);
						match(NEWLINE);
						}
						}
						setState(1118);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1119);
					match(ASSIGN);
					setState(1123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(1120);
						match(NEWLINE);
						}
						}
						setState(1125);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1126);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(1134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1131);
					match(NEWLINE);
					}
					} 
				}
				setState(1136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			setState(1137);
			stmtEnd();
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
	public static class AssertStmtContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(GDScriptParser.ASSERT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public StmtEndContext stmtEnd() {
			return getRuleContext(StmtEndContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public TerminalNode COMMA() { return getToken(GDScriptParser.COMMA, 0); }
		public TerminalNode STRING() { return getToken(GDScriptParser.STRING, 0); }
		public AssertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterAssertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitAssertStmt(this);
		}
	}

	public final AssertStmtContext assertStmt() throws RecognitionException {
		AssertStmtContext _localctx = new AssertStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(ASSERT);
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1140);
				match(NEWLINE);
				}
			}

			setState(1143);
			match(OPEN_PAREN);
			setState(1144);
			expression(0);
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1145);
				match(COMMA);
				setState(1146);
				match(STRING);
				}
			}

			setState(1149);
			match(CLOSE_PAREN);
			setState(1150);
			stmtEnd();
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
	public static class YieldStmtContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(GDScriptParser.YIELD, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(GDScriptParser.COMMA, 0); }
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public YieldStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterYieldStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitYieldStmt(this);
		}
	}

	public final YieldStmtContext yieldStmt() throws RecognitionException {
		YieldStmtContext _localctx = new YieldStmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_yieldStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(YIELD);
			setState(1154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1153);
				match(NEWLINE);
				}
			}

			setState(1156);
			match(OPEN_PAREN);
			{
			setState(1157);
			expression(0);
			setState(1158);
			match(COMMA);
			setState(1159);
			expression(0);
			}
			setState(1161);
			match(CLOSE_PAREN);
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
	public static class PreloadStmtContext extends ParserRuleContext {
		public TerminalNode PRELOAD() { return getToken(GDScriptParser.PRELOAD, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public TerminalNode CONSTANT() { return getToken(GDScriptParser.CONSTANT, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public PreloadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preloadStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterPreloadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitPreloadStmt(this);
		}
	}

	public final PreloadStmtContext preloadStmt() throws RecognitionException {
		PreloadStmtContext _localctx = new PreloadStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_preloadStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			match(PRELOAD);
			setState(1165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1164);
				match(NEWLINE);
				}
			}

			setState(1167);
			match(OPEN_PAREN);
			setState(1168);
			match(CONSTANT);
			setState(1169);
			match(CLOSE_PAREN);
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
	public static class ExprStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtEndContext stmtEnd() {
			return getRuleContext(StmtEndContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitExprStmt(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exprStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1171);
				match(NEWLINE);
				}
				}
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1177);
			expression(0);
			setState(1181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1178);
					match(NEWLINE);
					}
					} 
				}
				setState(1183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			}
			setState(1184);
			stmtEnd();
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
	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(GDScriptParser.MINUS, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitMinus(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitShiftContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LEFT_SHIFT() { return getToken(GDScriptParser.LEFT_SHIFT, 0); }
		public TerminalNode RIGHT_SHIFT() { return getToken(GDScriptParser.RIGHT_SHIFT, 0); }
		public BitShiftContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterBitShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitBitShift(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(GDScriptParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(GDScriptParser.GREATER_THAN, 0); }
		public TerminalNode LT_EQ() { return getToken(GDScriptParser.LT_EQ, 0); }
		public TerminalNode GT_EQ() { return getToken(GDScriptParser.GT_EQ, 0); }
		public TerminalNode EQUALS() { return getToken(GDScriptParser.EQUALS, 0); }
		public TerminalNode NOT_EQ() { return getToken(GDScriptParser.NOT_EQ, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public ComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitComparison(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(GDScriptParser.IN, 0); }
		public InContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitIn(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR_OP() { return getToken(GDScriptParser.OR_OP, 0); }
		public BitOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterBitOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitBitOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(GDScriptParser.OR, 0); }
		public TerminalNode LOGIC_OR() { return getToken(GDScriptParser.LOGIC_OR, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public LogicOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterLogicOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitLogicOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SignContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(GDScriptParser.MINUS, 0); }
		public TerminalNode ADD() { return getToken(GDScriptParser.ADD, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public SignContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitSign(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclContext extends ExpressionContext {
		public TerminalNode OPEN_BRACK() { return getToken(GDScriptParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(GDScriptParser.CLOSE_BRACK, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GDScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GDScriptParser.COMMA, i);
		}
		public ArrayDeclContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitArrayDecl(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(GDScriptParser.IS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public TerminalNode BUILTINTYPE() { return getToken(GDScriptParser.BUILTINTYPE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public IsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitIs(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPEN_BRACK() { return getToken(GDScriptParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(GDScriptParser.CLOSE_BRACK, 0); }
		public SubscriptionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterSubscription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitSubscription(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(GDScriptParser.ADD, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public PlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitPlus(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ExpressionContext {
		public TerminalNode DOT() { return getToken(GDScriptParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitCall(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(GDScriptParser.AS, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public CastContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitCast(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND_OP() { return getToken(GDScriptParser.AND_OP, 0); }
		public BitAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterBitAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitBitAnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(GDScriptParser.AND, 0); }
		public TerminalNode LOGIC_AND() { return getToken(GDScriptParser.LOGIC_AND, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public LogicAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterLogicAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitLogicAnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernacyExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IF() { return getToken(GDScriptParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(GDScriptParser.ELSE, 0); }
		public TernacyExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterTernacyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitTernacyExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictDeclContext extends ExpressionContext {
		public TerminalNode OPEN_BRACE() { return getToken(GDScriptParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(GDScriptParser.CLOSE_BRACE, 0); }
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GDScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GDScriptParser.COMMA, i);
		}
		public DictDeclContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterDictDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitDictDecl(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitXorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode XOR() { return getToken(GDScriptParser.XOR, 0); }
		public BitXorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterBitXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitBitXor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetNodeContext extends ExpressionContext {
		public TerminalNode DOLLAR() { return getToken(GDScriptParser.DOLLAR, 0); }
		public TerminalNode STRING() { return getToken(GDScriptParser.STRING, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GDScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GDScriptParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DIV() { return getTokens(GDScriptParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(GDScriptParser.DIV, i);
		}
		public GetNodeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterGetNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitGetNode(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GDScriptParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public AttributeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitAttribute(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(GDScriptParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(GDScriptParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GDScriptParser.MOD, 0); }
		public FactorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitFactor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitNotContext extends ExpressionContext {
		public TerminalNode NOT_OP() { return getToken(GDScriptParser.NOT_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BitNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterBitNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitBitNot(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicNotContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LOGIC_NOT() { return getToken(GDScriptParser.LOGIC_NOT, 0); }
		public TerminalNode NOT() { return getToken(GDScriptParser.NOT, 0); }
		public LogicNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterLogicNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitLogicNot(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(GDScriptParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GDScriptParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(GDScriptParser.NULL, 0); }
		public TerminalNode SELF() { return getToken(GDScriptParser.SELF, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public PrimaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitPrimary(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1187);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1188);
				match(FALSE);
				}
				break;
			case NULL:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1189);
				match(NULL);
				}
				break;
			case SELF:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1190);
				match(SELF);
				}
				break;
			case IDENTIFIER:
			case BUILTINTYPE:
			case CONSTANT:
			case STRING:
			case INTEGER:
			case FLOAT:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1191);
				literal();
				}
				break;
			case OPEN_BRACK:
				{
				_localctx = new ArrayDeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1192);
				match(OPEN_BRACK);
				setState(1196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1193);
						match(NEWLINE);
						}
						} 
					}
					setState(1198);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				}
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709245L) != 0) {
					{
					setState(1199);
					expression(0);
					setState(1210);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1200);
							match(COMMA);
							setState(1204);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NEWLINE) {
								{
								{
								setState(1201);
								match(NEWLINE);
								}
								}
								setState(1206);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1207);
							expression(0);
							}
							} 
						}
						setState(1212);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
					}
					setState(1214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1213);
						match(COMMA);
						}
					}

					}
				}

				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1218);
					match(NEWLINE);
					}
					}
					setState(1223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1224);
				match(CLOSE_BRACK);
				}
				break;
			case OPEN_BRACE:
				{
				_localctx = new DictDeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1225);
				match(OPEN_BRACE);
				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709245L) != 0) {
					{
					setState(1226);
					keyValue();
					setState(1231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1227);
							match(COMMA);
							setState(1228);
							keyValue();
							}
							} 
						}
						setState(1233);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
					}
					setState(1235);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1234);
						match(COMMA);
						}
					}

					}
				}

				setState(1239);
				match(CLOSE_BRACE);
				}
				break;
			case OPEN_PAREN:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1240);
				match(OPEN_PAREN);
				setState(1241);
				expression(0);
				setState(1242);
				match(CLOSE_PAREN);
				}
				break;
			case DOT:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1244);
				match(DOT);
				setState(1248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1245);
					match(NEWLINE);
					}
					}
					setState(1250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1251);
				match(IDENTIFIER);
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1252);
					match(NEWLINE);
					}
					}
					setState(1257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1258);
				match(OPEN_PAREN);
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709373L) != 0) {
					{
					setState(1259);
					argList();
					}
				}

				setState(1262);
				match(CLOSE_PAREN);
				}
				break;
			case DOLLAR:
				{
				_localctx = new GetNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1263);
				match(DOLLAR);
				setState(1273);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(1264);
					match(STRING);
					}
					break;
				case IDENTIFIER:
					{
					setState(1265);
					match(IDENTIFIER);
					setState(1270);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1266);
							match(DIV);
							setState(1267);
							match(IDENTIFIER);
							}
							} 
						}
						setState(1272);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NOT_OP:
				{
				_localctx = new BitNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1275);
				match(NOT_OP);
				setState(1276);
				expression(16);
				}
				break;
			case ADD:
			case MINUS:
				{
				_localctx = new SignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1277);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1278);
					match(NEWLINE);
					}
					}
					setState(1283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1284);
				expression(15);
				}
				break;
			case NOT:
			case LOGIC_NOT:
				{
				_localctx = new LogicNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1285);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==LOGIC_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1286);
				expression(5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1432);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1289);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1290);
						_la = _input.LA(1);
						if ( !((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 7L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1291);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1292);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1296);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1293);
							match(NEWLINE);
							}
							}
							setState(1298);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1299);
						match(ADD);
						setState(1303);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1300);
							match(NEWLINE);
							}
							}
							setState(1305);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1306);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1307);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1311);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1308);
							match(NEWLINE);
							}
							}
							setState(1313);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1314);
						match(MINUS);
						setState(1318);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1315);
							match(NEWLINE);
							}
							}
							setState(1320);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1321);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new BitShiftContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1322);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1323);
						_la = _input.LA(1);
						if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1324);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new BitAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1325);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1326);
						match(AND_OP);
						setState(1327);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new BitXorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1328);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1329);
						match(XOR);
						setState(1330);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new BitOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1331);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1332);
						match(OR_OP);
						setState(1333);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1334);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1336);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1335);
							match(NEWLINE);
							}
						}

						setState(1338);
						_la = _input.LA(1);
						if ( !((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 63L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1340);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1339);
							match(NEWLINE);
							}
						}

						setState(1342);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new InContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1343);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1344);
						match(IN);
						setState(1345);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new LogicAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1346);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1350);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1347);
							match(NEWLINE);
							}
							}
							setState(1352);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1353);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==LOGIC_AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1357);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1354);
							match(NEWLINE);
							}
							}
							setState(1359);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1360);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new LogicOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1361);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1365);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1362);
							match(NEWLINE);
							}
							}
							setState(1367);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1368);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==LOGIC_OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1372);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1369);
							match(NEWLINE);
							}
							}
							setState(1374);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1375);
						expression(4);
						}
						break;
					case 12:
						{
						_localctx = new TernacyExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1376);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1377);
						match(IF);
						setState(1378);
						expression(0);
						setState(1379);
						match(ELSE);
						setState(1380);
						expression(3);
						}
						break;
					case 13:
						{
						_localctx = new SubscriptionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1382);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1383);
						match(OPEN_BRACK);
						setState(1384);
						expression(0);
						setState(1385);
						match(CLOSE_BRACK);
						}
						break;
					case 14:
						{
						_localctx = new AttributeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1387);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1391);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1388);
							match(NEWLINE);
							}
							}
							setState(1393);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1394);
						match(DOT);
						setState(1398);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1395);
							match(NEWLINE);
							}
							}
							setState(1400);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1401);
						match(IDENTIFIER);
						}
						break;
					case 15:
						{
						_localctx = new CallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1402);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1406);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1403);
							match(NEWLINE);
							}
							}
							setState(1408);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1409);
						match(OPEN_PAREN);
						setState(1411);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709373L) != 0) {
							{
							setState(1410);
							argList();
							}
						}

						setState(1413);
						match(CLOSE_PAREN);
						}
						break;
					case 16:
						{
						_localctx = new IsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1414);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1418);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1415);
							match(NEWLINE);
							}
							}
							setState(1420);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1421);
						match(IS);
						setState(1425);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(1422);
							match(NEWLINE);
							}
							}
							setState(1427);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1428);
						_la = _input.LA(1);
						if ( !(_la==IDENTIFIER || _la==BUILTINTYPE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 17:
						{
						_localctx = new CastContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1429);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1430);
						match(AS);
						setState(1431);
						typeHint();
						}
						break;
					}
					} 
				}
				setState(1436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GDScriptParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(GDScriptParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(GDScriptParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public TerminalNode BUILTINTYPE() { return getToken(GDScriptParser.BUILTINTYPE, 0); }
		public TerminalNode CONSTANT() { return getToken(GDScriptParser.CONSTANT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8866461766385664L) != 0) ) {
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
	public static class KeyValueContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(GDScriptParser.ASSIGN, 0); }
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitKeyValue(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_keyValue);
		try {
			setState(1446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439);
				expression(0);
				setState(1440);
				match(COLON);
				setState(1441);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
				match(IDENTIFIER);
				setState(1444);
				match(ASSIGN);
				setState(1445);
				expression(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 41:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 22);
		case 13:
			return precpred(_ctx, 21);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 17);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001a\u05a9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0001\u0000"+
		"\u0005\u0000[\b\u0000\n\u0000\f\u0000^\t\u0000\u0001\u0000\u0005\u0000"+
		"a\b\u0000\n\u0000\f\u0000d\t\u0000\u0001\u0000\u0005\u0000g\b\u0000\n"+
		"\u0000\f\u0000j\t\u0000\u0001\u0000\u0005\u0000m\b\u0000\n\u0000\f\u0000"+
		"p\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001u\b\u0001\n\u0001"+
		"\f\u0001x\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001|\b\u0001\n\u0001"+
		"\f\u0001\u007f\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0084\b\u0001\u0001\u0002\u0003\u0002\u0087\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u008b\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0090\b\u0002\u0001\u0002\u0003\u0002\u0093\b\u0002\u0001\u0002"+
		"\u0005\u0002\u0096\b\u0002\n\u0002\f\u0002\u0099\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00a3\b\u0003\u0001\u0004\u0005\u0004\u00a6\b\u0004"+
		"\n\u0004\f\u0004\u00a9\t\u0004\u0001\u0004\u0003\u0004\u00ac\b\u0004\u0001"+
		"\u0004\u0003\u0004\u00af\b\u0004\u0001\u0004\u0005\u0004\u00b2\b\u0004"+
		"\n\u0004\f\u0004\u00b5\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00b9"+
		"\b\u0004\n\u0004\f\u0004\u00bc\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00c0\b\u0004\n\u0004\f\u0004\u00c3\t\u0004\u0001\u0004\u0005\u0004\u00c6"+
		"\b\u0004\n\u0004\f\u0004\u00c9\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00cd\b\u0004\n\u0004\f\u0004\u00d0\t\u0004\u0001\u0004\u0003\u0004\u00d3"+
		"\b\u0004\u0001\u0004\u0005\u0004\u00d6\b\u0004\n\u0004\f\u0004\u00d9\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00dd\b\u0004\n\u0004\f\u0004"+
		"\u00e0\t\u0004\u0001\u0004\u0003\u0004\u00e3\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u00e7\b\u0004\n\u0004\f\u0004\u00ea\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u00ef\b\u0004\n\u0004\f\u0004\u00f2"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00f6\b\u0004\n\u0004\f\u0004"+
		"\u00f9\t\u0004\u0001\u0004\u0003\u0004\u00fc\b\u0004\u0003\u0004\u00fe"+
		"\b\u0004\u0001\u0004\u0003\u0004\u0101\b\u0004\u0001\u0004\u0005\u0004"+
		"\u0104\b\u0004\n\u0004\f\u0004\u0107\t\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u010b\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u010f\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0117\b\u0006\n\u0006\f\u0006\u011a\t\u0006\u0003\u0006\u011c"+
		"\b\u0006\u0001\u0006\u0003\u0006\u011f\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0005\b\u0124\b\b\n\b\f\b\u0127\t\b\u0001\b\u0001\b\u0003\b\u012b"+
		"\b\b\u0001\b\u0001\b\u0005\b\u012f\b\b\n\b\f\b\u0132\t\b\u0001\b\u0001"+
		"\b\u0005\b\u0136\b\b\n\b\f\b\u0139\t\b\u0001\b\u0003\b\u013c\b\b\u0001"+
		"\b\u0005\b\u013f\b\b\n\b\f\b\u0142\t\b\u0001\b\u0001\b\u0005\b\u0146\b"+
		"\b\n\b\f\b\u0149\t\b\u0001\b\u0001\b\u0005\b\u014d\b\b\n\b\f\b\u0150\t"+
		"\b\u0001\b\u0001\b\u0005\b\u0154\b\b\n\b\f\b\u0157\t\b\u0001\b\u0001\b"+
		"\u0001\b\u0005\b\u015c\b\b\n\b\f\b\u015f\t\b\u0001\b\u0001\b\u0005\b\u0163"+
		"\b\b\n\b\f\b\u0166\t\b\u0001\b\u0003\b\u0169\b\b\u0001\t\u0001\t\u0005"+
		"\t\u016d\b\t\n\t\f\t\u0170\t\t\u0001\t\u0001\t\u0003\t\u0174\b\t\u0001"+
		"\t\u0005\t\u0177\b\t\n\t\f\t\u017a\t\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0005\n\u0180\b\n\n\n\f\n\u0183\t\n\u0003\n\u0185\b\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0005\u000b\u018a\b\u000b\n\u000b\f\u000b\u018d\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0191\b\u000b\u0001\u000b\u0003\u000b\u0194"+
		"\b\u000b\u0001\u000b\u0003\u000b\u0197\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u019b\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u01a0\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01a4\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01a9\b\u000b\u0005\u000b\u01ab"+
		"\b\u000b\n\u000b\f\u000b\u01ae\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u01b2\b\u000b\u0003\u000b\u01b4\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0005\f\u01b9\b\f\n\f\f\f\u01bc\t\f\u0001\f\u0003\f\u01bf\b\f\u0001"+
		"\f\u0003\f\u01c2\b\f\u0001\f\u0001\f\u0005\f\u01c6\b\f\n\f\f\f\u01c9\t"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u01ce\b\f\u0001\f\u0001\f\u0005\f\u01d2"+
		"\b\f\n\f\f\f\u01d5\t\f\u0001\f\u0001\f\u0005\f\u01d9\b\f\n\f\f\f\u01dc"+
		"\t\f\u0001\f\u0003\f\u01df\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0005\r"+
		"\u01e5\b\r\n\r\f\r\u01e8\t\r\u0001\r\u0001\r\u0005\r\u01ec\b\r\n\r\f\r"+
		"\u01ef\t\r\u0001\r\u0001\r\u0005\r\u01f3\b\r\n\r\f\r\u01f6\t\r\u0001\r"+
		"\u0005\r\u01f9\b\r\n\r\f\r\u01fc\t\r\u0001\r\u0005\r\u01ff\b\r\n\r\f\r"+
		"\u0202\t\r\u0001\u000e\u0003\u000e\u0205\b\u000e\u0001\u000e\u0005\u000e"+
		"\u0208\b\u000e\n\u000e\f\u000e\u020b\t\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u020f\b\u000e\n\u000e\f\u000e\u0212\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0216\b\u000e\n\u000e\f\u000e\u0219\t\u000e\u0001\u000e\u0003"+
		"\u000e\u021c\b\u000e\u0001\u000e\u0005\u000e\u021f\b\u000e\n\u000e\f\u000e"+
		"\u0222\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0226\b\u000e\n\u000e"+
		"\f\u000e\u0229\t\u000e\u0001\u000e\u0003\u000e\u022c\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0003\u0010\u0231\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0235\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u023a\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0240\b\u0010\u0001\u0010\u0003\u0010\u0243\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0249\b\u0010\u0001\u0011\u0005"+
		"\u0011\u024c\b\u0011\n\u0011\f\u0011\u024f\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u0253\b\u0011\n\u0011\f\u0011\u0256\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u025a\b\u0011\n\u0011\f\u0011\u025d\t\u0011\u0001\u0011"+
		"\u0005\u0011\u0260\b\u0011\n\u0011\f\u0011\u0263\t\u0011\u0001\u0011\u0005"+
		"\u0011\u0266\b\u0011\n\u0011\f\u0011\u0269\t\u0011\u0001\u0012\u0005\u0012"+
		"\u026c\b\u0012\n\u0012\f\u0012\u026f\t\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0273\b\u0012\n\u0012\f\u0012\u0276\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u027a\b\u0012\n\u0012\f\u0012\u027d\t\u0012\u0001\u0012\u0003"+
		"\u0012\u0280\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0288\b\u0012\u0001\u0012\u0004\u0012\u028b"+
		"\b\u0012\u000b\u0012\f\u0012\u028c\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0005\u0013\u0292\b\u0013\n\u0013\f\u0013\u0295\t\u0013\u0001\u0013\u0005"+
		"\u0013\u0298\b\u0013\n\u0013\f\u0013\u029b\t\u0013\u0001\u0013\u0005\u0013"+
		"\u029e\b\u0013\n\u0013\f\u0013\u02a1\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u02a7\b\u0013\u0001\u0014\u0004\u0014\u02aa"+
		"\b\u0014\u000b\u0014\f\u0014\u02ab\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u02bd\b\u0015\u0001\u0016\u0005\u0016\u02c0\b\u0016\n\u0016"+
		"\f\u0016\u02c3\t\u0016\u0001\u0016\u0003\u0016\u02c6\b\u0016\u0001\u0017"+
		"\u0005\u0017\u02c9\b\u0017\n\u0017\f\u0017\u02cc\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u02d0\b\u0017\n\u0017\f\u0017\u02d3\t\u0017\u0001\u0017"+
		"\u0005\u0017\u02d6\b\u0017\n\u0017\f\u0017\u02d9\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u02dd\b\u0017\n\u0017\f\u0017\u02e0\t\u0017\u0001\u0017"+
		"\u0005\u0017\u02e3\b\u0017\n\u0017\f\u0017\u02e6\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u02ea\b\u0017\n\u0017\f\u0017\u02ed\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u02f1\b\u0017\n\u0017\f\u0017\u02f4\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u02f8\b\u0017\n\u0017\f\u0017\u02fb\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0300\b\u0017\n\u0017"+
		"\f\u0017\u0303\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0307\b\u0017"+
		"\n\u0017\f\u0017\u030a\t\u0017\u0001\u0017\u0005\u0017\u030d\b\u0017\n"+
		"\u0017\f\u0017\u0310\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0314"+
		"\b\u0017\n\u0017\f\u0017\u0317\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u031b\b\u0017\n\u0017\f\u0017\u031e\t\u0017\u0001\u0017\u0003\u0017\u0321"+
		"\b\u0017\u0001\u0017\u0005\u0017\u0324\b\u0017\n\u0017\f\u0017\u0327\t"+
		"\u0017\u0001\u0018\u0005\u0018\u032a\b\u0018\n\u0018\f\u0018\u032d\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u0331\b\u0018\n\u0018\f\u0018\u0334"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0338\b\u0018\n\u0018\f\u0018"+
		"\u033b\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u033f\b\u0018\n\u0018"+
		"\f\u0018\u0342\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0005\u0019"+
		"\u0347\b\u0019\n\u0019\f\u0019\u034a\t\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u034e\b\u0019\n\u0019\f\u0019\u0351\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u0355\b\u0019\n\u0019\f\u0019\u0358\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u035c\b\u0019\n\u0019\f\u0019\u035f\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0363\b\u0019\n\u0019\f\u0019\u0366\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u036a\b\u0019\n\u0019\f\u0019\u036d\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0005\u001a\u0372\b\u001a\n\u001a"+
		"\f\u001a\u0375\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0379\b\u001a"+
		"\n\u001a\f\u001a\u037c\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0380"+
		"\b\u001a\n\u001a\f\u001a\u0383\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u0387\b\u001a\n\u001a\f\u001a\u038a\t\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0005\u001b\u0391\b\u001b\n\u001b\f\u001b"+
		"\u0394\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0399\b"+
		"\u001b\n\u001b\f\u001b\u039c\t\u001b\u0001\u001b\u0001\u001b\u0004\u001b"+
		"\u03a0\b\u001b\u000b\u001b\f\u001b\u03a1\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u03a6\b\u001c\n\u001c\f\u001c\u03a9\t\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u03ad\b\u001c\n\u001c\f\u001c\u03b0\t\u001c\u0001\u001c\u0005"+
		"\u001c\u03b3\b\u001c\n\u001c\f\u001c\u03b6\t\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u03bf\b\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u03c3\b\u001e\n\u001e"+
		"\f\u001e\u03c6\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u03ce\b\u001f\n\u001f\f\u001f\u03d1"+
		"\t\u001f\u0001\u001f\u0003\u001f\u03d4\b\u001f\u0003\u001f\u03d6\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 \u03dc\b \u0001 \u0001 \u0005"+
		" \u03e0\b \n \f \u03e3\t \u0001 \u0003 \u03e6\b \u0001 \u0001 \u0001!"+
		"\u0001!\u0001!\u0003!\u03ed\b!\u0001\"\u0001\"\u0005\"\u03f1\b\"\n\"\f"+
		"\"\u03f4\t\"\u0001\"\u0001\"\u0001\"\u0005\"\u03f9\b\"\n\"\f\"\u03fc\t"+
		"\"\u0001\"\u0001\"\u0001\"\u0005\"\u0401\b\"\n\"\f\"\u0404\t\"\u0001\""+
		"\u0003\"\u0407\b\"\u0001\"\u0003\"\u040a\b\"\u0001#\u0001#\u0005#\u040e"+
		"\b#\n#\f#\u0411\t#\u0001#\u0001#\u0005#\u0415\b#\n#\f#\u0418\t#\u0001"+
		"#\u0001#\u0001#\u0001$\u0005$\u041e\b$\n$\f$\u0421\t$\u0001$\u0001$\u0005"+
		"$\u0425\b$\n$\f$\u0428\t$\u0001$\u0001$\u0005$\u042c\b$\n$\f$\u042f\t"+
		"$\u0001$\u0005$\u0432\b$\n$\f$\u0435\t$\u0001$\u0001$\u0005$\u0439\b$"+
		"\n$\f$\u043c\t$\u0001$\u0003$\u043f\b$\u0001$\u0005$\u0442\b$\n$\f$\u0445"+
		"\t$\u0001$\u0001$\u0005$\u0449\b$\n$\f$\u044c\t$\u0001$\u0003$\u044f\b"+
		"$\u0001$\u0001$\u0005$\u0453\b$\n$\f$\u0456\t$\u0001$\u0001$\u0001$\u0005"+
		"$\u045b\b$\n$\f$\u045e\t$\u0001$\u0001$\u0005$\u0462\b$\n$\f$\u0465\t"+
		"$\u0001$\u0003$\u0468\b$\u0003$\u046a\b$\u0001$\u0005$\u046d\b$\n$\f$"+
		"\u0470\t$\u0001$\u0001$\u0001%\u0001%\u0003%\u0476\b%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u047c\b%\u0001%\u0001%\u0001%\u0001&\u0001&\u0003&\u0483"+
		"\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0003"+
		"\'\u048e\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0005(\u0495\b(\n"+
		"(\f(\u0498\t(\u0001(\u0001(\u0005(\u049c\b(\n(\f(\u049f\t(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u04ab"+
		"\b)\n)\f)\u04ae\t)\u0001)\u0001)\u0001)\u0005)\u04b3\b)\n)\f)\u04b6\t"+
		")\u0001)\u0005)\u04b9\b)\n)\f)\u04bc\t)\u0001)\u0003)\u04bf\b)\u0003)"+
		"\u04c1\b)\u0001)\u0005)\u04c4\b)\n)\f)\u04c7\t)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0005)\u04ce\b)\n)\f)\u04d1\t)\u0001)\u0003)\u04d4\b)\u0003)"+
		"\u04d6\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u04df"+
		"\b)\n)\f)\u04e2\t)\u0001)\u0001)\u0005)\u04e6\b)\n)\f)\u04e9\t)\u0001"+
		")\u0001)\u0003)\u04ed\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u04f5\b)\n)\f)\u04f8\t)\u0003)\u04fa\b)\u0001)\u0001)\u0001)\u0001)"+
		"\u0005)\u0500\b)\n)\f)\u0503\t)\u0001)\u0001)\u0001)\u0003)\u0508\b)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0005)\u050f\b)\n)\f)\u0512\t)\u0001)\u0001"+
		")\u0005)\u0516\b)\n)\f)\u0519\t)\u0001)\u0001)\u0001)\u0005)\u051e\b)"+
		"\n)\f)\u0521\t)\u0001)\u0001)\u0005)\u0525\b)\n)\f)\u0528\t)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u0539\b)\u0001)\u0001)\u0003)\u053d\b)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u0545\b)\n)\f)\u0548\t)\u0001"+
		")\u0001)\u0005)\u054c\b)\n)\f)\u054f\t)\u0001)\u0001)\u0001)\u0005)\u0554"+
		"\b)\n)\f)\u0557\t)\u0001)\u0001)\u0005)\u055b\b)\n)\f)\u055e\t)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u056e\b)\n)\f)\u0571\t)\u0001)\u0001)\u0005"+
		")\u0575\b)\n)\f)\u0578\t)\u0001)\u0001)\u0001)\u0005)\u057d\b)\n)\f)\u0580"+
		"\t)\u0001)\u0001)\u0003)\u0584\b)\u0001)\u0001)\u0001)\u0005)\u0589\b"+
		")\n)\f)\u058c\t)\u0001)\u0001)\u0005)\u0590\b)\n)\f)\u0593\t)\u0001)\u0001"+
		")\u0001)\u0001)\u0005)\u0599\b)\n)\f)\u059c\t)\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u05a7\b+\u0001+\u0000\u0001"+
		"R,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTV\u0000\f\u0002\u0000//22\u0001"+
		"\u0000/0\u0001\u0000\u000e\u0013\u0002\u000088:A\u0001\u0000Z[\u0002\u0000"+
		"\'\'NN\u0001\u0000\\^\u0001\u0000XY\u0001\u0000OT\u0002\u0000&&MM\u0002"+
		"\u0000%%LL\u0001\u0000/4\u068a\u0000b\u0001\u0000\u0000\u0000\u0002v\u0001"+
		"\u0000\u0000\u0000\u0004\u0086\u0001\u0000\u0000\u0000\u0006\u00a2\u0001"+
		"\u0000\u0000\u0000\b\u00a7\u0001\u0000\u0000\u0000\n\u0108\u0001\u0000"+
		"\u0000\u0000\f\u0110\u0001\u0000\u0000\u0000\u000e\u0120\u0001\u0000\u0000"+
		"\u0000\u0010\u0125\u0001\u0000\u0000\u0000\u0012\u016a\u0001\u0000\u0000"+
		"\u0000\u0014\u017b\u0001\u0000\u0000\u0000\u0016\u018b\u0001\u0000\u0000"+
		"\u0000\u0018\u01ba\u0001\u0000\u0000\u0000\u001a\u01e6\u0001\u0000\u0000"+
		"\u0000\u001c\u0204\u0001\u0000\u0000\u0000\u001e\u022d\u0001\u0000\u0000"+
		"\u0000 \u0230\u0001\u0000\u0000\u0000\"\u024d\u0001\u0000\u0000\u0000"+
		"$\u026d\u0001\u0000\u0000\u0000&\u02a6\u0001\u0000\u0000\u0000(\u02a9"+
		"\u0001\u0000\u0000\u0000*\u02bc\u0001\u0000\u0000\u0000,\u02c5\u0001\u0000"+
		"\u0000\u0000.\u02ca\u0001\u0000\u0000\u00000\u032b\u0001\u0000\u0000\u0000"+
		"2\u0348\u0001\u0000\u0000\u00004\u0373\u0001\u0000\u0000\u00006\u039f"+
		"\u0001\u0000\u0000\u00008\u03a3\u0001\u0000\u0000\u0000:\u03be\u0001\u0000"+
		"\u0000\u0000<\u03c0\u0001\u0000\u0000\u0000>\u03c9\u0001\u0000\u0000\u0000"+
		"@\u03d9\u0001\u0000\u0000\u0000B\u03e9\u0001\u0000\u0000\u0000D\u0409"+
		"\u0001\u0000\u0000\u0000F\u040b\u0001\u0000\u0000\u0000H\u041f\u0001\u0000"+
		"\u0000\u0000J\u0473\u0001\u0000\u0000\u0000L\u0480\u0001\u0000\u0000\u0000"+
		"N\u048b\u0001\u0000\u0000\u0000P\u0496\u0001\u0000\u0000\u0000R\u0507"+
		"\u0001\u0000\u0000\u0000T\u059d\u0001\u0000\u0000\u0000V\u05a6\u0001\u0000"+
		"\u0000\u0000X\\\u0003\u0002\u0001\u0000Y[\u0005.\u0000\u0000ZY\u0001\u0000"+
		"\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]a\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"_a\u0003\u0004\u0002\u0000`X\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000"+
		"\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ch\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000eg\u0003"+
		"\u0006\u0003\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000in\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000km\u0005.\u0000\u0000lk\u0001\u0000\u0000"+
		"\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005"+
		"\u0000\u0000\u0001r\u0001\u0001\u0000\u0000\u0000su\u0005.\u0000\u0000"+
		"ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000y}\u0005\u0003\u0000\u0000z|\u0005.\u0000\u0000{z\u0001\u0000"+
		"\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0083\u0007\u0000\u0000\u0000\u0081\u0082\u0005"+
		"5\u0000\u0000\u0082\u0084\u0005/\u0000\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0003\u0001\u0000\u0000"+
		"\u0000\u0085\u0087\u0005.\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u008a\u0005\u0004\u0000\u0000\u0089\u008b\u0005.\u0000\u0000\u008a"+
		"\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u0092\u0005/\u0000\u0000\u008d\u008f"+
		"\u00056\u0000\u0000\u008e\u0090\u0005.\u0000\u0000\u008f\u008e\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0093\u00052\u0000\u0000\u0092\u008d\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0097\u0001\u0000\u0000"+
		"\u0000\u0094\u0096\u0005.\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0005\u0001\u0000\u0000\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u00a3\u0003\b\u0004\u0000\u009b"+
		"\u00a3\u0003\u0010\b\u0000\u009c\u00a3\u0003\u0012\t\u0000\u009d\u00a3"+
		"\u0003\u0016\u000b\u0000\u009e\u00a3\u0003\u0018\f\u0000\u009f\u00a3\u0003"+
		" \u0010\u0000\u00a0\u00a3\u0003$\u0012\u0000\u00a1\u00a3\u0005-\u0000"+
		"\u0000\u00a2\u009a\u0001\u0000\u0000\u0000\u00a2\u009b\u0001\u0000\u0000"+
		"\u0000\u00a2\u009c\u0001\u0000\u0000\u0000\u00a2\u009d\u0001\u0000\u0000"+
		"\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2\u009f\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u0007\u0001\u0000\u0000\u0000\u00a4\u00a6\u0005.\u0000\u0000"+
		"\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ac\u0005\u0005\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ad\u00af\u0003\f\u0006\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0001\u0000\u0000\u0000\u00af\u00b3\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b2\u0005.\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b6\u00ba\u0005\u0006\u0000\u0000\u00b7\u00b9"+
		"\u0005.\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bd\u00c1\u0005/\u0000\u0000\u00be\u00c0\u0005.\u0000"+
		"\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2\u00fd\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c6\u0005.\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00ce\u00057\u0000\u0000\u00cb"+
		"\u00cd\u0005.\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d3\u0003\u000e\u0007\u0000\u00d2\u00c7"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00e2"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d6\u0005.\u0000\u0000\u00d5\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00de\u0005"+
		"8\u0000\u0000\u00db\u00dd\u0005.\u0000\u0000\u00dc\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e3\u0003R)\u0000\u00e2"+
		"\u00d7\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3"+
		"\u00fe\u0001\u0000\u0000\u0000\u00e4\u00e8\u00059\u0000\u0000\u00e5\u00e7"+
		"\u0005.\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00eb\u00fc\u0003R)\u0000\u00ec\u00f0\u00057\u0000"+
		"\u0000\u00ed\u00ef\u0005.\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f7\u00058\u0000\u0000\u00f4"+
		"\u00f6\u0005.\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f7"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fc\u0003R)\u0000\u00fb\u00e4\u0001\u0000"+
		"\u0000\u0000\u00fb\u00ec\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fd\u00d2\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u0101\u0003\n\u0005"+
		"\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0105\u0001\u0000\u0000\u0000\u0102\u0104\u0005.\u0000\u0000"+
		"\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\t\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108"+
		"\u010a\u0005\u0007\u0000\u0000\u0109\u010b\u0005/\u0000\u0000\u010a\u0109"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010e"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u00056\u0000\u0000\u010d\u010f\u0005"+
		"/\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000"+
		"\u0000\u0000\u010f\u000b\u0001\u0000\u0000\u0000\u0110\u011e\u0005\b\u0000"+
		"\u0000\u0111\u011b\u0005B\u0000\u0000\u0112\u011c\u00050\u0000\u0000\u0113"+
		"\u0118\u0005/\u0000\u0000\u0114\u0115\u00056\u0000\u0000\u0115\u0117\u0003"+
		"T*\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011b\u0112\u0001\u0000\u0000\u0000\u011b\u0113\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000"+
		"\u0000\u011d\u011f\u0005C\u0000\u0000\u011e\u0111\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\r\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0007\u0001\u0000\u0000\u0121\u000f\u0001\u0000\u0000\u0000\u0122"+
		"\u0124\u0005.\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u0127"+
		"\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0128\u012a\u0005\t\u0000\u0000\u0129\u012b\u0005"+
		".\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u013b\u0005/\u0000"+
		"\u0000\u012d\u012f\u0005.\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000"+
		"\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001\u0000\u0000\u0000"+
		"\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0137\u00057\u0000\u0000\u0134"+
		"\u0136\u0005.\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0139"+
		"\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u013a\u013c\u0003\u000e\u0007\u0000\u013b\u0130"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u0168"+
		"\u0001\u0000\u0000\u0000\u013d\u013f\u0005.\u0000\u0000\u013e\u013d\u0001"+
		"\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u013e\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001"+
		"\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u0147\u0005"+
		"8\u0000\u0000\u0144\u0146\u0005.\u0000\u0000\u0145\u0144\u0001\u0000\u0000"+
		"\u0000\u0146\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014a\u0001\u0000\u0000"+
		"\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u0169\u0003R)\u0000\u014b"+
		"\u014d\u0005.\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u0150"+
		"\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0001\u0000\u0000\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0151\u0155\u00059\u0000\u0000\u0152\u0154\u0005"+
		".\u0000\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000"+
		"\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000"+
		"\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0158\u0169\u0003R)\u0000\u0159\u015d\u00057\u0000\u0000"+
		"\u015a\u015c\u0005.\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c"+
		"\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u0160\u0164\u00058\u0000\u0000\u0161\u0163"+
		"\u0005.\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0166\u0001"+
		"\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001"+
		"\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000\u0166\u0164\u0001"+
		"\u0000\u0000\u0000\u0167\u0169\u0003R)\u0000\u0168\u0140\u0001\u0000\u0000"+
		"\u0000\u0168\u014e\u0001\u0000\u0000\u0000\u0168\u0159\u0001\u0000\u0000"+
		"\u0000\u0169\u0011\u0001\u0000\u0000\u0000\u016a\u016e\u0005\n\u0000\u0000"+
		"\u016b\u016d\u0005.\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d"+
		"\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0001\u0000\u0000\u0000\u016f\u0171\u0001\u0000\u0000\u0000\u0170"+
		"\u016e\u0001\u0000\u0000\u0000\u0171\u0173\u0005/\u0000\u0000\u0172\u0174"+
		"\u0003\u0014\n\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001"+
		"\u0000\u0000\u0000\u0174\u0178\u0001\u0000\u0000\u0000\u0175\u0177\u0005"+
		".\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000"+
		"\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000"+
		"\u0000\u0000\u0179\u0013\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000"+
		"\u0000\u0000\u017b\u0184\u0005B\u0000\u0000\u017c\u0181\u0005/\u0000\u0000"+
		"\u017d\u017e\u00056\u0000\u0000\u017e\u0180\u0005/\u0000\u0000\u017f\u017d"+
		"\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0185"+
		"\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u017c"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0001\u0000\u0000\u0000\u0186\u0187\u0005C\u0000\u0000\u0187\u0015\u0001"+
		"\u0000\u0000\u0000\u0188\u018a\u0005.\u0000\u0000\u0189\u0188\u0001\u0000"+
		"\u0000\u0000\u018a\u018d\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018e\u0001\u0000"+
		"\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e\u0190\u0005\u000b"+
		"\u0000\u0000\u018f\u0191\u0005.\u0000\u0000\u0190\u018f\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0193\u0001\u0000\u0000"+
		"\u0000\u0192\u0194\u0005/\u0000\u0000\u0193\u0192\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0196\u0001\u0000\u0000\u0000"+
		"\u0195\u0197\u0005.\u0000\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198"+
		"\u019a\u0005D\u0000\u0000\u0199\u019b\u0005.\u0000\u0000\u019a\u0199\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0001"+
		"\u0000\u0000\u0000\u019c\u019f\u0005/\u0000\u0000\u019d\u019e\u00058\u0000"+
		"\u0000\u019e\u01a0\u0003R)\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a0\u01ac\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a3\u00056\u0000\u0000\u01a2\u01a4\u0005.\u0000\u0000\u01a3\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a8\u0005/\u0000\u0000\u01a6\u01a7\u00058\u0000"+
		"\u0000\u01a7\u01a9\u0003R)\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a1\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad"+
		"\u01b3\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af"+
		"\u01b1\u00056\u0000\u0000\u01b0\u01b2\u0005.\u0000\u0000\u01b1\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b3\u01af\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005"+
		"E\u0000\u0000\u01b6\u0017\u0001\u0000\u0000\u0000\u01b7\u01b9\u0005.\u0000"+
		"\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000"+
		"\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bb\u01be\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bf\u0003\u001e\u000f\u0000\u01be\u01bd\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c2\u0005\f\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c7\u0005\r\u0000\u0000\u01c4\u01c6\u0005.\u0000\u0000\u01c5"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8"+
		"\u01ca\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0005/\u0000\u0000\u01cb\u01cd\u0005B\u0000\u0000\u01cc\u01ce\u0003"+
		"\u001a\r\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01de\u0005C\u0000"+
		"\u0000\u01d0\u01d2\u0005.\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01da\u0005F\u0000\u0000\u01d7"+
		"\u01d9\u0005.\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9\u01dc"+
		"\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0001\u0000\u0000\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc\u01da"+
		"\u0001\u0000\u0000\u0000\u01dd\u01df\u0003\u000e\u0007\u0000\u01de\u01d3"+
		"\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e0\u01e1\u00057\u0000\u0000\u01e1\u01e2\u0003"+
		"&\u0013\u0000\u01e2\u0019\u0001\u0000\u0000\u0000\u01e3\u01e5\u0005.\u0000"+
		"\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e8\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e9\u01fa\u0003\u001c\u000e\u0000\u01ea\u01ec\u0005.\u0000\u0000"+
		"\u01eb\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000"+
		"\u01ee\u01f0\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f4\u00056\u0000\u0000\u01f1\u01f3\u0005.\u0000\u0000\u01f2\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f6\u0001\u0000\u0000\u0000\u01f4\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f7\u01f9"+
		"\u0003\u001c\u000e\u0000\u01f8\u01ed\u0001\u0000\u0000\u0000\u01f9\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb"+
		"\u0001\u0000\u0000\u0000\u01fb\u0200\u0001\u0000\u0000\u0000\u01fc\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fd\u01ff\u0005.\u0000\u0000\u01fe\u01fd\u0001"+
		"\u0000\u0000\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001"+
		"\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u001b\u0001"+
		"\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0203\u0205\u0005"+
		"\u0006\u0000\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0204\u0205\u0001"+
		"\u0000\u0000\u0000\u0205\u0209\u0001\u0000\u0000\u0000\u0206\u0208\u0005"+
		".\u0000\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000"+
		"\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000"+
		"\u0000\u0000\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000"+
		"\u0000\u0000\u020c\u0210\u0005/\u0000\u0000\u020d\u020f\u0005.\u0000\u0000"+
		"\u020e\u020d\u0001\u0000\u0000\u0000\u020f\u0212\u0001\u0000\u0000\u0000"+
		"\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000"+
		"\u0211\u021b\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000"+
		"\u0213\u0217\u00057\u0000\u0000\u0214\u0216\u0005.\u0000\u0000\u0215\u0214"+
		"\u0001\u0000\u0000\u0000\u0216\u0219\u0001\u0000\u0000\u0000\u0217\u0215"+
		"\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u021a"+
		"\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u021a\u021c"+
		"\u0003\u000e\u0007\u0000\u021b\u0213\u0001\u0000\u0000\u0000\u021b\u021c"+
		"\u0001\u0000\u0000\u0000\u021c\u022b\u0001\u0000\u0000\u0000\u021d\u021f"+
		"\u0005.\u0000\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021f\u0222\u0001"+
		"\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u0221\u0001"+
		"\u0000\u0000\u0000\u0221\u0223\u0001\u0000\u0000\u0000\u0222\u0220\u0001"+
		"\u0000\u0000\u0000\u0223\u0227\u00058\u0000\u0000\u0224\u0226\u0005.\u0000"+
		"\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0226\u0229\u0001\u0000\u0000"+
		"\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000"+
		"\u0000\u0228\u022a\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000"+
		"\u0000\u022a\u022c\u0003R)\u0000\u022b\u0220\u0001\u0000\u0000\u0000\u022b"+
		"\u022c\u0001\u0000\u0000\u0000\u022c\u001d\u0001\u0000\u0000\u0000\u022d"+
		"\u022e\u0007\u0002\u0000\u0000\u022e\u001f\u0001\u0000\u0000\u0000\u022f"+
		"\u0231\u0005.\u0000\u0000\u0230\u022f\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0234"+
		"\u0005\r\u0000\u0000\u0233\u0235\u0005.\u0000\u0000\u0234\u0233\u0001"+
		"\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0001"+
		"\u0000\u0000\u0000\u0236\u0237\u0005/\u0000\u0000\u0237\u0239\u0005B\u0000"+
		"\u0000\u0238\u023a\u0003\u001a\r\u0000\u0239\u0238\u0001\u0000\u0000\u0000"+
		"\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000"+
		"\u023b\u0242\u0005C\u0000\u0000\u023c\u023d\u00055\u0000\u0000\u023d\u023f"+
		"\u0005B\u0000\u0000\u023e\u0240\u0003\"\u0011\u0000\u023f\u023e\u0001"+
		"\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0241\u0001"+
		"\u0000\u0000\u0000\u0241\u0243\u0005C\u0000\u0000\u0242\u023c\u0001\u0000"+
		"\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000"+
		"\u0000\u0000\u0244\u0245\u00057\u0000\u0000\u0245\u0246\u0005.\u0000\u0000"+
		"\u0246\u0248\u0003&\u0013\u0000\u0247\u0249\u0005\u0016\u0000\u0000\u0248"+
		"\u0247\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249"+
		"!\u0001\u0000\u0000\u0000\u024a\u024c\u0005.\u0000\u0000\u024b\u024a\u0001"+
		"\u0000\u0000\u0000\u024c\u024f\u0001\u0000\u0000\u0000\u024d\u024b\u0001"+
		"\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u0250\u0001"+
		"\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250\u0261\u0003"+
		"R)\u0000\u0251\u0253\u0005.\u0000\u0000\u0252\u0251\u0001\u0000\u0000"+
		"\u0000\u0253\u0256\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000"+
		"\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0257\u0001\u0000\u0000"+
		"\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0257\u025b\u00056\u0000\u0000"+
		"\u0258\u025a\u0005.\u0000\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u025a"+
		"\u025d\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b"+
		"\u025c\u0001\u0000\u0000\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d"+
		"\u025b\u0001\u0000\u0000\u0000\u025e\u0260\u0003R)\u0000\u025f\u0254\u0001"+
		"\u0000\u0000\u0000\u0260\u0263\u0001\u0000\u0000\u0000\u0261\u025f\u0001"+
		"\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0267\u0001"+
		"\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0264\u0266\u0005"+
		".\u0000\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0266\u0269\u0001\u0000"+
		"\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000"+
		"\u0000\u0000\u0268#\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000"+
		"\u0000\u026a\u026c\u0005.\u0000\u0000\u026b\u026a\u0001\u0000\u0000\u0000"+
		"\u026c\u026f\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000\u0000\u0000"+
		"\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u0270\u0001\u0000\u0000\u0000"+
		"\u026f\u026d\u0001\u0000\u0000\u0000\u0270\u0274\u0005\u0014\u0000\u0000"+
		"\u0271\u0273\u0005.\u0000\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273"+
		"\u0276\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274"+
		"\u0275\u0001\u0000\u0000\u0000\u0275\u0277\u0001\u0000\u0000\u0000\u0276"+
		"\u0274\u0001\u0000\u0000\u0000\u0277\u027f\u0005/\u0000\u0000\u0278\u027a"+
		"\u0005.\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a\u027d\u0001"+
		"\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027c\u0001"+
		"\u0000\u0000\u0000\u027c\u027e\u0001\u0000\u0000\u0000\u027d\u027b\u0001"+
		"\u0000\u0000\u0000\u027e\u0280\u0003\u0002\u0001\u0000\u027f\u027b\u0001"+
		"\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u0281\u0001"+
		"\u0000\u0000\u0000\u0281\u0282\u00057\u0000\u0000\u0282\u0283\u0005.\u0000"+
		"\u0000\u0283\u0287\u0005\u0001\u0000\u0000\u0284\u0285\u0003\u0002\u0001"+
		"\u0000\u0285\u0286\u0005.\u0000\u0000\u0286\u0288\u0001\u0000\u0000\u0000"+
		"\u0287\u0284\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000"+
		"\u0288\u028a\u0001\u0000\u0000\u0000\u0289\u028b\u0003\u0006\u0003\u0000"+
		"\u028a\u0289\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000"+
		"\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000"+
		"\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u028f\u0005\u0002\u0000\u0000"+
		"\u028f%\u0001\u0000\u0000\u0000\u0290\u0292\u0005.\u0000\u0000\u0291\u0290"+
		"\u0001\u0000\u0000\u0000\u0292\u0295\u0001\u0000\u0000\u0000\u0293\u0291"+
		"\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0299"+
		"\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0296\u0298"+
		"\u0003*\u0015\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0298\u029b\u0001"+
		"\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299\u029a\u0001"+
		"\u0000\u0000\u0000\u029a\u02a7\u0001\u0000\u0000\u0000\u029b\u0299\u0001"+
		"\u0000\u0000\u0000\u029c\u029e\u0005.\u0000\u0000\u029d\u029c\u0001\u0000"+
		"\u0000\u0000\u029e\u02a1\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000"+
		"\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a2\u02a3\u0005\u0001"+
		"\u0000\u0000\u02a3\u02a4\u0003(\u0014\u0000\u02a4\u02a5\u0005\u0002\u0000"+
		"\u0000\u02a5\u02a7\u0001\u0000\u0000\u0000\u02a6\u0293\u0001\u0000\u0000"+
		"\u0000\u02a6\u029f\u0001\u0000\u0000\u0000\u02a7\'\u0001\u0000\u0000\u0000"+
		"\u02a8\u02aa\u0003*\u0015\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab"+
		"\u02ac\u0001\u0000\u0000\u0000\u02ac)\u0001\u0000\u0000\u0000\u02ad\u02bd"+
		"\u0003H$\u0000\u02ae\u02bd\u0003.\u0017\u0000\u02af\u02bd\u00032\u0019"+
		"\u0000\u02b0\u02bd\u00030\u0018\u0000\u02b1\u02bd\u00034\u001a\u0000\u02b2"+
		"\u02bd\u0003D\"\u0000\u02b3\u02bd\u0003F#\u0000\u02b4\u02bd\u0003P(\u0000"+
		"\u02b5\u02bd\u0003J%\u0000\u02b6\u02bd\u0003L&\u0000\u02b7\u02bd\u0003"+
		"N\'\u0000\u02b8\u02b9\u0005\u0015\u0000\u0000\u02b9\u02bd\u0003,\u0016"+
		"\u0000\u02ba\u02bb\u0005\u0016\u0000\u0000\u02bb\u02bd\u0003,\u0016\u0000"+
		"\u02bc\u02ad\u0001\u0000\u0000\u0000\u02bc\u02ae\u0001\u0000\u0000\u0000"+
		"\u02bc\u02af\u0001\u0000\u0000\u0000\u02bc\u02b0\u0001\u0000\u0000\u0000"+
		"\u02bc\u02b1\u0001\u0000\u0000\u0000\u02bc\u02b2\u0001\u0000\u0000\u0000"+
		"\u02bc\u02b3\u0001\u0000\u0000\u0000\u02bc\u02b4\u0001\u0000\u0000\u0000"+
		"\u02bc\u02b5\u0001\u0000\u0000\u0000\u02bc\u02b6\u0001\u0000\u0000\u0000"+
		"\u02bc\u02b7\u0001\u0000\u0000\u0000\u02bc\u02b8\u0001\u0000\u0000\u0000"+
		"\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bd+\u0001\u0000\u0000\u0000\u02be"+
		"\u02c0\u0005.\u0000\u0000\u02bf\u02be\u0001\u0000\u0000\u0000\u02c0\u02c3"+
		"\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c2"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c6\u0001\u0000\u0000\u0000\u02c3\u02c1"+
		"\u0001\u0000\u0000\u0000\u02c4\u02c6\u0005K\u0000\u0000\u02c5\u02c1\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c6-\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c9\u0005.\u0000\u0000\u02c8\u02c7\u0001\u0000\u0000"+
		"\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cd\u0001\u0000\u0000"+
		"\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cd\u02d1\u0005\u0017\u0000"+
		"\u0000\u02ce\u02d0\u0005.\u0000\u0000\u02cf\u02ce\u0001\u0000\u0000\u0000"+
		"\u02d0\u02d3\u0001\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000"+
		"\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d7\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d4\u02d6\u0005B\u0000\u0000\u02d5"+
		"\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d9\u0001\u0000\u0000\u0000\u02d7"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8"+
		"\u02da\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02da"+
		"\u02de\u0003R)\u0000\u02db\u02dd\u0005C\u0000\u0000\u02dc\u02db\u0001"+
		"\u0000\u0000\u0000\u02dd\u02e0\u0001\u0000\u0000\u0000\u02de\u02dc\u0001"+
		"\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000\u0000\u02df\u02e4\u0001"+
		"\u0000\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e1\u02e3\u0005"+
		".\u0000\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e6\u0001\u0000"+
		"\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e7\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e7\u02eb\u00057\u0000\u0000\u02e8\u02ea\u0005.\u0000\u0000"+
		"\u02e9\u02e8\u0001\u0000\u0000\u0000\u02ea\u02ed\u0001\u0000\u0000\u0000"+
		"\u02eb\u02e9\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000"+
		"\u02ec\u02ee\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000"+
		"\u02ee\u0308\u0003&\u0013\u0000\u02ef\u02f1\u0005.\u0000\u0000\u02f0\u02ef"+
		"\u0001\u0000\u0000\u0000\u02f1\u02f4\u0001\u0000\u0000\u0000\u02f2\u02f0"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f5"+
		"\u0001\u0000\u0000\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f5\u02f9"+
		"\u0005\u0018\u0000\u0000\u02f6\u02f8\u0005.\u0000\u0000\u02f7\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f8\u02fb\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fc\u0001"+
		"\u0000\u0000\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fc\u02fd\u0003"+
		"R)\u0000\u02fd\u0301\u00057\u0000\u0000\u02fe\u0300\u0005.\u0000\u0000"+
		"\u02ff\u02fe\u0001\u0000\u0000\u0000\u0300\u0303\u0001\u0000\u0000\u0000"+
		"\u0301\u02ff\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000"+
		"\u0302\u0304\u0001\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000"+
		"\u0304\u0305\u0003&\u0013\u0000\u0305\u0307\u0001\u0000\u0000\u0000\u0306"+
		"\u02f2\u0001\u0000\u0000\u0000\u0307\u030a\u0001\u0000\u0000\u0000\u0308"+
		"\u0306\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309"+
		"\u0320\u0001\u0000\u0000\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030b"+
		"\u030d\u0005.\u0000\u0000\u030c\u030b\u0001\u0000\u0000\u0000\u030d\u0310"+
		"\u0001\u0000\u0000\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030e\u030f"+
		"\u0001\u0000\u0000\u0000\u030f\u0311\u0001\u0000\u0000\u0000\u0310\u030e"+
		"\u0001\u0000\u0000\u0000\u0311\u0315\u0005$\u0000\u0000\u0312\u0314\u0005"+
		".\u0000\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0314\u0317\u0001\u0000"+
		"\u0000\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000"+
		"\u0000\u0000\u0316\u0318\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000"+
		"\u0000\u0000\u0318\u031c\u00057\u0000\u0000\u0319\u031b\u0005.\u0000\u0000"+
		"\u031a\u0319\u0001\u0000\u0000\u0000\u031b\u031e\u0001\u0000\u0000\u0000"+
		"\u031c\u031a\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000"+
		"\u031d\u031f\u0001\u0000\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000"+
		"\u031f\u0321\u0003&\u0013\u0000\u0320\u030e\u0001\u0000\u0000\u0000\u0320"+
		"\u0321\u0001\u0000\u0000\u0000\u0321\u0325\u0001\u0000\u0000\u0000\u0322"+
		"\u0324\u0005.\u0000\u0000\u0323\u0322\u0001\u0000\u0000\u0000\u0324\u0327"+
		"\u0001\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0325\u0326"+
		"\u0001\u0000\u0000\u0000\u0326/\u0001\u0000\u0000\u0000\u0327\u0325\u0001"+
		"\u0000\u0000\u0000\u0328\u032a\u0005.\u0000\u0000\u0329\u0328\u0001\u0000"+
		"\u0000\u0000\u032a\u032d\u0001\u0000\u0000\u0000\u032b\u0329\u0001\u0000"+
		"\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000\u032c\u032e\u0001\u0000"+
		"\u0000\u0000\u032d\u032b\u0001\u0000\u0000\u0000\u032e\u0332\u0005\u0019"+
		"\u0000\u0000\u032f\u0331\u0005.\u0000\u0000\u0330\u032f\u0001\u0000\u0000"+
		"\u0000\u0331\u0334\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000\u0000"+
		"\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0335\u0001\u0000\u0000"+
		"\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0335\u0339\u0003R)\u0000\u0336"+
		"\u0338\u0005.\u0000\u0000\u0337\u0336\u0001\u0000\u0000\u0000\u0338\u033b"+
		"\u0001\u0000\u0000\u0000\u0339\u0337\u0001\u0000\u0000\u0000\u0339\u033a"+
		"\u0001\u0000\u0000\u0000\u033a\u033c\u0001\u0000\u0000\u0000\u033b\u0339"+
		"\u0001\u0000\u0000\u0000\u033c\u0340\u00057\u0000\u0000\u033d\u033f\u0005"+
		".\u0000\u0000\u033e\u033d\u0001\u0000\u0000\u0000\u033f\u0342\u0001\u0000"+
		"\u0000\u0000\u0340\u033e\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000"+
		"\u0000\u0000\u0341\u0343\u0001\u0000\u0000\u0000\u0342\u0340\u0001\u0000"+
		"\u0000\u0000\u0343\u0344\u0003&\u0013\u0000\u03441\u0001\u0000\u0000\u0000"+
		"\u0345\u0347\u0005.\u0000\u0000\u0346\u0345\u0001\u0000\u0000\u0000\u0347"+
		"\u034a\u0001\u0000\u0000\u0000\u0348\u0346\u0001\u0000\u0000\u0000\u0348"+
		"\u0349\u0001\u0000\u0000\u0000\u0349\u034b\u0001\u0000\u0000\u0000\u034a"+
		"\u0348\u0001\u0000\u0000\u0000\u034b\u034f\u0005\u001a\u0000\u0000\u034c"+
		"\u034e\u0005.\u0000\u0000\u034d\u034c\u0001\u0000\u0000\u0000\u034e\u0351"+
		"\u0001\u0000\u0000\u0000\u034f\u034d\u0001\u0000\u0000\u0000\u034f\u0350"+
		"\u0001\u0000\u0000\u0000\u0350\u0352\u0001\u0000\u0000\u0000\u0351\u034f"+
		"\u0001\u0000\u0000\u0000\u0352\u0356\u0005/\u0000\u0000\u0353\u0355\u0005"+
		".\u0000\u0000\u0354\u0353\u0001\u0000\u0000\u0000\u0355\u0358\u0001\u0000"+
		"\u0000\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000"+
		"\u0000\u0000\u0357\u0359\u0001\u0000\u0000\u0000\u0358\u0356\u0001\u0000"+
		"\u0000\u0000\u0359\u035d\u0005\u001b\u0000\u0000\u035a\u035c\u0005.\u0000"+
		"\u0000\u035b\u035a\u0001\u0000\u0000\u0000\u035c\u035f\u0001\u0000\u0000"+
		"\u0000\u035d\u035b\u0001\u0000\u0000\u0000\u035d\u035e\u0001\u0000\u0000"+
		"\u0000\u035e\u0360\u0001\u0000\u0000\u0000\u035f\u035d\u0001\u0000\u0000"+
		"\u0000\u0360\u0364\u0003R)\u0000\u0361\u0363\u0005.\u0000\u0000\u0362"+
		"\u0361\u0001\u0000\u0000\u0000\u0363\u0366\u0001\u0000\u0000\u0000\u0364"+
		"\u0362\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365"+
		"\u0367\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0367"+
		"\u036b\u00057\u0000\u0000\u0368\u036a\u0005.\u0000\u0000\u0369\u0368\u0001"+
		"\u0000\u0000\u0000\u036a\u036d\u0001\u0000\u0000\u0000\u036b\u0369\u0001"+
		"\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036e\u0001"+
		"\u0000\u0000\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036e\u036f\u0003"+
		"&\u0013\u0000\u036f3\u0001\u0000\u0000\u0000\u0370\u0372\u0005.\u0000"+
		"\u0000\u0371\u0370\u0001\u0000\u0000\u0000\u0372\u0375\u0001\u0000\u0000"+
		"\u0000\u0373\u0371\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000"+
		"\u0000\u0374\u0376\u0001\u0000\u0000\u0000\u0375\u0373\u0001\u0000\u0000"+
		"\u0000\u0376\u037a\u0005\u001c\u0000\u0000\u0377\u0379\u0005.\u0000\u0000"+
		"\u0378\u0377\u0001\u0000\u0000\u0000\u0379\u037c\u0001\u0000\u0000\u0000"+
		"\u037a\u0378\u0001\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000\u0000"+
		"\u037b\u037d\u0001\u0000\u0000\u0000\u037c\u037a\u0001\u0000\u0000\u0000"+
		"\u037d\u0381\u0003R)\u0000\u037e\u0380\u0005.\u0000\u0000\u037f\u037e"+
		"\u0001\u0000\u0000\u0000\u0380\u0383\u0001\u0000\u0000\u0000\u0381\u037f"+
		"\u0001\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0384"+
		"\u0001\u0000\u0000\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0384\u0388"+
		"\u00057\u0000\u0000\u0385\u0387\u0005.\u0000\u0000\u0386\u0385\u0001\u0000"+
		"\u0000\u0000\u0387\u038a\u0001\u0000\u0000\u0000\u0388\u0386\u0001\u0000"+
		"\u0000\u0000\u0388\u0389\u0001\u0000\u0000\u0000\u0389\u038b\u0001\u0000"+
		"\u0000\u0000\u038a\u0388\u0001\u0000\u0000\u0000\u038b\u038c\u0005\u0001"+
		"\u0000\u0000\u038c\u038d\u00036\u001b\u0000\u038d\u038e\u0005\u0002\u0000"+
		"\u0000\u038e5\u0001\u0000\u0000\u0000\u038f\u0391\u0005.\u0000\u0000\u0390"+
		"\u038f\u0001\u0000\u0000\u0000\u0391\u0394\u0001\u0000\u0000\u0000\u0392"+
		"\u0390\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000\u0000\u0393"+
		"\u0395\u0001\u0000\u0000\u0000\u0394\u0392\u0001\u0000\u0000\u0000\u0395"+
		"\u0396\u0003:\u001d\u0000\u0396\u039a\u00057\u0000\u0000\u0397\u0399\u0005"+
		".\u0000\u0000\u0398\u0397\u0001\u0000\u0000\u0000\u0399\u039c\u0001\u0000"+
		"\u0000\u0000\u039a\u0398\u0001\u0000\u0000\u0000\u039a\u039b\u0001\u0000"+
		"\u0000\u0000\u039b\u039d\u0001\u0000\u0000\u0000\u039c\u039a\u0001\u0000"+
		"\u0000\u0000\u039d\u039e\u0003&\u0013\u0000\u039e\u03a0\u0001\u0000\u0000"+
		"\u0000\u039f\u0392\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000"+
		"\u0000\u03a1\u039f\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000\u0000"+
		"\u0000\u03a27\u0001\u0000\u0000\u0000\u03a3\u03ae\u0003:\u001d\u0000\u03a4"+
		"\u03a6\u0005.\u0000\u0000\u03a5\u03a4\u0001\u0000\u0000\u0000\u03a6\u03a9"+
		"\u0001\u0000\u0000\u0000\u03a7\u03a5\u0001\u0000\u0000\u0000\u03a7\u03a8"+
		"\u0001\u0000\u0000\u0000\u03a8\u03aa\u0001\u0000\u0000\u0000\u03a9\u03a7"+
		"\u0001\u0000\u0000\u0000\u03aa\u03ab\u00056\u0000\u0000\u03ab\u03ad\u0003"+
		":\u001d\u0000\u03ac\u03a7\u0001\u0000\u0000\u0000\u03ad\u03b0\u0001\u0000"+
		"\u0000\u0000\u03ae\u03ac\u0001\u0000\u0000\u0000\u03ae\u03af\u0001\u0000"+
		"\u0000\u0000\u03af\u03b4\u0001\u0000\u0000\u0000\u03b0\u03ae\u0001\u0000"+
		"\u0000\u0000\u03b1\u03b3\u0005.\u0000\u0000\u03b2\u03b1\u0001\u0000\u0000"+
		"\u0000\u03b3\u03b6\u0001\u0000\u0000\u0000\u03b4\u03b2\u0001\u0000\u0000"+
		"\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b59\u0001\u0000\u0000\u0000"+
		"\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b7\u03bf\u0003T*\u0000\u03b8\u03bf"+
		"\u00050\u0000\u0000\u03b9\u03bf\u00051\u0000\u0000\u03ba\u03bf\u0005G"+
		"\u0000\u0000\u03bb\u03bf\u0003<\u001e\u0000\u03bc\u03bf\u0003>\u001f\u0000"+
		"\u03bd\u03bf\u0003@ \u0000\u03be\u03b7\u0001\u0000\u0000\u0000\u03be\u03b8"+
		"\u0001\u0000\u0000\u0000\u03be\u03b9\u0001\u0000\u0000\u0000\u03be\u03ba"+
		"\u0001\u0000\u0000\u0000\u03be\u03bb\u0001\u0000\u0000\u0000\u03be\u03bc"+
		"\u0001\u0000\u0000\u0000\u03be\u03bd\u0001\u0000\u0000\u0000\u03bf;\u0001"+
		"\u0000\u0000\u0000\u03c0\u03c4\u0005\u0006\u0000\u0000\u03c1\u03c3\u0005"+
		".\u0000\u0000\u03c2\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c6\u0001\u0000"+
		"\u0000\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c4\u03c5\u0001\u0000"+
		"\u0000\u0000\u03c5\u03c7\u0001\u0000\u0000\u0000\u03c6\u03c4\u0001\u0000"+
		"\u0000\u0000\u03c7\u03c8\u0005/\u0000\u0000\u03c8=\u0001\u0000\u0000\u0000"+
		"\u03c9\u03d5\u0005H\u0000\u0000\u03ca\u03cf\u0003:\u001d\u0000\u03cb\u03cc"+
		"\u00056\u0000\u0000\u03cc\u03ce\u0003:\u001d\u0000\u03cd\u03cb\u0001\u0000"+
		"\u0000\u0000\u03ce\u03d1\u0001\u0000\u0000\u0000\u03cf\u03cd\u0001\u0000"+
		"\u0000\u0000\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d1\u03cf\u0001\u0000\u0000\u0000\u03d2\u03d4\u0005J\u0000"+
		"\u0000\u03d3\u03d2\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d6\u0001\u0000\u0000\u0000\u03d5\u03ca\u0001\u0000\u0000"+
		"\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6\u03d7\u0001\u0000\u0000"+
		"\u0000\u03d7\u03d8\u0005I\u0000\u0000\u03d8?\u0001\u0000\u0000\u0000\u03d9"+
		"\u03db\u0005D\u0000\u0000\u03da\u03dc\u0003B!\u0000\u03db\u03da\u0001"+
		"\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03e1\u0001"+
		"\u0000\u0000\u0000\u03dd\u03de\u00056\u0000\u0000\u03de\u03e0\u0003B!"+
		"\u0000\u03df\u03dd\u0001\u0000\u0000\u0000\u03e0\u03e3\u0001\u0000\u0000"+
		"\u0000\u03e1\u03df\u0001\u0000\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000"+
		"\u0000\u03e2\u03e5\u0001\u0000\u0000\u0000\u03e3\u03e1\u0001\u0000\u0000"+
		"\u0000\u03e4\u03e6\u0005J\u0000\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000"+
		"\u03e5\u03e6\u0001\u0000\u0000\u0000\u03e6\u03e7\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e8\u0005E\u0000\u0000\u03e8A\u0001\u0000\u0000\u0000\u03e9\u03ec"+
		"\u00052\u0000\u0000\u03ea\u03eb\u00057\u0000\u0000\u03eb\u03ed\u0003:"+
		"\u001d\u0000\u03ec\u03ea\u0001\u0000\u0000\u0000\u03ec\u03ed\u0001\u0000"+
		"\u0000\u0000\u03edC\u0001\u0000\u0000\u0000\u03ee\u03f2\u0005\u001d\u0000"+
		"\u0000\u03ef\u03f1\u0005.\u0000\u0000\u03f0\u03ef\u0001\u0000\u0000\u0000"+
		"\u03f1\u03f4\u0001\u0000\u0000\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000"+
		"\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3\u03f5\u0001\u0000\u0000\u0000"+
		"\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f5\u040a\u0003,\u0016\u0000\u03f6"+
		"\u03fa\u0005\u001e\u0000\u0000\u03f7\u03f9\u0005.\u0000\u0000\u03f8\u03f7"+
		"\u0001\u0000\u0000\u0000\u03f9\u03fc\u0001\u0000\u0000\u0000\u03fa\u03f8"+
		"\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fd"+
		"\u0001\u0000\u0000\u0000\u03fc\u03fa\u0001\u0000\u0000\u0000\u03fd\u040a"+
		"\u0003,\u0016\u0000\u03fe\u0402\u0005\u001f\u0000\u0000\u03ff\u0401\u0005"+
		".\u0000\u0000\u0400\u03ff\u0001\u0000\u0000\u0000\u0401\u0404\u0001\u0000"+
		"\u0000\u0000\u0402\u0400\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000"+
		"\u0000\u0000\u0403\u0406\u0001\u0000\u0000\u0000\u0404\u0402\u0001\u0000"+
		"\u0000\u0000\u0405\u0407\u0003R)\u0000\u0406\u0405\u0001\u0000\u0000\u0000"+
		"\u0406\u0407\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000"+
		"\u0408\u040a\u0003,\u0016\u0000\u0409\u03ee\u0001\u0000\u0000\u0000\u0409"+
		"\u03f6\u0001\u0000\u0000\u0000\u0409\u03fe\u0001\u0000\u0000\u0000\u040a"+
		"E\u0001\u0000\u0000\u0000\u040b\u040f\u0003R)\u0000\u040c\u040e\u0005"+
		".\u0000\u0000\u040d\u040c\u0001\u0000\u0000\u0000\u040e\u0411\u0001\u0000"+
		"\u0000\u0000\u040f\u040d\u0001\u0000\u0000\u0000\u040f\u0410\u0001\u0000"+
		"\u0000\u0000\u0410\u0412\u0001\u0000\u0000\u0000\u0411\u040f\u0001\u0000"+
		"\u0000\u0000\u0412\u0416\u0007\u0003\u0000\u0000\u0413\u0415\u0005.\u0000"+
		"\u0000\u0414\u0413\u0001\u0000\u0000\u0000\u0415\u0418\u0001\u0000\u0000"+
		"\u0000\u0416\u0414\u0001\u0000\u0000\u0000\u0416\u0417\u0001\u0000\u0000"+
		"\u0000\u0417\u0419\u0001\u0000\u0000\u0000\u0418\u0416\u0001\u0000\u0000"+
		"\u0000\u0419\u041a\u0003R)\u0000\u041a\u041b\u0003,\u0016\u0000\u041b"+
		"G\u0001\u0000\u0000\u0000\u041c\u041e\u0005.\u0000\u0000\u041d\u041c\u0001"+
		"\u0000\u0000\u0000\u041e\u0421\u0001\u0000\u0000\u0000\u041f\u041d\u0001"+
		"\u0000\u0000\u0000\u041f\u0420\u0001\u0000\u0000\u0000\u0420\u0422\u0001"+
		"\u0000\u0000\u0000\u0421\u041f\u0001\u0000\u0000\u0000\u0422\u0426\u0005"+
		"\u0006\u0000\u0000\u0423\u0425\u0005.\u0000\u0000\u0424\u0423\u0001\u0000"+
		"\u0000\u0000\u0425\u0428\u0001\u0000\u0000\u0000\u0426\u0424\u0001\u0000"+
		"\u0000\u0000\u0426\u0427\u0001\u0000\u0000\u0000\u0427\u0429\u0001\u0000"+
		"\u0000\u0000\u0428\u0426\u0001\u0000\u0000\u0000\u0429\u042d\u0005/\u0000"+
		"\u0000\u042a\u042c\u0005.\u0000\u0000\u042b\u042a\u0001\u0000\u0000\u0000"+
		"\u042c\u042f\u0001\u0000\u0000\u0000\u042d\u042b\u0001\u0000\u0000\u0000"+
		"\u042d\u042e\u0001\u0000\u0000\u0000\u042e\u0469\u0001\u0000\u0000\u0000"+
		"\u042f\u042d\u0001\u0000\u0000\u0000\u0430\u0432\u0005.\u0000\u0000\u0431"+
		"\u0430\u0001\u0000\u0000\u0000\u0432\u0435\u0001\u0000\u0000\u0000\u0433"+
		"\u0431\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000\u0000\u0434"+
		"\u0436\u0001\u0000\u0000\u0000\u0435\u0433\u0001\u0000\u0000\u0000\u0436"+
		"\u043a\u00057\u0000\u0000\u0437\u0439\u0005.\u0000\u0000\u0438\u0437\u0001"+
		"\u0000\u0000\u0000\u0439\u043c\u0001\u0000\u0000\u0000\u043a\u0438\u0001"+
		"\u0000\u0000\u0000\u043a\u043b\u0001\u0000\u0000\u0000\u043b\u043d\u0001"+
		"\u0000\u0000\u0000\u043c\u043a\u0001\u0000\u0000\u0000\u043d\u043f\u0003"+
		"\u000e\u0007\u0000\u043e\u0433\u0001\u0000\u0000\u0000\u043e\u043f\u0001"+
		"\u0000\u0000\u0000\u043f\u044e\u0001\u0000\u0000\u0000\u0440\u0442\u0005"+
		".\u0000\u0000\u0441\u0440\u0001\u0000\u0000\u0000\u0442\u0445\u0001\u0000"+
		"\u0000\u0000\u0443\u0441\u0001\u0000\u0000\u0000\u0443\u0444\u0001\u0000"+
		"\u0000\u0000\u0444\u0446\u0001\u0000\u0000\u0000\u0445\u0443\u0001\u0000"+
		"\u0000\u0000\u0446\u044a\u00058\u0000\u0000\u0447\u0449\u0005.\u0000\u0000"+
		"\u0448\u0447\u0001\u0000\u0000\u0000\u0449\u044c\u0001\u0000\u0000\u0000"+
		"\u044a\u0448\u0001\u0000\u0000\u0000\u044a\u044b\u0001\u0000\u0000\u0000"+
		"\u044b\u044d\u0001\u0000\u0000\u0000\u044c\u044a\u0001\u0000\u0000\u0000"+
		"\u044d\u044f\u0003R)\u0000\u044e\u0443\u0001\u0000\u0000\u0000\u044e\u044f"+
		"\u0001\u0000\u0000\u0000\u044f\u046a\u0001\u0000\u0000\u0000\u0450\u0454"+
		"\u00059\u0000\u0000\u0451\u0453\u0005.\u0000\u0000\u0452\u0451\u0001\u0000"+
		"\u0000\u0000\u0453\u0456\u0001\u0000\u0000\u0000\u0454\u0452\u0001\u0000"+
		"\u0000\u0000\u0454\u0455\u0001\u0000\u0000\u0000\u0455\u0457\u0001\u0000"+
		"\u0000\u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0457\u0468\u0003R)\u0000"+
		"\u0458\u045c\u00057\u0000\u0000\u0459\u045b\u0005.\u0000\u0000\u045a\u0459"+
		"\u0001\u0000\u0000\u0000\u045b\u045e\u0001\u0000\u0000\u0000\u045c\u045a"+
		"\u0001\u0000\u0000\u0000\u045c\u045d\u0001\u0000\u0000\u0000\u045d\u045f"+
		"\u0001\u0000\u0000\u0000\u045e\u045c\u0001\u0000\u0000\u0000\u045f\u0463"+
		"\u00058\u0000\u0000\u0460\u0462\u0005.\u0000\u0000\u0461\u0460\u0001\u0000"+
		"\u0000\u0000\u0462\u0465\u0001\u0000\u0000\u0000\u0463\u0461\u0001\u0000"+
		"\u0000\u0000\u0463\u0464\u0001\u0000\u0000\u0000\u0464\u0466\u0001\u0000"+
		"\u0000\u0000\u0465\u0463\u0001\u0000\u0000\u0000\u0466\u0468\u0003R)\u0000"+
		"\u0467\u0450\u0001\u0000\u0000\u0000\u0467\u0458\u0001\u0000\u0000\u0000"+
		"\u0468\u046a\u0001\u0000\u0000\u0000\u0469\u043e\u0001\u0000\u0000\u0000"+
		"\u0469\u0467\u0001\u0000\u0000\u0000\u046a\u046e\u0001\u0000\u0000\u0000"+
		"\u046b\u046d\u0005.\u0000\u0000\u046c\u046b\u0001\u0000\u0000\u0000\u046d"+
		"\u0470\u0001\u0000\u0000\u0000\u046e\u046c\u0001\u0000\u0000\u0000\u046e"+
		"\u046f\u0001\u0000\u0000\u0000\u046f\u0471\u0001\u0000\u0000\u0000\u0470"+
		"\u046e\u0001\u0000\u0000\u0000\u0471\u0472\u0003,\u0016\u0000\u0472I\u0001"+
		"\u0000\u0000\u0000\u0473\u0475\u0005 \u0000\u0000\u0474\u0476\u0005.\u0000"+
		"\u0000\u0475\u0474\u0001\u0000\u0000\u0000\u0475\u0476\u0001\u0000\u0000"+
		"\u0000\u0476\u0477\u0001\u0000\u0000\u0000\u0477\u0478\u0005B\u0000\u0000"+
		"\u0478\u047b\u0003R)\u0000\u0479\u047a\u00056\u0000\u0000\u047a\u047c"+
		"\u00052\u0000\u0000\u047b\u0479\u0001\u0000\u0000\u0000\u047b\u047c\u0001"+
		"\u0000\u0000\u0000\u047c\u047d\u0001\u0000\u0000\u0000\u047d\u047e\u0005"+
		"C\u0000\u0000\u047e\u047f\u0003,\u0016\u0000\u047fK\u0001\u0000\u0000"+
		"\u0000\u0480\u0482\u0005!\u0000\u0000\u0481\u0483\u0005.\u0000\u0000\u0482"+
		"\u0481\u0001\u0000\u0000\u0000\u0482\u0483\u0001\u0000\u0000\u0000\u0483"+
		"\u0484\u0001\u0000\u0000\u0000\u0484\u0485\u0005B\u0000\u0000\u0485\u0486"+
		"\u0003R)\u0000\u0486\u0487\u00056\u0000\u0000\u0487\u0488\u0003R)\u0000"+
		"\u0488\u0489\u0001\u0000\u0000\u0000\u0489\u048a\u0005C\u0000\u0000\u048a"+
		"M\u0001\u0000\u0000\u0000\u048b\u048d\u0005\"\u0000\u0000\u048c\u048e"+
		"\u0005.\u0000\u0000\u048d\u048c\u0001\u0000\u0000\u0000\u048d\u048e\u0001"+
		"\u0000\u0000\u0000\u048e\u048f\u0001\u0000\u0000\u0000\u048f\u0490\u0005"+
		"B\u0000\u0000\u0490\u0491\u00051\u0000\u0000\u0491\u0492\u0005C\u0000"+
		"\u0000\u0492O\u0001\u0000\u0000\u0000\u0493\u0495\u0005.\u0000\u0000\u0494"+
		"\u0493\u0001\u0000\u0000\u0000\u0495\u0498\u0001\u0000\u0000\u0000\u0496"+
		"\u0494\u0001\u0000\u0000\u0000\u0496\u0497\u0001\u0000\u0000\u0000\u0497"+
		"\u0499\u0001\u0000\u0000\u0000\u0498\u0496\u0001\u0000\u0000\u0000\u0499"+
		"\u049d\u0003R)\u0000\u049a\u049c\u0005.\u0000\u0000\u049b\u049a\u0001"+
		"\u0000\u0000\u0000\u049c\u049f\u0001\u0000\u0000\u0000\u049d\u049b\u0001"+
		"\u0000\u0000\u0000\u049d\u049e\u0001\u0000\u0000\u0000\u049e\u04a0\u0001"+
		"\u0000\u0000\u0000\u049f\u049d\u0001\u0000\u0000\u0000\u04a0\u04a1\u0003"+
		",\u0016\u0000\u04a1Q\u0001\u0000\u0000\u0000\u04a2\u04a3\u0006)\uffff"+
		"\uffff\u0000\u04a3\u0508\u0005)\u0000\u0000\u04a4\u0508\u0005*\u0000\u0000"+
		"\u04a5\u0508\u0005+\u0000\u0000\u04a6\u0508\u0005,\u0000\u0000\u04a7\u0508"+
		"\u0003T*\u0000\u04a8\u04ac\u0005H\u0000\u0000\u04a9\u04ab\u0005.\u0000"+
		"\u0000\u04aa\u04a9\u0001\u0000\u0000\u0000\u04ab\u04ae\u0001\u0000\u0000"+
		"\u0000\u04ac\u04aa\u0001\u0000\u0000\u0000\u04ac\u04ad\u0001\u0000\u0000"+
		"\u0000\u04ad\u04c0\u0001\u0000\u0000\u0000\u04ae\u04ac\u0001\u0000\u0000"+
		"\u0000\u04af\u04ba\u0003R)\u0000\u04b0\u04b4\u00056\u0000\u0000\u04b1"+
		"\u04b3\u0005.\u0000\u0000\u04b2\u04b1\u0001\u0000\u0000\u0000\u04b3\u04b6"+
		"\u0001\u0000\u0000\u0000\u04b4\u04b2\u0001\u0000\u0000\u0000\u04b4\u04b5"+
		"\u0001\u0000\u0000\u0000\u04b5\u04b7\u0001\u0000\u0000\u0000\u04b6\u04b4"+
		"\u0001\u0000\u0000\u0000\u04b7\u04b9\u0003R)\u0000\u04b8\u04b0\u0001\u0000"+
		"\u0000\u0000\u04b9\u04bc\u0001\u0000\u0000\u0000\u04ba\u04b8\u0001\u0000"+
		"\u0000\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000\u04bb\u04be\u0001\u0000"+
		"\u0000\u0000\u04bc\u04ba\u0001\u0000\u0000\u0000\u04bd\u04bf\u00056\u0000"+
		"\u0000\u04be\u04bd\u0001\u0000\u0000\u0000\u04be\u04bf\u0001\u0000\u0000"+
		"\u0000\u04bf\u04c1\u0001\u0000\u0000\u0000\u04c0\u04af\u0001\u0000\u0000"+
		"\u0000\u04c0\u04c1\u0001\u0000\u0000\u0000\u04c1\u04c5\u0001\u0000\u0000"+
		"\u0000\u04c2\u04c4\u0005.\u0000\u0000\u04c3\u04c2\u0001\u0000\u0000\u0000"+
		"\u04c4\u04c7\u0001\u0000\u0000\u0000\u04c5\u04c3\u0001\u0000\u0000\u0000"+
		"\u04c5\u04c6\u0001\u0000\u0000\u0000\u04c6\u04c8\u0001\u0000\u0000\u0000"+
		"\u04c7\u04c5\u0001\u0000\u0000\u0000\u04c8\u0508\u0005I\u0000\u0000\u04c9"+
		"\u04d5\u0005D\u0000\u0000\u04ca\u04cf\u0003V+\u0000\u04cb\u04cc\u0005"+
		"6\u0000\u0000\u04cc\u04ce\u0003V+\u0000\u04cd\u04cb\u0001\u0000\u0000"+
		"\u0000\u04ce\u04d1\u0001\u0000\u0000\u0000\u04cf\u04cd\u0001\u0000\u0000"+
		"\u0000\u04cf\u04d0\u0001\u0000\u0000\u0000\u04d0\u04d3\u0001\u0000\u0000"+
		"\u0000\u04d1\u04cf\u0001\u0000\u0000\u0000\u04d2\u04d4\u00056\u0000\u0000"+
		"\u04d3\u04d2\u0001\u0000\u0000\u0000\u04d3\u04d4\u0001\u0000\u0000\u0000"+
		"\u04d4\u04d6\u0001\u0000\u0000\u0000\u04d5\u04ca\u0001\u0000\u0000\u0000"+
		"\u04d5\u04d6\u0001\u0000\u0000\u0000\u04d6\u04d7\u0001\u0000\u0000\u0000"+
		"\u04d7\u0508\u0005E\u0000\u0000\u04d8\u04d9\u0005B\u0000\u0000\u04d9\u04da"+
		"\u0003R)\u0000\u04da\u04db\u0005C\u0000\u0000\u04db\u0508\u0001\u0000"+
		"\u0000\u0000\u04dc\u04e0\u00055\u0000\u0000\u04dd\u04df\u0005.\u0000\u0000"+
		"\u04de\u04dd\u0001\u0000\u0000\u0000\u04df\u04e2\u0001\u0000\u0000\u0000"+
		"\u04e0\u04de\u0001\u0000\u0000\u0000\u04e0\u04e1\u0001\u0000\u0000\u0000"+
		"\u04e1\u04e3\u0001\u0000\u0000\u0000\u04e2\u04e0\u0001\u0000\u0000\u0000"+
		"\u04e3\u04e7\u0005/\u0000\u0000\u04e4\u04e6\u0005.\u0000\u0000\u04e5\u04e4"+
		"\u0001\u0000\u0000\u0000\u04e6\u04e9\u0001\u0000\u0000\u0000\u04e7\u04e5"+
		"\u0001\u0000\u0000\u0000\u04e7\u04e8\u0001\u0000\u0000\u0000\u04e8\u04ea"+
		"\u0001\u0000\u0000\u0000\u04e9\u04e7\u0001\u0000\u0000\u0000\u04ea\u04ec"+
		"\u0005B\u0000\u0000\u04eb\u04ed\u0003\"\u0011\u0000\u04ec\u04eb\u0001"+
		"\u0000\u0000\u0000\u04ec\u04ed\u0001\u0000\u0000\u0000\u04ed\u04ee\u0001"+
		"\u0000\u0000\u0000\u04ee\u0508\u0005C\u0000\u0000\u04ef\u04f9\u0005`\u0000"+
		"\u0000\u04f0\u04fa\u00052\u0000\u0000\u04f1\u04f6\u0005/\u0000\u0000\u04f2"+
		"\u04f3\u0005]\u0000\u0000\u04f3\u04f5\u0005/\u0000\u0000\u04f4\u04f2\u0001"+
		"\u0000\u0000\u0000\u04f5\u04f8\u0001\u0000\u0000\u0000\u04f6\u04f4\u0001"+
		"\u0000\u0000\u0000\u04f6\u04f7\u0001\u0000\u0000\u0000\u04f7\u04fa\u0001"+
		"\u0000\u0000\u0000\u04f8\u04f6\u0001\u0000\u0000\u0000\u04f9\u04f0\u0001"+
		"\u0000\u0000\u0000\u04f9\u04f1\u0001\u0000\u0000\u0000\u04fa\u0508\u0001"+
		"\u0000\u0000\u0000\u04fb\u04fc\u0005_\u0000\u0000\u04fc\u0508\u0003R)"+
		"\u0010\u04fd\u0501\u0007\u0004\u0000\u0000\u04fe\u0500\u0005.\u0000\u0000"+
		"\u04ff\u04fe\u0001\u0000\u0000\u0000\u0500\u0503\u0001\u0000\u0000\u0000"+
		"\u0501\u04ff\u0001\u0000\u0000\u0000\u0501\u0502\u0001\u0000\u0000\u0000"+
		"\u0502\u0504\u0001\u0000\u0000\u0000\u0503\u0501\u0001\u0000\u0000\u0000"+
		"\u0504\u0508\u0003R)\u000f\u0505\u0506\u0007\u0005\u0000\u0000\u0506\u0508"+
		"\u0003R)\u0005\u0507\u04a2\u0001\u0000\u0000\u0000\u0507\u04a4\u0001\u0000"+
		"\u0000\u0000\u0507\u04a5\u0001\u0000\u0000\u0000\u0507\u04a6\u0001\u0000"+
		"\u0000\u0000\u0507\u04a7\u0001\u0000\u0000\u0000\u0507\u04a8\u0001\u0000"+
		"\u0000\u0000\u0507\u04c9\u0001\u0000\u0000\u0000\u0507\u04d8\u0001\u0000"+
		"\u0000\u0000\u0507\u04dc\u0001\u0000\u0000\u0000\u0507\u04ef\u0001\u0000"+
		"\u0000\u0000\u0507\u04fb\u0001\u0000\u0000\u0000\u0507\u04fd\u0001\u0000"+
		"\u0000\u0000\u0507\u0505\u0001\u0000\u0000\u0000\u0508\u059a\u0001\u0000"+
		"\u0000\u0000\u0509\u050a\n\u000e\u0000\u0000\u050a\u050b\u0007\u0006\u0000"+
		"\u0000\u050b\u0599\u0003R)\u000f\u050c\u0510\n\r\u0000\u0000\u050d\u050f"+
		"\u0005.\u0000\u0000\u050e\u050d\u0001\u0000\u0000\u0000\u050f\u0512\u0001"+
		"\u0000\u0000\u0000\u0510\u050e\u0001\u0000\u0000\u0000\u0510\u0511\u0001"+
		"\u0000\u0000\u0000\u0511\u0513\u0001\u0000\u0000\u0000\u0512\u0510\u0001"+
		"\u0000\u0000\u0000\u0513\u0517\u0005Z\u0000\u0000\u0514\u0516\u0005.\u0000"+
		"\u0000\u0515\u0514\u0001\u0000\u0000\u0000\u0516\u0519\u0001\u0000\u0000"+
		"\u0000\u0517\u0515\u0001\u0000\u0000\u0000\u0517\u0518\u0001\u0000\u0000"+
		"\u0000\u0518\u051a\u0001\u0000\u0000\u0000\u0519\u0517\u0001\u0000\u0000"+
		"\u0000\u051a\u0599\u0003R)\u000e\u051b\u051f\n\f\u0000\u0000\u051c\u051e"+
		"\u0005.\u0000\u0000\u051d\u051c\u0001\u0000\u0000\u0000\u051e\u0521\u0001"+
		"\u0000\u0000\u0000\u051f\u051d\u0001\u0000\u0000\u0000\u051f\u0520\u0001"+
		"\u0000\u0000\u0000\u0520\u0522\u0001\u0000\u0000\u0000\u0521\u051f\u0001"+
		"\u0000\u0000\u0000\u0522\u0526\u0005[\u0000\u0000\u0523\u0525\u0005.\u0000"+
		"\u0000\u0524\u0523\u0001\u0000\u0000\u0000\u0525\u0528\u0001\u0000\u0000"+
		"\u0000\u0526\u0524\u0001\u0000\u0000\u0000\u0526\u0527\u0001\u0000\u0000"+
		"\u0000\u0527\u0529\u0001\u0000\u0000\u0000\u0528\u0526\u0001\u0000\u0000"+
		"\u0000\u0529\u0599\u0003R)\r\u052a\u052b\n\u000b\u0000\u0000\u052b\u052c"+
		"\u0007\u0007\u0000\u0000\u052c\u0599\u0003R)\f\u052d\u052e\n\n\u0000\u0000"+
		"\u052e\u052f\u0005W\u0000\u0000\u052f\u0599\u0003R)\u000b\u0530\u0531"+
		"\n\t\u0000\u0000\u0531\u0532\u0005V\u0000\u0000\u0532\u0599\u0003R)\n"+
		"\u0533\u0534\n\b\u0000\u0000\u0534\u0535\u0005U\u0000\u0000\u0535\u0599"+
		"\u0003R)\t\u0536\u0538\n\u0007\u0000\u0000\u0537\u0539\u0005.\u0000\u0000"+
		"\u0538\u0537\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000"+
		"\u0539\u053a\u0001\u0000\u0000\u0000\u053a\u053c\u0007\b\u0000\u0000\u053b"+
		"\u053d\u0005.\u0000\u0000\u053c\u053b\u0001\u0000\u0000\u0000\u053c\u053d"+
		"\u0001\u0000\u0000\u0000\u053d\u053e\u0001\u0000\u0000\u0000\u053e\u0599"+
		"\u0003R)\b\u053f\u0540\n\u0006\u0000\u0000\u0540\u0541\u0005\u001b\u0000"+
		"\u0000\u0541\u0599\u0003R)\u0007\u0542\u0546\n\u0004\u0000\u0000\u0543"+
		"\u0545\u0005.\u0000\u0000\u0544\u0543\u0001\u0000\u0000\u0000\u0545\u0548"+
		"\u0001\u0000\u0000\u0000\u0546\u0544\u0001\u0000\u0000\u0000\u0546\u0547"+
		"\u0001\u0000\u0000\u0000\u0547\u0549\u0001\u0000\u0000\u0000\u0548\u0546"+
		"\u0001\u0000\u0000\u0000\u0549\u054d\u0007\t\u0000\u0000\u054a\u054c\u0005"+
		".\u0000\u0000\u054b\u054a\u0001\u0000\u0000\u0000\u054c\u054f\u0001\u0000"+
		"\u0000\u0000\u054d\u054b\u0001\u0000\u0000\u0000\u054d\u054e\u0001\u0000"+
		"\u0000\u0000\u054e\u0550\u0001\u0000\u0000\u0000\u054f\u054d\u0001\u0000"+
		"\u0000\u0000\u0550\u0599\u0003R)\u0005\u0551\u0555\n\u0003\u0000\u0000"+
		"\u0552\u0554\u0005.\u0000\u0000\u0553\u0552\u0001\u0000\u0000\u0000\u0554"+
		"\u0557\u0001\u0000\u0000\u0000\u0555\u0553\u0001\u0000\u0000\u0000\u0555"+
		"\u0556\u0001\u0000\u0000\u0000\u0556\u0558\u0001\u0000\u0000\u0000\u0557"+
		"\u0555\u0001\u0000\u0000\u0000\u0558\u055c\u0007\n\u0000\u0000\u0559\u055b"+
		"\u0005.\u0000\u0000\u055a\u0559\u0001\u0000\u0000\u0000\u055b\u055e\u0001"+
		"\u0000\u0000\u0000\u055c\u055a\u0001\u0000\u0000\u0000\u055c\u055d\u0001"+
		"\u0000\u0000\u0000\u055d\u055f\u0001\u0000\u0000\u0000\u055e\u055c\u0001"+
		"\u0000\u0000\u0000\u055f\u0599\u0003R)\u0004\u0560\u0561\n\u0002\u0000"+
		"\u0000\u0561\u0562\u0005\u0017\u0000\u0000\u0562\u0563\u0003R)\u0000\u0563"+
		"\u0564\u0005$\u0000\u0000\u0564\u0565\u0003R)\u0003\u0565\u0599\u0001"+
		"\u0000\u0000\u0000\u0566\u0567\n\u0016\u0000\u0000\u0567\u0568\u0005H"+
		"\u0000\u0000\u0568\u0569\u0003R)\u0000\u0569\u056a\u0005I\u0000\u0000"+
		"\u056a\u0599\u0001\u0000\u0000\u0000\u056b\u056f\n\u0015\u0000\u0000\u056c"+
		"\u056e\u0005.\u0000\u0000\u056d\u056c\u0001\u0000\u0000\u0000\u056e\u0571"+
		"\u0001\u0000\u0000\u0000\u056f\u056d\u0001\u0000\u0000\u0000\u056f\u0570"+
		"\u0001\u0000\u0000\u0000\u0570\u0572\u0001\u0000\u0000\u0000\u0571\u056f"+
		"\u0001\u0000\u0000\u0000\u0572\u0576\u00055\u0000\u0000\u0573\u0575\u0005"+
		".\u0000\u0000\u0574\u0573\u0001\u0000\u0000\u0000\u0575\u0578\u0001\u0000"+
		"\u0000\u0000\u0576\u0574\u0001\u0000\u0000\u0000\u0576\u0577\u0001\u0000"+
		"\u0000\u0000\u0577\u0579\u0001\u0000\u0000\u0000\u0578\u0576\u0001\u0000"+
		"\u0000\u0000\u0579\u0599\u0005/\u0000\u0000\u057a\u057e\n\u0014\u0000"+
		"\u0000\u057b\u057d\u0005.\u0000\u0000\u057c\u057b\u0001\u0000\u0000\u0000"+
		"\u057d\u0580\u0001\u0000\u0000\u0000\u057e\u057c\u0001\u0000\u0000\u0000"+
		"\u057e\u057f\u0001\u0000\u0000\u0000\u057f\u0581\u0001\u0000\u0000\u0000"+
		"\u0580\u057e\u0001\u0000\u0000\u0000\u0581\u0583\u0005B\u0000\u0000\u0582"+
		"\u0584\u0003\"\u0011\u0000\u0583\u0582\u0001\u0000\u0000\u0000\u0583\u0584"+
		"\u0001\u0000\u0000\u0000\u0584\u0585\u0001\u0000\u0000\u0000\u0585\u0599"+
		"\u0005C\u0000\u0000\u0586\u058a\n\u0011\u0000\u0000\u0587\u0589\u0005"+
		".\u0000\u0000\u0588\u0587\u0001\u0000\u0000\u0000\u0589\u058c\u0001\u0000"+
		"\u0000\u0000\u058a\u0588\u0001\u0000\u0000\u0000\u058a\u058b\u0001\u0000"+
		"\u0000\u0000\u058b\u058d\u0001\u0000\u0000\u0000\u058c\u058a\u0001\u0000"+
		"\u0000\u0000\u058d\u0591\u0005(\u0000\u0000\u058e\u0590\u0005.\u0000\u0000"+
		"\u058f\u058e\u0001\u0000\u0000\u0000\u0590\u0593\u0001\u0000\u0000\u0000"+
		"\u0591\u058f\u0001\u0000\u0000\u0000\u0591\u0592\u0001\u0000\u0000\u0000"+
		"\u0592\u0594\u0001\u0000\u0000\u0000\u0593\u0591\u0001\u0000\u0000\u0000"+
		"\u0594\u0599\u0007\u0001\u0000\u0000\u0595\u0596\n\u0001\u0000\u0000\u0596"+
		"\u0597\u0005#\u0000\u0000\u0597\u0599\u0003\u000e\u0007\u0000\u0598\u0509"+
		"\u0001\u0000\u0000\u0000\u0598\u050c\u0001\u0000\u0000\u0000\u0598\u051b"+
		"\u0001\u0000\u0000\u0000\u0598\u052a\u0001\u0000\u0000\u0000\u0598\u052d"+
		"\u0001\u0000\u0000\u0000\u0598\u0530\u0001\u0000\u0000\u0000\u0598\u0533"+
		"\u0001\u0000\u0000\u0000\u0598\u0536\u0001\u0000\u0000\u0000\u0598\u053f"+
		"\u0001\u0000\u0000\u0000\u0598\u0542\u0001\u0000\u0000\u0000\u0598\u0551"+
		"\u0001\u0000\u0000\u0000\u0598\u0560\u0001\u0000\u0000\u0000\u0598\u0566"+
		"\u0001\u0000\u0000\u0000\u0598\u056b\u0001\u0000\u0000\u0000\u0598\u057a"+
		"\u0001\u0000\u0000\u0000\u0598\u0586\u0001\u0000\u0000\u0000\u0598\u0595"+
		"\u0001\u0000\u0000\u0000\u0599\u059c\u0001\u0000\u0000\u0000\u059a\u0598"+
		"\u0001\u0000\u0000\u0000\u059a\u059b\u0001\u0000\u0000\u0000\u059bS\u0001"+
		"\u0000\u0000\u0000\u059c\u059a\u0001\u0000\u0000\u0000\u059d\u059e\u0007"+
		"\u000b\u0000\u0000\u059eU\u0001\u0000\u0000\u0000\u059f\u05a0\u0003R)"+
		"\u0000\u05a0\u05a1\u00057\u0000\u0000\u05a1\u05a2\u0003R)\u0000\u05a2"+
		"\u05a7\u0001\u0000\u0000\u0000\u05a3\u05a4\u0005/\u0000\u0000\u05a4\u05a5"+
		"\u00058\u0000\u0000\u05a5\u05a7\u0003R)\u0000\u05a6\u059f\u0001\u0000"+
		"\u0000\u0000\u05a6\u05a3\u0001\u0000\u0000\u0000\u05a7W\u0001\u0000\u0000"+
		"\u0000\u00db\\`bhnv}\u0083\u0086\u008a\u008f\u0092\u0097\u00a2\u00a7\u00ab"+
		"\u00ae\u00b3\u00ba\u00c1\u00c7\u00ce\u00d2\u00d7\u00de\u00e2\u00e8\u00f0"+
		"\u00f7\u00fb\u00fd\u0100\u0105\u010a\u010e\u0118\u011b\u011e\u0125\u012a"+
		"\u0130\u0137\u013b\u0140\u0147\u014e\u0155\u015d\u0164\u0168\u016e\u0173"+
		"\u0178\u0181\u0184\u018b\u0190\u0193\u0196\u019a\u019f\u01a3\u01a8\u01ac"+
		"\u01b1\u01b3\u01ba\u01be\u01c1\u01c7\u01cd\u01d3\u01da\u01de\u01e6\u01ed"+
		"\u01f4\u01fa\u0200\u0204\u0209\u0210\u0217\u021b\u0220\u0227\u022b\u0230"+
		"\u0234\u0239\u023f\u0242\u0248\u024d\u0254\u025b\u0261\u0267\u026d\u0274"+
		"\u027b\u027f\u0287\u028c\u0293\u0299\u029f\u02a6\u02ab\u02bc\u02c1\u02c5"+
		"\u02ca\u02d1\u02d7\u02de\u02e4\u02eb\u02f2\u02f9\u0301\u0308\u030e\u0315"+
		"\u031c\u0320\u0325\u032b\u0332\u0339\u0340\u0348\u034f\u0356\u035d\u0364"+
		"\u036b\u0373\u037a\u0381\u0388\u0392\u039a\u03a1\u03a7\u03ae\u03b4\u03be"+
		"\u03c4\u03cf\u03d3\u03d5\u03db\u03e1\u03e5\u03ec\u03f2\u03fa\u0402\u0406"+
		"\u0409\u040f\u0416\u041f\u0426\u042d\u0433\u043a\u043e\u0443\u044a\u044e"+
		"\u0454\u045c\u0463\u0467\u0469\u046e\u0475\u047b\u0482\u048d\u0496\u049d"+
		"\u04ac\u04b4\u04ba\u04be\u04c0\u04c5\u04cf\u04d3\u04d5\u04e0\u04e7\u04ec"+
		"\u04f6\u04f9\u0501\u0507\u0510\u0517\u051f\u0526\u0538\u053c\u0546\u054d"+
		"\u0555\u055c\u056f\u0576\u057e\u0583\u058a\u0591\u0598\u059a\u05a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}