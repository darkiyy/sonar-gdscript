package gdscript_language;// Generated from java-escape by ANTLR 4.11.1
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitProgram(this);
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
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						{
						setState(88);
						inheritance();
						setState(89);
						match(NEWLINE);
						}
						}
						break;
					case 2:
						{
						setState(91);
						className();
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					topLevelDecl();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(103);
				match(NEWLINE);
				}
			}

			setState(106);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterInheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitInheritance(this);
		}
	}

	public final InheritanceContext inheritance() throws RecognitionException {
		InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inheritance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(108);
				match(NEWLINE);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(EXTENDS);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(115);
				match(NEWLINE);
				}
			}

			setState(118);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(119);
				match(DOT);
				setState(120);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_className);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(123);
				match(NEWLINE);
				}
			}

			setState(126);
			match(CLASS_NAME);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(127);
				match(NEWLINE);
				}
			}

			setState(130);
			match(IDENTIFIER);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(131);
				match(COMMA);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(132);
					match(NEWLINE);
					}
				}

				setState(135);
				match(STRING);
				}
			}

			setState(138);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterTopLevelDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitTopLevelDecl(this);
		}
	}

	public final TopLevelDeclContext topLevelDecl() throws RecognitionException {
		TopLevelDeclContext _localctx = new TopLevelDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_topLevelDecl);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				classVarDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				constDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				signalDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				enumDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				methodDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				constructorDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				innerClass();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(147);
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
		public TerminalNode COLON_ASSIGN() { return getToken(GDScriptParser.COLON_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		public ClassVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterClassVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitClassVarDecl(this);
		}
	}

	public final ClassVarDeclContext classVarDecl() throws RecognitionException {
		ClassVarDeclContext _localctx = new ClassVarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(150);
				match(NEWLINE);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONREADY) {
				{
				setState(156);
				match(ONREADY);
				}
			}

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(159);
				export();
				}
			}

			setState(162);
			match(VAR);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(163);
				match(NEWLINE);
				}
			}

			setState(166);
			match(IDENTIFIER);
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(167);
				match(NEWLINE);
				}
				break;
			}
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SETGET:
			case NEWLINE:
			case COLON:
			case ASSIGN:
				{
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(170);
					match(COLON);
					setState(171);
					typeHint();
					}
				}

				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(174);
					match(ASSIGN);
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(175);
						match(NEWLINE);
						}
					}

					setState(178);
					expression(0);
					}
				}

				}
				break;
			case COLON_ASSIGN:
				{
				setState(181);
				match(COLON_ASSIGN);
				setState(182);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETGET) {
				{
				setState(185);
				setget();
				}
			}

			setState(188);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterSetget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitSetget(this);
		}
	}

	public final SetgetContext setget() throws RecognitionException {
		SetgetContext _localctx = new SetgetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(SETGET);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(191);
				match(IDENTIFIER);
				}
			}

			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(194);
				match(COMMA);
				setState(195);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitExport(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_export);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(EXPORT);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(199);
				match(OPEN_PAREN);
				setState(209);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BUILTINTYPE:
					{
					setState(200);
					match(BUILTINTYPE);
					}
					break;
				case IDENTIFIER:
					{
					setState(201);
					match(IDENTIFIER);
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(202);
						match(COMMA);
						setState(203);
						literal();
						}
						}
						setState(208);
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
				setState(211);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterTypeHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitTypeHint(this);
		}
	}

	public final TypeHintContext typeHint() throws RecognitionException {
		TypeHintContext _localctx = new TypeHintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeHint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitConstDecl(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(216);
				match(NEWLINE);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			match(CONST);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(223);
				match(NEWLINE);
				}
			}

			setState(226);
			match(IDENTIFIER);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(227);
				match(COLON);
				setState(228);
				typeHint();
				}
			}

			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(231);
				match(NEWLINE);
				}
			}

			setState(234);
			match(ASSIGN);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(235);
				match(NEWLINE);
				}
			}

			setState(238);
			expression(0);
			setState(239);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterSignalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitSignalDecl(this);
		}
	}

	public final SignalDeclContext signalDecl() throws RecognitionException {
		SignalDeclContext _localctx = new SignalDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_signalDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(SIGNAL);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(242);
				match(NEWLINE);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(IDENTIFIER);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(249);
				signalParList();
				}
			}

			setState(252);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterSignalParList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitSignalParList(this);
		}
	}

	public final SignalParListContext signalParList() throws RecognitionException {
		SignalParListContext _localctx = new SignalParListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signalParList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(OPEN_PAREN);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(255);
				match(IDENTIFIER);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(256);
					match(COMMA);
					setState(257);
					match(IDENTIFIER);
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(265);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterEnumDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitEnumDecl(this);
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
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(267);
				match(NEWLINE);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(ENUM);
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(274);
				match(NEWLINE);
				}
				break;
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(277);
				match(IDENTIFIER);
				}
			}

			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(280);
				match(NEWLINE);
				}
			}

			setState(283);
			match(OPEN_BRACE);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(284);
				match(NEWLINE);
				}
			}

			{
			setState(287);
			match(IDENTIFIER);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(288);
				match(ASSIGN);
				setState(289);
				expression(0);
				}
			}

			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(292);
					match(COMMA);
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(293);
						match(NEWLINE);
						}
					}

					setState(296);
					match(IDENTIFIER);
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(297);
						match(ASSIGN);
						setState(298);
						expression(0);
						}
					}

					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(306);
				match(COMMA);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(307);
					match(NEWLINE);
					}
				}

				}
			}

			}
			setState(312);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitMethodDecl(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(314);
				match(NEWLINE);
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0) {
				{
				setState(320);
				rpc();
				}
			}

			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(323);
				match(STATIC);
				}
			}

			setState(326);
			match(FUNC);
			setState(327);
			match(IDENTIFIER);
			setState(328);
			match(OPEN_PAREN);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==IDENTIFIER) {
				{
				setState(329);
				parList();
				}
			}

			setState(332);
			match(CLOSE_PAREN);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(333);
				match(ARROW);
				setState(334);
				typeHint();
				}
			}

			setState(337);
			match(COLON);
			setState(338);
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
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public ParListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterParList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitParList(this);
		}
	}

	public final ParListContext parList() throws RecognitionException {
		ParListContext _localctx = new ParListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			parameter();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(341);
				match(COMMA);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(342);
					match(NEWLINE);
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				parameter();
				}
				}
				setState(353);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(354);
				match(VAR);
				}
			}

			setState(357);
			match(IDENTIFIER);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(358);
				match(COLON);
				setState(359);
				typeHint();
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(362);
				match(ASSIGN);
				setState(363);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterRpc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitRpc(this);
		}
	}

	public final RpcContext rpc() throws RecognitionException {
		RpcContext _localctx = new RpcContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rpc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterConstructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitConstructorDecl(this);
		}
	}

	public final ConstructorDeclContext constructorDecl() throws RecognitionException {
		ConstructorDeclContext _localctx = new ConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constructorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(368);
				match(NEWLINE);
				}
			}

			setState(371);
			match(FUNC);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(372);
				match(NEWLINE);
				}
			}

			setState(375);
			match(IDENTIFIER);
			setState(376);
			match(OPEN_PAREN);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==IDENTIFIER) {
				{
				setState(377);
				parList();
				}
			}

			setState(380);
			match(CLOSE_PAREN);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(381);
				match(DOT);
				setState(382);
				match(OPEN_PAREN);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709245L) != 0) {
					{
					setState(383);
					argList();
					}
				}

				setState(386);
				match(CLOSE_PAREN);
				}
			}

			setState(389);
			match(COLON);
			setState(390);
			match(NEWLINE);
			setState(391);
			stmtOrSuite();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASS) {
				{
				setState(392);
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
		public List<TerminalNode> COMMA() { return getTokens(GDScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GDScriptParser.COMMA, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitArgList(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			expression(0);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(396);
				match(COMMA);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(397);
					match(NEWLINE);
					}
				}

				setState(400);
				expression(0);
				}
				}
				setState(405);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterInnerClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitInnerClass(this);
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
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(406);
				match(NEWLINE);
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			match(CLASS);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(413);
				match(NEWLINE);
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
			match(IDENTIFIER);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==NEWLINE) {
				{
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(420);
						match(NEWLINE);
						}
						} 
					}
					setState(425);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				setState(426);
				inheritance();
				}
			}

			setState(429);
			match(COLON);
			setState(430);
			match(NEWLINE);
			setState(431);
			match(INDENT);
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(432);
				inheritance();
				setState(433);
				match(NEWLINE);
				}
				break;
			}
			setState(438); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(437);
				topLevelDecl();
				}
				}
				setState(440); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 105553118363488L) != 0 );
			setState(442);
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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterStmtOrSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitStmtOrSuite(this);
		}
	}

	public final StmtOrSuiteContext stmtOrSuite() throws RecognitionException {
		StmtOrSuiteContext _localctx = new StmtOrSuiteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stmtOrSuite);
		try {
			int _alt;
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(444);
						stmt();
						}
						} 
					}
					setState(449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(NEWLINE);
				setState(451);
				match(INDENT);
				setState(452);
				suite();
				setState(453);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitSuite(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(457);
				stmt();
				}
				}
				setState(460); 
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stmt);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				varDeclStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				ifStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				forStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
				whileStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(466);
				matchStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(467);
				flowStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(468);
				assignmentStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(469);
				exprStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(470);
				assertStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(471);
				yieldStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(472);
				preloadStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(473);
				match(BREAKPOINT);
				setState(474);
				stmtEnd();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(475);
				match(PASS);
				setState(476);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterStmtEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitStmtEnd(this);
		}
	}

	public final StmtEndContext stmtEnd() throws RecognitionException {
		StmtEndContext _localctx = new StmtEndContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stmtEnd);
		try {
			setState(483);
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
				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(479);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case SEMI_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitIfStmt(this);
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
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(485);
				match(NEWLINE);
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			match(IF);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(492);
				match(NEWLINE);
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(498);
			expression(0);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(499);
				match(NEWLINE);
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
			match(COLON);
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(506);
					match(NEWLINE);
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(512);
			stmtOrSuite();
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(513);
						match(NEWLINE);
						}
						}
						setState(518);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(519);
					match(ELIF);
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(520);
						match(NEWLINE);
						}
						}
						setState(525);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(526);
					expression(0);
					setState(527);
					match(COLON);
					setState(531);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(528);
							match(NEWLINE);
							}
							} 
						}
						setState(533);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
					}
					setState(534);
					stmtOrSuite();
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
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
				match(ELSE);
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
				match(COLON);
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(555);
						match(NEWLINE);
						}
						} 
					}
					setState(560);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				setState(561);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitWhileStmt(this);
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
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(564);
				match(NEWLINE);
				}
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(570);
			match(WHILE);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(571);
				match(NEWLINE);
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577);
			expression(0);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(578);
				match(NEWLINE);
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(584);
			match(COLON);
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(585);
					match(NEWLINE);
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(591);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitForStmt(this);
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
			match(FOR);
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
			match(IDENTIFIER);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(607);
				match(NEWLINE);
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613);
			match(IN);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(614);
				match(NEWLINE);
				}
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(620);
			expression(0);
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(621);
				match(NEWLINE);
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(627);
			match(COLON);
			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(628);
					match(NEWLINE);
					}
					} 
				}
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			setState(634);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterMatchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitMatchStmt(this);
		}
	}

	public final MatchStmtContext matchStmt() throws RecognitionException {
		MatchStmtContext _localctx = new MatchStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_matchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(MATCH);
			setState(637);
			expression(0);
			setState(638);
			match(NEWLINE);
			setState(639);
			match(INDENT);
			setState(640);
			matchBlock();
			setState(641);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterMatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitMatchBlock(this);
		}
	}

	public final MatchBlockContext matchBlock() throws RecognitionException {
		MatchBlockContext _localctx = new MatchBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_matchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(643);
				patternList();
				setState(644);
				match(COLON);
				setState(645);
				stmtOrSuite();
				}
				}
				setState(649); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 8866461766385728L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 25L) != 0 );
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterPatternList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitPatternList(this);
		}
	}

	public final PatternListContext patternList() throws RecognitionException {
		PatternListContext _localctx = new PatternListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			pattern();
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(652);
				match(COMMA);
				setState(653);
				pattern();
				}
				}
				setState(658);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_pattern);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				match(BUILTINTYPE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				match(CONSTANT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(662);
				match(UNDERSCORE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(663);
				bindingPattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(664);
				arrayPattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(665);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterBindingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitBindingPattern(this);
		}
	}

	public final BindingPatternContext bindingPattern() throws RecognitionException {
		BindingPatternContext _localctx = new BindingPatternContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bindingPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(VAR);
			setState(669);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterArrayPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitArrayPattern(this);
		}
	}

	public final ArrayPatternContext arrayPattern() throws RecognitionException {
		ArrayPatternContext _localctx = new ArrayPatternContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(OPEN_BRACK);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8866461766385728L) != 0 || (((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 25L) != 0) {
				{
				setState(672);
				pattern();
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(673);
					match(COMMA);
					setState(674);
					pattern();
					}
					}
					setState(679);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOTDOT) {
					{
					setState(680);
					match(DOTDOT);
					}
				}

				}
			}

			setState(685);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterDictPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitDictPattern(this);
		}
	}

	public final DictPatternContext dictPattern() throws RecognitionException {
		DictPatternContext _localctx = new DictPatternContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dictPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(OPEN_BRACE);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(688);
				keyValuePattern();
				}
			}

			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(691);
				match(COMMA);
				setState(692);
				keyValuePattern();
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(698);
				match(DOTDOT);
				}
			}

			setState(701);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterKeyValuePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitKeyValuePattern(this);
		}
	}

	public final KeyValuePatternContext keyValuePattern() throws RecognitionException {
		KeyValuePatternContext _localctx = new KeyValuePatternContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_keyValuePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(STRING);
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(704);
				match(COLON);
				setState(705);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterFlowStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitFlowStmt(this);
		}
	}

	public final FlowStmtContext flowStmt() throws RecognitionException {
		FlowStmtContext _localctx = new FlowStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_flowStmt);
		try {
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				match(CONTINUE);
				setState(709);
				stmtEnd();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				match(BREAK);
				setState(711);
				stmtEnd();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				match(RETURN);
				setState(714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(713);
					expression(0);
					}
					break;
				}
				setState(716);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitAssignmentStmt(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assignmentStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			expression(0);
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(720);
				match(NEWLINE);
				}
			}

			setState(723);
			_la = _input.LA(1);
			if ( !((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1021L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(724);
				match(NEWLINE);
				}
			}

			setState(727);
			expression(0);
			setState(728);
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
		public TerminalNode ASSIGN() { return getToken(GDScriptParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterVarDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitVarDeclStmt(this);
		}
	}

	public final VarDeclStmtContext varDeclStmt() throws RecognitionException {
		VarDeclStmtContext _localctx = new VarDeclStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_varDeclStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(730);
				match(NEWLINE);
				}
				}
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(736);
			match(VAR);
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
			match(IDENTIFIER);
			setState(752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(744);
					match(NEWLINE);
					}
				}

				setState(747);
				match(ASSIGN);
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(748);
					match(NEWLINE);
					}
				}

				setState(751);
				expression(0);
				}
				break;
			}
			setState(754);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterAssertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitAssertStmt(this);
		}
	}

	public final AssertStmtContext assertStmt() throws RecognitionException {
		AssertStmtContext _localctx = new AssertStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(ASSERT);
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(757);
				match(NEWLINE);
				}
			}

			setState(760);
			match(OPEN_PAREN);
			setState(761);
			expression(0);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(762);
				match(COMMA);
				setState(763);
				match(STRING);
				}
			}

			setState(766);
			match(CLOSE_PAREN);
			setState(767);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterYieldStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitYieldStmt(this);
		}
	}

	public final YieldStmtContext yieldStmt() throws RecognitionException {
		YieldStmtContext _localctx = new YieldStmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_yieldStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(YIELD);
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(770);
				match(NEWLINE);
				}
			}

			setState(773);
			match(OPEN_PAREN);
			{
			setState(774);
			expression(0);
			setState(775);
			match(COMMA);
			setState(776);
			expression(0);
			}
			setState(778);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterPreloadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitPreloadStmt(this);
		}
	}

	public final PreloadStmtContext preloadStmt() throws RecognitionException {
		PreloadStmtContext _localctx = new PreloadStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_preloadStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(PRELOAD);
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(781);
				match(NEWLINE);
				}
			}

			setState(784);
			match(OPEN_PAREN);
			setState(785);
			match(CONSTANT);
			setState(786);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitExprStmt(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exprStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			expression(0);
			setState(792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(789);
					match(NEWLINE);
					}
					} 
				}
				setState(794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			setState(795);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitMinus(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterBitShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitBitShift(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitComparison(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitIn(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterBitOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitBitOr(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterLogicOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitLogicOr(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitSign(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitArrayDecl(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitIs(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterSubscription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitSubscription(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitPlus(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitCall(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitCast(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterBitAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitBitAnd(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterLogicAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitLogicAnd(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterTernacyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitTernacyExpr(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterDictDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitDictDecl(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterBitXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitBitXor(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterGetNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitGetNode(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitAttribute(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitFactor(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterBitNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitBitNot(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterLogicNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitLogicNot(this);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitPrimary(this);
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
			setState(880);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(798);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(799);
				match(FALSE);
				}
				break;
			case NULL:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(800);
				match(NULL);
				}
				break;
			case SELF:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(801);
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
				setState(802);
				literal();
				}
				break;
			case OPEN_BRACK:
				{
				_localctx = new ArrayDeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(803);
				match(OPEN_BRACK);
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(804);
						match(NEWLINE);
						}
						} 
					}
					setState(809);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709245L) != 0) {
					{
					setState(810);
					expression(0);
					setState(821);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(811);
							match(COMMA);
							setState(815);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NEWLINE) {
								{
								{
								setState(812);
								match(NEWLINE);
								}
								}
								setState(817);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(818);
							expression(0);
							}
							} 
						}
						setState(823);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
					}
					setState(825);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(824);
						match(COMMA);
						}
					}

					}
				}

				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(829);
					match(NEWLINE);
					}
					}
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(835);
				match(CLOSE_BRACK);
				}
				break;
			case OPEN_BRACE:
				{
				_localctx = new DictDeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(836);
				match(OPEN_BRACE);
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709245L) != 0) {
					{
					setState(837);
					keyValue();
					setState(842);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(838);
							match(COMMA);
							setState(839);
							keyValue();
							}
							} 
						}
						setState(844);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
					}
					setState(846);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(845);
						match(COMMA);
						}
					}

					}
				}

				setState(850);
				match(CLOSE_BRACE);
				}
				break;
			case OPEN_PAREN:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(851);
				match(OPEN_PAREN);
				setState(852);
				expression(0);
				setState(853);
				match(CLOSE_PAREN);
				}
				break;
			case DOT:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(855);
				match(DOT);
				setState(856);
				match(IDENTIFIER);
				setState(857);
				match(OPEN_PAREN);
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709245L) != 0) {
					{
					setState(858);
					argList();
					}
				}

				setState(861);
				match(CLOSE_PAREN);
				}
				break;
			case DOLLAR:
				{
				_localctx = new GetNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(862);
				match(DOLLAR);
				setState(872);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(863);
					match(STRING);
					}
					break;
				case IDENTIFIER:
					{
					setState(864);
					match(IDENTIFIER);
					setState(869);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(865);
							match(DIV);
							setState(866);
							match(IDENTIFIER);
							}
							} 
						}
						setState(871);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
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
				setState(874);
				match(NOT_OP);
				setState(875);
				expression(16);
				}
				break;
			case ADD:
			case MINUS:
				{
				_localctx = new SignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(876);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(877);
				expression(15);
				}
				break;
			case NOT:
			case LOGIC_NOT:
				{
				_localctx = new LogicNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(878);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==LOGIC_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(879);
				expression(5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(959);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(882);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(883);
						_la = _input.LA(1);
						if ( !((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 7L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(884);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(885);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(889);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(886);
							match(NEWLINE);
							}
							}
							setState(891);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(892);
						match(ADD);
						setState(896);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(893);
							match(NEWLINE);
							}
							}
							setState(898);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(899);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(900);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(901);
						match(MINUS);
						setState(902);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new BitShiftContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(903);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(904);
						_la = _input.LA(1);
						if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(905);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new BitAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(906);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(907);
						match(AND_OP);
						setState(908);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new BitXorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(909);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(910);
						match(XOR);
						setState(911);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new BitOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(912);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(913);
						match(OR_OP);
						setState(914);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(915);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(917);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(916);
							match(NEWLINE);
							}
						}

						setState(919);
						_la = _input.LA(1);
						if ( !((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 63L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(921);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(920);
							match(NEWLINE);
							}
						}

						setState(923);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new InContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(924);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(925);
						match(IN);
						setState(926);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new LogicAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(927);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(928);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==LOGIC_AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(929);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new LogicOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(930);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(931);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==LOGIC_OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(932);
						expression(4);
						}
						break;
					case 12:
						{
						_localctx = new TernacyExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(933);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(934);
						match(IF);
						setState(935);
						expression(0);
						setState(936);
						match(ELSE);
						setState(937);
						expression(3);
						}
						break;
					case 13:
						{
						_localctx = new SubscriptionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(939);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(940);
						match(OPEN_BRACK);
						setState(941);
						expression(0);
						setState(942);
						match(CLOSE_BRACK);
						}
						break;
					case 14:
						{
						_localctx = new AttributeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(944);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(945);
						match(DOT);
						setState(946);
						match(IDENTIFIER);
						}
						break;
					case 15:
						{
						_localctx = new CallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(947);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(948);
						match(OPEN_PAREN);
						setState(950);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 222928740571709245L) != 0) {
							{
							setState(949);
							argList();
							}
						}

						setState(952);
						match(CLOSE_PAREN);
						}
						break;
					case 16:
						{
						_localctx = new IsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(953);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(954);
						match(IS);
						setState(955);
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
						setState(956);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(957);
						match(AS);
						setState(958);
						typeHint();
						}
						break;
					}
					} 
				}
				setState(963);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).enterKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitKeyValue(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_keyValue);
		try {
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				expression(0);
				setState(967);
				match(COLON);
				setState(968);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				match(IDENTIFIER);
				setState(971);
				match(ASSIGN);
				setState(972);
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
		"\u0004\u0001a\u03d0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0000\u0001\u0000\u0005\u0000]\b\u0000\n\u0000\f\u0000`\t\u0000"+
		"\u0001\u0000\u0005\u0000c\b\u0000\n\u0000\f\u0000f\t\u0000\u0001\u0000"+
		"\u0003\u0000i\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		"n\b\u0001\n\u0001\f\u0001q\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"u\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001z\b\u0001\u0001"+
		"\u0002\u0003\u0002}\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0081"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0086\b\u0002"+
		"\u0001\u0002\u0003\u0002\u0089\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0095\b\u0003\u0001\u0004\u0005\u0004\u0098\b"+
		"\u0004\n\u0004\f\u0004\u009b\t\u0004\u0001\u0004\u0003\u0004\u009e\b\u0004"+
		"\u0001\u0004\u0003\u0004\u00a1\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00a5\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a9\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00ad\b\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00b1\b\u0004\u0001\u0004\u0003\u0004\u00b4\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00b8\b\u0004\u0001\u0004\u0003\u0004\u00bb\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u00c1"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c5\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00cd\b\u0006\n\u0006\f\u0006\u00d0\t\u0006\u0003\u0006\u00d2\b\u0006"+
		"\u0001\u0006\u0003\u0006\u00d5\b\u0006\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0005\b\u00da\b\b\n\b\f\b\u00dd\t\b\u0001\b\u0001\b\u0003\b\u00e1\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00e6\b\b\u0001\b\u0003\b\u00e9\b\b\u0001"+
		"\b\u0001\b\u0003\b\u00ed\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005"+
		"\t\u00f4\b\t\n\t\f\t\u00f7\t\t\u0001\t\u0001\t\u0003\t\u00fb\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0103\b\n\n\n\f\n\u0106"+
		"\t\n\u0003\n\u0108\b\n\u0001\n\u0001\n\u0001\u000b\u0005\u000b\u010d\b"+
		"\u000b\n\u000b\f\u000b\u0110\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0114\b\u000b\u0001\u000b\u0003\u000b\u0117\b\u000b\u0001\u000b\u0003"+
		"\u000b\u011a\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u011e\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0123\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0127\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u012c\b\u000b\u0005\u000b\u012e\b\u000b\n\u000b\f\u000b\u0131"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0135\b\u000b\u0003\u000b"+
		"\u0137\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u013c\b\f\n\f\f"+
		"\f\u013f\t\f\u0001\f\u0003\f\u0142\b\f\u0001\f\u0003\f\u0145\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u014b\b\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0150\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u0158"+
		"\b\r\n\r\f\r\u015b\t\r\u0001\r\u0005\r\u015e\b\r\n\r\f\r\u0161\t\r\u0001"+
		"\u000e\u0003\u000e\u0164\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0169\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u016d\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010\u0172\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0176\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u017b\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0181\b\u0010\u0001\u0010\u0003\u0010\u0184\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u018a\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u018f\b\u0011\u0001\u0011\u0005"+
		"\u0011\u0192\b\u0011\n\u0011\f\u0011\u0195\t\u0011\u0001\u0012\u0005\u0012"+
		"\u0198\b\u0012\n\u0012\f\u0012\u019b\t\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u019f\b\u0012\n\u0012\f\u0012\u01a2\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u01a6\b\u0012\n\u0012\f\u0012\u01a9\t\u0012\u0001\u0012\u0003"+
		"\u0012\u01ac\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u01b4\b\u0012\u0001\u0012\u0004\u0012\u01b7"+
		"\b\u0012\u000b\u0012\f\u0012\u01b8\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0005\u0013\u01be\b\u0013\n\u0013\f\u0013\u01c1\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01c8\b\u0013\u0001"+
		"\u0014\u0004\u0014\u01cb\b\u0014\u000b\u0014\f\u0014\u01cc\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01de\b\u0015\u0001\u0016\u0003\u0016"+
		"\u01e1\b\u0016\u0001\u0016\u0003\u0016\u01e4\b\u0016\u0001\u0017\u0005"+
		"\u0017\u01e7\b\u0017\n\u0017\f\u0017\u01ea\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u01ee\b\u0017\n\u0017\f\u0017\u01f1\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u01f5\b\u0017\n\u0017\f\u0017\u01f8\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u01fc\b\u0017\n\u0017\f\u0017\u01ff\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0203\b\u0017\n\u0017\f\u0017\u0206\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u020a\b\u0017\n\u0017\f\u0017\u020d"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0212\b\u0017"+
		"\n\u0017\f\u0017\u0215\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0219"+
		"\b\u0017\n\u0017\f\u0017\u021c\t\u0017\u0001\u0017\u0005\u0017\u021f\b"+
		"\u0017\n\u0017\f\u0017\u0222\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u0226\b\u0017\n\u0017\f\u0017\u0229\t\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u022d\b\u0017\n\u0017\f\u0017\u0230\t\u0017\u0001\u0017\u0003\u0017"+
		"\u0233\b\u0017\u0001\u0018\u0005\u0018\u0236\b\u0018\n\u0018\f\u0018\u0239"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u023d\b\u0018\n\u0018\f\u0018"+
		"\u0240\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0244\b\u0018\n\u0018"+
		"\f\u0018\u0247\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u024b\b\u0018"+
		"\n\u0018\f\u0018\u024e\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0005"+
		"\u0019\u0253\b\u0019\n\u0019\f\u0019\u0256\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u025a\b\u0019\n\u0019\f\u0019\u025d\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0261\b\u0019\n\u0019\f\u0019\u0264\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0268\b\u0019\n\u0019\f\u0019\u026b\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u026f\b\u0019\n\u0019\f\u0019\u0272\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u0276\b\u0019\n\u0019\f\u0019\u0279"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0004\u001b\u0288\b\u001b\u000b\u001b\f\u001b\u0289"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u028f\b\u001c\n\u001c"+
		"\f\u001c\u0292\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u029b\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u02a4\b\u001f\n\u001f\f\u001f\u02a7\t\u001f\u0001\u001f\u0003"+
		"\u001f\u02aa\b\u001f\u0003\u001f\u02ac\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0003 \u02b2\b \u0001 \u0001 \u0005 \u02b6\b \n \f \u02b9"+
		"\t \u0001 \u0003 \u02bc\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u02c3"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02cb\b\""+
		"\u0001\"\u0003\"\u02ce\b\"\u0001#\u0001#\u0003#\u02d2\b#\u0001#\u0001"+
		"#\u0003#\u02d6\b#\u0001#\u0001#\u0001#\u0001$\u0005$\u02dc\b$\n$\f$\u02df"+
		"\t$\u0001$\u0001$\u0005$\u02e3\b$\n$\f$\u02e6\t$\u0001$\u0001$\u0003$"+
		"\u02ea\b$\u0001$\u0001$\u0003$\u02ee\b$\u0001$\u0003$\u02f1\b$\u0001$"+
		"\u0001$\u0001%\u0001%\u0003%\u02f7\b%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u02fd\b%\u0001%\u0001%\u0001%\u0001&\u0001&\u0003&\u0304\b&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0003\'\u030f\b\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0005(\u0317\b(\n(\f(\u031a"+
		"\t(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0005)\u0326\b)\n)\f)\u0329\t)\u0001)\u0001)\u0001)\u0005)\u032e\b)"+
		"\n)\f)\u0331\t)\u0001)\u0005)\u0334\b)\n)\f)\u0337\t)\u0001)\u0003)\u033a"+
		"\b)\u0003)\u033c\b)\u0001)\u0005)\u033f\b)\n)\f)\u0342\t)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u0349\b)\n)\f)\u034c\t)\u0001)\u0003)\u034f"+
		"\b)\u0003)\u0351\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u035c\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u0364\b)\n)\f)\u0367\t)\u0003)\u0369\b)\u0001)\u0001)\u0001)\u0001)"+
		"\u0001)\u0001)\u0003)\u0371\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u0378\b)\n)\f)\u037b\t)\u0001)\u0001)\u0005)\u037f\b)\n)\f)\u0382\t"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0396"+
		"\b)\u0001)\u0001)\u0003)\u039a\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u03b7\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0005)\u03c0\b)\n)\f)\u03c3\t)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u03ce\b+\u0001+\u0000\u0001R,\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTV\u0000\f\u0002\u0000//22\u0001\u0000/0\u0001"+
		"\u0000\u000e\u0013\u0002\u000088:A\u0001\u0000Z[\u0002\u0000\'\'NN\u0001"+
		"\u0000\\^\u0001\u0000XY\u0001\u0000OT\u0002\u0000&&MM\u0002\u0000%%LL"+
		"\u0001\u0000/4\u0465\u0000^\u0001\u0000\u0000\u0000\u0002o\u0001\u0000"+
		"\u0000\u0000\u0004|\u0001\u0000\u0000\u0000\u0006\u0094\u0001\u0000\u0000"+
		"\u0000\b\u0099\u0001\u0000\u0000\u0000\n\u00be\u0001\u0000\u0000\u0000"+
		"\f\u00c6\u0001\u0000\u0000\u0000\u000e\u00d6\u0001\u0000\u0000\u0000\u0010"+
		"\u00db\u0001\u0000\u0000\u0000\u0012\u00f1\u0001\u0000\u0000\u0000\u0014"+
		"\u00fe\u0001\u0000\u0000\u0000\u0016\u010e\u0001\u0000\u0000\u0000\u0018"+
		"\u013d\u0001\u0000\u0000\u0000\u001a\u0154\u0001\u0000\u0000\u0000\u001c"+
		"\u0163\u0001\u0000\u0000\u0000\u001e\u016e\u0001\u0000\u0000\u0000 \u0171"+
		"\u0001\u0000\u0000\u0000\"\u018b\u0001\u0000\u0000\u0000$\u0199\u0001"+
		"\u0000\u0000\u0000&\u01c7\u0001\u0000\u0000\u0000(\u01ca\u0001\u0000\u0000"+
		"\u0000*\u01dd\u0001\u0000\u0000\u0000,\u01e3\u0001\u0000\u0000\u0000."+
		"\u01e8\u0001\u0000\u0000\u00000\u0237\u0001\u0000\u0000\u00002\u0254\u0001"+
		"\u0000\u0000\u00004\u027c\u0001\u0000\u0000\u00006\u0287\u0001\u0000\u0000"+
		"\u00008\u028b\u0001\u0000\u0000\u0000:\u029a\u0001\u0000\u0000\u0000<"+
		"\u029c\u0001\u0000\u0000\u0000>\u029f\u0001\u0000\u0000\u0000@\u02af\u0001"+
		"\u0000\u0000\u0000B\u02bf\u0001\u0000\u0000\u0000D\u02cd\u0001\u0000\u0000"+
		"\u0000F\u02cf\u0001\u0000\u0000\u0000H\u02dd\u0001\u0000\u0000\u0000J"+
		"\u02f4\u0001\u0000\u0000\u0000L\u0301\u0001\u0000\u0000\u0000N\u030c\u0001"+
		"\u0000\u0000\u0000P\u0314\u0001\u0000\u0000\u0000R\u0370\u0001\u0000\u0000"+
		"\u0000T\u03c4\u0001\u0000\u0000\u0000V\u03cd\u0001\u0000\u0000\u0000X"+
		"Y\u0003\u0002\u0001\u0000YZ\u0005.\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[]\u0003\u0004\u0002\u0000\\X\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_d\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ac\u0003"+
		"\u0006\u0003\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000gi\u0005.\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005\u0000"+
		"\u0000\u0001k\u0001\u0001\u0000\u0000\u0000ln\u0005.\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000rt\u0005\u0003\u0000\u0000su\u0005.\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vy\u0007\u0000"+
		"\u0000\u0000wx\u00055\u0000\u0000xz\u0005/\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z\u0003\u0001\u0000\u0000\u0000{}\u0005"+
		".\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0080\u0005\u0004\u0000\u0000\u007f\u0081\u0005.\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0088\u0005/\u0000\u0000"+
		"\u0083\u0085\u00056\u0000\u0000\u0084\u0086\u0005.\u0000\u0000\u0085\u0084"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0089\u00052\u0000\u0000\u0088\u0083\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005.\u0000\u0000\u008b\u0005\u0001\u0000"+
		"\u0000\u0000\u008c\u0095\u0003\b\u0004\u0000\u008d\u0095\u0003\u0010\b"+
		"\u0000\u008e\u0095\u0003\u0012\t\u0000\u008f\u0095\u0003\u0016\u000b\u0000"+
		"\u0090\u0095\u0003\u0018\f\u0000\u0091\u0095\u0003 \u0010\u0000\u0092"+
		"\u0095\u0003$\u0012\u0000\u0093\u0095\u0005-\u0000\u0000\u0094\u008c\u0001"+
		"\u0000\u0000\u0000\u0094\u008d\u0001\u0000\u0000\u0000\u0094\u008e\u0001"+
		"\u0000\u0000\u0000\u0094\u008f\u0001\u0000\u0000\u0000\u0094\u0090\u0001"+
		"\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0007\u0001"+
		"\u0000\u0000\u0000\u0096\u0098\u0005.\u0000\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009e\u0005\u0005"+
		"\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u00a1\u0003\f\u0006"+
		"\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005\u0006\u0000"+
		"\u0000\u00a3\u00a5\u0005.\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a8\u0005/\u0000\u0000\u00a7\u00a9\u0005.\u0000\u0000\u00a8\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00b7"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u00057\u0000\u0000\u00ab\u00ad\u0003"+
		"\u000e\u0007\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b3\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005"+
		"8\u0000\u0000\u00af\u00b1\u0005.\u0000\u0000\u00b0\u00af\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b4\u0003R)\u0000\u00b3\u00ae\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b8\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u00059\u0000\u0000\u00b6\u00b8\u0003R)\u0000\u00b7\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bb\u0003\n\u0005\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005.\u0000\u0000\u00bd\t\u0001\u0000\u0000"+
		"\u0000\u00be\u00c0\u0005\u0007\u0000\u0000\u00bf\u00c1\u0005/\u0000\u0000"+
		"\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c3\u00056\u0000\u0000\u00c3"+
		"\u00c5\u0005/\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u000b\u0001\u0000\u0000\u0000\u00c6\u00d4"+
		"\u0005\b\u0000\u0000\u00c7\u00d1\u0005B\u0000\u0000\u00c8\u00d2\u0005"+
		"0\u0000\u0000\u00c9\u00ce\u0005/\u0000\u0000\u00ca\u00cb\u00056\u0000"+
		"\u0000\u00cb\u00cd\u0003T*\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd"+
		"\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d1\u00c8\u0001\u0000\u0000\u0000\u00d1"+
		"\u00c9\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0005C\u0000\u0000\u00d4\u00c7"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\r\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0007\u0001\u0000\u0000\u00d7\u000f\u0001"+
		"\u0000\u0000\u0000\u00d8\u00da\u0005.\u0000\u0000\u00d9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00e0\u0005\t\u0000"+
		"\u0000\u00df\u00e1\u0005.\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e5\u0005/\u0000\u0000\u00e3\u00e4\u00057\u0000\u0000\u00e4\u00e6"+
		"\u0003\u000e\u0007\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e9"+
		"\u0005.\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec\u0005"+
		"8\u0000\u0000\u00eb\u00ed\u0005.\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0003R)\u0000\u00ef\u00f0\u0005.\u0000\u0000\u00f0"+
		"\u0011\u0001\u0000\u0000\u0000\u00f1\u00f5\u0005\n\u0000\u0000\u00f2\u00f4"+
		"\u0005.\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fa\u0005/\u0000\u0000\u00f9\u00fb\u0003\u0014"+
		"\n\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005.\u0000\u0000"+
		"\u00fd\u0013\u0001\u0000\u0000\u0000\u00fe\u0107\u0005B\u0000\u0000\u00ff"+
		"\u0104\u0005/\u0000\u0000\u0100\u0101\u00056\u0000\u0000\u0101\u0103\u0005"+
		"/\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000"+
		"\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
		"\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000"+
		"\u0000\u0000\u0107\u00ff\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0005C\u0000"+
		"\u0000\u010a\u0015\u0001\u0000\u0000\u0000\u010b\u010d\u0005.\u0000\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0111\u0113\u0005\u000b\u0000\u0000\u0112\u0114\u0005.\u0000\u0000\u0113"+
		"\u0112\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114"+
		"\u0116\u0001\u0000\u0000\u0000\u0115\u0117\u0005/\u0000\u0000\u0116\u0115"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119"+
		"\u0001\u0000\u0000\u0000\u0118\u011a\u0005.\u0000\u0000\u0119\u0118\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b\u011d\u0005D\u0000\u0000\u011c\u011e\u0005.\u0000"+
		"\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0122\u0005/\u0000\u0000"+
		"\u0120\u0121\u00058\u0000\u0000\u0121\u0123\u0003R)\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u012f"+
		"\u0001\u0000\u0000\u0000\u0124\u0126\u00056\u0000\u0000\u0125\u0127\u0005"+
		".\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012b\u0005/\u0000"+
		"\u0000\u0129\u012a\u00058\u0000\u0000\u012a\u012c\u0003R)\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c"+
		"\u012e\u0001\u0000\u0000\u0000\u012d\u0124\u0001\u0000\u0000\u0000\u012e"+
		"\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0001\u0000\u0000\u0000\u0130\u0136\u0001\u0000\u0000\u0000\u0131"+
		"\u012f\u0001\u0000\u0000\u0000\u0132\u0134\u00056\u0000\u0000\u0133\u0135"+
		"\u0005.\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0134\u0135\u0001"+
		"\u0000\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0132\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0005E\u0000\u0000\u0139\u0017\u0001\u0000"+
		"\u0000\u0000\u013a\u013c\u0005.\u0000\u0000\u013b\u013a\u0001\u0000\u0000"+
		"\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000"+
		"\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0142\u0003\u001e\u000f"+
		"\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"+
		"\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0145\u0005\f\u0000\u0000"+
		"\u0144\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0005\r\u0000\u0000\u0147"+
		"\u0148\u0005/\u0000\u0000\u0148\u014a\u0005B\u0000\u0000\u0149\u014b\u0003"+
		"\u001a\r\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014f\u0005C\u0000"+
		"\u0000\u014d\u014e\u0005F\u0000\u0000\u014e\u0150\u0003\u000e\u0007\u0000"+
		"\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u00057\u0000\u0000\u0152"+
		"\u0153\u0003&\u0013\u0000\u0153\u0019\u0001\u0000\u0000\u0000\u0154\u015f"+
		"\u0003\u001c\u000e\u0000\u0155\u0159\u00056\u0000\u0000\u0156\u0158\u0005"+
		".\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000"+
		"\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000"+
		"\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015c\u015e\u0003\u001c\u000e\u0000\u015d\u0155\u0001\u0000"+
		"\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u001b\u0001\u0000"+
		"\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0164\u0005\u0006"+
		"\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0168\u0005/\u0000"+
		"\u0000\u0166\u0167\u00057\u0000\u0000\u0167\u0169\u0003\u000e\u0007\u0000"+
		"\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000"+
		"\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u016b\u00058\u0000\u0000\u016b"+
		"\u016d\u0003R)\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001"+
		"\u0000\u0000\u0000\u016d\u001d\u0001\u0000\u0000\u0000\u016e\u016f\u0007"+
		"\u0002\u0000\u0000\u016f\u001f\u0001\u0000\u0000\u0000\u0170\u0172\u0005"+
		".\u0000\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0175\u0005\r\u0000"+
		"\u0000\u0174\u0176\u0005.\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000"+
		"\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000"+
		"\u0177\u0178\u0005/\u0000\u0000\u0178\u017a\u0005B\u0000\u0000\u0179\u017b"+
		"\u0003\u001a\r\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017a\u017b\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u0183\u0005"+
		"C\u0000\u0000\u017d\u017e\u00055\u0000\u0000\u017e\u0180\u0005B\u0000"+
		"\u0000\u017f\u0181\u0003\"\u0011\u0000\u0180\u017f\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000"+
		"\u0182\u0184\u0005C\u0000\u0000\u0183\u017d\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185"+
		"\u0186\u00057\u0000\u0000\u0186\u0187\u0005.\u0000\u0000\u0187\u0189\u0003"+
		"&\u0013\u0000\u0188\u018a\u0005\u0016\u0000\u0000\u0189\u0188\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a!\u0001\u0000\u0000"+
		"\u0000\u018b\u0193\u0003R)\u0000\u018c\u018e\u00056\u0000\u0000\u018d"+
		"\u018f\u0005.\u0000\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192"+
		"\u0003R)\u0000\u0191\u018c\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000"+
		"\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000"+
		"\u0000\u0000\u0194#\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000"+
		"\u0000\u0196\u0198\u0005.\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000"+
		"\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019c\u0001\u0000\u0000\u0000"+
		"\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u01a0\u0005\u0014\u0000\u0000"+
		"\u019d\u019f\u0005.\u0000\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019f"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a3\u01ab\u0005/\u0000\u0000\u01a4\u01a6"+
		"\u0005.\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ac\u0003\u0002\u0001\u0000\u01ab\u01a7\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ae\u00057\u0000\u0000\u01ae\u01af\u0005.\u0000"+
		"\u0000\u01af\u01b3\u0005\u0001\u0000\u0000\u01b0\u01b1\u0003\u0002\u0001"+
		"\u0000\u01b1\u01b2\u0005.\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01b7\u0003\u0006\u0003\u0000"+
		"\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005\u0002\u0000\u0000"+
		"\u01bb%\u0001\u0000\u0000\u0000\u01bc\u01be\u0003*\u0015\u0000\u01bd\u01bc"+
		"\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0005.\u0000\u0000\u01c3\u01c4\u0005\u0001\u0000\u0000\u01c4\u01c5\u0003"+
		"(\u0014\u0000\u01c5\u01c6\u0005\u0002\u0000\u0000\u01c6\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c7\u01bf\u0001\u0000\u0000\u0000\u01c7\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c8\'\u0001\u0000\u0000\u0000\u01c9\u01cb\u0003*\u0015"+
		"\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cd)\u0001\u0000\u0000\u0000\u01ce\u01de\u0003H$\u0000\u01cf"+
		"\u01de\u0003.\u0017\u0000\u01d0\u01de\u00032\u0019\u0000\u01d1\u01de\u0003"+
		"0\u0018\u0000\u01d2\u01de\u00034\u001a\u0000\u01d3\u01de\u0003D\"\u0000"+
		"\u01d4\u01de\u0003F#\u0000\u01d5\u01de\u0003P(\u0000\u01d6\u01de\u0003"+
		"J%\u0000\u01d7\u01de\u0003L&\u0000\u01d8\u01de\u0003N\'\u0000\u01d9\u01da"+
		"\u0005\u0015\u0000\u0000\u01da\u01de\u0003,\u0016\u0000\u01db\u01dc\u0005"+
		"\u0016\u0000\u0000\u01dc\u01de\u0003,\u0016\u0000\u01dd\u01ce\u0001\u0000"+
		"\u0000\u0000\u01dd\u01cf\u0001\u0000\u0000\u0000\u01dd\u01d0\u0001\u0000"+
		"\u0000\u0000\u01dd\u01d1\u0001\u0000\u0000\u0000\u01dd\u01d2\u0001\u0000"+
		"\u0000\u0000\u01dd\u01d3\u0001\u0000\u0000\u0000\u01dd\u01d4\u0001\u0000"+
		"\u0000\u0000\u01dd\u01d5\u0001\u0000\u0000\u0000\u01dd\u01d6\u0001\u0000"+
		"\u0000\u0000\u01dd\u01d7\u0001\u0000\u0000\u0000\u01dd\u01d8\u0001\u0000"+
		"\u0000\u0000\u01dd\u01d9\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000"+
		"\u0000\u0000\u01de+\u0001\u0000\u0000\u0000\u01df\u01e1\u0005.\u0000\u0000"+
		"\u01e0\u01df\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e4\u0005K\u0000\u0000\u01e3"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e4"+
		"-\u0001\u0000\u0000\u0000\u01e5\u01e7\u0005.\u0000\u0000\u01e6\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01eb\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ef\u0005"+
		"\u0017\u0000\u0000\u01ec\u01ee\u0005.\u0000\u0000\u01ed\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f6\u0003R)\u0000"+
		"\u01f3\u01f5\u0005.\u0000\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f8\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f9\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f9\u01fd\u00057\u0000\u0000\u01fa\u01fc"+
		"\u0005.\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001"+
		"\u0000\u0000\u0000\u01fe\u0200\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001"+
		"\u0000\u0000\u0000\u0200\u021a\u0003&\u0013\u0000\u0201\u0203\u0005.\u0000"+
		"\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0203\u0206\u0001\u0000\u0000"+
		"\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000"+
		"\u0000\u0205\u0207\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000"+
		"\u0000\u0207\u020b\u0005\u0018\u0000\u0000\u0208\u020a\u0005.\u0000\u0000"+
		"\u0209\u0208\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000\u0000"+
		"\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000"+
		"\u020c\u020e\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000"+
		"\u020e\u020f\u0003R)\u0000\u020f\u0213\u00057\u0000\u0000\u0210\u0212"+
		"\u0005.\u0000\u0000\u0211\u0210\u0001\u0000\u0000\u0000\u0212\u0215\u0001"+
		"\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0213\u0214\u0001"+
		"\u0000\u0000\u0000\u0214\u0216\u0001\u0000\u0000\u0000\u0215\u0213\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\u0003&\u0013\u0000\u0217\u0219\u0001\u0000"+
		"\u0000\u0000\u0218\u0204\u0001\u0000\u0000\u0000\u0219\u021c\u0001\u0000"+
		"\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000"+
		"\u0000\u0000\u021b\u0232\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000"+
		"\u0000\u0000\u021d\u021f\u0005.\u0000\u0000\u021e\u021d\u0001\u0000\u0000"+
		"\u0000\u021f\u0222\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000"+
		"\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0223\u0001\u0000\u0000"+
		"\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0223\u0227\u0005$\u0000\u0000"+
		"\u0224\u0226\u0005.\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0226"+
		"\u0229\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227"+
		"\u0228\u0001\u0000\u0000\u0000\u0228\u022a\u0001\u0000\u0000\u0000\u0229"+
		"\u0227\u0001\u0000\u0000\u0000\u022a\u022e\u00057\u0000\u0000\u022b\u022d"+
		"\u0005.\u0000\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022d\u0230\u0001"+
		"\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001"+
		"\u0000\u0000\u0000\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u022e\u0001"+
		"\u0000\u0000\u0000\u0231\u0233\u0003&\u0013\u0000\u0232\u0220\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233/\u0001\u0000\u0000"+
		"\u0000\u0234\u0236\u0005.\u0000\u0000\u0235\u0234\u0001\u0000\u0000\u0000"+
		"\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000"+
		"\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u023a\u0001\u0000\u0000\u0000"+
		"\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023e\u0005\u0019\u0000\u0000"+
		"\u023b\u023d\u0005.\u0000\u0000\u023c\u023b\u0001\u0000\u0000\u0000\u023d"+
		"\u0240\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023e"+
		"\u023f\u0001\u0000\u0000\u0000\u023f\u0241\u0001\u0000\u0000\u0000\u0240"+
		"\u023e\u0001\u0000\u0000\u0000\u0241\u0245\u0003R)\u0000\u0242\u0244\u0005"+
		".\u0000\u0000\u0243\u0242\u0001\u0000\u0000\u0000\u0244\u0247\u0001\u0000"+
		"\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000"+
		"\u0000\u0000\u0246\u0248\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000"+
		"\u0000\u0000\u0248\u024c\u00057\u0000\u0000\u0249\u024b\u0005.\u0000\u0000"+
		"\u024a\u0249\u0001\u0000\u0000\u0000\u024b\u024e\u0001\u0000\u0000\u0000"+
		"\u024c\u024a\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000"+
		"\u024d\u024f\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000"+
		"\u024f\u0250\u0003&\u0013\u0000\u02501\u0001\u0000\u0000\u0000\u0251\u0253"+
		"\u0005.\u0000\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0253\u0256\u0001"+
		"\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0254\u0255\u0001"+
		"\u0000\u0000\u0000\u0255\u0257\u0001\u0000\u0000\u0000\u0256\u0254\u0001"+
		"\u0000\u0000\u0000\u0257\u025b\u0005\u001a\u0000\u0000\u0258\u025a\u0005"+
		".\u0000\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u025a\u025d\u0001\u0000"+
		"\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000"+
		"\u0000\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000"+
		"\u0000\u0000\u025e\u0262\u0005/\u0000\u0000\u025f\u0261\u0005.\u0000\u0000"+
		"\u0260\u025f\u0001\u0000\u0000\u0000\u0261\u0264\u0001\u0000\u0000\u0000"+
		"\u0262\u0260\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000"+
		"\u0263\u0265\u0001\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000"+
		"\u0265\u0269\u0005\u001b\u0000\u0000\u0266\u0268\u0005.\u0000\u0000\u0267"+
		"\u0266\u0001\u0000\u0000\u0000\u0268\u026b\u0001\u0000\u0000\u0000\u0269"+
		"\u0267\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a"+
		"\u026c\u0001\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c"+
		"\u0270\u0003R)\u0000\u026d\u026f\u0005.\u0000\u0000\u026e\u026d\u0001"+
		"\u0000\u0000\u0000\u026f\u0272\u0001\u0000\u0000\u0000\u0270\u026e\u0001"+
		"\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0273\u0001"+
		"\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0273\u0277\u0005"+
		"7\u0000\u0000\u0274\u0276\u0005.\u0000\u0000\u0275\u0274\u0001\u0000\u0000"+
		"\u0000\u0276\u0279\u0001\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000"+
		"\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u027a\u0001\u0000\u0000"+
		"\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u027a\u027b\u0003&\u0013\u0000"+
		"\u027b3\u0001\u0000\u0000\u0000\u027c\u027d\u0005\u001c\u0000\u0000\u027d"+
		"\u027e\u0003R)\u0000\u027e\u027f\u0005.\u0000\u0000\u027f\u0280\u0005"+
		"\u0001\u0000\u0000\u0280\u0281\u00036\u001b\u0000\u0281\u0282\u0005\u0002"+
		"\u0000\u0000\u02825\u0001\u0000\u0000\u0000\u0283\u0284\u00038\u001c\u0000"+
		"\u0284\u0285\u00057\u0000\u0000\u0285\u0286\u0003&\u0013\u0000\u0286\u0288"+
		"\u0001\u0000\u0000\u0000\u0287\u0283\u0001\u0000\u0000\u0000\u0288\u0289"+
		"\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u0289\u028a"+
		"\u0001\u0000\u0000\u0000\u028a7\u0001\u0000\u0000\u0000\u028b\u0290\u0003"+
		":\u001d\u0000\u028c\u028d\u00056\u0000\u0000\u028d\u028f\u0003:\u001d"+
		"\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028f\u0292\u0001\u0000\u0000"+
		"\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000"+
		"\u0000\u02919\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000"+
		"\u0293\u029b\u0003T*\u0000\u0294\u029b\u00050\u0000\u0000\u0295\u029b"+
		"\u00051\u0000\u0000\u0296\u029b\u0005G\u0000\u0000\u0297\u029b\u0003<"+
		"\u001e\u0000\u0298\u029b\u0003>\u001f\u0000\u0299\u029b\u0003@ \u0000"+
		"\u029a\u0293\u0001\u0000\u0000\u0000\u029a\u0294\u0001\u0000\u0000\u0000"+
		"\u029a\u0295\u0001\u0000\u0000\u0000\u029a\u0296\u0001\u0000\u0000\u0000"+
		"\u029a\u0297\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000\u0000\u0000"+
		"\u029a\u0299\u0001\u0000\u0000\u0000\u029b;\u0001\u0000\u0000\u0000\u029c"+
		"\u029d\u0005\u0006\u0000\u0000\u029d\u029e\u0005/\u0000\u0000\u029e=\u0001"+
		"\u0000\u0000\u0000\u029f\u02ab\u0005H\u0000\u0000\u02a0\u02a5\u0003:\u001d"+
		"\u0000\u02a1\u02a2\u00056\u0000\u0000\u02a2\u02a4\u0003:\u001d\u0000\u02a3"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a4\u02a7\u0001\u0000\u0000\u0000\u02a5"+
		"\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6"+
		"\u02a9\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a8"+
		"\u02aa\u0005J\u0000\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02a9\u02aa"+
		"\u0001\u0000\u0000\u0000\u02aa\u02ac\u0001\u0000\u0000\u0000\u02ab\u02a0"+
		"\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad"+
		"\u0001\u0000\u0000\u0000\u02ad\u02ae\u0005I\u0000\u0000\u02ae?\u0001\u0000"+
		"\u0000\u0000\u02af\u02b1\u0005D\u0000\u0000\u02b0\u02b2\u0003B!\u0000"+
		"\u02b1\u02b0\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b7\u0001\u0000\u0000\u0000\u02b3\u02b4\u00056\u0000\u0000\u02b4"+
		"\u02b6\u0003B!\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b6\u02b9\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001"+
		"\u0000\u0000\u0000\u02b8\u02bb\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001"+
		"\u0000\u0000\u0000\u02ba\u02bc\u0005J\u0000\u0000\u02bb\u02ba\u0001\u0000"+
		"\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000"+
		"\u0000\u0000\u02bd\u02be\u0005E\u0000\u0000\u02beA\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c2\u00052\u0000\u0000\u02c0\u02c1\u00057\u0000\u0000\u02c1\u02c3"+
		"\u0003:\u001d\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c3C\u0001\u0000\u0000\u0000\u02c4\u02c5\u0005\u001d"+
		"\u0000\u0000\u02c5\u02ce\u0003,\u0016\u0000\u02c6\u02c7\u0005\u001e\u0000"+
		"\u0000\u02c7\u02ce\u0003,\u0016\u0000\u02c8\u02ca\u0005\u001f\u0000\u0000"+
		"\u02c9\u02cb\u0003R)\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02ca\u02cb"+
		"\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02ce"+
		"\u0003,\u0016\u0000\u02cd\u02c4\u0001\u0000\u0000\u0000\u02cd\u02c6\u0001"+
		"\u0000\u0000\u0000\u02cd\u02c8\u0001\u0000\u0000\u0000\u02ceE\u0001\u0000"+
		"\u0000\u0000\u02cf\u02d1\u0003R)\u0000\u02d0\u02d2\u0005.\u0000\u0000"+
		"\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d5\u0007\u0003\u0000\u0000"+
		"\u02d4\u02d6\u0005.\u0000\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d5"+
		"\u02d6\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7"+
		"\u02d8\u0003R)\u0000\u02d8\u02d9\u0003,\u0016\u0000\u02d9G\u0001\u0000"+
		"\u0000\u0000\u02da\u02dc\u0005.\u0000\u0000\u02db\u02da\u0001\u0000\u0000"+
		"\u0000\u02dc\u02df\u0001\u0000\u0000\u0000\u02dd\u02db\u0001\u0000\u0000"+
		"\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02e0\u0001\u0000\u0000"+
		"\u0000\u02df\u02dd\u0001\u0000\u0000\u0000\u02e0\u02e4\u0005\u0006\u0000"+
		"\u0000\u02e1\u02e3\u0005.\u0000\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e6\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000"+
		"\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5\u02e7\u0001\u0000\u0000\u0000"+
		"\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e7\u02f0\u0005/\u0000\u0000\u02e8"+
		"\u02ea\u0005.\u0000\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000\u02e9\u02ea"+
		"\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ed"+
		"\u00058\u0000\u0000\u02ec\u02ee\u0005.\u0000\u0000\u02ed\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000"+
		"\u0000\u0000\u02ef\u02f1\u0003R)\u0000\u02f0\u02e9\u0001\u0000\u0000\u0000"+
		"\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f2\u02f3\u0003,\u0016\u0000\u02f3I\u0001\u0000\u0000\u0000\u02f4\u02f6"+
		"\u0005 \u0000\u0000\u02f5\u02f7\u0005.\u0000\u0000\u02f6\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000"+
		"\u0000\u0000\u02f8\u02f9\u0005B\u0000\u0000\u02f9\u02fc\u0003R)\u0000"+
		"\u02fa\u02fb\u00056\u0000\u0000\u02fb\u02fd\u00052\u0000\u0000\u02fc\u02fa"+
		"\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02fe"+
		"\u0001\u0000\u0000\u0000\u02fe\u02ff\u0005C\u0000\u0000\u02ff\u0300\u0003"+
		",\u0016\u0000\u0300K\u0001\u0000\u0000\u0000\u0301\u0303\u0005!\u0000"+
		"\u0000\u0302\u0304\u0005.\u0000\u0000\u0303\u0302\u0001\u0000\u0000\u0000"+
		"\u0303\u0304\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000"+
		"\u0305\u0306\u0005B\u0000\u0000\u0306\u0307\u0003R)\u0000\u0307\u0308"+
		"\u00056\u0000\u0000\u0308\u0309\u0003R)\u0000\u0309\u030a\u0001\u0000"+
		"\u0000\u0000\u030a\u030b\u0005C\u0000\u0000\u030bM\u0001\u0000\u0000\u0000"+
		"\u030c\u030e\u0005\"\u0000\u0000\u030d\u030f\u0005.\u0000\u0000\u030e"+
		"\u030d\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f"+
		"\u0310\u0001\u0000\u0000\u0000\u0310\u0311\u0005B\u0000\u0000\u0311\u0312"+
		"\u00051\u0000\u0000\u0312\u0313\u0005C\u0000\u0000\u0313O\u0001\u0000"+
		"\u0000\u0000\u0314\u0318\u0003R)\u0000\u0315\u0317\u0005.\u0000\u0000"+
		"\u0316\u0315\u0001\u0000\u0000\u0000\u0317\u031a\u0001\u0000\u0000\u0000"+
		"\u0318\u0316\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000"+
		"\u0319\u031b\u0001\u0000\u0000\u0000\u031a\u0318\u0001\u0000\u0000\u0000"+
		"\u031b\u031c\u0003,\u0016\u0000\u031cQ\u0001\u0000\u0000\u0000\u031d\u031e"+
		"\u0006)\uffff\uffff\u0000\u031e\u0371\u0005)\u0000\u0000\u031f\u0371\u0005"+
		"*\u0000\u0000\u0320\u0371\u0005+\u0000\u0000\u0321\u0371\u0005,\u0000"+
		"\u0000\u0322\u0371\u0003T*\u0000\u0323\u0327\u0005H\u0000\u0000\u0324"+
		"\u0326\u0005.\u0000\u0000\u0325\u0324\u0001\u0000\u0000\u0000\u0326\u0329"+
		"\u0001\u0000\u0000\u0000\u0327\u0325\u0001\u0000\u0000\u0000\u0327\u0328"+
		"\u0001\u0000\u0000\u0000\u0328\u033b\u0001\u0000\u0000\u0000\u0329\u0327"+
		"\u0001\u0000\u0000\u0000\u032a\u0335\u0003R)\u0000\u032b\u032f\u00056"+
		"\u0000\u0000\u032c\u032e\u0005.\u0000\u0000\u032d\u032c\u0001\u0000\u0000"+
		"\u0000\u032e\u0331\u0001\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000"+
		"\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0332\u0001\u0000\u0000"+
		"\u0000\u0331\u032f\u0001\u0000\u0000\u0000\u0332\u0334\u0003R)\u0000\u0333"+
		"\u032b\u0001\u0000\u0000\u0000\u0334\u0337\u0001\u0000\u0000\u0000\u0335"+
		"\u0333\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336"+
		"\u0339\u0001\u0000\u0000\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0338"+
		"\u033a\u00056\u0000\u0000\u0339\u0338\u0001\u0000\u0000\u0000\u0339\u033a"+
		"\u0001\u0000\u0000\u0000\u033a\u033c\u0001\u0000\u0000\u0000\u033b\u032a"+
		"\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000\u033c\u0340"+
		"\u0001\u0000\u0000\u0000\u033d\u033f\u0005.\u0000\u0000\u033e\u033d\u0001"+
		"\u0000\u0000\u0000\u033f\u0342\u0001\u0000\u0000\u0000\u0340\u033e\u0001"+
		"\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0343\u0001"+
		"\u0000\u0000\u0000\u0342\u0340\u0001\u0000\u0000\u0000\u0343\u0371\u0005"+
		"I\u0000\u0000\u0344\u0350\u0005D\u0000\u0000\u0345\u034a\u0003V+\u0000"+
		"\u0346\u0347\u00056\u0000\u0000\u0347\u0349\u0003V+\u0000\u0348\u0346"+
		"\u0001\u0000\u0000\u0000\u0349\u034c\u0001\u0000\u0000\u0000\u034a\u0348"+
		"\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034e"+
		"\u0001\u0000\u0000\u0000\u034c\u034a\u0001\u0000\u0000\u0000\u034d\u034f"+
		"\u00056\u0000\u0000\u034e\u034d\u0001\u0000\u0000\u0000\u034e\u034f\u0001"+
		"\u0000\u0000\u0000\u034f\u0351\u0001\u0000\u0000\u0000\u0350\u0345\u0001"+
		"\u0000\u0000\u0000\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u0352\u0001"+
		"\u0000\u0000\u0000\u0352\u0371\u0005E\u0000\u0000\u0353\u0354\u0005B\u0000"+
		"\u0000\u0354\u0355\u0003R)\u0000\u0355\u0356\u0005C\u0000\u0000\u0356"+
		"\u0371\u0001\u0000\u0000\u0000\u0357\u0358\u00055\u0000\u0000\u0358\u0359"+
		"\u0005/\u0000\u0000\u0359\u035b\u0005B\u0000\u0000\u035a\u035c\u0003\""+
		"\u0011\u0000\u035b\u035a\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000"+
		"\u0000\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u0371\u0005C\u0000"+
		"\u0000\u035e\u0368\u0005`\u0000\u0000\u035f\u0369\u00052\u0000\u0000\u0360"+
		"\u0365\u0005/\u0000\u0000\u0361\u0362\u0005]\u0000\u0000\u0362\u0364\u0005"+
		"/\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0364\u0367\u0001\u0000"+
		"\u0000\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000"+
		"\u0000\u0000\u0366\u0369\u0001\u0000\u0000\u0000\u0367\u0365\u0001\u0000"+
		"\u0000\u0000\u0368\u035f\u0001\u0000\u0000\u0000\u0368\u0360\u0001\u0000"+
		"\u0000\u0000\u0369\u0371\u0001\u0000\u0000\u0000\u036a\u036b\u0005_\u0000"+
		"\u0000\u036b\u0371\u0003R)\u0010\u036c\u036d\u0007\u0004\u0000\u0000\u036d"+
		"\u0371\u0003R)\u000f\u036e\u036f\u0007\u0005\u0000\u0000\u036f\u0371\u0003"+
		"R)\u0005\u0370\u031d\u0001\u0000\u0000\u0000\u0370\u031f\u0001\u0000\u0000"+
		"\u0000\u0370\u0320\u0001\u0000\u0000\u0000\u0370\u0321\u0001\u0000\u0000"+
		"\u0000\u0370\u0322\u0001\u0000\u0000\u0000\u0370\u0323\u0001\u0000\u0000"+
		"\u0000\u0370\u0344\u0001\u0000\u0000\u0000\u0370\u0353\u0001\u0000\u0000"+
		"\u0000\u0370\u0357\u0001\u0000\u0000\u0000\u0370\u035e\u0001\u0000\u0000"+
		"\u0000\u0370\u036a\u0001\u0000\u0000\u0000\u0370\u036c\u0001\u0000\u0000"+
		"\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0371\u03c1\u0001\u0000\u0000"+
		"\u0000\u0372\u0373\n\u000e\u0000\u0000\u0373\u0374\u0007\u0006\u0000\u0000"+
		"\u0374\u03c0\u0003R)\u000f\u0375\u0379\n\r\u0000\u0000\u0376\u0378\u0005"+
		".\u0000\u0000\u0377\u0376\u0001\u0000\u0000\u0000\u0378\u037b\u0001\u0000"+
		"\u0000\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000"+
		"\u0000\u0000\u037a\u037c\u0001\u0000\u0000\u0000\u037b\u0379\u0001\u0000"+
		"\u0000\u0000\u037c\u0380\u0005Z\u0000\u0000\u037d\u037f\u0005.\u0000\u0000"+
		"\u037e\u037d\u0001\u0000\u0000\u0000\u037f\u0382\u0001\u0000\u0000\u0000"+
		"\u0380\u037e\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000"+
		"\u0381\u0383\u0001\u0000\u0000\u0000\u0382\u0380\u0001\u0000\u0000\u0000"+
		"\u0383\u03c0\u0003R)\u000e\u0384\u0385\n\f\u0000\u0000\u0385\u0386\u0005"+
		"[\u0000\u0000\u0386\u03c0\u0003R)\r\u0387\u0388\n\u000b\u0000\u0000\u0388"+
		"\u0389\u0007\u0007\u0000\u0000\u0389\u03c0\u0003R)\f\u038a\u038b\n\n\u0000"+
		"\u0000\u038b\u038c\u0005W\u0000\u0000\u038c\u03c0\u0003R)\u000b\u038d"+
		"\u038e\n\t\u0000\u0000\u038e\u038f\u0005V\u0000\u0000\u038f\u03c0\u0003"+
		"R)\n\u0390\u0391\n\b\u0000\u0000\u0391\u0392\u0005U\u0000\u0000\u0392"+
		"\u03c0\u0003R)\t\u0393\u0395\n\u0007\u0000\u0000\u0394\u0396\u0005.\u0000"+
		"\u0000\u0395\u0394\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000"+
		"\u0000\u0396\u0397\u0001\u0000\u0000\u0000\u0397\u0399\u0007\b\u0000\u0000"+
		"\u0398\u039a\u0005.\u0000\u0000\u0399\u0398\u0001\u0000\u0000\u0000\u0399"+
		"\u039a\u0001\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039b"+
		"\u03c0\u0003R)\b\u039c\u039d\n\u0006\u0000\u0000\u039d\u039e\u0005\u001b"+
		"\u0000\u0000\u039e\u03c0\u0003R)\u0007\u039f\u03a0\n\u0004\u0000\u0000"+
		"\u03a0\u03a1\u0007\t\u0000\u0000\u03a1\u03c0\u0003R)\u0005\u03a2\u03a3"+
		"\n\u0003\u0000\u0000\u03a3\u03a4\u0007\n\u0000\u0000\u03a4\u03c0\u0003"+
		"R)\u0004\u03a5\u03a6\n\u0002\u0000\u0000\u03a6\u03a7\u0005\u0017\u0000"+
		"\u0000\u03a7\u03a8\u0003R)\u0000\u03a8\u03a9\u0005$\u0000\u0000\u03a9"+
		"\u03aa\u0003R)\u0003\u03aa\u03c0\u0001\u0000\u0000\u0000\u03ab\u03ac\n"+
		"\u0016\u0000\u0000\u03ac\u03ad\u0005H\u0000\u0000\u03ad\u03ae\u0003R)"+
		"\u0000\u03ae\u03af\u0005I\u0000\u0000\u03af\u03c0\u0001\u0000\u0000\u0000"+
		"\u03b0\u03b1\n\u0015\u0000\u0000\u03b1\u03b2\u00055\u0000\u0000\u03b2"+
		"\u03c0\u0005/\u0000\u0000\u03b3\u03b4\n\u0014\u0000\u0000\u03b4\u03b6"+
		"\u0005B\u0000\u0000\u03b5\u03b7\u0003\"\u0011\u0000\u03b6\u03b5\u0001"+
		"\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001"+
		"\u0000\u0000\u0000\u03b8\u03c0\u0005C\u0000\u0000\u03b9\u03ba\n\u0011"+
		"\u0000\u0000\u03ba\u03bb\u0005(\u0000\u0000\u03bb\u03c0\u0007\u0001\u0000"+
		"\u0000\u03bc\u03bd\n\u0001\u0000\u0000\u03bd\u03be\u0005#\u0000\u0000"+
		"\u03be\u03c0\u0003\u000e\u0007\u0000\u03bf\u0372\u0001\u0000\u0000\u0000"+
		"\u03bf\u0375\u0001\u0000\u0000\u0000\u03bf\u0384\u0001\u0000\u0000\u0000"+
		"\u03bf\u0387\u0001\u0000\u0000\u0000\u03bf\u038a\u0001\u0000\u0000\u0000"+
		"\u03bf\u038d\u0001\u0000\u0000\u0000\u03bf\u0390\u0001\u0000\u0000\u0000"+
		"\u03bf\u0393\u0001\u0000\u0000\u0000\u03bf\u039c\u0001\u0000\u0000\u0000"+
		"\u03bf\u039f\u0001\u0000\u0000\u0000\u03bf\u03a2\u0001\u0000\u0000\u0000"+
		"\u03bf\u03a5\u0001\u0000\u0000\u0000\u03bf\u03ab\u0001\u0000\u0000\u0000"+
		"\u03bf\u03b0\u0001\u0000\u0000\u0000\u03bf\u03b3\u0001\u0000\u0000\u0000"+
		"\u03bf\u03b9\u0001\u0000\u0000\u0000\u03bf\u03bc\u0001\u0000\u0000\u0000"+
		"\u03c0\u03c3\u0001\u0000\u0000\u0000\u03c1\u03bf\u0001\u0000\u0000\u0000"+
		"\u03c1\u03c2\u0001\u0000\u0000\u0000\u03c2S\u0001\u0000\u0000\u0000\u03c3"+
		"\u03c1\u0001\u0000\u0000\u0000\u03c4\u03c5\u0007\u000b\u0000\u0000\u03c5"+
		"U\u0001\u0000\u0000\u0000\u03c6\u03c7\u0003R)\u0000\u03c7\u03c8\u0005"+
		"7\u0000\u0000\u03c8\u03c9\u0003R)\u0000\u03c9\u03ce\u0001\u0000\u0000"+
		"\u0000\u03ca\u03cb\u0005/\u0000\u0000\u03cb\u03cc\u00058\u0000\u0000\u03cc"+
		"\u03ce\u0003R)\u0000\u03cd\u03c6\u0001\u0000\u0000\u0000\u03cd\u03ca\u0001"+
		"\u0000\u0000\u0000\u03ceW\u0001\u0000\u0000\u0000\u0090\\^dhoty|\u0080"+
		"\u0085\u0088\u0094\u0099\u009d\u00a0\u00a4\u00a8\u00ac\u00b0\u00b3\u00b7"+
		"\u00ba\u00c0\u00c4\u00ce\u00d1\u00d4\u00db\u00e0\u00e5\u00e8\u00ec\u00f5"+
		"\u00fa\u0104\u0107\u010e\u0113\u0116\u0119\u011d\u0122\u0126\u012b\u012f"+
		"\u0134\u0136\u013d\u0141\u0144\u014a\u014f\u0159\u015f\u0163\u0168\u016c"+
		"\u0171\u0175\u017a\u0180\u0183\u0189\u018e\u0193\u0199\u01a0\u01a7\u01ab"+
		"\u01b3\u01b8\u01bf\u01c7\u01cc\u01dd\u01e0\u01e3\u01e8\u01ef\u01f6\u01fd"+
		"\u0204\u020b\u0213\u021a\u0220\u0227\u022e\u0232\u0237\u023e\u0245\u024c"+
		"\u0254\u025b\u0262\u0269\u0270\u0277\u0289\u0290\u029a\u02a5\u02a9\u02ab"+
		"\u02b1\u02b7\u02bb\u02c2\u02ca\u02cd\u02d1\u02d5\u02dd\u02e4\u02e9\u02ed"+
		"\u02f0\u02f6\u02fc\u0303\u030e\u0318\u0327\u032f\u0335\u0339\u033b\u0340"+
		"\u034a\u034e\u0350\u035b\u0365\u0368\u0370\u0379\u0380\u0395\u0399\u03b6"+
		"\u03bf\u03c1\u03cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}