grammar estudol;

//regras que começam com letra minúscula são as regras de parser

inicio: PROGRAMA ID corpo 
        ;
corpo:  AbreChave secaoVariaveis listaComandos  FechaChave
        ; 


secaoVariaveis: VARS Doispontos  listDecVariavel  PVirg 
                |// vazio
                ;

listDecVariavel:  TipoInt ID listDecVariavel1 
                |   TipoReal ID listDecVariavel1 
                |   TipoChar ID listDecVariavel1
                ;

listDecVariavel1:  VIRG TipoInt ID listDecVariavel1
                |   VIRG  TipoReal ID  listDecVariavel1 
                |   VIRG  TipoChar ID  listDecVariavel1 
                |   //ε
                ;


listaComandos:  stmt | stmt PVirg listaComandos;


stmt: assign_stmt 
| if_then_stmt
| do_while_stmt
| while_stmt
|//vazio
;

assign_stmt: ID OPAtrib expr;

if_then_stmt: SE AbreParentese logicalExp FechaParentese ENTAO corpo;

do_while_stmt: FACA corpo ENQUANTO AbreParentese logicalExp FechaParentese;

while_stmt: ENQUANTO AbreParentese logicalExp FechaParentese corpo;

expr: term OPMais term | term OPMenos term | term;

term: fator OPMult fator | fator OPDiv fator | fator;

fator: fator OPMais fator
| fator  OPMenos fator
| INT
| REAL
| AbreParentese expr FechaParentese
| ID
;


logicalExp: logicalStmt OPAnd logicalStmt 
        | logicalStmt OPOr logicalStmt
        | logicalStmt
        ;

logicalStmt: expr OPMaior expr 
                    | expr OPMenor expr
                    | expr OPIgual expr
                    | expr OPMaiorIgual expr
                    | expr OPDiferente expr
                    | expr OPMenorIgual expr
                    | expr
                    ;

//regras que começam com letra maiúscula são regras do lexer
INT: [0-9]+;
DIGIT: [0-9];
REAL: DIGIT+ DOT DIGIT*;
DOT: '.';
SE: 'SE';
SENAO: 'SENAO';
ENQUANTO: 'ENQUANTO';
FACA: 'FACA';
ID: [a-z][a-z0-9]*;
CHAR: '\''([0-9A-Za-z]|'\\'([a-f]|[0-9]|[1-9][0-9]|'1'[0-2][0-7]))'\'';
AbreChave: '{';
FechaChave : '}';
AbreParentese: '(';
FechaParentese: ')';
PROGRAMA: 'PROGRAMA';
VARS: 'VARS';
ENTAO: 'ENTAO';
Doispontos: ':';
TipoInt : 'INT';
TipoReal: 'REAL';
TipoChar: 'CHAR';
PVirg:  ';';
OPAtrib: ':=';
VIRG: ',';
OPAnd: 'AND';
OPOr: 'OR';
OPMaior: '>';
OPMenor: '<';
OPIgual: '==';
OPMaiorIgual: '>=';
OPMenorIgual: '<=';
OPDiferente: '<>';
OPMais: '+';
OPDiv: '/';
OPMenos: '-';
OPMult: '*';
WS: [ \t\r\n]+ -> skip;