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
		EXPORT=8, EXPORT_NODE_PATH=9, EXPORT_RANGE=10, EXPORT_MULTILINE=11, EXPORT_EXP_EASING=12, 
		EXPORT_COLOR_NO_ALPHA=13, EXPORT_FLAGS=14, EXPORT_FLAGS_2D_PHYSICS=15, 
		EXPORT_FLAGS_2D_RENDER=16, EXPORT_FLAGS_2D_NAVIGATION=17, EXPORT_FLAGS_3D_PHYSICS=18, 
		EXPORT_FLAGS_3D_RENDER=19, EXPORT_FLAGS_3D_NAVIGATION=20, EXPORT_ENUM=21, 
		CONST=22, SIGNAL=23, ENUM=24, STATIC=25, FUNC=26, REMOTE=27, MASTER=28, 
		PUPPET=29, REMOTESYNC=30, MASTERSYNC=31, PUPPETSYNC=32, CLASS=33, BREAKPOINT=34, 
		PASS=35, IF=36, ELIF=37, WHILE=38, FOR=39, IN=40, MATCH=41, CONTINUE=42, 
		BREAK=43, RETURN=44, ASSERT=45, YIELD=46, PRELOAD=47, AS=48, ELSE=49, 
		OR=50, AND=51, NOT=52, IS=53, TRUE=54, FALSE=55, NULL=56, SELF=57, TOOL=58, 
		AWAIT=59, RPC=60, ICON=61, WARNING_IGNORE=62, ARRAY=63, NEWLINE=64, IDENTIFIER=65, 
		BUILTINTYPE=66, CONSTANT=67, MULTI_LINE_STRING=68, STRING=69, STRINGNAME=70, 
		NODEPATH=71, INTEGER=72, FLOAT=73, DOT=74, COMMA=75, COLON=76, ASSIGN=77, 
		COLON_ASSIGN=78, COLON_ASSIGN_WHITESPACE=79, ADD_ASSIGN=80, MINUS_ASSIGN=81, 
		MUL_ASSIGN=82, DIV_ASSIGN=83, MOD_ASSIGN=84, AND_ASSIGN=85, OR_ASSIGN=86, 
		XOR_ASSIGN=87, OPEN_PAREN=88, CLOSE_PAREN=89, OPEN_BRACE=90, CLOSE_BRACE=91, 
		ARROW=92, UNDERSCORE=93, OPEN_BRACK=94, CLOSE_BRACK=95, DOTDOT=96, SEMI_COLON=97, 
		LOGIC_OR=98, LOGIC_AND=99, LOGIC_NOT=100, LESS_THAN=101, GREATER_THAN=102, 
		EQUALS=103, GT_EQ=104, LT_EQ=105, NOT_EQ=106, OR_OP=107, XOR=108, AND_OP=109, 
		LEFT_SHIFT=110, RIGHT_SHIFT=111, ADD=112, MINUS=113, STAR=114, DIV=115, 
		MOD=116, NOT_OP=117, DOLLAR=118, AT=119, SKIP_=120;
	public static final int
		RULE_program = 0, RULE_iconToolDecl = 1, RULE_iconDecl = 2, RULE_fileDeclaration = 3, 
		RULE_inheritance = 4, RULE_className = 5, RULE_topLevelDecl = 6, RULE_classVarDecl = 7, 
		RULE_setget = 8, RULE_onready = 9, RULE_exportStmts = 10, RULE_export = 11, 
		RULE_export_node_path = 12, RULE_export_range = 13, RULE_export_multiline = 14, 
		RULE_export_exp_easing = 15, RULE_export_color_no_alpha = 16, RULE_export_flags = 17, 
		RULE_export_flags_2d = 18, RULE_export_flags_3d = 19, RULE_export_enum = 20, 
		RULE_typeHint = 21, RULE_constDecl = 22, RULE_signalDecl = 23, RULE_signalParList = 24, 
		RULE_enumDecl = 25, RULE_enumList = 26, RULE_methodDecl = 27, RULE_parList = 28, 
		RULE_parameter = 29, RULE_rpc = 30, RULE_constructorDecl = 31, RULE_argList = 32, 
		RULE_innerClass = 33, RULE_stmtOrSuite = 34, RULE_suite = 35, RULE_stmt = 36, 
		RULE_stmtEnd = 37, RULE_awaitStmt = 38, RULE_ifStmt = 39, RULE_whileStmt = 40, 
		RULE_forStmt = 41, RULE_matchStmt = 42, RULE_matchBlock = 43, RULE_patternList = 44, 
		RULE_pattern = 45, RULE_bindingPattern = 46, RULE_arrayPattern = 47, RULE_dictPattern = 48, 
		RULE_keyValuePattern = 49, RULE_flowStmt = 50, RULE_assignmentStmt = 51, 
		RULE_equalsAssignmentStmt = 52, RULE_varDeclStmt = 53, RULE_assertStmt = 54, 
		RULE_yieldStmt = 55, RULE_preloadStmt = 56, RULE_exprStmt = 57, RULE_expression = 58, 
		RULE_literal = 59, RULE_number = 60, RULE_keyValue = 61;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "iconToolDecl", "iconDecl", "fileDeclaration", "inheritance", 
			"className", "topLevelDecl", "classVarDecl", "setget", "onready", "exportStmts", 
			"export", "export_node_path", "export_range", "export_multiline", "export_exp_easing", 
			"export_color_no_alpha", "export_flags", "export_flags_2d", "export_flags_3d", 
			"export_enum", "typeHint", "constDecl", "signalDecl", "signalParList", 
			"enumDecl", "enumList", "methodDecl", "parList", "parameter", "rpc", 
			"constructorDecl", "argList", "innerClass", "stmtOrSuite", "suite", "stmt", 
			"stmtEnd", "awaitStmt", "ifStmt", "whileStmt", "forStmt", "matchStmt", 
			"matchBlock", "patternList", "pattern", "bindingPattern", "arrayPattern", 
			"dictPattern", "keyValuePattern", "flowStmt", "assignmentStmt", "equalsAssignmentStmt", 
			"varDeclStmt", "assertStmt", "yieldStmt", "preloadStmt", "exprStmt", 
			"expression", "literal", "number", "keyValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'extends'", "'class_name'", "'onready'", "'var'", 
			"'setget'", "'export'", "'export_node_path'", "'export_range'", "'export_multiline'", 
			"'export_exp_easing'", "'export_color_no_alpha'", "'export_flags'", "'export_flags_2d_physics'", 
			"'export_flags_2d_render'", "'export_flags_2d_navigation'", "'export_flags_3d_physics'", 
			"'export_flags_3d_render'", "'export_flags_3d_navigation'", "'export_enum'", 
			"'const'", "'signal'", "'enum'", "'static'", "'func'", "'remote'", "'master'", 
			"'puppet'", "'remotesync'", "'mastersync'", "'puppetsync'", "'class'", 
			"'breakpoint'", "'pass'", "'if'", "'elif'", "'while'", "'for'", "'in'", 
			"'match'", "'continue'", "'break'", "'return'", "'assert'", "'yield'", 
			"'preload'", "'as'", "'else'", "'or'", "'and'", "'not'", "'is'", "'true'", 
			"'false'", "'null'", "'self'", "'tool'", "'await'", null, null, null, 
			"'Array'", null, null, null, null, null, null, null, null, null, null, 
			"'.'", "','", "':'", "'='", "':='", "': ='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'&='", "'|='", "'^='", "'('", "')'", "'{'", "'}'", "'->'", 
			"'_'", "'['", "']'", "'..'", "';'", "'||'", "'&&'", "'!'", "'<'", "'>'", 
			"'=='", "'>='", "'<='", "'!='", "'|'", "'^'", "'&'", "'<<'", "'>>'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'$'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "EXTENDS", "CLASS_NAME", "ONREADY", "VAR", 
			"SETGET", "EXPORT", "EXPORT_NODE_PATH", "EXPORT_RANGE", "EXPORT_MULTILINE", 
			"EXPORT_EXP_EASING", "EXPORT_COLOR_NO_ALPHA", "EXPORT_FLAGS", "EXPORT_FLAGS_2D_PHYSICS", 
			"EXPORT_FLAGS_2D_RENDER", "EXPORT_FLAGS_2D_NAVIGATION", "EXPORT_FLAGS_3D_PHYSICS", 
			"EXPORT_FLAGS_3D_RENDER", "EXPORT_FLAGS_3D_NAVIGATION", "EXPORT_ENUM", 
			"CONST", "SIGNAL", "ENUM", "STATIC", "FUNC", "REMOTE", "MASTER", "PUPPET", 
			"REMOTESYNC", "MASTERSYNC", "PUPPETSYNC", "CLASS", "BREAKPOINT", "PASS", 
			"IF", "ELIF", "WHILE", "FOR", "IN", "MATCH", "CONTINUE", "BREAK", "RETURN", 
			"ASSERT", "YIELD", "PRELOAD", "AS", "ELSE", "OR", "AND", "NOT", "IS", 
			"TRUE", "FALSE", "NULL", "SELF", "TOOL", "AWAIT", "RPC", "ICON", "WARNING_IGNORE", 
			"ARRAY", "NEWLINE", "IDENTIFIER", "BUILTINTYPE", "CONSTANT", "MULTI_LINE_STRING", 
			"STRING", "STRINGNAME", "NODEPATH", "INTEGER", "FLOAT", "DOT", "COMMA", 
			"COLON", "ASSIGN", "COLON_ASSIGN", "COLON_ASSIGN_WHITESPACE", "ADD_ASSIGN", 
			"MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACE", 
			"CLOSE_BRACE", "ARROW", "UNDERSCORE", "OPEN_BRACK", "CLOSE_BRACK", "DOTDOT", 
			"SEMI_COLON", "LOGIC_OR", "LOGIC_AND", "LOGIC_NOT", "LESS_THAN", "GREATER_THAN", 
			"EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ", "OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", 
			"RIGHT_SHIFT", "ADD", "MINUS", "STAR", "DIV", "MOD", "NOT_OP", "DOLLAR", 
			"AT", "SKIP_"
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
		public IconToolDeclContext iconToolDecl() {
			return getRuleContext(IconToolDeclContext.class,0);
		}
		public FileDeclarationContext fileDeclaration() {
			return getRuleContext(FileDeclarationContext.class,0);
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
			if ( listener instanceof GDScriptParserListener) ((GDScriptParserListener)listener).exitProgram(this);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(124);
				iconToolDecl();
				}
				break;
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==CLASS_NAME) {
				{
				setState(127);
				fileDeclaration();
				}
			}

			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					topLevelDecl();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(136);
				match(NEWLINE);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
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
	public static class IconToolDeclContext extends ParserRuleContext {
		public IconDeclContext iconDecl() {
			return getRuleContext(IconDeclContext.class,0);
		}
		public TerminalNode AT() { return getToken(GDScriptParser.AT, 0); }
		public TerminalNode TOOL() { return getToken(GDScriptParser.TOOL, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public IconToolDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iconToolDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterIconToolDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitIconToolDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitIconToolDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconToolDeclContext iconToolDecl() throws RecognitionException {
		IconToolDeclContext _localctx = new IconToolDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_iconToolDecl);
		int _la;
		try {
			int _alt;
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(144);
					match(AT);
					setState(145);
					match(TOOL);
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(146);
						match(NEWLINE);
						}
						}
						setState(151);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(154);
				iconDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ICON) {
					{
					setState(155);
					iconDecl();
					}
				}

				{
				setState(158);
				match(AT);
				setState(159);
				match(TOOL);
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(160);
						match(NEWLINE);
						}
						} 
					}
					setState(165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
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
	public static class IconDeclContext extends ParserRuleContext {
		public TerminalNode ICON() { return getToken(GDScriptParser.ICON, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public TerminalNode STRING() { return getToken(GDScriptParser.STRING, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public IconDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iconDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterIconDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitIconDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitIconDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IconDeclContext iconDecl() throws RecognitionException {
		IconDeclContext _localctx = new IconDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_iconDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ICON);
			setState(169);
			match(OPEN_PAREN);
			setState(170);
			match(STRING);
			setState(171);
			match(CLOSE_PAREN);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172);
					match(NEWLINE);
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class FileDeclarationContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public FileDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterFileDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitFileDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitFileDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileDeclarationContext fileDeclaration() throws RecognitionException {
		FileDeclarationContext _localctx = new FileDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fileDeclaration);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				className();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(179);
					inheritance();
					}
				}

				}
				break;
			case EXTENDS:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				inheritance();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLASS_NAME) {
					{
					setState(183);
					className();
					}
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
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
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
		enterRule(_localctx, 8, RULE_inheritance);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(EXTENDS);
			setState(189);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					match(DOT);
					setState(191);
					match(IDENTIFIER);
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					match(NEWLINE);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public TerminalNode COMMA() { return getToken(GDScriptParser.COMMA, 0); }
		public TerminalNode STRING() { return getToken(GDScriptParser.STRING, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
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
		enterRule(_localctx, 10, RULE_className);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(CLASS_NAME);
			setState(204);
			match(IDENTIFIER);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(205);
				match(COMMA);
				setState(206);
				match(STRING);
				}
			}

			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(209);
					match(NEWLINE);
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_topLevelDecl);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				classVarDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				constDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				signalDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				enumDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				methodDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				constructorDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(221);
				innerClass();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				match(TOOL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(223);
				stmt();
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
		public OnreadyContext onready() {
			return getRuleContext(OnreadyContext.class,0);
		}
		public ExportStmtsContext exportStmts() {
			return getRuleContext(ExportStmtsContext.class,0);
		}
		public SetgetContext setget() {
			return getRuleContext(SetgetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public EqualsAssignmentStmtContext equalsAssignmentStmt() {
			return getRuleContext(EqualsAssignmentStmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitClassVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVarDeclContext classVarDecl() throws RecognitionException {
		ClassVarDeclContext _localctx = new ClassVarDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(226);
				onready();
				}
				break;
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT || _la==AT) {
				{
				setState(229);
				exportStmts();
				}
			}

			setState(232);
			match(VAR);
			setState(233);
			match(IDENTIFIER);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(234);
				match(COLON);
				setState(235);
				typeHint();
				}
			}

			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 7L) != 0)) {
				{
				setState(238);
				equalsAssignmentStmt();
				setState(241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(239);
					expression(0);
					}
					break;
				case 2:
					{
					setState(240);
					stmt();
					}
					break;
				}
				}
			}

			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SETGET) {
				{
				setState(245);
				setget();
				}
			}

			setState(248);
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
		enterRule(_localctx, 16, RULE_setget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(SETGET);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(251);
				match(IDENTIFIER);
				}
			}

			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(254);
				match(COMMA);
				setState(255);
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
	public static class OnreadyContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(GDScriptParser.AT, 0); }
		public TerminalNode ONREADY() { return getToken(GDScriptParser.ONREADY, 0); }
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public OnreadyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onready; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterOnready(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitOnready(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitOnready(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnreadyContext onready() throws RecognitionException {
		OnreadyContext _localctx = new OnreadyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_onready);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(258);
				match(AT);
				}
				break;
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONREADY) {
				{
				setState(261);
				match(ONREADY);
				}
			}

			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(264);
				match(NEWLINE);
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
	public static class ExportStmtsContext extends ParserRuleContext {
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public Export_node_pathContext export_node_path() {
			return getRuleContext(Export_node_pathContext.class,0);
		}
		public Export_rangeContext export_range() {
			return getRuleContext(Export_rangeContext.class,0);
		}
		public Export_multilineContext export_multiline() {
			return getRuleContext(Export_multilineContext.class,0);
		}
		public Export_color_no_alphaContext export_color_no_alpha() {
			return getRuleContext(Export_color_no_alphaContext.class,0);
		}
		public Export_flagsContext export_flags() {
			return getRuleContext(Export_flagsContext.class,0);
		}
		public Export_flags_2dContext export_flags_2d() {
			return getRuleContext(Export_flags_2dContext.class,0);
		}
		public Export_flags_3dContext export_flags_3d() {
			return getRuleContext(Export_flags_3dContext.class,0);
		}
		public ExportStmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterExportStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitExportStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitExportStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStmtsContext exportStmts() throws RecognitionException {
		ExportStmtsContext _localctx = new ExportStmtsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exportStmts);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				export();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				export_node_path();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				export_range();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				export_multiline();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				export_color_no_alpha();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
				export_flags();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(273);
				export_flags_2d();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(274);
				export_flags_3d();
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
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(GDScriptParser.EXPORT, 0); }
		public TerminalNode AT() { return getToken(GDScriptParser.AT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
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
		enterRule(_localctx, 22, RULE_export);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(277);
				match(AT);
				}
			}

			setState(280);
			match(EXPORT);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(281);
				match(OPEN_PAREN);
				setState(291);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BUILTINTYPE:
					{
					setState(282);
					match(BUILTINTYPE);
					}
					break;
				case IDENTIFIER:
					{
					setState(283);
					match(IDENTIFIER);
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(284);
						match(COMMA);
						setState(285);
						literal();
						}
						}
						setState(290);
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
				setState(293);
				match(CLOSE_PAREN);
				}
			}

			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(296);
				match(NEWLINE);
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
	public static class Export_node_pathContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(GDScriptParser.AT, 0); }
		public TerminalNode EXPORT_NODE_PATH() { return getToken(GDScriptParser.EXPORT_NODE_PATH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public Export_node_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_node_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterExport_node_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitExport_node_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitExport_node_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Export_node_pathContext export_node_path() throws RecognitionException {
		Export_node_pathContext _localctx = new Export_node_pathContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_export_node_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(AT);
			setState(300);
			match(EXPORT_NODE_PATH);
			setState(301);
			match(OPEN_PAREN);
			setState(302);
			argList();
			setState(303);
			match(CLOSE_PAREN);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(304);
				match(NEWLINE);
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
	public static class Export_rangeContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(GDScriptParser.AT, 0); }
		public TerminalNode EXPORT_RANGE() { return getToken(GDScriptParser.EXPORT_RANGE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public Export_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterExport_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitExport_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitExport_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Export_rangeContext export_range() throws RecognitionException {
		Export_rangeContext _localctx = new Export_rangeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_export_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(AT);
			setState(308);
			match(EXPORT_RANGE);
			setState(309);
			match(OPEN_PAREN);
			setState(310);
			argList();
			setState(311);
			match(CLOSE_PAREN);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(312);
				match(NEWLINE);
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
	public static class Export_multilineContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(GDScriptParser.AT, 0); }
		public TerminalNode EXPORT_MULTILINE() { return getToken(GDScriptParser.EXPORT_MULTILINE, 0); }
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public Export_multilineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_multiline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterExport_multiline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitExport_multiline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitExport_multiline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Export_multilineContext export_multiline() throws RecognitionException {
		Export_multilineContext _localctx = new Export_multilineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_export_multiline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(AT);
			setState(316);
			match(EXPORT_MULTILINE);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(317);
				match(NEWLINE);
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
	public static class Export_exp_easingContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(GDScriptParser.AT, 0); }
		public TerminalNode EXPORT_EXP_EASING() { return getToken(GDScriptParser.EXPORT_EXP_EASING, 0); }
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public Export_exp_easingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_exp_easing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterExport_exp_easing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitExport_exp_easing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitExport_exp_easing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Export_exp_easingContext export_exp_easing() throws RecognitionException {
		Export_exp_easingContext _localctx = new Export_exp_easingContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_export_exp_easing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(AT);
			setState(321);
			match(EXPORT_EXP_EASING);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(322);
				match(NEWLINE);
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
	public static class Export_color_no_alphaContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(GDScriptParser.AT, 0); }
		public TerminalNode EXPORT_COLOR_NO_ALPHA() { return getToken(GDScriptParser.EXPORT_COLOR_NO_ALPHA, 0); }
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public Export_color_no_alphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_color_no_alpha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterExport_color_no_alpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitExport_color_no_alpha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitExport_color_no_alpha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Export_color_no_alphaContext export_color_no_alpha() throws RecognitionException {
		Export_color_no_alphaContext _localctx = new Export_color_no_alphaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_export_color_no_alpha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(AT);
			setState(326);
			match(EXPORT_COLOR_NO_ALPHA);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(327);
				match(NEWLINE);
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
	public static class Export_flagsContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(GDScriptParser.AT, 0); }
		public TerminalNode EXPORT_FLAGS() { return getToken(GDScriptParser.EXPORT_FLAGS, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public Export_flagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_flags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterExport_flags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitExport_flags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitExport_flags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Export_flagsContext export_flags() throws RecognitionException {
		Export_flagsContext _localctx = new Export_flagsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_export_flags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(AT);
			setState(331);
			match(EXPORT_FLAGS);
			setState(332);
			match(OPEN_PAREN);
			setState(333);
			argList();
			setState(334);
			match(CLOSE_PAREN);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(335);
				match(NEWLINE);
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
	public static class Export_flags_2dContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(GDScriptParser.AT, 0); }
		public TerminalNode EXPORT_FLAGS_2D_PHYSICS() { return getToken(GDScriptParser.EXPORT_FLAGS_2D_PHYSICS, 0); }
		public TerminalNode EXPORT_FLAGS_2D_RENDER() { return getToken(GDScriptParser.EXPORT_FLAGS_2D_RENDER, 0); }
		public TerminalNode EXPORT_FLAGS_2D_NAVIGATION() { return getToken(GDScriptParser.EXPORT_FLAGS_2D_NAVIGATION, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public Export_flags_2dContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_flags_2d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterExport_flags_2d(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitExport_flags_2d(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitExport_flags_2d(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Export_flags_2dContext export_flags_2d() throws RecognitionException {
		Export_flags_2dContext _localctx = new Export_flags_2dContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_export_flags_2d);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(AT);
			setState(339);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 229376L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(340);
				match(NEWLINE);
				}
				}
				setState(345);
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
	public static class Export_flags_3dContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(GDScriptParser.AT, 0); }
		public TerminalNode EXPORT_FLAGS_3D_PHYSICS() { return getToken(GDScriptParser.EXPORT_FLAGS_3D_PHYSICS, 0); }
		public TerminalNode EXPORT_FLAGS_3D_RENDER() { return getToken(GDScriptParser.EXPORT_FLAGS_3D_RENDER, 0); }
		public TerminalNode EXPORT_FLAGS_3D_NAVIGATION() { return getToken(GDScriptParser.EXPORT_FLAGS_3D_NAVIGATION, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
		public Export_flags_3dContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_flags_3d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterExport_flags_3d(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitExport_flags_3d(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitExport_flags_3d(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Export_flags_3dContext export_flags_3d() throws RecognitionException {
		Export_flags_3dContext _localctx = new Export_flags_3dContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_export_flags_3d);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(AT);
			setState(347);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(348);
				match(NEWLINE);
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
	public static class Export_enumContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(GDScriptParser.AT, 0); }
		public TerminalNode EXPORT_ENUM() { return getToken(GDScriptParser.EXPORT_ENUM, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public Export_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterExport_enum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitExport_enum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitExport_enum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Export_enumContext export_enum() throws RecognitionException {
		Export_enumContext _localctx = new Export_enumContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_export_enum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(AT);
			setState(355);
			match(EXPORT_ENUM);
			setState(356);
			match(OPEN_PAREN);
			setState(357);
			argList();
			setState(358);
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
	public static class TypeHintContext extends ParserRuleContext {
		public TerminalNode BUILTINTYPE() { return getToken(GDScriptParser.BUILTINTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public TerminalNode ARRAY() { return getToken(GDScriptParser.ARRAY, 0); }
		public TerminalNode OPEN_BRACK() { return getToken(GDScriptParser.OPEN_BRACK, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(GDScriptParser.CLOSE_BRACK, 0); }
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
		enterRule(_localctx, 42, RULE_typeHint);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BUILTINTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(BUILTINTYPE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(IDENTIFIER);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				match(ARRAY);
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(363);
					match(OPEN_BRACK);
					setState(364);
					typeHint();
					setState(365);
					match(CLOSE_BRACK);
					}
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
	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GDScriptParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public EqualsAssignmentStmtContext equalsAssignmentStmt() {
			return getRuleContext(EqualsAssignmentStmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
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
		enterRule(_localctx, 44, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(CONST);
			setState(372);
			match(IDENTIFIER);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(373);
				match(COLON);
				setState(374);
				typeHint();
				}
			}

			setState(377);
			equalsAssignmentStmt();
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(378);
				expression(0);
				}
				break;
			case 2:
				{
				setState(379);
				stmt();
				}
				break;
			}
			setState(382);
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
		enterRule(_localctx, 46, RULE_signalDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(SIGNAL);
			setState(385);
			match(IDENTIFIER);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(386);
				signalParList();
				}
			}

			setState(389);
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
		public List<TerminalNode> COLON() { return getTokens(GDScriptParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GDScriptParser.COLON, i);
		}
		public List<TypeHintContext> typeHint() {
			return getRuleContexts(TypeHintContext.class);
		}
		public TypeHintContext typeHint(int i) {
			return getRuleContext(TypeHintContext.class,i);
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
		enterRule(_localctx, 48, RULE_signalParList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(OPEN_PAREN);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER || _la==COMMA) {
				{
				{
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(392);
					match(COMMA);
					}
				}

				setState(395);
				match(IDENTIFIER);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(396);
					match(COLON);
					setState(397);
					typeHint();
					}
				}

				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
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
		public EnumListContext enumList() {
			return getRuleContext(EnumListContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 50, RULE_enumDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(ENUM);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(408);
				match(IDENTIFIER);
				}
			}

			setState(411);
			enumList();
			setState(412);
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
	public static class EnumListContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(GDScriptParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(GDScriptParser.CLOSE_BRACE, 0); }
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
		public EnumListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterEnumList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitEnumList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitEnumList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumListContext enumList() throws RecognitionException {
		EnumListContext _localctx = new EnumListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enumList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(OPEN_BRACE);
			{
			setState(415);
			match(IDENTIFIER);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(416);
				match(ASSIGN);
				setState(417);
				expression(0);
				}
			}

			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(420);
					match(COMMA);
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
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(431);
				match(COMMA);
				}
			}

			}
			setState(434);
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
		enterRule(_localctx, 54, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921513062563840L) != 0)) {
				{
				setState(436);
				rpc();
				}
			}

			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(439);
				match(STATIC);
				}
			}

			setState(442);
			match(FUNC);
			setState(443);
			match(IDENTIFIER);
			setState(444);
			match(OPEN_PAREN);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==IDENTIFIER) {
				{
				setState(445);
				parList();
				}
			}

			setState(448);
			match(CLOSE_PAREN);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(449);
				match(ARROW);
				setState(450);
				typeHint();
				}
			}

			setState(453);
			match(COLON);
			setState(454);
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
		enterRule(_localctx, 56, RULE_parList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			parameter();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(457);
				match(COMMA);
				setState(458);
				parameter();
				}
				}
				setState(463);
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
		public EqualsAssignmentStmtContext equalsAssignmentStmt() {
			return getRuleContext(EqualsAssignmentStmtContext.class,0);
		}
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
		enterRule(_localctx, 58, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(464);
				match(VAR);
				}
			}

			setState(467);
			match(IDENTIFIER);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(468);
				match(COLON);
				setState(469);
				typeHint();
				}
			}

			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 7L) != 0)) {
				{
				setState(472);
				equalsAssignmentStmt();
				setState(473);
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
		public TerminalNode RPC() { return getToken(GDScriptParser.RPC, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public TerminalNode STRING() { return getToken(GDScriptParser.STRING, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(GDScriptParser.NEWLINE, 0); }
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
		enterRule(_localctx, 60, RULE_rpc);
		int _la;
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REMOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(REMOTE);
				}
				break;
			case MASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				match(MASTER);
				}
				break;
			case PUPPET:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				match(PUPPET);
				}
				break;
			case REMOTESYNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(480);
				match(REMOTESYNC);
				}
				break;
			case MASTERSYNC:
				enterOuterAlt(_localctx, 5);
				{
				setState(481);
				match(MASTERSYNC);
				}
				break;
			case PUPPETSYNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(482);
				match(PUPPETSYNC);
				}
				break;
			case RPC:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(483);
				match(RPC);
				setState(484);
				match(OPEN_PAREN);
				setState(485);
				match(STRING);
				setState(486);
				match(CLOSE_PAREN);
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(487);
					match(NEWLINE);
					}
				}

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
		enterRule(_localctx, 62, RULE_constructorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(FUNC);
			setState(493);
			match(IDENTIFIER);
			setState(494);
			match(OPEN_PAREN);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==IDENTIFIER) {
				{
				setState(495);
				parList();
				}
			}

			setState(498);
			match(CLOSE_PAREN);
			{
			setState(499);
			match(DOT);
			setState(500);
			match(OPEN_PAREN);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3760225468008103872L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 16184846099416063L) != 0)) {
				{
				setState(501);
				argList();
				}
			}

			setState(504);
			match(CLOSE_PAREN);
			}
			setState(506);
			match(COLON);
			setState(507);
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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
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
		enterRule(_localctx, 64, RULE_argList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(509);
				expression(0);
				}
				break;
			case 2:
				{
				setState(510);
				stmt();
				}
				break;
			}
			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(513);
					match(COMMA);
					setState(516);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(514);
						expression(0);
						}
						break;
					case 2:
						{
						setState(515);
						stmt();
						}
						break;
					}
					}
					} 
				}
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(523);
				match(COMMA);
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
		enterRule(_localctx, 66, RULE_innerClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(CLASS);
			setState(527);
			match(IDENTIFIER);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(528);
				inheritance();
				}
			}

			setState(531);
			match(COLON);
			setState(532);
			match(NEWLINE);
			setState(533);
			match(INDENT);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(534);
				inheritance();
				setState(535);
				match(NEWLINE);
				}
			}

			setState(540); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(539);
				topLevelDecl();
				}
				}
				setState(542); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -2319073570073869984L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 68398489217796095L) != 0) );
			setState(544);
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
		enterRule(_localctx, 68, RULE_stmtOrSuite);
		try {
			setState(552);
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
			case AWAIT:
			case WARNING_IGNORE:
			case ARRAY:
			case IDENTIFIER:
			case BUILTINTYPE:
			case CONSTANT:
			case MULTI_LINE_STRING:
			case STRING:
			case STRINGNAME:
			case NODEPATH:
			case INTEGER:
			case FLOAT:
			case DOT:
			case OPEN_PAREN:
			case OPEN_BRACE:
			case OPEN_BRACK:
			case LOGIC_NOT:
			case ADD:
			case MINUS:
			case MOD:
			case NOT_OP:
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(NEWLINE);
				setState(548);
				match(INDENT);
				setState(549);
				suite();
				setState(550);
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
		enterRule(_localctx, 70, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(554);
				stmt();
				}
				}
				setState(557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -3760225468008103872L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 16184846099416063L) != 0) );
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
		public AwaitStmtContext awaitStmt() {
			return getRuleContext(AwaitStmtContext.class,0);
		}
		public TerminalNode BREAKPOINT() { return getToken(GDScriptParser.BREAKPOINT, 0); }
		public StmtEndContext stmtEnd() {
			return getRuleContext(StmtEndContext.class,0);
		}
		public TerminalNode PASS() { return getToken(GDScriptParser.PASS, 0); }
		public TerminalNode WARNING_IGNORE() { return getToken(GDScriptParser.WARNING_IGNORE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public List<TerminalNode> STRING() { return getTokens(GDScriptParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GDScriptParser.STRING, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GDScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GDScriptParser.COMMA, i);
		}
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
		enterRule(_localctx, 72, RULE_stmt);
		int _la;
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				varDeclStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				ifStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(561);
				forStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(562);
				whileStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(563);
				matchStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(564);
				flowStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(565);
				assignmentStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(566);
				exprStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(567);
				assertStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(568);
				yieldStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(569);
				preloadStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(570);
				awaitStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(571);
				match(BREAKPOINT);
				setState(572);
				stmtEnd();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(573);
				match(PASS);
				setState(574);
				stmtEnd();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(575);
				match(WARNING_IGNORE);
				setState(576);
				match(OPEN_PAREN);
				setState(577);
				match(STRING);
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(578);
					match(COMMA);
					setState(579);
					match(STRING);
					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(585);
				match(CLOSE_PAREN);
				setState(586);
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
		enterRule(_localctx, 74, RULE_stmtEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
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
	public static class AwaitStmtContext extends ParserRuleContext {
		public TerminalNode AWAIT() { return getToken(GDScriptParser.AWAIT, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public AwaitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_awaitStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterAwaitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitAwaitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitAwaitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AwaitStmtContext awaitStmt() throws RecognitionException {
		AwaitStmtContext _localctx = new AwaitStmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_awaitStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(AWAIT);
			setState(592);
			stmt();
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
		public List<TerminalNode> NEWLINE() { return getTokens(GDScriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GDScriptParser.NEWLINE, i);
		}
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
		enterRule(_localctx, 78, RULE_ifStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(IF);
			setState(595);
			expression(0);
			setState(596);
			match(COLON);
			setState(597);
			stmtOrSuite();
			setState(605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(598);
					match(ELIF);
					setState(599);
					expression(0);
					setState(600);
					match(COLON);
					setState(601);
					stmtOrSuite();
					}
					} 
				}
				setState(607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(608);
				match(ELSE);
				setState(609);
				match(COLON);
				setState(610);
				stmtOrSuite();
				}
				break;
			}
			setState(616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(613);
					match(NEWLINE);
					}
					} 
				}
				setState(618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
		enterRule(_localctx, 80, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(WHILE);
			setState(620);
			expression(0);
			setState(621);
			match(COLON);
			setState(622);
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
		enterRule(_localctx, 82, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(FOR);
			setState(625);
			match(IDENTIFIER);
			setState(626);
			match(IN);
			setState(627);
			expression(0);
			setState(628);
			match(COLON);
			setState(629);
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
		enterRule(_localctx, 84, RULE_matchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(MATCH);
			setState(632);
			expression(0);
			setState(633);
			match(COLON);
			setState(634);
			match(NEWLINE);
			setState(635);
			match(INDENT);
			setState(636);
			matchBlock();
			setState(637);
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
		enterRule(_localctx, 86, RULE_matchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(639);
				patternList();
				setState(640);
				match(COLON);
				setState(641);
				stmtOrSuite();
				}
				}
				setState(645); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -8948652459585175488L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 16184846367851519L) != 0) );
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
		enterRule(_localctx, 88, RULE_patternList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			pattern();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(648);
				match(COMMA);
				setState(649);
				pattern();
				}
				}
				setState(654);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 90, RULE_pattern);
		try {
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(BUILTINTYPE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				match(CONSTANT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(658);
				match(UNDERSCORE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(659);
				bindingPattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(660);
				arrayPattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(661);
				dictPattern();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(662);
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
		enterRule(_localctx, 92, RULE_bindingPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(VAR);
			setState(666);
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
		enterRule(_localctx, 94, RULE_arrayPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(OPEN_BRACK);
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8948652459585175488L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 16184846367851519L) != 0)) {
				{
				setState(669);
				pattern();
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(670);
					match(COMMA);
					setState(671);
					pattern();
					}
					}
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOTDOT) {
					{
					setState(677);
					match(DOTDOT);
					}
				}

				}
			}

			setState(682);
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
		enterRule(_localctx, 96, RULE_dictPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(OPEN_BRACE);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(685);
				keyValuePattern();
				}
			}

			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(688);
				match(COMMA);
				setState(689);
				keyValuePattern();
				}
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(695);
				match(DOTDOT);
				}
			}

			setState(698);
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
		enterRule(_localctx, 98, RULE_keyValuePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(STRING);
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(701);
				match(COLON);
				setState(702);
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
		enterRule(_localctx, 100, RULE_flowStmt);
		int _la;
		try {
			setState(714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(CONTINUE);
				setState(706);
				stmtEnd();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				match(BREAK);
				setState(708);
				stmtEnd();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				match(RETURN);
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8948652459585175552L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 16184846099416063L) != 0)) {
					{
					setState(710);
					expression(0);
					}
				}

				setState(713);
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
		public EqualsAssignmentStmtContext equalsAssignmentStmt() {
			return getRuleContext(EqualsAssignmentStmtContext.class,0);
		}
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
		enterRule(_localctx, 102, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			expression(0);
			setState(726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
			case COLON_ASSIGN:
			case COLON_ASSIGN_WHITESPACE:
				{
				setState(717);
				equalsAssignmentStmt();
				}
				break;
			case ADD_ASSIGN:
				{
				setState(718);
				match(ADD_ASSIGN);
				}
				break;
			case MINUS_ASSIGN:
				{
				setState(719);
				match(MINUS_ASSIGN);
				}
				break;
			case MUL_ASSIGN:
				{
				setState(720);
				match(MUL_ASSIGN);
				}
				break;
			case DIV_ASSIGN:
				{
				setState(721);
				match(DIV_ASSIGN);
				}
				break;
			case MOD_ASSIGN:
				{
				setState(722);
				match(MOD_ASSIGN);
				}
				break;
			case AND_ASSIGN:
				{
				setState(723);
				match(AND_ASSIGN);
				}
				break;
			case OR_ASSIGN:
				{
				setState(724);
				match(OR_ASSIGN);
				}
				break;
			case XOR_ASSIGN:
				{
				setState(725);
				match(XOR_ASSIGN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(728);
			expression(0);
			setState(729);
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
	public static class EqualsAssignmentStmtContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(GDScriptParser.ASSIGN, 0); }
		public TerminalNode COLON_ASSIGN() { return getToken(GDScriptParser.COLON_ASSIGN, 0); }
		public TerminalNode COLON_ASSIGN_WHITESPACE() { return getToken(GDScriptParser.COLON_ASSIGN_WHITESPACE, 0); }
		public EqualsAssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsAssignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterEqualsAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitEqualsAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitEqualsAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsAssignmentStmtContext equalsAssignmentStmt() throws RecognitionException {
		EqualsAssignmentStmtContext _localctx = new EqualsAssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_equalsAssignmentStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 7L) != 0)) ) {
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
	public static class VarDeclStmtContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GDScriptParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
		public StmtEndContext stmtEnd() {
			return getRuleContext(StmtEndContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GDScriptParser.COLON, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public EqualsAssignmentStmtContext equalsAssignmentStmt() {
			return getRuleContext(EqualsAssignmentStmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public MethodDeclContext methodDecl() {
			return getRuleContext(MethodDeclContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitVarDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclStmtContext varDeclStmt() throws RecognitionException {
		VarDeclStmtContext _localctx = new VarDeclStmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_varDeclStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(VAR);
			setState(734);
			match(IDENTIFIER);
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(735);
				match(COLON);
				setState(736);
				typeHint();
				}
			}

			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 7L) != 0)) {
				{
				setState(739);
				equalsAssignmentStmt();
				setState(743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(740);
					expression(0);
					}
					break;
				case 2:
					{
					setState(741);
					stmt();
					}
					break;
				case 3:
					{
					setState(742);
					methodDecl();
					}
					break;
				}
				}
			}

			setState(747);
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
		enterRule(_localctx, 108, RULE_assertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(ASSERT);
			setState(750);
			match(OPEN_PAREN);
			setState(751);
			expression(0);
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(752);
				match(COMMA);
				setState(753);
				match(STRING);
				}
			}

			setState(756);
			match(CLOSE_PAREN);
			setState(757);
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
		public StmtEndContext stmtEnd() {
			return getRuleContext(StmtEndContext.class,0);
		}
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
		enterRule(_localctx, 110, RULE_yieldStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(YIELD);
			setState(760);
			match(OPEN_PAREN);
			{
			setState(761);
			expression(0);
			setState(762);
			match(COMMA);
			setState(763);
			expression(0);
			}
			setState(765);
			match(CLOSE_PAREN);
			setState(766);
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
	public static class PreloadStmtContext extends ParserRuleContext {
		public TerminalNode PRELOAD() { return getToken(GDScriptParser.PRELOAD, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public TerminalNode CONSTANT() { return getToken(GDScriptParser.CONSTANT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StmtEndContext stmtEnd() {
			return getRuleContext(StmtEndContext.class,0);
		}
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
		enterRule(_localctx, 112, RULE_preloadStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(PRELOAD);
			setState(769);
			match(OPEN_PAREN);
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(770);
				match(CONSTANT);
				}
				break;
			case 2:
				{
				setState(771);
				expression(0);
				}
				break;
			}
			setState(774);
			match(CLOSE_PAREN);
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(775);
				expression(0);
				}
				break;
			}
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(778);
				stmtEnd();
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
		enterRule(_localctx, 114, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			expression(0);
			setState(782);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitCast(this);
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
		public TerminalNode ARRAY() { return getToken(GDScriptParser.ARRAY, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(GDScriptParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(GDScriptParser.CLOSE_PAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GDScriptParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GDScriptParser.IDENTIFIER, 0); }
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
	public static class UniqueNodeContext extends ExpressionContext {
		public TerminalNode MOD() { return getToken(GDScriptParser.MOD, 0); }
		public TerminalNode STRING() { return getToken(GDScriptParser.STRING, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GDScriptParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GDScriptParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DIV() { return getTokens(GDScriptParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(GDScriptParser.DIV, i);
		}
		public UniqueNodeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterUniqueNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitUniqueNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitUniqueNode(this);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(785);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(786);
				match(FALSE);
				}
				break;
			case NULL:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(787);
				match(NULL);
				}
				break;
			case SELF:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(788);
				match(SELF);
				}
				break;
			case ARRAY:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(789);
				match(ARRAY);
				setState(790);
				match(OPEN_PAREN);
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3760225468008103872L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 16184846099416063L) != 0)) {
					{
					setState(791);
					argList();
					}
				}

				setState(794);
				match(CLOSE_PAREN);
				}
				break;
			case IDENTIFIER:
			case BUILTINTYPE:
			case CONSTANT:
			case MULTI_LINE_STRING:
			case STRING:
			case STRINGNAME:
			case NODEPATH:
			case INTEGER:
			case FLOAT:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(795);
				literal();
				}
				break;
			case OPEN_BRACK:
				{
				_localctx = new ArrayDeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(796);
				match(OPEN_BRACK);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8948652459585175552L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 16184846099416063L) != 0)) {
					{
					setState(797);
					expression(0);
					setState(802);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(798);
							match(COMMA);
							setState(799);
							expression(0);
							}
							} 
						}
						setState(804);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
					}
					setState(806);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(805);
						match(COMMA);
						}
					}

					}
				}

				setState(810);
				match(CLOSE_BRACK);
				}
				break;
			case OPEN_BRACE:
				{
				_localctx = new DictDeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(811);
				match(OPEN_BRACE);
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8948652459585175552L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 16184846099416063L) != 0)) {
					{
					setState(812);
					keyValue();
					setState(817);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(813);
							match(COMMA);
							setState(814);
							keyValue();
							}
							} 
						}
						setState(819);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					}
					setState(821);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(820);
						match(COMMA);
						}
					}

					}
				}

				setState(825);
				match(CLOSE_BRACE);
				}
				break;
			case OPEN_PAREN:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(826);
				match(OPEN_PAREN);
				setState(827);
				expression(0);
				setState(828);
				match(CLOSE_PAREN);
				}
				break;
			case DOT:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(830);
				match(DOT);
				setState(831);
				match(IDENTIFIER);
				setState(832);
				match(OPEN_PAREN);
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3760225468008103872L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 16184846099416063L) != 0)) {
					{
					setState(833);
					argList();
					}
				}

				setState(836);
				match(CLOSE_PAREN);
				}
				break;
			case DOLLAR:
				{
				_localctx = new GetNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(837);
				match(DOLLAR);
				setState(847);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(838);
					match(STRING);
					}
					break;
				case IDENTIFIER:
					{
					setState(839);
					match(IDENTIFIER);
					setState(844);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(840);
							match(DIV);
							setState(841);
							match(IDENTIFIER);
							}
							} 
						}
						setState(846);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case MOD:
				{
				_localctx = new UniqueNodeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(849);
				match(MOD);
				setState(859);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(850);
					match(STRING);
					}
					break;
				case IDENTIFIER:
					{
					setState(851);
					match(IDENTIFIER);
					setState(856);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(852);
							match(DIV);
							setState(853);
							match(IDENTIFIER);
							}
							} 
						}
						setState(858);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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
				setState(861);
				match(NOT_OP);
				setState(862);
				expression(16);
				}
				break;
			case ADD:
			case MINUS:
				{
				_localctx = new SignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(863);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(864);
				expression(15);
				}
				break;
			case NOT:
			case LOGIC_NOT:
				{
				_localctx = new LogicNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(865);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==LOGIC_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(866);
				expression(5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(930);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(928);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(869);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(870);
						_la = _input.LA(1);
						if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(871);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(872);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(873);
						match(ADD);
						setState(874);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(875);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(876);
						match(MINUS);
						setState(877);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new BitShiftContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(878);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(879);
						_la = _input.LA(1);
						if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(880);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new BitAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(881);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(882);
						match(AND_OP);
						setState(883);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new BitXorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(884);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(885);
						match(XOR);
						setState(886);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new BitOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(887);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(888);
						match(OR_OP);
						setState(889);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(890);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(891);
						_la = _input.LA(1);
						if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(892);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new InContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(893);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(894);
						match(IN);
						setState(895);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new LogicAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(896);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(897);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==LOGIC_AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(898);
						expression(5);
						}
						break;
					case 11:
						{
						_localctx = new LogicOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(899);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(900);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==LOGIC_OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(901);
						expression(4);
						}
						break;
					case 12:
						{
						_localctx = new TernacyExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(902);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(903);
						match(IF);
						setState(904);
						expression(0);
						setState(905);
						match(ELSE);
						setState(906);
						expression(3);
						}
						break;
					case 13:
						{
						_localctx = new SubscriptionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(908);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(909);
						match(OPEN_BRACK);
						setState(910);
						expression(0);
						setState(911);
						match(CLOSE_BRACK);
						}
						break;
					case 14:
						{
						_localctx = new AttributeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(913);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(914);
						match(DOT);
						setState(915);
						match(IDENTIFIER);
						}
						break;
					case 15:
						{
						_localctx = new CallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(916);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(917);
						match(OPEN_PAREN);
						setState(919);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3760225468008103872L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 16184846099416063L) != 0)) {
							{
							setState(918);
							argList();
							}
						}

						setState(921);
						match(CLOSE_PAREN);
						}
						break;
					case 16:
						{
						_localctx = new IsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(922);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(923);
						match(IS);
						setState(924);
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
						setState(925);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(926);
						match(AS);
						setState(927);
						typeHint();
						}
						break;
					}
					} 
				}
				setState(932);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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
		public TerminalNode MULTI_LINE_STRING() { return getToken(GDScriptParser.MULTI_LINE_STRING, 0); }
		public TerminalNode STRINGNAME() { return getToken(GDScriptParser.STRINGNAME, 0); }
		public TerminalNode NODEPATH() { return getToken(GDScriptParser.NODEPATH, 0); }
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
		enterRule(_localctx, 118, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 511L) != 0)) ) {
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
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GDScriptParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(GDScriptParser.FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDScriptParserListener ) ((GDScriptParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GDScriptParserVisitor ) return ((GDScriptParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
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
		enterRule(_localctx, 122, RULE_keyValue);
		try {
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				expression(0);
				setState(938);
				match(COLON);
				setState(939);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				match(IDENTIFIER);
				setState(942);
				match(ASSIGN);
				setState(943);
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
		case 58:
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
			return precpred(_ctx, 23);
		case 13:
			return precpred(_ctx, 22);
		case 14:
			return precpred(_ctx, 21);
		case 15:
			return precpred(_ctx, 17);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001x\u03b3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0001\u0000\u0003\u0000~\b\u0000\u0001\u0000\u0003"+
		"\u0000\u0081\b\u0000\u0001\u0000\u0005\u0000\u0084\b\u0000\n\u0000\f\u0000"+
		"\u0087\t\u0000\u0001\u0000\u0005\u0000\u008a\b\u0000\n\u0000\f\u0000\u008d"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0094\b\u0001\n\u0001\f\u0001\u0097\t\u0001\u0003\u0001\u0099\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u009d\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u00a2\b\u0001\n\u0001\f\u0001\u00a5\t\u0001"+
		"\u0003\u0001\u00a7\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u00ae\b\u0002\n\u0002\f\u0002\u00b1\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00b5\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00b9\b\u0003\u0003\u0003\u00bb\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u00c1\b\u0004\n\u0004\f\u0004\u00c4"+
		"\t\u0004\u0001\u0004\u0005\u0004\u00c7\b\u0004\n\u0004\f\u0004\u00ca\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d0"+
		"\b\u0005\u0001\u0005\u0005\u0005\u00d3\b\u0005\n\u0005\f\u0005\u00d6\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00e1\b\u0006\u0001"+
		"\u0007\u0003\u0007\u00e4\b\u0007\u0001\u0007\u0003\u0007\u00e7\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ed\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00f2\b\u0007\u0003\u0007"+
		"\u00f4\b\u0007\u0001\u0007\u0003\u0007\u00f7\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0003\b\u00fd\b\b\u0001\b\u0001\b\u0003\b\u0101"+
		"\b\b\u0001\t\u0003\t\u0104\b\t\u0001\t\u0003\t\u0107\b\t\u0001\t\u0003"+
		"\t\u010a\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0114\b\n\u0001\u000b\u0003\u000b\u0117\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u011f\b\u000b\n\u000b\f\u000b\u0122\t\u000b\u0003\u000b\u0124\b\u000b"+
		"\u0001\u000b\u0003\u000b\u0127\b\u000b\u0001\u000b\u0003\u000b\u012a\b"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0132\b"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u013a\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u013f\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0144\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0149\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0151\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0156\b\u0012\n\u0012\f\u0012\u0159\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u015e\b\u0013\n\u0013"+
		"\f\u0013\u0161\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0170\b\u0015\u0003\u0015"+
		"\u0172\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0178\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u017d\b"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0184\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u018a\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u018f"+
		"\b\u0018\u0005\u0018\u0191\b\u0018\n\u0018\f\u0018\u0194\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u019a\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01a3\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01a9\b\u001a\u0005\u001a\u01ab\b\u001a\n\u001a\f\u001a"+
		"\u01ae\t\u001a\u0001\u001a\u0003\u001a\u01b1\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0003\u001b\u01b6\b\u001b\u0001\u001b\u0003\u001b\u01b9"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01bf"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01c4\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u01cc\b\u001c\n\u001c\f\u001c\u01cf\t\u001c\u0001\u001d\u0003"+
		"\u001d\u01d2\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01d7"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01dc\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01e9\b\u001e\u0003\u001e\u01eb\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01f1\b\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01f7\b\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 \u0200\b \u0001 \u0001"+
		" \u0001 \u0003 \u0205\b \u0005 \u0207\b \n \f \u020a\t \u0001 \u0003 "+
		"\u020d\b \u0001!\u0001!\u0001!\u0003!\u0212\b!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u021a\b!\u0001!\u0004!\u021d\b!\u000b!\f!\u021e"+
		"\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\""+
		"\u0229\b\"\u0001#\u0004#\u022c\b#\u000b#\f#\u022d\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u0245"+
		"\b$\n$\f$\u0248\t$\u0001$\u0001$\u0003$\u024c\b$\u0001%\u0001%\u0001&"+
		"\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0005\'\u025c\b\'\n\'\f\'\u025f\t\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u0264\b\'\u0001\'\u0005\'\u0267\b\'\n\'\f\'\u026a\t\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001+\u0004+\u0284\b+\u000b+\f+\u0285\u0001,\u0001,\u0001"+
		",\u0005,\u028b\b,\n,\f,\u028e\t,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u0298\b-\u0001.\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0001/\u0005/\u02a1\b/\n/\f/\u02a4\t/\u0001/\u0003/\u02a7\b/\u0003/"+
		"\u02a9\b/\u0001/\u0001/\u00010\u00010\u00030\u02af\b0\u00010\u00010\u0005"+
		"0\u02b3\b0\n0\f0\u02b6\t0\u00010\u00030\u02b9\b0\u00010\u00010\u00011"+
		"\u00011\u00011\u00031\u02c0\b1\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u02c8\b2\u00012\u00032\u02cb\b2\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00033\u02d7\b3\u00013\u00013\u0001"+
		"3\u00014\u00014\u00015\u00015\u00015\u00015\u00035\u02e2\b5\u00015\u0001"+
		"5\u00015\u00015\u00035\u02e8\b5\u00035\u02ea\b5\u00015\u00015\u00016\u0001"+
		"6\u00016\u00016\u00016\u00036\u02f3\b6\u00016\u00016\u00016\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00018\u00018\u0001"+
		"8\u00018\u00038\u0305\b8\u00018\u00018\u00038\u0309\b8\u00018\u00038\u030c"+
		"\b8\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0003:\u0319\b:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0005"+
		":\u0321\b:\n:\f:\u0324\t:\u0001:\u0003:\u0327\b:\u0003:\u0329\b:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0005:\u0330\b:\n:\f:\u0333\t:\u0001:\u0003"+
		":\u0336\b:\u0003:\u0338\b:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0003:\u0343\b:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0005:\u034b\b:\n:\f:\u034e\t:\u0003:\u0350\b:\u0001:\u0001:\u0001:"+
		"\u0001:\u0001:\u0005:\u0357\b:\n:\f:\u035a\t:\u0003:\u035c\b:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0003:\u0364\b:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u0398\b:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0005:\u03a1\b:\n:\f:\u03a4\t:\u0001"+
		";\u0001;\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0003=\u03b1\b=\u0001=\u0000\u0001t>\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz\u0000\u000f\u0002\u0000AAEE\u0001\u0000\u000f"+
		"\u0011\u0001\u0000\u0012\u0014\u0002\u0000@@aa\u0001\u0000MO\u0001\u0000"+
		"pq\u0002\u000044dd\u0001\u0000rt\u0001\u0000no\u0001\u0000ej\u0002\u0000"+
		"33cc\u0002\u000022bb\u0001\u0000AB\u0001\u0000AI\u0001\u0000HI\u0437\u0000"+
		"}\u0001\u0000\u0000\u0000\u0002\u00a6\u0001\u0000\u0000\u0000\u0004\u00a8"+
		"\u0001\u0000\u0000\u0000\u0006\u00ba\u0001\u0000\u0000\u0000\b\u00bc\u0001"+
		"\u0000\u0000\u0000\n\u00cb\u0001\u0000\u0000\u0000\f\u00e0\u0001\u0000"+
		"\u0000\u0000\u000e\u00e3\u0001\u0000\u0000\u0000\u0010\u00fa\u0001\u0000"+
		"\u0000\u0000\u0012\u0103\u0001\u0000\u0000\u0000\u0014\u0113\u0001\u0000"+
		"\u0000\u0000\u0016\u0116\u0001\u0000\u0000\u0000\u0018\u012b\u0001\u0000"+
		"\u0000\u0000\u001a\u0133\u0001\u0000\u0000\u0000\u001c\u013b\u0001\u0000"+
		"\u0000\u0000\u001e\u0140\u0001\u0000\u0000\u0000 \u0145\u0001\u0000\u0000"+
		"\u0000\"\u014a\u0001\u0000\u0000\u0000$\u0152\u0001\u0000\u0000\u0000"+
		"&\u015a\u0001\u0000\u0000\u0000(\u0162\u0001\u0000\u0000\u0000*\u0171"+
		"\u0001\u0000\u0000\u0000,\u0173\u0001\u0000\u0000\u0000.\u0180\u0001\u0000"+
		"\u0000\u00000\u0187\u0001\u0000\u0000\u00002\u0197\u0001\u0000\u0000\u0000"+
		"4\u019e\u0001\u0000\u0000\u00006\u01b5\u0001\u0000\u0000\u00008\u01c8"+
		"\u0001\u0000\u0000\u0000:\u01d1\u0001\u0000\u0000\u0000<\u01ea\u0001\u0000"+
		"\u0000\u0000>\u01ec\u0001\u0000\u0000\u0000@\u01ff\u0001\u0000\u0000\u0000"+
		"B\u020e\u0001\u0000\u0000\u0000D\u0228\u0001\u0000\u0000\u0000F\u022b"+
		"\u0001\u0000\u0000\u0000H\u024b\u0001\u0000\u0000\u0000J\u024d\u0001\u0000"+
		"\u0000\u0000L\u024f\u0001\u0000\u0000\u0000N\u0252\u0001\u0000\u0000\u0000"+
		"P\u026b\u0001\u0000\u0000\u0000R\u0270\u0001\u0000\u0000\u0000T\u0277"+
		"\u0001\u0000\u0000\u0000V\u0283\u0001\u0000\u0000\u0000X\u0287\u0001\u0000"+
		"\u0000\u0000Z\u0297\u0001\u0000\u0000\u0000\\\u0299\u0001\u0000\u0000"+
		"\u0000^\u029c\u0001\u0000\u0000\u0000`\u02ac\u0001\u0000\u0000\u0000b"+
		"\u02bc\u0001\u0000\u0000\u0000d\u02ca\u0001\u0000\u0000\u0000f\u02cc\u0001"+
		"\u0000\u0000\u0000h\u02db\u0001\u0000\u0000\u0000j\u02dd\u0001\u0000\u0000"+
		"\u0000l\u02ed\u0001\u0000\u0000\u0000n\u02f7\u0001\u0000\u0000\u0000p"+
		"\u0300\u0001\u0000\u0000\u0000r\u030d\u0001\u0000\u0000\u0000t\u0363\u0001"+
		"\u0000\u0000\u0000v\u03a5\u0001\u0000\u0000\u0000x\u03a7\u0001\u0000\u0000"+
		"\u0000z\u03b0\u0001\u0000\u0000\u0000|~\u0003\u0002\u0001\u0000}|\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000"+
		"\u0000\u007f\u0081\u0003\u0006\u0003\u0000\u0080\u007f\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0085\u0001\u0000\u0000"+
		"\u0000\u0082\u0084\u0003\f\u0006\u0000\u0083\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u008b\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008a\u0005@\u0000\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005\u0000\u0000\u0001\u008f\u0001\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005w\u0000\u0000\u0091\u0095\u0005:\u0000\u0000\u0092\u0094\u0005"+
		"@\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u0090\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u00a7\u0003\u0004"+
		"\u0002\u0000\u009b\u009d\u0003\u0004\u0002\u0000\u009c\u009b\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005w\u0000\u0000\u009f\u00a3\u0005:\u0000\u0000"+
		"\u00a0\u00a2\u0005@\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u0098\u0001\u0000\u0000\u0000\u00a6"+
		"\u009c\u0001\u0000\u0000\u0000\u00a7\u0003\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005=\u0000\u0000\u00a9\u00aa\u0005X\u0000\u0000\u00aa\u00ab\u0005"+
		"E\u0000\u0000\u00ab\u00af\u0005Y\u0000\u0000\u00ac\u00ae\u0005@\u0000"+
		"\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u0005\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b4\u0003\n\u0005\u0000\u00b3\u00b5\u0003\b\u0004\u0000"+
		"\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00bb\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\b\u0004\u0000\u00b7"+
		"\u00b9\u0003\n\u0005\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b2"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00bb\u0007"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0003\u0000\u0000\u00bd\u00c2"+
		"\u0007\u0000\u0000\u0000\u00be\u00bf\u0005J\u0000\u0000\u00bf\u00c1\u0005"+
		"A\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c8\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c7\u0005@\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\t\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0004\u0000\u0000"+
		"\u00cc\u00cf\u0005A\u0000\u0000\u00cd\u00ce\u0005K\u0000\u0000\u00ce\u00d0"+
		"\u0005E\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d4\u0001\u0000\u0000\u0000\u00d1\u00d3\u0005"+
		"@\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5\u000b\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d7\u00e1\u0003\u000e\u0007\u0000\u00d8\u00e1\u0003,\u0016"+
		"\u0000\u00d9\u00e1\u0003.\u0017\u0000\u00da\u00e1\u00032\u0019\u0000\u00db"+
		"\u00e1\u00036\u001b\u0000\u00dc\u00e1\u0003>\u001f\u0000\u00dd\u00e1\u0003"+
		"B!\u0000\u00de\u00e1\u0005:\u0000\u0000\u00df\u00e1\u0003H$\u0000\u00e0"+
		"\u00d7\u0001\u0000\u0000\u0000\u00e0\u00d8\u0001\u0000\u0000\u0000\u00e0"+
		"\u00d9\u0001\u0000\u0000\u0000\u00e0\u00da\u0001\u0000\u0000\u0000\u00e0"+
		"\u00db\u0001\u0000\u0000\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e0"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0"+
		"\u00df\u0001\u0000\u0000\u0000\u00e1\r\u0001\u0000\u0000\u0000\u00e2\u00e4"+
		"\u0003\u0012\t\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e7\u0003"+
		"\u0014\n\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0006"+
		"\u0000\u0000\u00e9\u00ec\u0005A\u0000\u0000\u00ea\u00eb\u0005L\u0000\u0000"+
		"\u00eb\u00ed\u0003*\u0015\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ed\u00f3\u0001\u0000\u0000\u0000\u00ee"+
		"\u00f1\u0003h4\u0000\u00ef\u00f2\u0003t:\u0000\u00f0\u00f2\u0003H$\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f7\u0003\u0010\b\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0005@\u0000\u0000\u00f9\u000f\u0001\u0000\u0000\u0000\u00fa\u00fc"+
		"\u0005\u0007\u0000\u0000\u00fb\u00fd\u0005A\u0000\u0000\u00fc\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0100\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0005K\u0000\u0000\u00ff\u0101\u0005A\u0000"+
		"\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0011\u0001\u0000\u0000\u0000\u0102\u0104\u0005w\u0000\u0000"+
		"\u0103\u0102\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0107\u0005\u0005\u0000\u0000"+
		"\u0106\u0105\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000"+
		"\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u010a\u0005@\u0000\u0000\u0109"+
		"\u0108\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\u0013\u0001\u0000\u0000\u0000\u010b\u0114\u0003\u0016\u000b\u0000\u010c"+
		"\u0114\u0003\u0018\f\u0000\u010d\u0114\u0003\u001a\r\u0000\u010e\u0114"+
		"\u0003\u001c\u000e\u0000\u010f\u0114\u0003 \u0010\u0000\u0110\u0114\u0003"+
		"\"\u0011\u0000\u0111\u0114\u0003$\u0012\u0000\u0112\u0114\u0003&\u0013"+
		"\u0000\u0113\u010b\u0001\u0000\u0000\u0000\u0113\u010c\u0001\u0000\u0000"+
		"\u0000\u0113\u010d\u0001\u0000\u0000\u0000\u0113\u010e\u0001\u0000\u0000"+
		"\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u0113\u0110\u0001\u0000\u0000"+
		"\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0112\u0001\u0000\u0000"+
		"\u0000\u0114\u0015\u0001\u0000\u0000\u0000\u0115\u0117\u0005w\u0000\u0000"+
		"\u0116\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0126\u0005\b\u0000\u0000\u0119"+
		"\u0123\u0005X\u0000\u0000\u011a\u0124\u0005B\u0000\u0000\u011b\u0120\u0005"+
		"A\u0000\u0000\u011c\u011d\u0005K\u0000\u0000\u011d\u011f\u0003v;\u0000"+
		"\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000"+
		"\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000"+
		"\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0123\u011a\u0001\u0000\u0000\u0000\u0123\u011b\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0127\u0005Y\u0000\u0000\u0126\u0119\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128"+
		"\u012a\u0005@\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0001\u0000\u0000\u0000\u012a\u0017\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0005w\u0000\u0000\u012c\u012d\u0005\t\u0000\u0000\u012d\u012e\u0005"+
		"X\u0000\u0000\u012e\u012f\u0003@ \u0000\u012f\u0131\u0005Y\u0000\u0000"+
		"\u0130\u0132\u0005@\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0001\u0000\u0000\u0000\u0132\u0019\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0005w\u0000\u0000\u0134\u0135\u0005\n\u0000\u0000\u0135\u0136"+
		"\u0005X\u0000\u0000\u0136\u0137\u0003@ \u0000\u0137\u0139\u0005Y\u0000"+
		"\u0000\u0138\u013a\u0005@\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u001b\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0005w\u0000\u0000\u013c\u013e\u0005\u000b\u0000\u0000\u013d"+
		"\u013f\u0005@\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u001d\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0005w\u0000\u0000\u0141\u0143\u0005\f\u0000\u0000\u0142\u0144\u0005"+
		"@\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000"+
		"\u0000\u0000\u0144\u001f\u0001\u0000\u0000\u0000\u0145\u0146\u0005w\u0000"+
		"\u0000\u0146\u0148\u0005\r\u0000\u0000\u0147\u0149\u0005@\u0000\u0000"+
		"\u0148\u0147\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000"+
		"\u0149!\u0001\u0000\u0000\u0000\u014a\u014b\u0005w\u0000\u0000\u014b\u014c"+
		"\u0005\u000e\u0000\u0000\u014c\u014d\u0005X\u0000\u0000\u014d\u014e\u0003"+
		"@ \u0000\u014e\u0150\u0005Y\u0000\u0000\u014f\u0151\u0005@\u0000\u0000"+
		"\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000"+
		"\u0151#\u0001\u0000\u0000\u0000\u0152\u0153\u0005w\u0000\u0000\u0153\u0157"+
		"\u0007\u0001\u0000\u0000\u0154\u0156\u0005@\u0000\u0000\u0155\u0154\u0001"+
		"\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158%\u0001\u0000"+
		"\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015b\u0005w\u0000"+
		"\u0000\u015b\u015f\u0007\u0002\u0000\u0000\u015c\u015e\u0005@\u0000\u0000"+
		"\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000"+
		"\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000"+
		"\u0160\'\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162"+
		"\u0163\u0005w\u0000\u0000\u0163\u0164\u0005\u0015\u0000\u0000\u0164\u0165"+
		"\u0005X\u0000\u0000\u0165\u0166\u0003@ \u0000\u0166\u0167\u0005Y\u0000"+
		"\u0000\u0167)\u0001\u0000\u0000\u0000\u0168\u0172\u0005B\u0000\u0000\u0169"+
		"\u0172\u0005A\u0000\u0000\u016a\u016f\u0005?\u0000\u0000\u016b\u016c\u0005"+
		"^\u0000\u0000\u016c\u016d\u0003*\u0015\u0000\u016d\u016e\u0005_\u0000"+
		"\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u016b\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0172\u0001\u0000\u0000"+
		"\u0000\u0171\u0168\u0001\u0000\u0000\u0000\u0171\u0169\u0001\u0000\u0000"+
		"\u0000\u0171\u016a\u0001\u0000\u0000\u0000\u0172+\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0005\u0016\u0000\u0000\u0174\u0177\u0005A\u0000\u0000\u0175"+
		"\u0176\u0005L\u0000\u0000\u0176\u0178\u0003*\u0015\u0000\u0177\u0175\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0001"+
		"\u0000\u0000\u0000\u0179\u017c\u0003h4\u0000\u017a\u017d\u0003t:\u0000"+
		"\u017b\u017d\u0003H$\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017b"+
		"\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\u0005@\u0000\u0000\u017f-\u0001\u0000\u0000\u0000\u0180\u0181\u0005\u0017"+
		"\u0000\u0000\u0181\u0183\u0005A\u0000\u0000\u0182\u0184\u00030\u0018\u0000"+
		"\u0183\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0005@\u0000\u0000\u0186"+
		"/\u0001\u0000\u0000\u0000\u0187\u0192\u0005X\u0000\u0000\u0188\u018a\u0005"+
		"K\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000"+
		"\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018e\u0005A\u0000"+
		"\u0000\u018c\u018d\u0005L\u0000\u0000\u018d\u018f\u0003*\u0015\u0000\u018e"+
		"\u018c\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f"+
		"\u0191\u0001\u0000\u0000\u0000\u0190\u0189\u0001\u0000\u0000\u0000\u0191"+
		"\u0194\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0001\u0000\u0000\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194"+
		"\u0192\u0001\u0000\u0000\u0000\u0195\u0196\u0005Y\u0000\u0000\u01961\u0001"+
		"\u0000\u0000\u0000\u0197\u0199\u0005\u0018\u0000\u0000\u0198\u019a\u0005"+
		"A\u0000\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u00034\u001a"+
		"\u0000\u019c\u019d\u0005@\u0000\u0000\u019d3\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0005Z\u0000\u0000\u019f\u01a2\u0005A\u0000\u0000\u01a0\u01a1\u0005"+
		"M\u0000\u0000\u01a1\u01a3\u0003t:\u0000\u01a2\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01ac\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0005K\u0000\u0000\u01a5\u01a8\u0005A\u0000\u0000\u01a6"+
		"\u01a7\u0005M\u0000\u0000\u01a7\u01a9\u0003t:\u0000\u01a8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001"+
		"\u0000\u0000\u0000\u01aa\u01a4\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001"+
		"\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001"+
		"\u0000\u0000\u0000\u01af\u01b1\u0005K\u0000\u0000\u01b0\u01af\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b3\u0005[\u0000\u0000\u01b35\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b6\u0003<\u001e\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b9\u0005\u0019\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\u0005\u001a\u0000\u0000\u01bb\u01bc\u0005A\u0000\u0000\u01bc\u01be"+
		"\u0005X\u0000\u0000\u01bd\u01bf\u00038\u001c\u0000\u01be\u01bd\u0001\u0000"+
		"\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c3\u0005Y\u0000\u0000\u01c1\u01c2\u0005\\\u0000"+
		"\u0000\u01c2\u01c4\u0003*\u0015\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c6\u0005L\u0000\u0000\u01c6\u01c7\u0003D\"\u0000\u01c77\u0001"+
		"\u0000\u0000\u0000\u01c8\u01cd\u0003:\u001d\u0000\u01c9\u01ca\u0005K\u0000"+
		"\u0000\u01ca\u01cc\u0003:\u001d\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce9\u0001\u0000\u0000\u0000\u01cf"+
		"\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d2\u0005\u0006\u0000\u0000\u01d1"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d6\u0005A\u0000\u0000\u01d4\u01d5"+
		"\u0005L\u0000\u0000\u01d5\u01d7\u0003*\u0015\u0000\u01d6\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01db\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0003h4\u0000\u01d9\u01da\u0003t:\u0000\u01da"+
		"\u01dc\u0001\u0000\u0000\u0000\u01db\u01d8\u0001\u0000\u0000\u0000\u01db"+
		"\u01dc\u0001\u0000\u0000\u0000\u01dc;\u0001\u0000\u0000\u0000\u01dd\u01eb"+
		"\u0005\u001b\u0000\u0000\u01de\u01eb\u0005\u001c\u0000\u0000\u01df\u01eb"+
		"\u0005\u001d\u0000\u0000\u01e0\u01eb\u0005\u001e\u0000\u0000\u01e1\u01eb"+
		"\u0005\u001f\u0000\u0000\u01e2\u01eb\u0005 \u0000\u0000\u01e3\u01e4\u0005"+
		"<\u0000\u0000\u01e4\u01e5\u0005X\u0000\u0000\u01e5\u01e6\u0005E\u0000"+
		"\u0000\u01e6\u01e8\u0005Y\u0000\u0000\u01e7\u01e9\u0005@\u0000\u0000\u01e8"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ea\u01dd\u0001\u0000\u0000\u0000\u01ea"+
		"\u01de\u0001\u0000\u0000\u0000\u01ea\u01df\u0001\u0000\u0000\u0000\u01ea"+
		"\u01e0\u0001\u0000\u0000\u0000\u01ea\u01e1\u0001\u0000\u0000\u0000\u01ea"+
		"\u01e2\u0001\u0000\u0000\u0000\u01ea\u01e3\u0001\u0000\u0000\u0000\u01eb"+
		"=\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005\u001a\u0000\u0000\u01ed\u01ee"+
		"\u0005A\u0000\u0000\u01ee\u01f0\u0005X\u0000\u0000\u01ef\u01f1\u00038"+
		"\u001c\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f3\u0005Y\u0000"+
		"\u0000\u01f3\u01f4\u0005J\u0000\u0000\u01f4\u01f6\u0005X\u0000\u0000\u01f5"+
		"\u01f7\u0003@ \u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005"+
		"Y\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005L\u0000"+
		"\u0000\u01fb\u01fc\u0003D\"\u0000\u01fc?\u0001\u0000\u0000\u0000\u01fd"+
		"\u0200\u0003t:\u0000\u01fe\u0200\u0003H$\u0000\u01ff\u01fd\u0001\u0000"+
		"\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200\u0208\u0001\u0000"+
		"\u0000\u0000\u0201\u0204\u0005K\u0000\u0000\u0202\u0205\u0003t:\u0000"+
		"\u0203\u0205\u0003H$\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0203"+
		"\u0001\u0000\u0000\u0000\u0205\u0207\u0001\u0000\u0000\u0000\u0206\u0201"+
		"\u0001\u0000\u0000\u0000\u0207\u020a\u0001\u0000\u0000\u0000\u0208\u0206"+
		"\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020c"+
		"\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020b\u020d"+
		"\u0005K\u0000\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020c\u020d\u0001"+
		"\u0000\u0000\u0000\u020dA\u0001\u0000\u0000\u0000\u020e\u020f\u0005!\u0000"+
		"\u0000\u020f\u0211\u0005A\u0000\u0000\u0210\u0212\u0003\b\u0004\u0000"+
		"\u0211\u0210\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000"+
		"\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0214\u0005L\u0000\u0000\u0214"+
		"\u0215\u0005@\u0000\u0000\u0215\u0219\u0005\u0001\u0000\u0000\u0216\u0217"+
		"\u0003\b\u0004\u0000\u0217\u0218\u0005@\u0000\u0000\u0218\u021a\u0001"+
		"\u0000\u0000\u0000\u0219\u0216\u0001\u0000\u0000\u0000\u0219\u021a\u0001"+
		"\u0000\u0000\u0000\u021a\u021c\u0001\u0000\u0000\u0000\u021b\u021d\u0003"+
		"\f\u0006\u0000\u021c\u021b\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000"+
		"\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000"+
		"\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0005\u0002"+
		"\u0000\u0000\u0221C\u0001\u0000\u0000\u0000\u0222\u0229\u0003H$\u0000"+
		"\u0223\u0224\u0005@\u0000\u0000\u0224\u0225\u0005\u0001\u0000\u0000\u0225"+
		"\u0226\u0003F#\u0000\u0226\u0227\u0005\u0002\u0000\u0000\u0227\u0229\u0001"+
		"\u0000\u0000\u0000\u0228\u0222\u0001\u0000\u0000\u0000\u0228\u0223\u0001"+
		"\u0000\u0000\u0000\u0229E\u0001\u0000\u0000\u0000\u022a\u022c\u0003H$"+
		"\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000"+
		"\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000"+
		"\u0000\u022eG\u0001\u0000\u0000\u0000\u022f\u024c\u0003j5\u0000\u0230"+
		"\u024c\u0003N\'\u0000\u0231\u024c\u0003R)\u0000\u0232\u024c\u0003P(\u0000"+
		"\u0233\u024c\u0003T*\u0000\u0234\u024c\u0003d2\u0000\u0235\u024c\u0003"+
		"f3\u0000\u0236\u024c\u0003r9\u0000\u0237\u024c\u0003l6\u0000\u0238\u024c"+
		"\u0003n7\u0000\u0239\u024c\u0003p8\u0000\u023a\u024c\u0003L&\u0000\u023b"+
		"\u023c\u0005\"\u0000\u0000\u023c\u024c\u0003J%\u0000\u023d\u023e\u0005"+
		"#\u0000\u0000\u023e\u024c\u0003J%\u0000\u023f\u0240\u0005>\u0000\u0000"+
		"\u0240\u0241\u0005X\u0000\u0000\u0241\u0246\u0005E\u0000\u0000\u0242\u0243"+
		"\u0005K\u0000\u0000\u0243\u0245\u0005E\u0000\u0000\u0244\u0242\u0001\u0000"+
		"\u0000\u0000\u0245\u0248\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000"+
		"\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0249\u0001\u0000"+
		"\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0249\u024a\u0005Y\u0000"+
		"\u0000\u024a\u024c\u0003J%\u0000\u024b\u022f\u0001\u0000\u0000\u0000\u024b"+
		"\u0230\u0001\u0000\u0000\u0000\u024b\u0231\u0001\u0000\u0000\u0000\u024b"+
		"\u0232\u0001\u0000\u0000\u0000\u024b\u0233\u0001\u0000\u0000\u0000\u024b"+
		"\u0234\u0001\u0000\u0000\u0000\u024b\u0235\u0001\u0000\u0000\u0000\u024b"+
		"\u0236\u0001\u0000\u0000\u0000\u024b\u0237\u0001\u0000\u0000\u0000\u024b"+
		"\u0238\u0001\u0000\u0000\u0000\u024b\u0239\u0001\u0000\u0000\u0000\u024b"+
		"\u023a\u0001\u0000\u0000\u0000\u024b\u023b\u0001\u0000\u0000\u0000\u024b"+
		"\u023d\u0001\u0000\u0000\u0000\u024b\u023f\u0001\u0000\u0000\u0000\u024c"+
		"I\u0001\u0000\u0000\u0000\u024d\u024e\u0007\u0003\u0000\u0000\u024eK\u0001"+
		"\u0000\u0000\u0000\u024f\u0250\u0005;\u0000\u0000\u0250\u0251\u0003H$"+
		"\u0000\u0251M\u0001\u0000\u0000\u0000\u0252\u0253\u0005$\u0000\u0000\u0253"+
		"\u0254\u0003t:\u0000\u0254\u0255\u0005L\u0000\u0000\u0255\u025d\u0003"+
		"D\"\u0000\u0256\u0257\u0005%\u0000\u0000\u0257\u0258\u0003t:\u0000\u0258"+
		"\u0259\u0005L\u0000\u0000\u0259\u025a\u0003D\"\u0000\u025a\u025c\u0001"+
		"\u0000\u0000\u0000\u025b\u0256\u0001\u0000\u0000\u0000\u025c\u025f\u0001"+
		"\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000\u025d\u025e\u0001"+
		"\u0000\u0000\u0000\u025e\u0263\u0001\u0000\u0000\u0000\u025f\u025d\u0001"+
		"\u0000\u0000\u0000\u0260\u0261\u00051\u0000\u0000\u0261\u0262\u0005L\u0000"+
		"\u0000\u0262\u0264\u0003D\"\u0000\u0263\u0260\u0001\u0000\u0000\u0000"+
		"\u0263\u0264\u0001\u0000\u0000\u0000\u0264\u0268\u0001\u0000\u0000\u0000"+
		"\u0265\u0267\u0005@\u0000\u0000\u0266\u0265\u0001\u0000\u0000\u0000\u0267"+
		"\u026a\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0268"+
		"\u0269\u0001\u0000\u0000\u0000\u0269O\u0001\u0000\u0000\u0000\u026a\u0268"+
		"\u0001\u0000\u0000\u0000\u026b\u026c\u0005&\u0000\u0000\u026c\u026d\u0003"+
		"t:\u0000\u026d\u026e\u0005L\u0000\u0000\u026e\u026f\u0003D\"\u0000\u026f"+
		"Q\u0001\u0000\u0000\u0000\u0270\u0271\u0005\'\u0000\u0000\u0271\u0272"+
		"\u0005A\u0000\u0000\u0272\u0273\u0005(\u0000\u0000\u0273\u0274\u0003t"+
		":\u0000\u0274\u0275\u0005L\u0000\u0000\u0275\u0276\u0003D\"\u0000\u0276"+
		"S\u0001\u0000\u0000\u0000\u0277\u0278\u0005)\u0000\u0000\u0278\u0279\u0003"+
		"t:\u0000\u0279\u027a\u0005L\u0000\u0000\u027a\u027b\u0005@\u0000\u0000"+
		"\u027b\u027c\u0005\u0001\u0000\u0000\u027c\u027d\u0003V+\u0000\u027d\u027e"+
		"\u0005\u0002\u0000\u0000\u027eU\u0001\u0000\u0000\u0000\u027f\u0280\u0003"+
		"X,\u0000\u0280\u0281\u0005L\u0000\u0000\u0281\u0282\u0003D\"\u0000\u0282"+
		"\u0284\u0001\u0000\u0000\u0000\u0283\u027f\u0001\u0000\u0000\u0000\u0284"+
		"\u0285\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285"+
		"\u0286\u0001\u0000\u0000\u0000\u0286W\u0001\u0000\u0000\u0000\u0287\u028c"+
		"\u0003Z-\u0000\u0288\u0289\u0005K\u0000\u0000\u0289\u028b\u0003Z-\u0000"+
		"\u028a\u0288\u0001\u0000\u0000\u0000\u028b\u028e\u0001\u0000\u0000\u0000"+
		"\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000"+
		"\u028dY\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028f"+
		"\u0298\u0003v;\u0000\u0290\u0298\u0005B\u0000\u0000\u0291\u0298\u0005"+
		"C\u0000\u0000\u0292\u0298\u0005]\u0000\u0000\u0293\u0298\u0003\\.\u0000"+
		"\u0294\u0298\u0003^/\u0000\u0295\u0298\u0003`0\u0000\u0296\u0298\u0003"+
		"t:\u0000\u0297\u028f\u0001\u0000\u0000\u0000\u0297\u0290\u0001\u0000\u0000"+
		"\u0000\u0297\u0291\u0001\u0000\u0000\u0000\u0297\u0292\u0001\u0000\u0000"+
		"\u0000\u0297\u0293\u0001\u0000\u0000\u0000\u0297\u0294\u0001\u0000\u0000"+
		"\u0000\u0297\u0295\u0001\u0000\u0000\u0000\u0297\u0296\u0001\u0000\u0000"+
		"\u0000\u0298[\u0001\u0000\u0000\u0000\u0299\u029a\u0005\u0006\u0000\u0000"+
		"\u029a\u029b\u0005A\u0000\u0000\u029b]\u0001\u0000\u0000\u0000\u029c\u02a8"+
		"\u0005^\u0000\u0000\u029d\u02a2\u0003Z-\u0000\u029e\u029f\u0005K\u0000"+
		"\u0000\u029f\u02a1\u0003Z-\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a6\u0001\u0000\u0000\u0000\u02a4"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a5\u02a7\u0005`\u0000\u0000\u02a6\u02a5"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a9"+
		"\u0001\u0000\u0000\u0000\u02a8\u029d\u0001\u0000\u0000\u0000\u02a8\u02a9"+
		"\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ab"+
		"\u0005_\u0000\u0000\u02ab_\u0001\u0000\u0000\u0000\u02ac\u02ae\u0005Z"+
		"\u0000\u0000\u02ad\u02af\u0003b1\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000"+
		"\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b4\u0001\u0000\u0000\u0000"+
		"\u02b0\u02b1\u0005K\u0000\u0000\u02b1\u02b3\u0003b1\u0000\u02b2\u02b0"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b6\u0001\u0000\u0000\u0000\u02b4\u02b2"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b8"+
		"\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b7\u02b9"+
		"\u0005`\u0000\u0000\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001"+
		"\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bb\u0005"+
		"[\u0000\u0000\u02bba\u0001\u0000\u0000\u0000\u02bc\u02bf\u0005E\u0000"+
		"\u0000\u02bd\u02be\u0005L\u0000\u0000\u02be\u02c0\u0003Z-\u0000\u02bf"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0"+
		"c\u0001\u0000\u0000\u0000\u02c1\u02c2\u0005*\u0000\u0000\u02c2\u02cb\u0003"+
		"J%\u0000\u02c3\u02c4\u0005+\u0000\u0000\u02c4\u02cb\u0003J%\u0000\u02c5"+
		"\u02c7\u0005,\u0000\u0000\u02c6\u02c8\u0003t:\u0000\u02c7\u02c6\u0001"+
		"\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001"+
		"\u0000\u0000\u0000\u02c9\u02cb\u0003J%\u0000\u02ca\u02c1\u0001\u0000\u0000"+
		"\u0000\u02ca\u02c3\u0001\u0000\u0000\u0000\u02ca\u02c5\u0001\u0000\u0000"+
		"\u0000\u02cbe\u0001\u0000\u0000\u0000\u02cc\u02d6\u0003t:\u0000\u02cd"+
		"\u02d7\u0003h4\u0000\u02ce\u02d7\u0005P\u0000\u0000\u02cf\u02d7\u0005"+
		"Q\u0000\u0000\u02d0\u02d7\u0005R\u0000\u0000\u02d1\u02d7\u0005S\u0000"+
		"\u0000\u02d2\u02d7\u0005T\u0000\u0000\u02d3\u02d7\u0005U\u0000\u0000\u02d4"+
		"\u02d7\u0005V\u0000\u0000\u02d5\u02d7\u0005W\u0000\u0000\u02d6\u02cd\u0001"+
		"\u0000\u0000\u0000\u02d6\u02ce\u0001\u0000\u0000\u0000\u02d6\u02cf\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d0\u0001\u0000\u0000\u0000\u02d6\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d2\u0001\u0000\u0000\u0000\u02d6\u02d3\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d5\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02d9\u0003"+
		"t:\u0000\u02d9\u02da\u0003J%\u0000\u02dag\u0001\u0000\u0000\u0000\u02db"+
		"\u02dc\u0007\u0004\u0000\u0000\u02dci\u0001\u0000\u0000\u0000\u02dd\u02de"+
		"\u0005\u0006\u0000\u0000\u02de\u02e1\u0005A\u0000\u0000\u02df\u02e0\u0005"+
		"L\u0000\u0000\u02e0\u02e2\u0003*\u0015\u0000\u02e1\u02df\u0001\u0000\u0000"+
		"\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e9\u0001\u0000\u0000"+
		"\u0000\u02e3\u02e7\u0003h4\u0000\u02e4\u02e8\u0003t:\u0000\u02e5\u02e8"+
		"\u0003H$\u0000\u02e6\u02e8\u00036\u001b\u0000\u02e7\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e6\u0001\u0000"+
		"\u0000\u0000\u02e8\u02ea\u0001\u0000\u0000\u0000\u02e9\u02e3\u0001\u0000"+
		"\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000"+
		"\u0000\u0000\u02eb\u02ec\u0003J%\u0000\u02eck\u0001\u0000\u0000\u0000"+
		"\u02ed\u02ee\u0005-\u0000\u0000\u02ee\u02ef\u0005X\u0000\u0000\u02ef\u02f2"+
		"\u0003t:\u0000\u02f0\u02f1\u0005K\u0000\u0000\u02f1\u02f3\u0005E\u0000"+
		"\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f5\u0005Y\u0000\u0000"+
		"\u02f5\u02f6\u0003J%\u0000\u02f6m\u0001\u0000\u0000\u0000\u02f7\u02f8"+
		"\u0005.\u0000\u0000\u02f8\u02f9\u0005X\u0000\u0000\u02f9\u02fa\u0003t"+
		":\u0000\u02fa\u02fb\u0005K\u0000\u0000\u02fb\u02fc\u0003t:\u0000\u02fc"+
		"\u02fd\u0001\u0000\u0000\u0000\u02fd\u02fe\u0005Y\u0000\u0000\u02fe\u02ff"+
		"\u0003J%\u0000\u02ffo\u0001\u0000\u0000\u0000\u0300\u0301\u0005/\u0000"+
		"\u0000\u0301\u0304\u0005X\u0000\u0000\u0302\u0305\u0005C\u0000\u0000\u0303"+
		"\u0305\u0003t:\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0303\u0001"+
		"\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0308\u0005"+
		"Y\u0000\u0000\u0307\u0309\u0003t:\u0000\u0308\u0307\u0001\u0000\u0000"+
		"\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030b\u0001\u0000\u0000"+
		"\u0000\u030a\u030c\u0003J%\u0000\u030b\u030a\u0001\u0000\u0000\u0000\u030b"+
		"\u030c\u0001\u0000\u0000\u0000\u030cq\u0001\u0000\u0000\u0000\u030d\u030e"+
		"\u0003t:\u0000\u030e\u030f\u0003J%\u0000\u030fs\u0001\u0000\u0000\u0000"+
		"\u0310\u0311\u0006:\uffff\uffff\u0000\u0311\u0364\u00056\u0000\u0000\u0312"+
		"\u0364\u00057\u0000\u0000\u0313\u0364\u00058\u0000\u0000\u0314\u0364\u0005"+
		"9\u0000\u0000\u0315\u0316\u0005?\u0000\u0000\u0316\u0318\u0005X\u0000"+
		"\u0000\u0317\u0319\u0003@ \u0000\u0318\u0317\u0001\u0000\u0000\u0000\u0318"+
		"\u0319\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a"+
		"\u0364\u0005Y\u0000\u0000\u031b\u0364\u0003v;\u0000\u031c\u0328\u0005"+
		"^\u0000\u0000\u031d\u0322\u0003t:\u0000\u031e\u031f\u0005K\u0000\u0000"+
		"\u031f\u0321\u0003t:\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0321\u0324"+
		"\u0001\u0000\u0000\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0322\u0323"+
		"\u0001\u0000\u0000\u0000\u0323\u0326\u0001\u0000\u0000\u0000\u0324\u0322"+
		"\u0001\u0000\u0000\u0000\u0325\u0327\u0005K\u0000\u0000\u0326\u0325\u0001"+
		"\u0000\u0000\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u0329\u0001"+
		"\u0000\u0000\u0000\u0328\u031d\u0001\u0000\u0000\u0000\u0328\u0329\u0001"+
		"\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000\u0000\u032a\u0364\u0005"+
		"_\u0000\u0000\u032b\u0337\u0005Z\u0000\u0000\u032c\u0331\u0003z=\u0000"+
		"\u032d\u032e\u0005K\u0000\u0000\u032e\u0330\u0003z=\u0000\u032f\u032d"+
		"\u0001\u0000\u0000\u0000\u0330\u0333\u0001\u0000\u0000\u0000\u0331\u032f"+
		"\u0001\u0000\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0335"+
		"\u0001\u0000\u0000\u0000\u0333\u0331\u0001\u0000\u0000\u0000\u0334\u0336"+
		"\u0005K\u0000\u0000\u0335\u0334\u0001\u0000\u0000\u0000\u0335\u0336\u0001"+
		"\u0000\u0000\u0000\u0336\u0338\u0001\u0000\u0000\u0000\u0337\u032c\u0001"+
		"\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u0339\u0001"+
		"\u0000\u0000\u0000\u0339\u0364\u0005[\u0000\u0000\u033a\u033b\u0005X\u0000"+
		"\u0000\u033b\u033c\u0003t:\u0000\u033c\u033d\u0005Y\u0000\u0000\u033d"+
		"\u0364\u0001\u0000\u0000\u0000\u033e\u033f\u0005J\u0000\u0000\u033f\u0340"+
		"\u0005A\u0000\u0000\u0340\u0342\u0005X\u0000\u0000\u0341\u0343\u0003@"+
		" \u0000\u0342\u0341\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000"+
		"\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u0364\u0005Y\u0000\u0000"+
		"\u0345\u034f\u0005v\u0000\u0000\u0346\u0350\u0005E\u0000\u0000\u0347\u034c"+
		"\u0005A\u0000\u0000\u0348\u0349\u0005s\u0000\u0000\u0349\u034b\u0005A"+
		"\u0000\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034b\u034e\u0001\u0000"+
		"\u0000\u0000\u034c\u034a\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000"+
		"\u0000\u0000\u034d\u0350\u0001\u0000\u0000\u0000\u034e\u034c\u0001\u0000"+
		"\u0000\u0000\u034f\u0346\u0001\u0000\u0000\u0000\u034f\u0347\u0001\u0000"+
		"\u0000\u0000\u0350\u0364\u0001\u0000\u0000\u0000\u0351\u035b\u0005t\u0000"+
		"\u0000\u0352\u035c\u0005E\u0000\u0000\u0353\u0358\u0005A\u0000\u0000\u0354"+
		"\u0355\u0005s\u0000\u0000\u0355\u0357\u0005A\u0000\u0000\u0356\u0354\u0001"+
		"\u0000\u0000\u0000\u0357\u035a\u0001\u0000\u0000\u0000\u0358\u0356\u0001"+
		"\u0000\u0000\u0000\u0358\u0359\u0001\u0000\u0000\u0000\u0359\u035c\u0001"+
		"\u0000\u0000\u0000\u035a\u0358\u0001\u0000\u0000\u0000\u035b\u0352\u0001"+
		"\u0000\u0000\u0000\u035b\u0353\u0001\u0000\u0000\u0000\u035c\u0364\u0001"+
		"\u0000\u0000\u0000\u035d\u035e\u0005u\u0000\u0000\u035e\u0364\u0003t:"+
		"\u0010\u035f\u0360\u0007\u0005\u0000\u0000\u0360\u0364\u0003t:\u000f\u0361"+
		"\u0362\u0007\u0006\u0000\u0000\u0362\u0364\u0003t:\u0005\u0363\u0310\u0001"+
		"\u0000\u0000\u0000\u0363\u0312\u0001\u0000\u0000\u0000\u0363\u0313\u0001"+
		"\u0000\u0000\u0000\u0363\u0314\u0001\u0000\u0000\u0000\u0363\u0315\u0001"+
		"\u0000\u0000\u0000\u0363\u031b\u0001\u0000\u0000\u0000\u0363\u031c\u0001"+
		"\u0000\u0000\u0000\u0363\u032b\u0001\u0000\u0000\u0000\u0363\u033a\u0001"+
		"\u0000\u0000\u0000\u0363\u033e\u0001\u0000\u0000\u0000\u0363\u0345\u0001"+
		"\u0000\u0000\u0000\u0363\u0351\u0001\u0000\u0000\u0000\u0363\u035d\u0001"+
		"\u0000\u0000\u0000\u0363\u035f\u0001\u0000\u0000\u0000\u0363\u0361\u0001"+
		"\u0000\u0000\u0000\u0364\u03a2\u0001\u0000\u0000\u0000\u0365\u0366\n\u000e"+
		"\u0000\u0000\u0366\u0367\u0007\u0007\u0000\u0000\u0367\u03a1\u0003t:\u000f"+
		"\u0368\u0369\n\r\u0000\u0000\u0369\u036a\u0005p\u0000\u0000\u036a\u03a1"+
		"\u0003t:\u000e\u036b\u036c\n\f\u0000\u0000\u036c\u036d\u0005q\u0000\u0000"+
		"\u036d\u03a1\u0003t:\r\u036e\u036f\n\u000b\u0000\u0000\u036f\u0370\u0007"+
		"\b\u0000\u0000\u0370\u03a1\u0003t:\f\u0371\u0372\n\n\u0000\u0000\u0372"+
		"\u0373\u0005m\u0000\u0000\u0373\u03a1\u0003t:\u000b\u0374\u0375\n\t\u0000"+
		"\u0000\u0375\u0376\u0005l\u0000\u0000\u0376\u03a1\u0003t:\n\u0377\u0378"+
		"\n\b\u0000\u0000\u0378\u0379\u0005k\u0000\u0000\u0379\u03a1\u0003t:\t"+
		"\u037a\u037b\n\u0007\u0000\u0000\u037b\u037c\u0007\t\u0000\u0000\u037c"+
		"\u03a1\u0003t:\b\u037d\u037e\n\u0006\u0000\u0000\u037e\u037f\u0005(\u0000"+
		"\u0000\u037f\u03a1\u0003t:\u0007\u0380\u0381\n\u0004\u0000\u0000\u0381"+
		"\u0382\u0007\n\u0000\u0000\u0382\u03a1\u0003t:\u0005\u0383\u0384\n\u0003"+
		"\u0000\u0000\u0384\u0385\u0007\u000b\u0000\u0000\u0385\u03a1\u0003t:\u0004"+
		"\u0386\u0387\n\u0002\u0000\u0000\u0387\u0388\u0005$\u0000\u0000\u0388"+
		"\u0389\u0003t:\u0000\u0389\u038a\u00051\u0000\u0000\u038a\u038b\u0003"+
		"t:\u0003\u038b\u03a1\u0001\u0000\u0000\u0000\u038c\u038d\n\u0017\u0000"+
		"\u0000\u038d\u038e\u0005^\u0000\u0000\u038e\u038f\u0003t:\u0000\u038f"+
		"\u0390\u0005_\u0000\u0000\u0390\u03a1\u0001\u0000\u0000\u0000\u0391\u0392"+
		"\n\u0016\u0000\u0000\u0392\u0393\u0005J\u0000\u0000\u0393\u03a1\u0005"+
		"A\u0000\u0000\u0394\u0395\n\u0015\u0000\u0000\u0395\u0397\u0005X\u0000"+
		"\u0000\u0396\u0398\u0003@ \u0000\u0397\u0396\u0001\u0000\u0000\u0000\u0397"+
		"\u0398\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399"+
		"\u03a1\u0005Y\u0000\u0000\u039a\u039b\n\u0011\u0000\u0000\u039b\u039c"+
		"\u00055\u0000\u0000\u039c\u03a1\u0007\f\u0000\u0000\u039d\u039e\n\u0001"+
		"\u0000\u0000\u039e\u039f\u00050\u0000\u0000\u039f\u03a1\u0003*\u0015\u0000"+
		"\u03a0\u0365\u0001\u0000\u0000\u0000\u03a0\u0368\u0001\u0000\u0000\u0000"+
		"\u03a0\u036b\u0001\u0000\u0000\u0000\u03a0\u036e\u0001\u0000\u0000\u0000"+
		"\u03a0\u0371\u0001\u0000\u0000\u0000\u03a0\u0374\u0001\u0000\u0000\u0000"+
		"\u03a0\u0377\u0001\u0000\u0000\u0000\u03a0\u037a\u0001\u0000\u0000\u0000"+
		"\u03a0\u037d\u0001\u0000\u0000\u0000\u03a0\u0380\u0001\u0000\u0000\u0000"+
		"\u03a0\u0383\u0001\u0000\u0000\u0000\u03a0\u0386\u0001\u0000\u0000\u0000"+
		"\u03a0\u038c\u0001\u0000\u0000\u0000\u03a0\u0391\u0001\u0000\u0000\u0000"+
		"\u03a0\u0394\u0001\u0000\u0000\u0000\u03a0\u039a\u0001\u0000\u0000\u0000"+
		"\u03a0\u039d\u0001\u0000\u0000\u0000\u03a1\u03a4\u0001\u0000\u0000\u0000"+
		"\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000"+
		"\u03a3u\u0001\u0000\u0000\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a5"+
		"\u03a6\u0007\r\u0000\u0000\u03a6w\u0001\u0000\u0000\u0000\u03a7\u03a8"+
		"\u0007\u000e\u0000\u0000\u03a8y\u0001\u0000\u0000\u0000\u03a9\u03aa\u0003"+
		"t:\u0000\u03aa\u03ab\u0005L\u0000\u0000\u03ab\u03ac\u0003t:\u0000\u03ac"+
		"\u03b1\u0001\u0000\u0000\u0000\u03ad\u03ae\u0005A\u0000\u0000\u03ae\u03af"+
		"\u0005M\u0000\u0000\u03af\u03b1\u0003t:\u0000\u03b0\u03a9\u0001\u0000"+
		"\u0000\u0000\u03b0\u03ad\u0001\u0000\u0000\u0000\u03b1{\u0001\u0000\u0000"+
		"\u0000w}\u0080\u0085\u008b\u0095\u0098\u009c\u00a3\u00a6\u00af\u00b4\u00b8"+
		"\u00ba\u00c2\u00c8\u00cf\u00d4\u00e0\u00e3\u00e6\u00ec\u00f1\u00f3\u00f6"+
		"\u00fc\u0100\u0103\u0106\u0109\u0113\u0116\u0120\u0123\u0126\u0129\u0131"+
		"\u0139\u013e\u0143\u0148\u0150\u0157\u015f\u016f\u0171\u0177\u017c\u0183"+
		"\u0189\u018e\u0192\u0199\u01a2\u01a8\u01ac\u01b0\u01b5\u01b8\u01be\u01c3"+
		"\u01cd\u01d1\u01d6\u01db\u01e8\u01ea\u01f0\u01f6\u01ff\u0204\u0208\u020c"+
		"\u0211\u0219\u021e\u0228\u022d\u0246\u024b\u025d\u0263\u0268\u0285\u028c"+
		"\u0297\u02a2\u02a6\u02a8\u02ae\u02b4\u02b8\u02bf\u02c7\u02ca\u02d6\u02e1"+
		"\u02e7\u02e9\u02f2\u0304\u0308\u030b\u0318\u0322\u0326\u0328\u0331\u0335"+
		"\u0337\u0342\u034c\u034f\u0358\u035b\u0363\u0397\u03a0\u03a2\u03b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}