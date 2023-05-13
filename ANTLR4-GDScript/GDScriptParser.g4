parser grammar GDScriptParser
	;

options {
	tokenVocab = GDScriptLexer;
}

program
	: (AT 'tool' NEWLINE)? (inheritance NEWLINE)? className? topLevelDecl* NEWLINE* EOF
	;

inheritance
	: 'extends' (IDENTIFIER | STRING) ('.' IDENTIFIER)*
	;
className
	: 'class_name' IDENTIFIER (',' STRING)? NEWLINE
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
	: AT? 'onready'? export? 'var' IDENTIFIER (
		( ':' typeHint)? ( '=' expression)?
		| (':=' expression)?
	) setget? NEWLINE
	;
setget
	: 'setget' IDENTIFIER? (',' IDENTIFIER)?
	;
export
	: AT? 'export' (
		'(' (BUILTINTYPE | IDENTIFIER (',' literal)*)? ')'
	)?
	;
typeHint
	: BUILTINTYPE
	| IDENTIFIER
	;

constDecl
	: 'const' IDENTIFIER (':' typeHint)? '=' expression NEWLINE
	;

signalDecl
	: 'signal' IDENTIFIER signalParList? NEWLINE
	;
signalParList
	: '(' (IDENTIFIER (',' IDENTIFIER)*)? ')'
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
	: 'func' IDENTIFIER '(' parList? ')' ('.' '(' argList? ')') ':' stmtOrSuite
	;
argList
	: expression (',' expression)*
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
	| 'breakpoint' stmtEnd
	| 'pass' stmtEnd
	;
stmtEnd
	: NEWLINE
	| ';'
	;

ifStmt
	: 'if' expression ':' stmtOrSuite (
		'elif' expression ':' stmtOrSuite
	)* ('else' ':' stmtOrSuite)?
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
		'='
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
varDeclStmt
	: 'var' IDENTIFIER (':' typeHint)? (('=' | ':=') (expression | stmt))? stmtEnd
	;

assertStmt
	: 'assert' '(' expression (',' STRING)? ')' stmtEnd
	;
yieldStmt
	: 'yield' '(' (expression ',' expression) ')' stmtEnd
	;
preloadStmt
	: 'preload' '(' (CONSTANT | expression) ')' stmtEnd?
	;

exprStmt
	: expression stmtEnd
	;
expression
	: 'true'														# primary
	| 'false'														# primary
	| 'null'														# primary
	| 'self'														# primary
	| literal														# primary
	| '[' (expression ( ',' expression)* ','?)? ']'					# arrayDecl
	| '{' (keyValue (',' keyValue)* ','?)? '}'						# dictDecl
	| '(' expression ')'											# primary

	| expression '[' expression ']'									# subscription
	| expression '.' IDENTIFIER										# attribute
	
	| expression '(' argList? ')'									# call
	| '.' IDENTIFIER '(' argList? ')'								# call
	| '$' (STRING | IDENTIFIER ('/' IDENTIFIER)*)					# getNode

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
