package gdscript_language;// Generated from GDScriptParser.g4 by ANTLR 4.12.0
import gdscript_language.listener.GDScriptParserListener;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GDScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "GDScriptParser.g4"; }

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
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public List<TopLevelDeclContext> topLevelDecl() {
			return getRuleContexts(TopLevelDeclContext.class);
		}
		public TopLevelDeclContext topLevelDecl(int i) {
			return getRuleContext(TopLevelDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(88);
				inheritance();
				setState(89);
				match(NEWLINE);
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS_NAME) {
				{
				setState(93);
				className();
				}
			}

			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184374185824L) != 0)) {
				{
				{
				setState(96);
				topLevelDecl();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(102);
				match(NEWLINE);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
		public List<TerminalNode> DOT() { return getTokens(GDScriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GDScriptParser.DOT, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitInheritance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceContext inheritance() throws RecognitionException {
		InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inheritance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(EXTENDS);
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(112);
				match(DOT);
				setState(113);
				match(IDENTIFIER);
				}
				}
				setState(118);
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
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(GDScriptParser.CLASS_NAME, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(CLASS_NAME);
			setState(120);
			match(IDENTIFIER);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(121);
				match(COMMA);
				setState(122);
				match(STRING);
				}
			}

			setState(125);
			match(NEWLINE);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitTopLevelDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelDeclContext topLevelDecl() throws RecognitionException {
		TopLevelDeclContext _localctx = new TopLevelDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_topLevelDecl);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				classVarDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				constDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				signalDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				enumDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				methodDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				constructorDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				innerClass();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(134);
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
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public TerminalNode ONREADY() { return getToken(GDScriptParser.ONREADY, 0); }
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public SetgetContext setget() {
			return getRuleContext(SetgetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GDScriptParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON_ASSIGN() { return getToken(GDScriptParser.COLON_ASSIGN, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitClassVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVarDeclContext classVarDecl() throws RecognitionException {
		ClassVarDeclContext _localctx = new ClassVarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONREADY) {
				{
				setState(137);
				match(ONREADY);
				}
			}

			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(140);
				export();
				}
			}

			setState(143);
			match(VAR);
			setState(144);
			match(IDENTIFIER);
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(145);
					match(COLON);
					setState(146);
					typeHint();
					}
				}

				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(149);
					match(ASSIGN);
					setState(150);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON_ASSIGN) {
					{
					setState(153);
					match(COLON_ASSIGN);
					setState(154);
					expression(0);
					}
				}

				}
				break;
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETGET) {
				{
				setState(159);
				setget();
				}
			}

			setState(162);
			match(NEWLINE);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitSetget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetgetContext setget() throws RecognitionException {
		SetgetContext _localctx = new SetgetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(SETGET);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(165);
				match(IDENTIFIER);
				}
			}

			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(168);
				match(COMMA);
				setState(169);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_export);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(EXPORT);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(173);
				match(OPEN_PAREN);
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BUILTINTYPE:
					{
					setState(174);
					match(BUILTINTYPE);
					}
					break;
				case IDENTIFIER:
					{
					setState(175);
					match(IDENTIFIER);
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(176);
						match(COMMA);
						setState(177);
						literal();
						}
						}
						setState(182);
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
				setState(185);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitTypeHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeHintContext typeHint() throws RecognitionException {
		TypeHintContext _localctx = new TypeHintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeHint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(CONST);
			setState(191);
			match(IDENTIFIER);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(192);
				match(COLON);
				setState(193);
				typeHint();
				}
			}

			setState(196);
			match(ASSIGN);
			setState(197);
			expression(0);
			setState(198);
			match(NEWLINE);
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
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitSignalDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignalDeclContext signalDecl() throws RecognitionException {
		SignalDeclContext _localctx = new SignalDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_signalDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(SIGNAL);
			setState(201);
			match(IDENTIFIER);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(202);
				signalParList();
				}
			}

			setState(205);
			match(NEWLINE);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitSignalParList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignalParListContext signalParList() throws RecognitionException {
		SignalParListContext _localctx = new SignalParListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signalParList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(OPEN_PAREN);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(208);
				match(IDENTIFIER);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(209);
					match(COMMA);
					setState(210);
					match(IDENTIFIER);
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(218);
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
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GDScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GDScriptParser.IDENTIFIER, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitEnumDecl(this);
			else return visitor.visitChildren(this);
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
			setState(220);
			match(ENUM);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(221);
				match(IDENTIFIER);
				}
			}

			setState(224);
			match(OPEN_BRACE);
			{
			setState(225);
			match(IDENTIFIER);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(226);
				match(ASSIGN);
				setState(227);
				expression(0);
				}
			}

			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(230);
					match(COMMA);
					setState(231);
					match(IDENTIFIER);
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(232);
						match(ASSIGN);
						setState(233);
						expression(0);
						}
					}

					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(241);
				match(COMMA);
				}
			}

			}
			setState(244);
			match(CLOSE_BRACE);
			setState(245);
			match(NEWLINE);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) {
				{
				setState(247);
				rpc();
				}
			}

			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(250);
				match(STATIC);
				}
			}

			setState(253);
			match(FUNC);
			setState(254);
			match(IDENTIFIER);
			setState(255);
			match(OPEN_PAREN);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==IDENTIFIER) {
				{
				setState(256);
				parList();
				}
			}

			setState(259);
			match(CLOSE_PAREN);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(260);
				match(ARROW);
				setState(261);
				typeHint();
				}
			}

			setState(264);
			match(COLON);
			setState(265);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitParList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParListContext parList() throws RecognitionException {
		ParListContext _localctx = new ParListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			parameter();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(268);
				match(COMMA);
				setState(269);
				parameter();
				}
				}
				setState(274);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(275);
				match(VAR);
				}
			}

			setState(278);
			match(IDENTIFIER);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(279);
				match(COLON);
				setState(280);
				typeHint();
				}
			}

			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(283);
				match(ASSIGN);
				setState(284);
				expression(0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitRpc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpcContext rpc() throws RecognitionException {
		RpcContext _localctx = new RpcContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rpc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) ) {
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
		public StmtOrSuiteContext stmtOrSuite() {
			return getRuleContext(StmtOrSuiteContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GDScriptParser.DOT, 0); }
		public ParListContext parList() {
			return getRuleContext(ParListContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitConstructorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclContext constructorDecl() throws RecognitionException {
		ConstructorDeclContext _localctx = new ConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constructorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(FUNC);
			setState(290);
			match(IDENTIFIER);
			setState(291);
			match(OPEN_PAREN);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==IDENTIFIER) {
				{
				setState(292);
				parList();
				}
			}

			setState(295);
			match(CLOSE_PAREN);
			{
			setState(296);
			match(DOT);
			setState(297);
			match(OPEN_PAREN);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709245L) != 0)) {
				{
				setState(298);
				argList();
				}
			}

			setState(301);
			match(CLOSE_PAREN);
			}
			setState(303);
			match(COLON);
			setState(304);
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
	public static class ArgListContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			expression(0);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(307);
				match(COMMA);
				setState(308);
				expression(0);
				}
				}
				setState(313);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitInnerClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerClassContext innerClass() throws RecognitionException {
		InnerClassContext _localctx = new InnerClassContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_innerClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(CLASS);
			setState(315);
			match(IDENTIFIER);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(316);
				inheritance();
				}
			}

			setState(319);
			match(COLON);
			setState(320);
			match(NEWLINE);
			setState(321);
			match(INDENT);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(322);
				inheritance();
				setState(323);
				match(NEWLINE);
				}
			}

			setState(328); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(327);
				topLevelDecl();
				}
				}
				setState(330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35184374185824L) != 0) );
			setState(332);
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
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitStmtOrSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtOrSuiteContext stmtOrSuite() throws RecognitionException {
		StmtOrSuiteContext _localctx = new StmtOrSuiteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stmtOrSuite);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case BREAKPOINT:
			case PASS:
			case IF:
			case WHILE:
			case FOR:
			case MATCH:
			case CONTINUE:
			case BREAK:
			case RETURN:
			case ASSERT:
			case YIELD:
			case PRELOAD:
			case NOT:
			case TRUE:
			case FALSE:
			case NULL:
			case SELF:
			case IDENTIFIER:
			case BUILTINTYPE:
			case CONSTANT:
			case STRING:
			case INTEGER:
			case FLOAT:
			case DOT:
			case OPEN_PAREN:
			case OPEN_BRACE:
			case OPEN_BRACK:
			case LOGIC_NOT:
			case ADD:
			case MINUS:
			case NOT_OP:
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(NEWLINE);
				setState(336);
				match(INDENT);
				setState(337);
				suite();
				setState(338);
				match(DEDENT);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(342);
				stmt();
				}
				}
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17907230332420160L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1660948549L) != 0) );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stmt);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				varDeclStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				ifStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				forStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				whileStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(351);
				matchStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(352);
				flowStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(353);
				assignmentStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(354);
				exprStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(355);
				assertStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(356);
				yieldStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(357);
				preloadStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(358);
				match(BREAKPOINT);
				setState(359);
				stmtEnd();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(360);
				match(PASS);
				setState(361);
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
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitStmtEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtEndContext stmtEnd() throws RecognitionException {
		StmtEndContext _localctx = new StmtEndContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stmtEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SEMI_COLON) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(IF);
			setState(367);
			expression(0);
			setState(368);
			match(COLON);
			setState(369);
			stmtOrSuite();
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(370);
					match(ELIF);
					setState(371);
					expression(0);
					setState(372);
					match(COLON);
					setState(373);
					stmtOrSuite();
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(380);
				match(ELSE);
				setState(381);
				match(COLON);
				setState(382);
				stmtOrSuite();
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
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GDScriptParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public StmtOrSuiteContext stmtOrSuite() {
			return getRuleContext(StmtOrSuiteContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(WHILE);
			setState(386);
			expression(0);
			setState(387);
			match(COLON);
			setState(388);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(FOR);
			setState(391);
			match(IDENTIFIER);
			setState(392);
			match(IN);
			setState(393);
			expression(0);
			setState(394);
			match(COLON);
			setState(395);
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
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(GDScriptParser.INDENT, 0); }
		public MatchBlockContext matchBlock() {
			return getRuleContext(MatchBlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(GDScriptParser.DEDENT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitMatchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchStmtContext matchStmt() throws RecognitionException {
		MatchStmtContext _localctx = new MatchStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_matchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(MATCH);
			setState(398);
			expression(0);
			setState(399);
			match(COLON);
			setState(400);
			match(NEWLINE);
			setState(401);
			match(INDENT);
			setState(402);
			matchBlock();
			setState(403);
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
		public List<PatternListContext> patternList() {
			return getRuleContexts(PatternListContext.class);
		}
		public PatternListContext patternList(int i) {
			return getRuleContext(PatternListContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitMatchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchBlockContext matchBlock() throws RecognitionException {
		MatchBlockContext _localctx = new MatchBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_matchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(405);
				patternList();
				setState(406);
				match(COLON);
				setState(407);
				stmtOrSuite();
				}
				}
				setState(411); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8866461766385728L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 25L) != 0) );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitPatternList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternListContext patternList() throws RecognitionException {
		PatternListContext _localctx = new PatternListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			pattern();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(414);
				match(COMMA);
				setState(415);
				pattern();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_pattern);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(BUILTINTYPE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				match(CONSTANT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				match(UNDERSCORE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				bindingPattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(426);
				arrayPattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(427);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitBindingPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingPatternContext bindingPattern() throws RecognitionException {
		BindingPatternContext _localctx = new BindingPatternContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bindingPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(VAR);
			setState(431);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitArrayPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayPatternContext arrayPattern() throws RecognitionException {
		ArrayPatternContext _localctx = new ArrayPatternContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(OPEN_BRACK);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8866461766385728L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 25L) != 0)) {
				{
				setState(434);
				pattern();
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(435);
					match(COMMA);
					setState(436);
					pattern();
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOTDOT) {
					{
					setState(442);
					match(DOTDOT);
					}
				}

				}
			}

			setState(447);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitDictPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictPatternContext dictPattern() throws RecognitionException {
		DictPatternContext _localctx = new DictPatternContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dictPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(OPEN_BRACE);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(450);
				keyValuePattern();
				}
			}

			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(453);
				match(COMMA);
				setState(454);
				keyValuePattern();
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(460);
				match(DOTDOT);
				}
			}

			setState(463);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitKeyValuePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValuePatternContext keyValuePattern() throws RecognitionException {
		KeyValuePatternContext _localctx = new KeyValuePatternContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_keyValuePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(STRING);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(466);
				match(COLON);
				setState(467);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitFlowStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlowStmtContext flowStmt() throws RecognitionException {
		FlowStmtContext _localctx = new FlowStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_flowStmt);
		int _la;
		try {
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(CONTINUE);
				setState(471);
				stmtEnd();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(BREAK);
				setState(473);
				stmtEnd();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(RETURN);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709245L) != 0)) {
					{
					setState(475);
					expression(0);
					}
				}

				setState(478);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assignmentStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			expression(0);
			setState(482);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1021L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(483);
			expression(0);
			setState(484);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GDScriptParser.ASSIGN, 0); }
		public TerminalNode COLON_ASSIGN() { return getToken(GDScriptParser.COLON_ASSIGN, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitVarDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclStmtContext varDeclStmt() throws RecognitionException {
		VarDeclStmtContext _localctx = new VarDeclStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_varDeclStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(VAR);
			setState(487);
			match(IDENTIFIER);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==COLON_ASSIGN) {
				{
				setState(488);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==COLON_ASSIGN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(489);
				expression(0);
				}
			}

			setState(492);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitAssertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStmtContext assertStmt() throws RecognitionException {
		AssertStmtContext _localctx = new AssertStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(ASSERT);
			setState(495);
			match(OPEN_PAREN);
			setState(496);
			expression(0);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(497);
				match(COMMA);
				setState(498);
				match(STRING);
				}
			}

			setState(501);
			match(CLOSE_PAREN);
			setState(502);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitYieldStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldStmtContext yieldStmt() throws RecognitionException {
		YieldStmtContext _localctx = new YieldStmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_yieldStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(YIELD);
			setState(505);
			match(OPEN_PAREN);
			{
			setState(506);
			expression(0);
			setState(507);
			match(COMMA);
			setState(508);
			expression(0);
			}
			setState(510);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitPreloadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreloadStmtContext preloadStmt() throws RecognitionException {
		PreloadStmtContext _localctx = new PreloadStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_preloadStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(PRELOAD);
			setState(513);
			match(OPEN_PAREN);
			setState(514);
			match(CONSTANT);
			setState(515);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			expression(0);
			setState(518);
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
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitBitShift(this);
			else return visitor.visitChildren(this);
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
		public ComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitBitOr(this);
			else return visitor.visitChildren(this);
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
		public LogicOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterLogicOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitLogicOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitLogicOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SignContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(GDScriptParser.MINUS, 0); }
		public TerminalNode ADD() { return getToken(GDScriptParser.ADD, 0); }
		public SignContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclContext extends ExpressionContext {
		public TerminalNode OPEN_BRACK() { return getToken(GDScriptParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(GDScriptParser.CLOSE_BRACK, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitArrayDecl(this);
			else return visitor.visitChildren(this);
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
		public IsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitIs(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitSubscription(this);
			else return visitor.visitChildren(this);
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
		public PlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ExpressionContext {
		public TerminalNode DOT() { return getToken(GDScriptParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitBitAnd(this);
			else return visitor.visitChildren(this);
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
		public LogicAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterLogicAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitLogicAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitLogicAnd(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitTernacyExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitDictDecl(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitBitXor(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitGetNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GDScriptParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public AttributeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitBitNot(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitLogicNot(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
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
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(521);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(522);
				match(FALSE);
				}
				break;
			case NULL:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(523);
				match(NULL);
				}
				break;
			case SELF:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(524);
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
				setState(525);
				literal();
				}
				break;
			case OPEN_BRACK:
				{
				_localctx = new ArrayDeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(526);
				match(OPEN_BRACK);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709245L) != 0)) {
					{
					setState(527);
					expression(0);
					setState(532);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(528);
							match(COMMA);
							setState(529);
							expression(0);
							}
							} 
						}
						setState(534);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(535);
						match(COMMA);
						}
					}

					}
				}

				setState(540);
				match(CLOSE_BRACK);
				}
				break;
			case OPEN_BRACE:
				{
				_localctx = new DictDeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(541);
				match(OPEN_BRACE);
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709245L) != 0)) {
					{
					setState(542);
					keyValue();
					setState(547);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(543);
							match(COMMA);
							setState(544);
							keyValue();
							}
							} 
						}
						setState(549);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(550);
						match(COMMA);
						}
					}

					}
				}

				setState(555);
				match(CLOSE_BRACE);
				}
				break;
			case OPEN_PAREN:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(556);
				match(OPEN_PAREN);
				setState(557);
				expression(0);
				setState(558);
				match(CLOSE_PAREN);
				}
				break;
			case DOT:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(560);
				match(DOT);
				setState(561);
				match(IDENTIFIER);
				setState(562);
				match(OPEN_PAREN);
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709245L) != 0)) {
					{
					setState(563);
					argList();
					}
				}

				setState(566);
				match(CLOSE_PAREN);
				}
				break;
			case DOLLAR:
				{
				_localctx = new GetNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(567);
				match(DOLLAR);
				setState(577);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(568);
					match(STRING);
					}
					break;
				case IDENTIFIER:
					{
					setState(569);
					match(IDENTIFIER);
					setState(574);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(570);
							match(DIV);
							setState(571);
							match(IDENTIFIER);
							}
							} 
						}
						setState(576);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
				setState(579);
				match(NOT_OP);
				setState(580);
				expression(16);
				}
				break;
			case ADD:
			case MINUS:
				{
				_localctx = new SignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(581);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(582);
				expression(15);
				}
				break;
			case NOT:
			case LOGIC_NOT:
				{
				_localctx = new LogicNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(583);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==LOGIC_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(584);
				expression(5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(648);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(646);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(587);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(588);
						_la = _input.LA(1);
						if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(589);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(590);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(591);
						match(ADD);
						setState(592);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(593);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(594);
						match(MINUS);
						setState(595);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new BitShiftContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(596);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(597);
						_la = _input.LA(1);
						if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(598);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new BitAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(599);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(600);
						match(AND_OP);
						setState(601);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new BitXorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(602);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(603);
						match(XOR);
						setState(604);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new BitOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(605);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(606);
						match(OR_OP);
						setState(607);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(608);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(609);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(610);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new InContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(611);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(612);
						match(IN);
						setState(613);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new LogicAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(614);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(615);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==LOGIC_AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(616);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new LogicOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(617);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(618);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==LOGIC_OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(619);
						expression(4);
						}
						break;
					case 12:
						{
						_localctx = new TernacyExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(620);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(621);
						match(IF);
						setState(622);
						expression(0);
						setState(623);
						match(ELSE);
						setState(624);
						expression(3);
						}
						break;
					case 13:
						{
						_localctx = new SubscriptionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(626);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(627);
						match(OPEN_BRACK);
						setState(628);
						expression(0);
						setState(629);
						match(CLOSE_BRACK);
						}
						break;
					case 14:
						{
						_localctx = new AttributeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(631);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(632);
						match(DOT);
						setState(633);
						match(IDENTIFIER);
						}
						break;
					case 15:
						{
						_localctx = new CallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(634);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(635);
						match(OPEN_PAREN);
						setState(637);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709245L) != 0)) {
							{
							setState(636);
							argList();
							}
						}

						setState(639);
						match(CLOSE_PAREN);
						}
						break;
					case 16:
						{
						_localctx = new IsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(640);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(641);
						match(IS);
						setState(642);
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
						setState(643);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(644);
						match(AS);
						setState(645);
						typeHint();
						}
						break;
					}
					} 
				}
				setState(650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8866461766385664L) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_keyValue);
		try {
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				expression(0);
				setState(654);
				match(COLON);
				setState(655);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				match(IDENTIFIER);
				setState(658);
				match(ASSIGN);
				setState(659);
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
		"\u0004\u0001a\u0297\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0000\u0003\u0000\\\b\u0000\u0001\u0000\u0003\u0000_\b\u0000\u0001"+
		"\u0000\u0005\u0000b\b\u0000\n\u0000\f\u0000e\t\u0000\u0001\u0000\u0005"+
		"\u0000h\b\u0000\n\u0000\f\u0000k\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001s\b\u0001\n\u0001"+
		"\f\u0001v\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002|\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0088\b\u0003\u0001\u0004\u0003\u0004\u008b\b\u0004\u0001\u0004"+
		"\u0003\u0004\u008e\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0094\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0098\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009c\b\u0004\u0003\u0004\u009e"+
		"\b\u0004\u0001\u0004\u0003\u0004\u00a1\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00a7\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00ab\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00b3\b\u0006\n\u0006\f\u0006\u00b6"+
		"\t\u0006\u0003\u0006\u00b8\b\u0006\u0001\u0006\u0003\u0006\u00bb\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c3"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00cc"+
		"\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00d4\b\n"+
		"\n\n\f\n\u00d7\t\n\u0003\n\u00d9\b\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00df\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00e5\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00eb\b\u000b\u0005\u000b\u00ed\b\u000b\n\u000b\f\u000b"+
		"\u00f0\t\u000b\u0001\u000b\u0003\u000b\u00f3\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0003\f\u00f9\b\f\u0001\f\u0003\f\u00fc\b\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0102\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0107\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u010f\b\r\n\r\f\r\u0112\t\r\u0001\u000e\u0003\u000e\u0115\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u011a\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u011e\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0126\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u012c\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0136\b\u0011\n\u0011\f\u0011\u0139\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u013e\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0146\b\u0012"+
		"\u0001\u0012\u0004\u0012\u0149\b\u0012\u000b\u0012\f\u0012\u014a\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0155\b\u0013\u0001\u0014\u0004\u0014\u0158"+
		"\b\u0014\u000b\u0014\f\u0014\u0159\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u016b\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u0178\b\u0017\n\u0017\f\u0017\u017b\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0180\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u019a"+
		"\b\u001b\u000b\u001b\f\u001b\u019b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u01a1\b\u001c\n\u001c\f\u001c\u01a4\t\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u01ad\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01b6\b\u001f\n\u001f\f\u001f"+
		"\u01b9\t\u001f\u0001\u001f\u0003\u001f\u01bc\b\u001f\u0003\u001f\u01be"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 \u01c4\b \u0001 "+
		"\u0001 \u0005 \u01c8\b \n \f \u01cb\t \u0001 \u0003 \u01ce\b \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0003!\u01d5\b!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0003\"\u01dd\b\"\u0001\"\u0003\"\u01e0\b\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0003$\u01eb\b$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01f4\b%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001)"+
		"\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u0213"+
		"\b)\n)\f)\u0216\t)\u0001)\u0003)\u0219\b)\u0003)\u021b\b)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u0222\b)\n)\f)\u0225\t)\u0001)\u0003)\u0228"+
		"\b)\u0003)\u022a\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u0235\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u023d\b)\n)\f)\u0240\t)\u0003)\u0242\b)\u0001)\u0001)\u0001)\u0001)"+
		"\u0001)\u0001)\u0003)\u024a\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u027e\b)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u0287\b)\n)\f)\u028a\t)\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0295\b+\u0001+\u0000"+
		"\u0001R,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTV\u0000\u000e\u0002\u0000"+
		"//22\u0001\u0000/0\u0001\u0000\u000e\u0013\u0002\u0000..KK\u0002\u0000"+
		"88:A\u0001\u000089\u0001\u0000Z[\u0002\u0000\'\'NN\u0001\u0000\\^\u0001"+
		"\u0000XY\u0001\u0000OT\u0002\u0000&&MM\u0002\u0000%%LL\u0001\u0000/4\u02e7"+
		"\u0000[\u0001\u0000\u0000\u0000\u0002n\u0001\u0000\u0000\u0000\u0004w"+
		"\u0001\u0000\u0000\u0000\u0006\u0087\u0001\u0000\u0000\u0000\b\u008a\u0001"+
		"\u0000\u0000\u0000\n\u00a4\u0001\u0000\u0000\u0000\f\u00ac\u0001\u0000"+
		"\u0000\u0000\u000e\u00bc\u0001\u0000\u0000\u0000\u0010\u00be\u0001\u0000"+
		"\u0000\u0000\u0012\u00c8\u0001\u0000\u0000\u0000\u0014\u00cf\u0001\u0000"+
		"\u0000\u0000\u0016\u00dc\u0001\u0000\u0000\u0000\u0018\u00f8\u0001\u0000"+
		"\u0000\u0000\u001a\u010b\u0001\u0000\u0000\u0000\u001c\u0114\u0001\u0000"+
		"\u0000\u0000\u001e\u011f\u0001\u0000\u0000\u0000 \u0121\u0001\u0000\u0000"+
		"\u0000\"\u0132\u0001\u0000\u0000\u0000$\u013a\u0001\u0000\u0000\u0000"+
		"&\u0154\u0001\u0000\u0000\u0000(\u0157\u0001\u0000\u0000\u0000*\u016a"+
		"\u0001\u0000\u0000\u0000,\u016c\u0001\u0000\u0000\u0000.\u016e\u0001\u0000"+
		"\u0000\u00000\u0181\u0001\u0000\u0000\u00002\u0186\u0001\u0000\u0000\u0000"+
		"4\u018d\u0001\u0000\u0000\u00006\u0199\u0001\u0000\u0000\u00008\u019d"+
		"\u0001\u0000\u0000\u0000:\u01ac\u0001\u0000\u0000\u0000<\u01ae\u0001\u0000"+
		"\u0000\u0000>\u01b1\u0001\u0000\u0000\u0000@\u01c1\u0001\u0000\u0000\u0000"+
		"B\u01d1\u0001\u0000\u0000\u0000D\u01df\u0001\u0000\u0000\u0000F\u01e1"+
		"\u0001\u0000\u0000\u0000H\u01e6\u0001\u0000\u0000\u0000J\u01ee\u0001\u0000"+
		"\u0000\u0000L\u01f8\u0001\u0000\u0000\u0000N\u0200\u0001\u0000\u0000\u0000"+
		"P\u0205\u0001\u0000\u0000\u0000R\u0249\u0001\u0000\u0000\u0000T\u028b"+
		"\u0001\u0000\u0000\u0000V\u0294\u0001\u0000\u0000\u0000XY\u0003\u0002"+
		"\u0001\u0000YZ\u0005.\u0000\u0000Z\\\u0001\u0000\u0000\u0000[X\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000]_\u0003"+
		"\u0004\u0002\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_c\u0001\u0000\u0000\u0000`b\u0003\u0006\u0003\u0000a`\u0001\u0000\u0000"+
		"\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000di\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fh\u0005"+
		".\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000lm\u0005\u0000\u0000\u0001m\u0001\u0001\u0000"+
		"\u0000\u0000no\u0005\u0003\u0000\u0000ot\u0007\u0000\u0000\u0000pq\u0005"+
		"5\u0000\u0000qs\u0005/\u0000\u0000rp\u0001\u0000\u0000\u0000sv\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0003"+
		"\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005\u0004\u0000"+
		"\u0000x{\u0005/\u0000\u0000yz\u00056\u0000\u0000z|\u00052\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}~\u0005.\u0000\u0000~\u0005\u0001\u0000\u0000\u0000\u007f\u0088"+
		"\u0003\b\u0004\u0000\u0080\u0088\u0003\u0010\b\u0000\u0081\u0088\u0003"+
		"\u0012\t\u0000\u0082\u0088\u0003\u0016\u000b\u0000\u0083\u0088\u0003\u0018"+
		"\f\u0000\u0084\u0088\u0003 \u0010\u0000\u0085\u0088\u0003$\u0012\u0000"+
		"\u0086\u0088\u0005-\u0000\u0000\u0087\u007f\u0001\u0000\u0000\u0000\u0087"+
		"\u0080\u0001\u0000\u0000\u0000\u0087\u0081\u0001\u0000\u0000\u0000\u0087"+
		"\u0082\u0001\u0000\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087"+
		"\u0084\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0007\u0001\u0000\u0000\u0000\u0089"+
		"\u008b\u0005\u0005\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c"+
		"\u008e\u0003\f\u0006\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\u0006\u0000\u0000\u0090\u009d\u0005/\u0000\u0000\u0091\u0092\u0005"+
		"7\u0000\u0000\u0092\u0094\u0003\u000e\u0007\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u00058\u0000\u0000\u0096\u0098\u0003R)\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u009e\u0001\u0000\u0000\u0000\u0099\u009a\u00059\u0000\u0000\u009a"+
		"\u009c\u0003R)\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u0093\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a0\u0001"+
		"\u0000\u0000\u0000\u009f\u00a1\u0003\n\u0005\u0000\u00a0\u009f\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0005.\u0000\u0000\u00a3\t\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a6\u0005\u0007\u0000\u0000\u00a5\u00a7\u0005/\u0000\u0000"+
		"\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a9\u00056\u0000\u0000\u00a9"+
		"\u00ab\u0005/\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u000b\u0001\u0000\u0000\u0000\u00ac\u00ba"+
		"\u0005\b\u0000\u0000\u00ad\u00b7\u0005B\u0000\u0000\u00ae\u00b8\u0005"+
		"0\u0000\u0000\u00af\u00b4\u0005/\u0000\u0000\u00b0\u00b1\u00056\u0000"+
		"\u0000\u00b1\u00b3\u0003T*\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b7\u00ae\u0001\u0000\u0000\u0000\u00b7"+
		"\u00af\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb\u0005C\u0000\u0000\u00ba\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\r\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0007\u0001\u0000\u0000\u00bd\u000f\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005\t\u0000\u0000\u00bf\u00c2\u0005/"+
		"\u0000\u0000\u00c0\u00c1\u00057\u0000\u0000\u00c1\u00c3\u0003\u000e\u0007"+
		"\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u00058\u0000\u0000"+
		"\u00c5\u00c6\u0003R)\u0000\u00c6\u00c7\u0005.\u0000\u0000\u00c7\u0011"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\n\u0000\u0000\u00c9\u00cb\u0005"+
		"/\u0000\u0000\u00ca\u00cc\u0003\u0014\n\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0005.\u0000\u0000\u00ce\u0013\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d8\u0005B\u0000\u0000\u00d0\u00d5\u0005/\u0000\u0000\u00d1"+
		"\u00d2\u00056\u0000\u0000\u00d2\u00d4\u0005/\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0005C\u0000\u0000\u00db\u0015\u0001\u0000"+
		"\u0000\u0000\u00dc\u00de\u0005\u000b\u0000\u0000\u00dd\u00df\u0005/\u0000"+
		"\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005D\u0000\u0000"+
		"\u00e1\u00e4\u0005/\u0000\u0000\u00e2\u00e3\u00058\u0000\u0000\u00e3\u00e5"+
		"\u0003R)\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u00ee\u0001\u0000\u0000\u0000\u00e6\u00e7\u00056\u0000"+
		"\u0000\u00e7\u00ea\u0005/\u0000\u0000\u00e8\u00e9\u00058\u0000\u0000\u00e9"+
		"\u00eb\u0003R)\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00e6\u0001"+
		"\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f3\u0005"+
		"6\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005E\u0000"+
		"\u0000\u00f5\u00f6\u0005.\u0000\u0000\u00f6\u0017\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f9\u0003\u001e\u000f\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fc\u0005\f\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005\r\u0000\u0000\u00fe\u00ff\u0005/\u0000\u0000\u00ff\u0101"+
		"\u0005B\u0000\u0000\u0100\u0102\u0003\u001a\r\u0000\u0101\u0100\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u0106\u0005C\u0000\u0000\u0104\u0105\u0005F\u0000"+
		"\u0000\u0105\u0107\u0003\u000e\u0007\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u00057\u0000\u0000\u0109\u010a\u0003&\u0013\u0000\u010a"+
		"\u0019\u0001\u0000\u0000\u0000\u010b\u0110\u0003\u001c\u000e\u0000\u010c"+
		"\u010d\u00056\u0000\u0000\u010d\u010f\u0003\u001c\u000e\u0000\u010e\u010c"+
		"\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u001b"+
		"\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0115"+
		"\u0005\u0006\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0119"+
		"\u0005/\u0000\u0000\u0117\u0118\u00057\u0000\u0000\u0118\u011a\u0003\u000e"+
		"\u0007\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000"+
		"\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u011c\u00058\u0000"+
		"\u0000\u011c\u011e\u0003R)\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u001d\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0007\u0002\u0000\u0000\u0120\u001f\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0005\r\u0000\u0000\u0122\u0123\u0005/\u0000\u0000\u0123\u0125"+
		"\u0005B\u0000\u0000\u0124\u0126\u0003\u001a\r\u0000\u0125\u0124\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0005C\u0000\u0000\u0128\u0129\u00055\u0000"+
		"\u0000\u0129\u012b\u0005B\u0000\u0000\u012a\u012c\u0003\"\u0011\u0000"+
		"\u012b\u012a\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0005C\u0000\u0000\u012e"+
		"\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u00057\u0000\u0000\u0130\u0131"+
		"\u0003&\u0013\u0000\u0131!\u0001\u0000\u0000\u0000\u0132\u0137\u0003R"+
		")\u0000\u0133\u0134\u00056\u0000\u0000\u0134\u0136\u0003R)\u0000\u0135"+
		"\u0133\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"#\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0005\u0014\u0000\u0000\u013b\u013d\u0005/\u0000\u0000\u013c\u013e\u0003"+
		"\u0002\u0001\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d\u013e\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0005"+
		"7\u0000\u0000\u0140\u0141\u0005.\u0000\u0000\u0141\u0145\u0005\u0001\u0000"+
		"\u0000\u0142\u0143\u0003\u0002\u0001\u0000\u0143\u0144\u0005.\u0000\u0000"+
		"\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0142\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000"+
		"\u0147\u0149\u0003\u0006\u0003\u0000\u0148\u0147\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0005\u0002\u0000\u0000\u014d%\u0001\u0000\u0000\u0000\u014e"+
		"\u0155\u0003*\u0015\u0000\u014f\u0150\u0005.\u0000\u0000\u0150\u0151\u0005"+
		"\u0001\u0000\u0000\u0151\u0152\u0003(\u0014\u0000\u0152\u0153\u0005\u0002"+
		"\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u014e\u0001\u0000"+
		"\u0000\u0000\u0154\u014f\u0001\u0000\u0000\u0000\u0155\'\u0001\u0000\u0000"+
		"\u0000\u0156\u0158\u0003*\u0015\u0000\u0157\u0156\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0001\u0000\u0000\u0000\u015a)\u0001\u0000\u0000\u0000\u015b"+
		"\u016b\u0003H$\u0000\u015c\u016b\u0003.\u0017\u0000\u015d\u016b\u0003"+
		"2\u0019\u0000\u015e\u016b\u00030\u0018\u0000\u015f\u016b\u00034\u001a"+
		"\u0000\u0160\u016b\u0003D\"\u0000\u0161\u016b\u0003F#\u0000\u0162\u016b"+
		"\u0003P(\u0000\u0163\u016b\u0003J%\u0000\u0164\u016b\u0003L&\u0000\u0165"+
		"\u016b\u0003N\'\u0000\u0166\u0167\u0005\u0015\u0000\u0000\u0167\u016b"+
		"\u0003,\u0016\u0000\u0168\u0169\u0005\u0016\u0000\u0000\u0169\u016b\u0003"+
		",\u0016\u0000\u016a\u015b\u0001\u0000\u0000\u0000\u016a\u015c\u0001\u0000"+
		"\u0000\u0000\u016a\u015d\u0001\u0000\u0000\u0000\u016a\u015e\u0001\u0000"+
		"\u0000\u0000\u016a\u015f\u0001\u0000\u0000\u0000\u016a\u0160\u0001\u0000"+
		"\u0000\u0000\u016a\u0161\u0001\u0000\u0000\u0000\u016a\u0162\u0001\u0000"+
		"\u0000\u0000\u016a\u0163\u0001\u0000\u0000\u0000\u016a\u0164\u0001\u0000"+
		"\u0000\u0000\u016a\u0165\u0001\u0000\u0000\u0000\u016a\u0166\u0001\u0000"+
		"\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b+\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0007\u0003\u0000\u0000\u016d-\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0005\u0017\u0000\u0000\u016f\u0170\u0003R)\u0000\u0170\u0171"+
		"\u00057\u0000\u0000\u0171\u0179\u0003&\u0013\u0000\u0172\u0173\u0005\u0018"+
		"\u0000\u0000\u0173\u0174\u0003R)\u0000\u0174\u0175\u00057\u0000\u0000"+
		"\u0175\u0176\u0003&\u0013\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177"+
		"\u0172\u0001\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179"+
		"\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a"+
		"\u017f\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0005$\u0000\u0000\u017d\u017e\u00057\u0000\u0000\u017e\u0180\u0003"+
		"&\u0013\u0000\u017f\u017c\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180/\u0001\u0000\u0000\u0000\u0181\u0182\u0005\u0019\u0000"+
		"\u0000\u0182\u0183\u0003R)\u0000\u0183\u0184\u00057\u0000\u0000\u0184"+
		"\u0185\u0003&\u0013\u0000\u01851\u0001\u0000\u0000\u0000\u0186\u0187\u0005"+
		"\u001a\u0000\u0000\u0187\u0188\u0005/\u0000\u0000\u0188\u0189\u0005\u001b"+
		"\u0000\u0000\u0189\u018a\u0003R)\u0000\u018a\u018b\u00057\u0000\u0000"+
		"\u018b\u018c\u0003&\u0013\u0000\u018c3\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0005\u001c\u0000\u0000\u018e\u018f\u0003R)\u0000\u018f\u0190\u00057"+
		"\u0000\u0000\u0190\u0191\u0005.\u0000\u0000\u0191\u0192\u0005\u0001\u0000"+
		"\u0000\u0192\u0193\u00036\u001b\u0000\u0193\u0194\u0005\u0002\u0000\u0000"+
		"\u01945\u0001\u0000\u0000\u0000\u0195\u0196\u00038\u001c\u0000\u0196\u0197"+
		"\u00057\u0000\u0000\u0197\u0198\u0003&\u0013\u0000\u0198\u019a\u0001\u0000"+
		"\u0000\u0000\u0199\u0195\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000"+
		"\u0000\u0000\u019c7\u0001\u0000\u0000\u0000\u019d\u01a2\u0003:\u001d\u0000"+
		"\u019e\u019f\u00056\u0000\u0000\u019f\u01a1\u0003:\u001d\u0000\u01a0\u019e"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a39\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01ad\u0003"+
		"T*\u0000\u01a6\u01ad\u00050\u0000\u0000\u01a7\u01ad\u00051\u0000\u0000"+
		"\u01a8\u01ad\u0005G\u0000\u0000\u01a9\u01ad\u0003<\u001e\u0000\u01aa\u01ad"+
		"\u0003>\u001f\u0000\u01ab\u01ad\u0003@ \u0000\u01ac\u01a5\u0001\u0000"+
		"\u0000\u0000\u01ac\u01a6\u0001\u0000\u0000\u0000\u01ac\u01a7\u0001\u0000"+
		"\u0000\u0000\u01ac\u01a8\u0001\u0000\u0000\u0000\u01ac\u01a9\u0001\u0000"+
		"\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ad;\u0001\u0000\u0000\u0000\u01ae\u01af\u0005\u0006\u0000"+
		"\u0000\u01af\u01b0\u0005/\u0000\u0000\u01b0=\u0001\u0000\u0000\u0000\u01b1"+
		"\u01bd\u0005H\u0000\u0000\u01b2\u01b7\u0003:\u001d\u0000\u01b3\u01b4\u0005"+
		"6\u0000\u0000\u01b4\u01b6\u0003:\u001d\u0000\u01b5\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000"+
		"\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bc\u0005J\u0000\u0000"+
		"\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01b2\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0005I\u0000\u0000\u01c0?\u0001\u0000\u0000\u0000\u01c1\u01c3"+
		"\u0005D\u0000\u0000\u01c2\u01c4\u0003B!\u0000\u01c3\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u00056\u0000\u0000\u01c6\u01c8\u0003B!\u0000"+
		"\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01cb\u0001\u0000\u0000\u0000"+
		"\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cd\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ce\u0005J\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01cd"+
		"\u01ce\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0005E\u0000\u0000\u01d0A\u0001\u0000\u0000\u0000\u01d1\u01d4\u0005"+
		"2\u0000\u0000\u01d2\u01d3\u00057\u0000\u0000\u01d3\u01d5\u0003:\u001d"+
		"\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d5C\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005\u001d\u0000\u0000"+
		"\u01d7\u01e0\u0003,\u0016\u0000\u01d8\u01d9\u0005\u001e\u0000\u0000\u01d9"+
		"\u01e0\u0003,\u0016\u0000\u01da\u01dc\u0005\u001f\u0000\u0000\u01db\u01dd"+
		"\u0003R)\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000"+
		"\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01e0\u0003,\u0016"+
		"\u0000\u01df\u01d6\u0001\u0000\u0000\u0000\u01df\u01d8\u0001\u0000\u0000"+
		"\u0000\u01df\u01da\u0001\u0000\u0000\u0000\u01e0E\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e2\u0003R)\u0000\u01e2\u01e3\u0007\u0004\u0000\u0000\u01e3\u01e4"+
		"\u0003R)\u0000\u01e4\u01e5\u0003,\u0016\u0000\u01e5G\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e7\u0005\u0006\u0000\u0000\u01e7\u01ea\u0005/\u0000\u0000"+
		"\u01e8\u01e9\u0007\u0005\u0000\u0000\u01e9\u01eb\u0003R)\u0000\u01ea\u01e8"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ed\u0003,\u0016\u0000\u01edI\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ef\u0005 \u0000\u0000\u01ef\u01f0\u0005B\u0000\u0000"+
		"\u01f0\u01f3\u0003R)\u0000\u01f1\u01f2\u00056\u0000\u0000\u01f2\u01f4"+
		"\u00052\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005"+
		"C\u0000\u0000\u01f6\u01f7\u0003,\u0016\u0000\u01f7K\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f9\u0005!\u0000\u0000\u01f9\u01fa\u0005B\u0000\u0000\u01fa"+
		"\u01fb\u0003R)\u0000\u01fb\u01fc\u00056\u0000\u0000\u01fc\u01fd\u0003"+
		"R)\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005C\u0000"+
		"\u0000\u01ffM\u0001\u0000\u0000\u0000\u0200\u0201\u0005\"\u0000\u0000"+
		"\u0201\u0202\u0005B\u0000\u0000\u0202\u0203\u00051\u0000\u0000\u0203\u0204"+
		"\u0005C\u0000\u0000\u0204O\u0001\u0000\u0000\u0000\u0205\u0206\u0003R"+
		")\u0000\u0206\u0207\u0003,\u0016\u0000\u0207Q\u0001\u0000\u0000\u0000"+
		"\u0208\u0209\u0006)\uffff\uffff\u0000\u0209\u024a\u0005)\u0000\u0000\u020a"+
		"\u024a\u0005*\u0000\u0000\u020b\u024a\u0005+\u0000\u0000\u020c\u024a\u0005"+
		",\u0000\u0000\u020d\u024a\u0003T*\u0000\u020e\u021a\u0005H\u0000\u0000"+
		"\u020f\u0214\u0003R)\u0000\u0210\u0211\u00056\u0000\u0000\u0211\u0213"+
		"\u0003R)\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0213\u0216\u0001\u0000"+
		"\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000"+
		"\u0000\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000"+
		"\u0000\u0000\u0217\u0219\u00056\u0000\u0000\u0218\u0217\u0001\u0000\u0000"+
		"\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021b\u0001\u0000\u0000"+
		"\u0000\u021a\u020f\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000"+
		"\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u024a\u0005I\u0000\u0000"+
		"\u021d\u0229\u0005D\u0000\u0000\u021e\u0223\u0003V+\u0000\u021f\u0220"+
		"\u00056\u0000\u0000\u0220\u0222\u0003V+\u0000\u0221\u021f\u0001\u0000"+
		"\u0000\u0000\u0222\u0225\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000"+
		"\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000"+
		"\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0226\u0228\u00056\u0000"+
		"\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000"+
		"\u0000\u0228\u022a\u0001\u0000\u0000\u0000\u0229\u021e\u0001\u0000\u0000"+
		"\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000"+
		"\u0000\u022b\u024a\u0005E\u0000\u0000\u022c\u022d\u0005B\u0000\u0000\u022d"+
		"\u022e\u0003R)\u0000\u022e\u022f\u0005C\u0000\u0000\u022f\u024a\u0001"+
		"\u0000\u0000\u0000\u0230\u0231\u00055\u0000\u0000\u0231\u0232\u0005/\u0000"+
		"\u0000\u0232\u0234\u0005B\u0000\u0000\u0233\u0235\u0003\"\u0011\u0000"+
		"\u0234\u0233\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000"+
		"\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u024a\u0005C\u0000\u0000\u0237"+
		"\u0241\u0005`\u0000\u0000\u0238\u0242\u00052\u0000\u0000\u0239\u023e\u0005"+
		"/\u0000\u0000\u023a\u023b\u0005]\u0000\u0000\u023b\u023d\u0005/\u0000"+
		"\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u0240\u0001\u0000\u0000"+
		"\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000"+
		"\u0000\u023f\u0242\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000"+
		"\u0000\u0241\u0238\u0001\u0000\u0000\u0000\u0241\u0239\u0001\u0000\u0000"+
		"\u0000\u0242\u024a\u0001\u0000\u0000\u0000\u0243\u0244\u0005_\u0000\u0000"+
		"\u0244\u024a\u0003R)\u0010\u0245\u0246\u0007\u0006\u0000\u0000\u0246\u024a"+
		"\u0003R)\u000f\u0247\u0248\u0007\u0007\u0000\u0000\u0248\u024a\u0003R"+
		")\u0005\u0249\u0208\u0001\u0000\u0000\u0000\u0249\u020a\u0001\u0000\u0000"+
		"\u0000\u0249\u020b\u0001\u0000\u0000\u0000\u0249\u020c\u0001\u0000\u0000"+
		"\u0000\u0249\u020d\u0001\u0000\u0000\u0000\u0249\u020e\u0001\u0000\u0000"+
		"\u0000\u0249\u021d\u0001\u0000\u0000\u0000\u0249\u022c\u0001\u0000\u0000"+
		"\u0000\u0249\u0230\u0001\u0000\u0000\u0000\u0249\u0237\u0001\u0000\u0000"+
		"\u0000\u0249\u0243\u0001\u0000\u0000\u0000\u0249\u0245\u0001\u0000\u0000"+
		"\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u024a\u0288\u0001\u0000\u0000"+
		"\u0000\u024b\u024c\n\u000e\u0000\u0000\u024c\u024d\u0007\b\u0000\u0000"+
		"\u024d\u0287\u0003R)\u000f\u024e\u024f\n\r\u0000\u0000\u024f\u0250\u0005"+
		"Z\u0000\u0000\u0250\u0287\u0003R)\u000e\u0251\u0252\n\f\u0000\u0000\u0252"+
		"\u0253\u0005[\u0000\u0000\u0253\u0287\u0003R)\r\u0254\u0255\n\u000b\u0000"+
		"\u0000\u0255\u0256\u0007\t\u0000\u0000\u0256\u0287\u0003R)\f\u0257\u0258"+
		"\n\n\u0000\u0000\u0258\u0259\u0005W\u0000\u0000\u0259\u0287\u0003R)\u000b"+
		"\u025a\u025b\n\t\u0000\u0000\u025b\u025c\u0005V\u0000\u0000\u025c\u0287"+
		"\u0003R)\n\u025d\u025e\n\b\u0000\u0000\u025e\u025f\u0005U\u0000\u0000"+
		"\u025f\u0287\u0003R)\t\u0260\u0261\n\u0007\u0000\u0000\u0261\u0262\u0007"+
		"\n\u0000\u0000\u0262\u0287\u0003R)\b\u0263\u0264\n\u0006\u0000\u0000\u0264"+
		"\u0265\u0005\u001b\u0000\u0000\u0265\u0287\u0003R)\u0007\u0266\u0267\n"+
		"\u0004\u0000\u0000\u0267\u0268\u0007\u000b\u0000\u0000\u0268\u0287\u0003"+
		"R)\u0005\u0269\u026a\n\u0003\u0000\u0000\u026a\u026b\u0007\f\u0000\u0000"+
		"\u026b\u0287\u0003R)\u0004\u026c\u026d\n\u0002\u0000\u0000\u026d\u026e"+
		"\u0005\u0017\u0000\u0000\u026e\u026f\u0003R)\u0000\u026f\u0270\u0005$"+
		"\u0000\u0000\u0270\u0271\u0003R)\u0003\u0271\u0287\u0001\u0000\u0000\u0000"+
		"\u0272\u0273\n\u0016\u0000\u0000\u0273\u0274\u0005H\u0000\u0000\u0274"+
		"\u0275\u0003R)\u0000\u0275\u0276\u0005I\u0000\u0000\u0276\u0287\u0001"+
		"\u0000\u0000\u0000\u0277\u0278\n\u0015\u0000\u0000\u0278\u0279\u00055"+
		"\u0000\u0000\u0279\u0287\u0005/\u0000\u0000\u027a\u027b\n\u0014\u0000"+
		"\u0000\u027b\u027d\u0005B\u0000\u0000\u027c\u027e\u0003\"\u0011\u0000"+
		"\u027d\u027c\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000"+
		"\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0287\u0005C\u0000\u0000\u0280"+
		"\u0281\n\u0011\u0000\u0000\u0281\u0282\u0005(\u0000\u0000\u0282\u0287"+
		"\u0007\u0001\u0000\u0000\u0283\u0284\n\u0001\u0000\u0000\u0284\u0285\u0005"+
		"#\u0000\u0000\u0285\u0287\u0003\u000e\u0007\u0000\u0286\u024b\u0001\u0000"+
		"\u0000\u0000\u0286\u024e\u0001\u0000\u0000\u0000\u0286\u0251\u0001\u0000"+
		"\u0000\u0000\u0286\u0254\u0001\u0000\u0000\u0000\u0286\u0257\u0001\u0000"+
		"\u0000\u0000\u0286\u025a\u0001\u0000\u0000\u0000\u0286\u025d\u0001\u0000"+
		"\u0000\u0000\u0286\u0260\u0001\u0000\u0000\u0000\u0286\u0263\u0001\u0000"+
		"\u0000\u0000\u0286\u0266\u0001\u0000\u0000\u0000\u0286\u0269\u0001\u0000"+
		"\u0000\u0000\u0286\u026c\u0001\u0000\u0000\u0000\u0286\u0272\u0001\u0000"+
		"\u0000\u0000\u0286\u0277\u0001\u0000\u0000\u0000\u0286\u027a\u0001\u0000"+
		"\u0000\u0000\u0286\u0280\u0001\u0000\u0000\u0000\u0286\u0283\u0001\u0000"+
		"\u0000\u0000\u0287\u028a\u0001\u0000\u0000\u0000\u0288\u0286\u0001\u0000"+
		"\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289S\u0001\u0000\u0000"+
		"\u0000\u028a\u0288\u0001\u0000\u0000\u0000\u028b\u028c\u0007\r\u0000\u0000"+
		"\u028cU\u0001\u0000\u0000\u0000\u028d\u028e\u0003R)\u0000\u028e\u028f"+
		"\u00057\u0000\u0000\u028f\u0290\u0003R)\u0000\u0290\u0295\u0001\u0000"+
		"\u0000\u0000\u0291\u0292\u0005/\u0000\u0000\u0292\u0293\u00058\u0000\u0000"+
		"\u0293\u0295\u0003R)\u0000\u0294\u028d\u0001\u0000\u0000\u0000\u0294\u0291"+
		"\u0001\u0000\u0000\u0000\u0295W\u0001\u0000\u0000\u0000K[^cit{\u0087\u008a"+
		"\u008d\u0093\u0097\u009b\u009d\u00a0\u00a6\u00aa\u00b4\u00b7\u00ba\u00c2"+
		"\u00cb\u00d5\u00d8\u00de\u00e4\u00ea\u00ee\u00f2\u00f8\u00fb\u0101\u0106"+
		"\u0110\u0114\u0119\u011d\u0125\u012b\u0137\u013d\u0145\u014a\u0154\u0159"+
		"\u016a\u0179\u017f\u019b\u01a2\u01ac\u01b7\u01bb\u01bd\u01c3\u01c9\u01cd"+
		"\u01d4\u01dc\u01df\u01ea\u01f3\u0214\u0218\u021a\u0223\u0227\u0229\u0234"+
		"\u023e\u0241\u0249\u027d\u0286\u0288\u0294";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}