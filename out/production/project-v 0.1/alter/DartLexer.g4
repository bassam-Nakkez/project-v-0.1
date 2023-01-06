lexer grammar DartLexer;

// ---------------------------------------- Lexer rules.


INT_TYPE : 'INT'|'int';
STRING_TYPE : 'String'|'string';
BOOL_TYPE : 'BOOL'|'bool';
FLOAT_TYPE : 'float'|'FLOAT';
DOUBLE_TYPE : 'DOUBLE'|'double';



CP: ')';
DOT: '.';
E: '=';
EE: '==';
EGT: '>=';
GT: '>';
LE: '<=';
LL: '<<';
LLE: '<<=';
LT: '<';
MIN: '-';
MINMIN: '--';
MOD: '%';
MODE: '%=';
MUL: '*';
MULE: '*=';
NE: '!=';
OB: '[';
OP: '(';
P: '+';
PE: '+=';
POUND: '#';
PP: '++';
Q: '?';
QD: '?.';
QDD: '?..';
QQ: '??';
MIE: '-=';
SCO: ';';
DIV: '/';
SLE: '/=';
TE: '^=';
POW :'^';
COT: '"';
START :'{';
END:'}';
AA: '&&';
AND: '&';
ANDE: '&=';
AT: '@';
B: '|';
NOT: '!';
OR : '||';
BE: '|=';
CB: ']';
CO: ':';
COM: ',';


fragment
LETTER
    :    'a' .. 'z'
    |    'A' .. 'Z'
    ;

fragment
DIGIT
    :    '0' .. '9'
    ;

fragment
EXPONENT
    :    ('e' | 'E') ('+' | '-')? DIGIT+
    ;


// Reserved words.

ASSERT
    :    'assert'
    ;

BREAK
    :    'break'
    ;

CASE
    :    'case'
    ;

CATCH
    :    'catch'
    ;

CLASS
    :    'class'
    ;

CONST
    :    'const'
    ;

CONTINUE
    :    'continue'
    ;

DEFAULT
    :    'default'
    ;

DO
    :    'do'
    ;

ELSE
    :    'else'
    ;

ENUM
    :    'enum'
    ;

EXTENDS
    :    'extends'
    ;

FALSE
    :    'false'
    ;

FINAL
    :    'final'
    ;

FINALLY
    :    'finally'
    ;

FOR
    :    'for'|'FOR'
    ;

IF
    :    'if'|'IF'
    ;

IN
    :    'in'
    ;

IS
    :    'is'
    ;

NEW
    :    'new'
    ;

NULL
    :    'null'
    ;

RETHROW
    :    'rethrow'
    ;

RETURN
    :    'return' | 'RETURN'
    ;

SUPER
    :    'super'
    ;

SWITCH
    :    'switch'|'SWICH'
    ;

THIS
    :    'this'
    ;

THROW
    :    'throw'
    ;

TRUE
    :    'true'|'TRUE'
    ;

TRY
    :    'try'
    ;

VAR
    :    'var'
    ;

VOID
    :    'void'
    ;

WHILE
    :    'while'
    ;

WITH
    :    'with'
    ;

// Built-in identifiers.

ABSTRACT
    :    'abstract'
    ;

AS
    :    'as'
    ;

COVARIANT
    :    'covariant'
    ;

DEFERRED
    :    'deferred'
    ;

DYNAMIC
    :    'dynamic'
    ;

EXPORT
    :    'export'
    ;

EXTENSION
    :    'extension'
    ;

EXTERNAL
    :    'external'
    ;

FACTORY
    :    'factory'
    ;

FUNCTION
    :    'Function'
    ;

GET
    :    'get'
    ;

IMPLEMENTS
    :    'implements'
    ;

IMPORT
    :    'import'
    ;

INTERFACE
    :    'interface'
    ;

LATE
    :    'late'
    ;

LIBRARY
    :    'library'
    ;

OPERATOR
    :    'operator'
    ;

MIXIN
    :    'mixin'
    ;

PART
    :    'part'
    ;

REQUIRED
    :    'required'
    ;

SET
    :    'set'
    ;

STATIC
    :    'static'
    ;

TYPEDEF
    :    'typedef'
    ;

// "Contextual keywords".

AWAIT
    :    'await'
    ;

YIELD
    :    'yield'
    ;

// Other words used in the grammar.

ASYNC
    :    'async'
    ;

HIDE
    :    'hide'
    ;

OF
    :    'of'
    ;

ON
    :    'on'
    ;

SHOW
    :    'show'
    ;

SYNC
    :    'sync'
    ;

NATIVE:'native';



BOOL_VALUE : TRUE | FALSE;
INT_NUM: '0'|'-'?[1-9][0-9]*;

FLOAT_NUM
 : '-'?[0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;
 STRING_singl
  : '\'' (~["\r\n] | '""')* '\''
  ;
 ID
  : [a-zA-Z_] [a-zA-Z_0-9]*
  ;
COMMENT
 : '//' ~[\r\n]* -> skip
 ;
MULTI_LINE_COMMENT : '/*' ( MULTI_LINE_COMMENT | . )*? '*/'  -> skip ;
WS
    :    (' ' | '\t' | '\r' | '\n')+ -> skip
    ;