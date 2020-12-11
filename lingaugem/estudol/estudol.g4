grammar estudol;

//regras que começam com letra minúscula são as regras de parser

inicio: PROGRAMA ID corpo 
        ;
corpo:  AbreChave secaoVariaveis listaComandos  FechaChave
        ; 


secaoVariaveis: VARS Doispontos  listDecVariavel  PVirg
                ;

listDecVariavel:    listDecVariavel VIRG varDec 
                    |  varDec 
                    ;

varDec: tipos ID;

tipos: TipotInt | TipoReal | TipoChar
            ;

bloco:  AbreChave listaComandos FechaChave      
        ;

listaComandos:   listaComandos command 
                | command
                ;

command:    singleCmd PVirg 
            | stmt
            ;

singleCmd:  ID OPAtrib cexpr
            ;

stmt:   SE AbreParentese cexpr FechaParentese bloco
        | SE AbreParentese cexpr FechaParentese bloco SENAO bloco
        | ENQUANTO AbreParentese cexpr FechaParentese bloco
        | FACA  bloco  ENQUANTO cexpr
        ;

cexpr:   cexpr OPAnd cexpr
        |cexpr  OPOr cexpr
        |expr OPIgual expr
        |expr OPMaior expr
        |expr OPMenor expr
        |expr 
        ;

expr:   expr OPMais expr
        |expr OPMenos expr
        |expr OPDiv expr
        |expr OPMult expr
        |AbreParentese cexpr FechaParentese
        |ID
        |INT
        |CHAR
        |FLOAT
        ;

//regras que começam com letra maiúscula são regras do lexer
INT: [0-9]+;
DIGIT: [0-9];
FLOAT: DIGIT+  DIGIT*;
DOT: '.';
ID: [a-z][a-zA-Z0-9]*;
CHAR: '\''([0-9A-Za-z]|'\\'([a-f]|[0-9]|[1-9][0-9]|'1'[0-2][0-7]))'\'';
AbreChave: '{';
FechaChave : '}';
AbreParentese: '(';
FechaParentese: ')';
PROGRAMA: 'PROGRAMA';
VARS: 'VARS';
Doispontos: ':';
TipotInt : 'INT';
TipoReal: 'REAL';
TipoChar: 'CHAR';
PVirg:  ';';
OPAtrib: ':=';
SE: 'SE';
SENAO: 'SENAO';
ENQUANTO: 'ENQUANTO';
FACA: 'FACA';
VIRG: ',';
OPAnd: 'AND';
OPOr: 'OR';
OPMaior: '>';
OPMenor: '<';
OPIgual: '==';
OPMais: '+';
OPDiv: '/';
OPMenos: '-';
OPMult: '*';
WS: [ \t\r\n]+ -> skip;