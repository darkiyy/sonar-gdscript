parser grammar GDScriptParser
	;

options {
	tokenVocab = GDScriptLexer;
}

program
	: ((inheritance NEWLINE*) | className)* topLevelDecl* NEWLINE* EOF
	;

inheritance
	: NEWLINE* EXTENDS NEWLINE* (IDENTIFIER | STRING) ('.' IDENTIFIER)?
	;

className
	: NEWLINE? 'class_name' NEWLINE? IDENTIFIER (',' NEWLINE? STRING)? NEWLINE*
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
	: NEWLINE* ONREADY? export? NEWLINE* VAR NEWLINE* IDENTIFIER NEWLINE* (
		( NEWLINE* ':' NEWLINE* typeHint)? ( NEWLINE* '=' NEWLINE* expression)?
		| (':=' NEWLINE* expression | ':' NEWLINE* '=' NEWLINE* expression)
	) setget? NEWLINE*
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
	: NEWLINE* 'const' NEWLINE? IDENTIFIER (NEWLINE* ':' NEWLINE* typeHint)?
        ( NEWLINE* '=' NEWLINE* expression
		| NEWLINE* ':=' NEWLINE* expression | ':' NEWLINE* '=' NEWLINE* expression)

	;

signalDecl
	: 'signal' NEWLINE* IDENTIFIER signalParList? NEWLINE*
	;
signalParList
	: '(' (IDENTIFIER (',' IDENTIFIER)*)? ')'
	;

enumDecl
	: NEWLINE* 'enum' NEWLINE? IDENTIFIER? NEWLINE? '{' NEWLINE*(
		IDENTIFIER ('=' expression)* (
			',' NEWLINE* IDENTIFIER ( '=' expression)?
		)* (',' NEWLINE*)*
	) NEWLINE* '}' NEWLINE*
	;

methodDecl
	: NEWLINE* rpc? 'static'?  NEWLINE* 'func' NEWLINE* IDENTIFIER '(' parList? ')' (
		NEWLINE* '->' NEWLINE* typeHint)? ':' stmtOrSuite
	;
parList
	: NEWLINE* parameter (NEWLINE* ',' NEWLINE* parameter)* NEWLINE*
	;
parameter
	: 'var'? NEWLINE* IDENTIFIER NEWLINE* (':' NEWLINE* typeHint)? (NEWLINE* '=' NEWLINE* expression)?
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
	: NEWLINE* expression (NEWLINE* ',' NEWLINE* expression)* NEWLINE*
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
	: NEWLINE*
	| ';'
	;

ifStmt
	: NEWLINE* 'if' NEWLINE* OPEN_PAREN* expression CLOSE_PAREN* NEWLINE* ':' NEWLINE* stmtOrSuite (NEWLINE*
		'elif' NEWLINE* expression ':' NEWLINE* stmtOrSuite
	)* (NEWLINE* 'else' NEWLINE* ':' NEWLINE* stmtOrSuite)? NEWLINE*
	;
whileStmt
	: NEWLINE* 'while' NEWLINE*  expression NEWLINE* ':' NEWLINE* stmtOrSuite
	;
forStmt
	: NEWLINE* 'for' NEWLINE* IDENTIFIER NEWLINE* 'in' NEWLINE* expression NEWLINE* ':' NEWLINE* stmtOrSuite
	;

matchStmt
	: NEWLINE* 'match' NEWLINE* expression NEWLINE* ':'  NEWLINE* INDENT matchBlock DEDENT
	;
matchBlock
	: (NEWLINE* pattern ':' NEWLINE* stmtOrSuite)+
	;
patternList
	: pattern (NEWLINE* ',' pattern)* NEWLINE*
	;

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
	: 'var' NEWLINE* IDENTIFIER
	;
arrayPattern
	: '[' (pattern (',' pattern)* '..'?)? ']'
	;
dictPattern
	: NEWLINE* '{' NEWLINE* keyValuePattern? NEWLINE* (',' NEWLINE* keyValuePattern? NEWLINE*)* '..'? '}'
	;
keyValuePattern
	: STRING NEWLINE* (':' NEWLINE* pattern)*
	;

flowStmt
	: 'continue' NEWLINE* stmtEnd
	| 'break' NEWLINE* stmtEnd
	| 'return' NEWLINE* expression? stmtEnd
	;

assignmentStmt
	: expression NEWLINE* (
		'='
		| '+='
		| '-='
		| '*='
		| '/='
		| '%='
		| '&='
		| '|='
		| '^='
	) NEWLINE* expression stmtEnd
	;

varDeclStmt
	:
	    NEWLINE* VAR NEWLINE* IDENTIFIER NEWLINE* (
        ( NEWLINE* ':' NEWLINE* typeHint)? ( NEWLINE* '=' NEWLINE* expression)?
        | (':=' NEWLINE* expression | ':' NEWLINE* '=' NEWLINE* expression)
    	) NEWLINE* stmtEnd
	;

assertStmt
	: 'assert' NEWLINE? '(' expression (',' STRING)? ')' stmtEnd
	;
yieldStmt
	: 'yield' NEWLINE? '(' (expression ',' expression) ')'
	;
preloadStmt
	: 'preload' NEWLINE? '(' (STRING | CONSTANT) ')'
	;

exprStmt
	: NEWLINE* expression NEWLINE* stmtEnd
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
	| expression NEWLINE* '.' NEWLINE* IDENTIFIER					# attribute

	|  expression NEWLINE* '(' argList? ')'									# call
	| '.' NEWLINE* IDENTIFIER NEWLINE* '(' argList? ')'				# call
	| '$' (STRING | IDENTIFIER ('/' IDENTIFIER)*)					# getNode

	| expression NEWLINE* 'is' NEWLINE* (IDENTIFIER | BUILTINTYPE)					# is
	| '~' expression												# bitNot
	| ('-' | '+') NEWLINE* expression								# sign
	| expression ('*' | '/' | '%') expression						# factor
	| expression NEWLINE* '+' NEWLINE* expression					# plus
	| expression NEWLINE* '-' NEWLINE* expression										# minus
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
	| preloadStmt								                    # call
	| pattern								                        # primary
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

