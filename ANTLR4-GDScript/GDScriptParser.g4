parser grammar GDScriptParser
	;

options {
	tokenVocab = GDScriptLexer;
}

program
	: iconToolDecl? fileDeclaration? topLevelDecl* NEWLINE* EOF
	;
	
iconToolDecl
	:
	(AT 'tool' NEWLINE*)? iconDecl
	| iconDecl? (AT 'tool' NEWLINE*)
	;

iconDecl
	:
	ICON '(' STRING ')' NEWLINE*
	;

fileDeclaration
    : className inheritance?
    | inheritance className?
    ;

inheritance
	: 'extends' (IDENTIFIER | STRING) ('.' IDENTIFIER)* NEWLINE*
	;
className
	: 'class_name' IDENTIFIER (',' STRING)? NEWLINE*
	;

topLevelDecl
	: classVarDecl
	| constDecl
	| signalDecl
	| enumDecl
	| methodDecl
	| constructorDecl
	| innerClass
	| 'tool'
	| stmt
	;

classVarDecl
	: onready? exportStmts? 'var' IDENTIFIER (
		( ':' typeHint)? 
		( equalsAssignmentStmt (expression | stmt))?
	) setget? NEWLINE
	;
	
setget
	: 'setget' IDENTIFIER? (',' IDENTIFIER)?
	;	
	
onready
	: AT? 'onready'? NEWLINE?
	;

exportStmts
	: export
	| export_node_path
	| export_range
	| export_multiline
	| export_color_no_alpha
	| export_flags
	| export_flags_2d
	| export_flags_3d
	;
export
	: AT? 'export' (
		'(' (BUILTINTYPE | IDENTIFIER (',' literal)*)? ')'
	)? NEWLINE?
	;

// Each export type needs specific const parameter, but well argList works	
export_node_path
	: AT 'export_node_path' '(' argList ')' NEWLINE?
	;	

export_range
	: AT 'export_range' '(' argList ')' NEWLINE?
	;

export_multiline
	: AT 'export_multiline' NEWLINE?
	;

export_exp_easing
	: AT 'export_exp_easing' NEWLINE?
	;

export_color_no_alpha
	: AT 'export_color_no_alpha' NEWLINE? //Note: There should always be a Variable with the type Color, that wont check for that 
	;
export_flags
	: AT 'export_flags' '(' argList ')' NEWLINE?
	;
	
export_flags_2d
	: AT ('export_flags_2d_physics' | 'export_flags_2d_render' | 'export_flags_2d_navigation') NEWLINE*
	;

export_flags_3d
	: AT ('export_flags_3d_physics' | 'export_flags_3d_render' | 'export_flags_3d_navigation') NEWLINE*
	;

export_enum
	: AT 'export_enum' '(' argList ')'
	;

typeHint
	: BUILTINTYPE
	| IDENTIFIER
	| 'Array' ('[' typeHint ']')?
	;

constDecl
	: 'const' IDENTIFIER (':' typeHint)? equalsAssignmentStmt (expression | stmt) NEWLINE
	;

signalDecl
	: 'signal' IDENTIFIER signalParList? NEWLINE
	;
signalParList
	: '(' (','? IDENTIFIER (':' typeHint)?)* ')'
	;

enumDecl
	: 'enum' IDENTIFIER? enumList NEWLINE
	;

enumList
	:'{' (
		IDENTIFIER ('=' expression)? (
			',' IDENTIFIER ( '=' expression)?
		)* ','?
	) '}'
	;

methodDecl
	: rpc? 'static'? 'func' IDENTIFIER '(' parList? ')' (
		'->' typeHint
	)? ':' stmtOrSuite
	;
parList
	: parameter (',' parameter)*
	;
parameter
	: 'var'? IDENTIFIER (':' typeHint)? (equalsAssignmentStmt expression)?
	;
rpc
	: 'remote'
	| 'master'
	| 'puppet'
	| 'remotesync'
	| 'mastersync'
	| 'puppetsync'
	| (RPC '(' STRING ')' NEWLINE?)
	;

constructorDecl
	: 'func' IDENTIFIER '(' parList? ')' ('.' '(' argList? ')') ':' stmtOrSuite
	;
argList
	: (expression | stmt) (',' (expression | stmt))* ','? // There are situations where a additional comma at the ends works, like Input.get_vector()
	;

innerClass
	: 'class' IDENTIFIER inheritance? ':' NEWLINE INDENT (
		inheritance NEWLINE
	)? topLevelDecl+ DEDENT
	;

stmtOrSuite
	: stmt
	| NEWLINE INDENT suite DEDENT
	;
suite
	: stmt+
	;

stmt
	: varDeclStmt
	| ifStmt
	| forStmt
	| whileStmt
	| matchStmt
	| flowStmt
	| assignmentStmt
	| exprStmt
	| assertStmt
	| yieldStmt
	| preloadStmt
	| awaitStmt
	| 'breakpoint' stmtEnd
	| 'pass' stmtEnd
	| WARNING_IGNORE '(' STRING ( ',' STRING )* ')' stmtEnd
	;
stmtEnd
	: NEWLINE
	| ';'
	;

awaitStmt
	: 'await' stmt
	;

ifStmt
	: 'if' expression ':' stmtOrSuite (
		'elif' expression ':' stmtOrSuite
	)* ('else' ':' stmtOrSuite)? NEWLINE*
	;
whileStmt
	: 'while' expression ':' stmtOrSuite
	;
forStmt
	: 'for' IDENTIFIER 'in' expression ':' stmtOrSuite
	;

matchStmt
	: 'match' expression ':' NEWLINE INDENT matchBlock DEDENT
	;
matchBlock
	: (patternList ':' stmtOrSuite)+
	;
patternList
	: pattern (',' pattern)*
	;
// Note: you can't have a binding in a pattern list, but to not complicate the grammar more it won't
// be restricted syntactically
pattern
	: literal
	| BUILTINTYPE
	| CONSTANT
	| '_'
	| bindingPattern
	| arrayPattern
	| dictPattern
	| expression
	;
bindingPattern
	: 'var' IDENTIFIER
	;
arrayPattern
	: '[' (pattern (',' pattern)* '..'?)? ']'
	;
dictPattern
	: '{' keyValuePattern? (',' keyValuePattern)* '..'? '}'
	;
keyValuePattern
	: STRING (':' pattern)?
	;

flowStmt
	: 'continue' stmtEnd
	| 'break' stmtEnd
	| 'return' expression? stmtEnd
	;

assignmentStmt
	: expression (
		equalsAssignmentStmt
		| '+='
		| '-='
		| '*='
		| '/='
		| '%='
		| '&='
		| '|='
		| '^='
	) expression stmtEnd
	;

equalsAssignmentStmt
	: ASSIGN
	| COLON_ASSIGN
	| COLON_ASSIGN_WHITESPACE
	;
	
varDeclStmt
	: 'var' IDENTIFIER (':' typeHint)? (equalsAssignmentStmt (expression | stmt | methodDecl))? stmtEnd
	;

assertStmt
	: 'assert' '(' expression (',' STRING)? ')' stmtEnd
	;
yieldStmt
	: 'yield' '(' (expression ',' expression) ')' stmtEnd
	;
preloadStmt
	: 'preload' '(' (CONSTANT | expression) ')' expression? stmtEnd?
	;

exprStmt
	: expression stmtEnd
	;
	
expression
	: 'true'														# primary
	| 'false'														# primary
	| 'null'														# primary
	| 'self'														# primary
	| 'Array' '(' argList? ')'												# call
	| literal														# primary
	| '[' (expression ( ',' expression)* ','?)? ']'					# arrayDecl
	| '{' (keyValue (',' keyValue)* ','?)? '}'						# dictDecl
	| '(' expression ')'											# primary

	| expression '[' expression ']'									# subscription
	| expression '.' IDENTIFIER										# attribute
	
	| expression '(' argList? ')'									# call
	| '.' IDENTIFIER '(' argList? ')'								# call
	| '$' (STRING | IDENTIFIER ('/' IDENTIFIER)*)					# getNode
	| '%' (STRING | IDENTIFIER ('/' IDENTIFIER)*)					# uniqueNode
	
	| expression 'is' (IDENTIFIER | BUILTINTYPE)					# is
	| '~' expression												# bitNot
	| ('-' | '+') expression										# sign
	| expression ('*' | '/' | '%') expression						# factor
	| expression '+' expression										# plus
	| expression '-' expression										# minus
	| expression ('<<' | '>>') expression							# bitShift
	| expression '&' expression										# bitAnd
	| expression '^' expression										# bitXor
	| expression '|' expression										# bitOr
	| expression ('<' | '>' | '<=' | '>=' | '==' | '!=') expression	# comparison
	| expression 'in' expression									# in
	| ('!' | 'not') expression										# logicNot
	| expression ('and' | '&&') expression							# logicAnd
	| expression ('or' | '||') expression							# logicOr
	| expression 'if' expression 'else' expression					# ternacyExpr
	| expression 'as' typeHint										# cast
	;

literal
	: STRING
	| MULTI_LINE_STRING
	| STRINGNAME
	| NODEPATH
	| INTEGER
	| FLOAT
	| IDENTIFIER
	| BUILTINTYPE
	| CONSTANT
	;

number
	: INTEGER
	| FLOAT
	;
	
keyValue
	: expression ':' expression
	| IDENTIFIER '=' expression
	;
