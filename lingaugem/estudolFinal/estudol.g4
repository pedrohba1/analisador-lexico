grammar estudol;

//regras que começam com letra minúscula são as regras de parser

inicio: PROGRAMA ID corpo 
        ;
corpo:  AbreChave secaoVariaveis listaComandos  FechaChave
        ; 


secaoVariaveis: VARS Doispontos  listDecVariavel  PVirg 
                |// vazio
                ;


listDecVariavel:    varDec listDecVariavel1
		;
listDecVariavel1:   VIRG varDec listDecVariavel1
	       |   //ε
                        ;
varDec:  TipoInt ID 
	|TipoReal ID 
	|TipoChar ID
	;

listaComandos:  stmt;

stmt_aux: PVirg listaComandos |   //ε
        ;


stmt: assign_stmt stmt_aux
| if_then_stmt stmt_aux
| do_while_stmt stmt_aux
| while_stmt stmt_aux
|//vazio
;

assign_stmt: ID OPAtrib expr;

if_then_stmt: SE AbreParentese logicalExp FechaParentese ENTAO corpo stmtSENAO;

stmtSENAO: SENAO corpo | //vazio 
                        ;

do_while_stmt: FACA corpo ENQUANTO AbreParentese logicalExp FechaParentese;

while_stmt: ENQUANTO AbreParentese logicalExp FechaParentese corpo;

expr: term opArith1;

term: fator opArith2;

fator: opArith1
| INT
| REAL
| AbreParentese expr FechaParentese
| ID
;

opArith1: OPMais term
	|OPMenos term
	| //e
	;

opArith2: OPMult fator
	|OPDiv fator
	| //e
        ;


logicalExp: logicalStmt opLogic;


opLogic: OPAnd logicalStmt 
	|OPOr logicalStmt 
	| //e
	;


logicalStmt: expr opRelac;

opRelac: OPMaior expr
	|OPMenor expr
	|OPIgual expr
	|OPMaiorIgual expr
	|OPMenorIgual expr
	|OPDiferente expr
	| //e
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