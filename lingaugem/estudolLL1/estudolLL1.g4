grammar estudolLL1;

//regras que começam com letra minúscula são as regras de parser

inicio: PROGRAMA ID corpo 
        ;
corpo:  AbreChave secaoVariaveis listaComandos  FechaChave
        ; 


secaoVariaveis: VARS Doispontos  listDecVariavel  PVirg
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

listaComandos:  command listaComandos1
                ;

listaComandos1:  command listaComandos1
                |  //ε
                ;

command:    singleCmd PVirg 
            | stmt
            ;

singleCmd:  ID OPAtrib cexpr
            ;

stmt:    SE AbreParentese cexpr FechaParentese bloco parametroSe
        | ENQUANTO AbreParentese cexpr FechaParentese bloco
        | FACA  bloco  ENQUANTO cexpr
        ;

bloco:  AbreChave listaComandos FechaChave 
        ;

parametroSe :   SENAO bloco 
                ;

cexpr: expr cexpr0
	;

cexpr0:  cexpr1
        |OPIgual expr cexpr1
        |OPMaior expr cexpr1
        |OPMenor expr cexpr1
        ;

cexpr1:  OPAnd cexpr0 cexpr1
        |OPOr cexpr0 cexpr1
        |  //ε
        ;

expr:   AbreParentese cexpr FechaParentese expr1
				|ID expr1
				|INT expr1
				|CHAR expr1 
				|FLOAT expr1
				;


expr1:  OPMais expr expr1
				|OPMenos expr expr1
				|OPDiv expr expr1
				|OPMult expr expr1
				|  //ε
				;





//regras que começam com letra maiúscula são regras do lexer
INT: [0-9]+;
DIGIT: [0-9];
FLOAT: DIGIT+ DOT DIGIT*;
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
TipoInt : 'INT';
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