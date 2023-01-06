parser grammar DartParser;

options { tokenVocab = DartLexer ; }

parse
 :block  EOF
 ;

block
 : stat*
 ;


stat
 : assignment SCO
 | if_stat
 | decFun
 | loops
 | decVar SCO
 | obj_or_fun_or_Other SCO
 | incrementVar SCO
 | classDeclaration
 | switch_stat
 ;

if_stat
 : IF OP condition CP stat_block (ELSE IF condition)* (ELSE stat_block)?
 ;



stat_block
 : START block (BREAK SCO)? END
 | stat
 ;

loops
     : do_while_stat
     | while_stat
     | for_stat
     ;

while_stat
 : WHILE OP condition CP stat_block
 ;

do_while_stat
 : DO  stat_block WHILE OP condition CP
 ;

obj_or_fun_or_Other
      : ID DOT funName
      | funOfObj
      | callFunction
      ;

callFunction : ID OP parameters CP;
funOfObj: ID DOT ID OP parameters CP;
incrementVar : ID PP | ID MINMIN;

for_stat : FOR OP forinitstatement? SCO condition? SCO (expr|incrementVar)? CP stat_block     #ClassicForStatement;
forinitstatement : decVar | assignment;
condition: comparison | logical | boolValue | ID | obj_or_fun_or_Other;
//forEch_stat:'(' forrangedeclaration ':' forrangeinitializer ')' stat_block #ForEachStatement

decFun : returnType funName parameterPartDec functionBody;
funName : ID;

returnType: variableType | VOID ;
parameterPart : OP parameters  CP;

parameter : variableType ID (E expr)? | (boolValue | expr)? ;

parameters: parameter (COM parameter)* ;

parameterPartDec : OP parametersDec*  CP;

parameterDec : variableType ID (E expr)? | ID  ;

parametersDec: parameterDec (COM parameterDec)* ;



functionBody : START  block  ( return )* END;
return : RETURN expr  SCO;



switch_stat : SWITCH OP switch_key CP switchBody;
switch_key : ID | INT_NUM;
switchBody: START (CASE ( INT_NUM | STRING_singl )  CO block  (BREAK SCO)* )* ( DEFAULT CO block (BREAK SCO)*)? END ;

//functionType : functionTypeTails | typeNotFunction functionTypeTails ;
//functionTypeTail : FUNCTION_ typeParameters? parameterTypeList ;
//functionTypeTails : functionTypeTail QU? functionTypeTails | functionTypeTail;
//typeNotFunction : VOID_ | typeNotVoidNotFunction ;

//classBody1
//        : propretes
//        | classMethods
//        ;
//

classDeclaration : ABSTRACT? CLASS type_ID typeParameters? superclass?  interfaces? START classBody END ;


propretes : (property)+;
property : decVar SCO ;
classMethods : ( method )+;
method : returnType funName parameterPart functionBody ;
constructor : funName parameterPart functionBody  ;
 //| ABSTRACT? CLASS mixinApplicationClass ;
superclass : EXTENDS typeNotVoid mixins? | mixins ;
interfaces : IMPLEMENTS typeNotVoidList ;
//typeNotVoid : functionType Q? | typeNotVoidNotFunction ;
typeNotVoid : funName Q?  | funName COM ID ;
typeNotVoidList : typeNotVoid (  typeNotVoid )*;
mixins : WITH typeNotVoidList ;
metadata : ( AT metadatum )* ;
//metadatum : IDENTI | qualifiedName | constructorDesignation arguments ;
metadatum : identi | qualifiedName ;

typeParameter : metadata identi ( EXTENDS typeNotVoid )? ;
typeParameters : LT typeParameter ( COM typeParameter )* GT ;
qualifiedName : type_ID DOT identi | type_ID DOT type_ID DOT identi ;

classBody:propretes*  constructor? classMethods*
         |constructor? (propretes | classMethods )*
         | (propretes | classMethods )* constructor?
         | classMethods* constructor? propretes*
         ;


decVar
    : (CONST |FINAL? variableType ) ID (E (expr|boolValue))? #varableDeclaration ;

variableType
        :INT_TYPE
        |BOOL_TYPE
        |STRING_TYPE
        |FLOAT_TYPE
        |DOUBLE_TYPE
        |VAR
        ;


expr
 : //expr POW<assoc=right> expr           #powExpr
  MIN expr                           #unaryMinusExpr
 | NOT expr                             #notExpr
 | expr op=(MUL | DIV | MOD) expr       #multiplicationExpr
 | expr op=(P | MIN) expr               #additiveExpr
 | atom                                    #atomExpr
 ;

atom
 : OP expr CP             #parExpr
 |INT_NUM                 #intNumber
 |FLOAT_NUM               #floatNumber
 | ID                     #idAtom
 | STRING                 #stringAtom
 ;

 comparison
 : expr LE expr  #lessEqual
 | expr EGT expr #greaterEqual
 | expr LT expr  #lessOperation
 | expr GT expr  #greaterOperation
 | expr EE expr  #equalOperation
 | expr NE expr  #notEqual
 ;

 boolValue :  TRUE | FALSE ;

 logical:
        OP logical CP
        |logical  op = (AA | OR)  logical
        |comparison
        |BOOL_VALUE
        |ID;

 assignment
  : ID E expr
  | ID MULE expr
  | ID PE expr
  | ID MODE expr
  | ID MIE expr
  | ID SLE expr

  ;


//TYPE_ID
type_ID: ID| ASYNC | HIDE | OF | ON | SHOW | SYNC | AWAIT | YIELD | DYNAMIC | NATIVE | FUNCTION;


//IDENTI
identi
  : ID | ABSTRACT | AS | COVARIANT | DEFERRED | DYNAMIC | EXPORT | EXTERNAL| EXTENSION | FACTORY
  | FUNCTION | GET | IMPLEMENTS | IMPORT | INTERFACE | LATE
  | LIBRARY | MIXIN| OPERATOR | PART | REQUIRED | SET | STATIC | TYPEDEF | FUNCTION
  |ASYNC | HIDE | OF | ON | SHOW | SYNC | AWAIT | YIELD | DYNAMIC | NATIVE ;