grammar BNLang;

// =========================
// Parser rules
// =========================

program
  : BEGIN sep* item (sep+ item)* sep* END sep* EOF
  ;

sep
  : (SEMI | NEWLINE)+
  ;

item
  : description
  | statement
  ;

// <описание>::= <идентификатор> {, <идентификатор> } : <тип>
description
  : idList COLON type
  ;

idList
  : IDENT (COMMA IDENT)*
  ;

type
  : PERCENT
  | BANG
  | DOLLAR
  ;

statement
  : simpleStmt (stmtSep simpleStmt)*
  ;

// Разделители внутри составного оператора:
// по БН.md это ':' или перевод строки, но часто в примерах встречается ';' — разрешаем тоже.
stmtSep
  : (COLON | NEWLINE | SEMI)+
  ;

simpleStmt
  : assignment
  | ifStmt
  | forStmt
  | whileStmt
  | readStmt
  | writeStmt
  ;

// <присваивания>::= <идентификатор> ass <выражение>
assignment
  : IDENT ASS expr
  ;

// <условный>::= if <выражение> then <оператор> [ else <оператор> ]
ifStmt
  : IF expr THEN sep* statement (sep* ELSE sep* statement)?
  ;

// <фиксированного_цикла>::= for <присваивания> to <выражение> do <оператор>
forStmt
  : FOR assignment TO expr DO sep* statement
  ;

// <условного_цикла>::= while <выражение> do <оператор>
whileStmt
  : WHILE expr DO sep* statement
  ;

// <ввода>::= read '(' <идентификатор> {, <идентификатор> } ')'
readStmt
  : READ LPAREN IDENT (COMMA IDENT)* RPAREN
  ;

// <вывода>::= write '(' <выражение> {, <выражение> } ')'
writeStmt
  : WRITE LPAREN expr (COMMA expr)* RPAREN
  ;

// ===== Expressions (приоритеты как в БН.md) =====
// <выражение>::= <операнд>{<операции_группы_отношения> <операнд>}
expr
  : operand (relOp operand)*
  ;

// <операнд>::= <слагаемое> {<операции_группы_сложения> <слагаемое>}
operand
  : term (addOp term)*
  ;

// <слагаемое>::= <множитель> {<операции_группы_умножения> <множитель>}
term
  : factor (mulOp factor)*
  ;

// <множитель>::= <идентификатор> | <число> | <логическая_константа> |
//               <унарная_операция> <множитель> | '(' <выражение> ')'
factor
  : IDENT
  | number
  | boolConst
  | TILDE factor
  | LPAREN expr RPAREN
  ;

number
  : REAL
  | INT_BIN
  | INT_OCT
  | INT_DEC
  | INT_HEX
  ;

boolConst
  : TRUE
  | FALSE
  ;

relOp
  : NE | EQ | LT | LE | GT | GE
  ;

addOp
  : PLUS | MIN | OR
  ;

mulOp
  : MULT | DIV | AND
  ;

// =========================
// Lexer rules
// =========================

// Keywords
BEGIN : 'begin';
END   : 'end';
IF    : 'if';
THEN  : 'then';
ELSE  : 'else';
FOR   : 'for';
TO    : 'to';
DO    : 'do';
WHILE : 'while';
READ  : 'read';
WRITE : 'write';

TRUE  : 'true';
FALSE : 'false';

// Operators (по БН.md)
NE : 'NE' | 'ne';
EQ : 'EQ' | 'eq';
LT : 'LT' | 'lt';
LE : 'LE' | 'le';
GT : 'GT' | 'gt';
GE : 'GE' | 'ge';

PLUS : 'plus';
MIN  : 'min';
OR   : 'or';

MULT : 'mult';
DIV  : 'div';
AND  : 'and';

ASS  : 'ass';

TILDE : '~';

// Separators
LPAREN : '(';
RPAREN : ')';
COMMA  : ',';
SEMI   : ';';
COLON  : ':';
DOT    : '.';

// Types
PERCENT : '%';
BANG    : '!';
DOLLAR  : '$';

// Numbers
INT_BIN : BIN_DIGIT+ [Bb];
INT_OCT : OCT_DIGIT+ [Oo];
INT_DEC : DIGIT+ [Dd]?;
INT_HEX : HEX_DIGIT+ [Hh];

REAL
  : DIGIT+ DOT DIGIT+ EXP?
  | DOT DIGIT+ EXP?
  | DIGIT+ EXP
  ;

// Identifiers
IDENT : LETTER (LETTER | DIGIT)*;

// Comments (вариант 4: { ... })
COMMENT : '{' .*? '}' -> skip;

// Newlines are significant (для составного оператора)
NEWLINE : ('\r'? '\n')+;

// Whitespace
WS : [ \t\f]+ -> skip;

// =========================
// Fragments
// =========================

fragment EXP       : [Ee] [+\-]? DIGIT+;
fragment LETTER    : [A-Za-z];
fragment DIGIT     : [0-9];
fragment BIN_DIGIT : [01];
fragment OCT_DIGIT : [0-7];
fragment HEX_DIGIT : [0-9A-Fa-f];

