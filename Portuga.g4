grammar Portuga;
program:
    declList 'programa' TYID body |
    'programa' TYID body; // declList lambda
declList:
    decl declList | 
    decl; //declList lambda
decl:
    functionDec |
    recordDec;
recordDec:
    'registro' TYID '{' varDecList '}';
functionDec:
    type ID '(' ')' body |
    type ID '(' varDecList ')' body;
body:
    '{' varsSection commandList '}' |
    '{' commandList '}'; //varsSection lambda
block:
    '{' commandList '}';
varsSection:
    'vars' ':' varDecList ';';
varDecList:
    varDecList ',' varDec |
    varDec;
varDec:
    type ID;
commandList:
    commandList cmd |
    cmd;
cmd:
    singlecmd ';'|
    stmt;
singlecmd:
    'instancie' variable cexpr|
    'escreva' '(' cexpr ')'|
    'leia' '(' variable ')'|
    variable '=' cexpr|
    ID '(' paramList ')'|
    ID '(' ')'| //paramList lambda
    'retorne' cexpr;
stmt:
    'enquanto' '(' cexpr ')' block|
    'se' '(' cexpr ')' block|
    'se' '(' cexpr ')' block 'senao' block;
cexpr:
    cexpr op='&' cexpr|
    cexpr op='|' cexpr|
    expr op='==' expr|
    expr op='<' expr|
    expr op='>' expr|
    expr;
expr:
    expr '+' expr|
    expr '-' expr|
    expr '*' expr|
    expr '/' expr|
    expr '%' expr|
    INT|
    'V'|
    'F'|
    CHAR|
    '(' cexpr ')'|
    ID '(' paramList ')'|
    ID '(' ')'| //paramList lambda
    ID;
variable:
    ID | //indexes lambda
    ID indexes |
    variable '.' variable;
indexes:
    '[' expr ']' | //indexes lambda
    indexes '[' expr ']';
type:
    'Bool' |
    'Char' |
    TYID |
    'Int' |
    type '[' ']';
paramList:
    variable |
    variable ',' paramList;
INT: [0-9]+;
CHAR: '\''([0-9A-Za-z]|'\\'([a-f]|[0-9]|[1-9][0-9]|'1'[0-2][0-7]))'\'';
ID: [a-z][a-zA-Z0-9]*;
TYID: [A-Z][a-zA-Z0-9]*;
WS: [ \t\r\n]+ -> skip;