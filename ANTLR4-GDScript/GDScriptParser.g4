parser grammar GDScriptParser
	;

options {
	tokenVocab = GDScriptLexer;
}

program
	: ((inheritance NEWLINE) | className)* topLevelDecl* NEWLINE? EOF
	;

inheritance
	: NEWLINE* EXTENDS NEWLINE? (IDENTIFIER | STRING) ('.' IDENTIFIER)?
	;

className
	: NEWLINE? 'class_name' NEWLINE? IDENTIFIER (',' NEWLINE? STRING)? NEWLINE
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
	;

classVarDecl
	: NEWLINE* ONREADY? export? VAR NEWLINE? IDENTIFIER NEWLINE? (
		( ':' typeHint)? ( '=' NEWLINE? expression)?
		| ':=' expression
	) setget? NEWLINE
	;
setget
	: 'setget' IDENTIFIER? (',' IDENTIFIER)?
	;
export
	: 'export' (
		'(' (BUILTINTYPE | IDENTIFIER (',' literal)*)? ')'
	)?
	;
typeHint
	: BUILTINTYPE
	| IDENTIFIER
	;

constDecl
	: NEWLINE* 'const' NEWLINE? IDENTIFIER (':' typeHint)? NEWLINE? '=' NEWLINE? expression NEWLINE
	;

signalDecl
	: 'signal' NEWLINE* IDENTIFIER signalParList? NEWLINE
	;
signalParList
	: '(' (IDENTIFIER (',' IDENTIFIER)*)? ')'
	;

enumDecl
	: NEWLINE* 'enum' NEWLINE? IDENTIFIER? NEWLINE? '{' NEWLINE?(
		IDENTIFIER ('=' expression)? (
			',' NEWLINE? IDENTIFIER ( '=' expression)?
		)* (',' NEWLINE?)?
	) '}'
	;

methodDecl
	: NEWLINE* rpc? 'static'? 'func' NEWLINE* IDENTIFIER '(' parList? ')' (
		'->' typeHint)? ':' stmtOrSuite
	;
parList
	: parameter (',' NEWLINE* parameter)*
	;
parameter
	: 'var'? IDENTIFIER (':' typeHint)? ('=' expression)?
	;
rpc
	: 'remote'
	| 'master'
	| 'puppet'
	| 'remotesync'
	| 'mastersync'
	| 'puppetsync'
	;

constructorDecl
	: NEWLINE? 'func' NEWLINE? IDENTIFIER '(' parList? ')' ('.' '(' argList? ')')? ':' NEWLINE stmtOrSuite PASS?
	;
argList
	: expression (',' NEWLINE? expression)*
	;

innerClass
	: NEWLINE* 'class' NEWLINE* IDENTIFIER (NEWLINE* inheritance)? ':' NEWLINE INDENT (
		inheritance NEWLINE
	)? topLevelDecl+ DEDENT
	;

stmtOrSuite
	: NEWLINE* stmt*
	| NEWLINE* INDENT suite DEDENT
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
	| 'breakpoint' stmtEnd
	| 'pass' stmtEnd
	;
stmtEnd
	: NEWLINE?
	| ';'
	;

ifStmt
	: NEWLINE* 'if' NEWLINE* expression NEWLINE* ':' NEWLINE* stmtOrSuite (NEWLINE*
		'elif' NEWLINE* expression ':' NEWLINE* stmtOrSuite
	)* (NEWLINE* 'else' NEWLINE* ':' NEWLINE* stmtOrSuite)?
	;
whileStmt
	: NEWLINE* 'while' NEWLINE*  expression NEWLINE* ':' NEWLINE* stmtOrSuite
	;
forStmt
	: NEWLINE* 'for' NEWLINE* IDENTIFIER NEWLINE* 'in' NEWLINE* expression NEWLINE* ':' NEWLINE* stmtOrSuite
	;

matchStmt
	: 'match' expression NEWLINE INDENT matchBlock DEDENT
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
	: expression NEWLINE? (
		'='
		| '+='
		| '-='
		| '*='
		| '/='
		| '%='
		| '&='
		| '|='
		| '^='
	) NEWLINE? expression stmtEnd
	;
varDeclStmt
	: NEWLINE*  'var' NEWLINE* IDENTIFIER (NEWLINE? '=' NEWLINE? expression)? stmtEnd
	;

assertStmt
	: 'assert' NEWLINE? '(' expression (',' STRING)? ')' stmtEnd
	;
yieldStmt
	: 'yield' NEWLINE? '(' (expression ',' expression) ')'
	;
preloadStmt
	: 'preload' NEWLINE? '(' CONSTANT ')'
	;

exprStmt
	: expression NEWLINE* stmtEnd
	;

expression
	:
	'true'														# primary
	| 'false'														# primary
	| 'null'														# primary
	| 'self'														# primary
	| literal														# primary
	| '[' NEWLINE* (expression ( ',' NEWLINE* expression)* ','?)? NEWLINE* ']'					# arrayDecl
	| '{' (keyValue (',' keyValue)* ','?)? '}'						# dictDecl
	| '(' expression ')'											# primary

	| expression '[' expression ']'									# subscription
	| expression '.' IDENTIFIER										# attribute

	|  expression '(' argList? ')'									# call
	| '.' IDENTIFIER '(' argList? ')'								# call
	| '$' (STRING | IDENTIFIER ('/' IDENTIFIER)*)					# getNode

	| expression 'is' (IDENTIFIER | BUILTINTYPE)					# is
	| '~' expression												# bitNot
	| ('-' | '+') expression										# sign
	| expression ('*' | '/' | '%') expression						# factor
	| expression NEWLINE* '+' NEWLINE* expression					# plus
	| expression '-' expression										# minus
	| expression ('<<' | '>>') expression							# bitShift
	| expression '&' expression										# bitAnd
	| expression '^' expression										# bitXor
	| expression '|' expression										# bitOr
	| expression NEWLINE? ('<' | '>' | '<=' | '>=' | '==' | '!=') NEWLINE? expression	# comparison
	| expression 'in' expression									# in
	| ('!' | 'not') expression										# logicNot
	| expression NEWLINE* ('and' | '&&') NEWLINE* expression							# logicAnd
	| expression NEWLINE* ('or' | '||') NEWLINE* expression							# logicOr
	| expression 'if' expression 'else' expression					# ternacyExpr
	| expression 'as' typeHint										# cast
	;

literal
	: STRING
	| INTEGER
	| FLOAT
	| IDENTIFIER
	| BUILTINTYPE
	| CONSTANT
	;

keyValue
	: expression ':' expression
	| IDENTIFIER '=' expression
	;

