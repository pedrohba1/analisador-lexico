import re
from typing import NamedTuple
from tokens import *


class Node(object):
    def __init__(self, name):
        self.name = name
        self.children = []

    def add(self, node):
        self.children.append(node)

class RuleNode(Node):
    pass

class TokenNode(Node):
    pass



class Token(NamedTuple):
    type: str
    value: str
    line: int
    column: int


class Analyzer:
    def __init__(self, filename):
        self.file = open(filename, 'r').read()
        self.tokens = []
        self.token_idx = 0

        token = self.tokenize(self.file)
        self.tokens.append(token)
        self.current_token = self.tokens[0]
        self.root = None
        self.current_node = None
        self.root = self.parse()

    
    def eat(self, token_type):
        if self.current_token.type == token_type:
            self.current_node.add(TokenNode(self.current_token.value))
            self.advance()
        else:
            self.error()

    def advance(self):
        self.token_idx +=1
        token = self.tokenize(self.file)
        self.tokens.append(token)
        self.current_token = self.tokens[self.token_idx]
    
    def error(self):
        raise Exception('Invalid syntax')


    def parse(self):
        self.inicio()
        return self.root

    def tokenize(self, code):
        keywords = {'PROGRAMA','SE', 'ENTAO', 'SENAO', 'ENQUANTO', 'FACA',  'INT', 'REAL', 'CHAR', 'OR', 'AND', 'NOT'}
        token_specification = [
            ('ConstReal', r'\d(\d)*\.\d(\d)*'),   
            ('ConstInt', r'\d(\d)*'), 
            ('VARS', r'VARS'),
            ('ConstChar', r'\'[\w+]?\''),
            ('opAtribuicao',   r':='), 
            ('DoisPontos', r':'),
            ('VIRG',      r','),           
            ('PVirg',      r';'),           
            ('OPMais', r'\+'),                    
            ('OPMenos', r'-'),                   
            ('OPMult', r'\*'),                    
            ('OPDiv', r'\/'),                     
            ('AbreParentese', r'\('),          
            ('FechaParentese', r'\)'),          
            ('AbreChave', r'\{'),                
            ('FechaChave', r'\}'),     
            ('OPDiferente', r'<>'),             
            ('OPMenorIgual', r'<='),              
            ('OPMaiorIgual', r'>='),   
            ('OPMaior', r'>'),
            ('OPMenor', r'<'),
            ('OPIgual', r'=='),             
            ('ID',       r'(?<!\w)[a-zA-Z0-9]\w*'),    
            ('NEWLINE',  r'\n'),          
            ('SKIP',     r'[ \t]+'),       
            ('EOF', r'\Z'),
            ('MISMATCH', r'.'),           
        ]

        # A regra (?P<name>regex) é um "named captruing group". Ou seja, o regex que
        # está escrito depois de <> pode ser acessado pelo symbolic group que no caso é name
        # aí todos os tokens acima são juntados numa string só, cada um com seu regex e seu symbolic 
        # name, separados por | que o operador de OR do regex.
        # http://www.regular-expressions.info/named.html
        tok_regex = '|'.join('(?P<%s>%s)' % pair for pair in token_specification)
        line_num = 1
        line_start = 0
        # mo é um matchObject. finditer retorna uma lista de todos os matches que foram encontrados 
        # levando em consideração o tok_regex e a entrada de texto passada (code)
        for mo in re.finditer(tok_regex, code):

            # a primeira vez que ele lê as keywords, ele considera elas um ID.
            # esse problema é corrigido logo abaixo no else do primeiro if aninhado à seguir
            tipo = mo.lastgroup
            value = mo.group()

            column = mo.start() - line_start
            if tipo == 'ID' and value in keywords:
                if value == 'AND':
                    tipo = 'OPAnd'
                elif value == 'OR':
                    tipo = 'OPOr'
                elif value == 'NOT':
                    tipo = 'opNot'  
                # esses 3 elifs nem precisam mais:
                elif value == 'int':
                    tipo = 'tipoInt'       
                elif value == 'real':
                    tipo = 'tipoReal'
                elif value == 'char':
                    tipo = 'tipoChar'
                else:
                    tipo = value.upper()
            elif tipo == 'NEWLINE':
                line_start = mo.end()
                line_num += 1
                continue
            elif tipo == 'SKIP':
                continue
            elif tipo == 'MISMATCH':
                raise RuntimeError(f'{value!r} unexpected on line {line_num}')
            

            self.file = self.file.replace(mo.group(), '', 1)
            return Token(tipo, value, line_num, column)


    def inicio(self):
        """
        inicio: PROGRAMA ID corpo;
        """
        node = RuleNode('inicio')
        if self.root is None:
            self.root = node
        else:
            self.current_node.add(node)
            
        _save = self.current_node
        self.current_node = node

        token = self.current_token
        if token.type == PROGRAMA:
            self.eat(PROGRAMA)
            self.eat(ID)
            self.corpo()
        self.current_node = _save


    def corpo(self):
        """
        corpo:  AbreChave secaoVariaveis listaComandos  FechaChave; 
        """
        node = RuleNode('corpo')
        if self.root is None:
            self.root = node
        else:
            self.current_node.add(node)

        _save = self.current_node
        self.current_node = node

        token = self.current_token
        if token.type == AbreChave:
            self.eat(AbreChave)
            self.secaoVariaveis()
            self.listaComandos()
            self.eat(FechaChave)
        self.current_node = _save

    def secaoVariaveis(self):
        """
        secaoVariaveis: VARS Doispontos  listDecVariavel  PVirg | //vazio;
        """

        node = RuleNode('secaoVariaveis')
        if self.root is None:
            self.root = node
        else:
            self.current_node.add(node)
            
        _save = self.current_node
        self.current_node = node

        token = self.current_token
        if token.type == VARS:
            self.eat(VARS)
            self.eat(DoisPontos)
            self.listDecVariavel()
            self.eat(PVirg)
            self.current_node = _save
        else: 
            self.current_node = _save

    def listDecVariavel(self):
        """
        listDecVariavel:    varDec listDecVariavel1
        """
        node = RuleNode('listDecVariavel')
        if self.root is None:
            self.root = node
        else:
            self.current_node.add(node)
        
        _save = self.current_node
        self.current_node = node

        token = self.current_token
        self.varDec()
        self.listDecVariavel1()
        self.current_node = _save

        # if token.type in (INT,REAL,CHAR):
        #     self.eat(token.type)
        #     self.eat(ID)
        #     self.listDecVariavel1()



    def listDecVariavel1(self):
        """
        listDecVariavel1:   VIRG varDec listDecVariavel1
	                       |   //ε
        """

        node = RuleNode('listDecVariave1')
        if self.root is None:
            self.root = node
        else:
            self.current_node.add(node)
            
        _save = self.current_node
        self.current_node = node

        if self.current_token.type == VIRG:
            self.eat(VIRG)
            self.varDec()
            self.listDecVariavel1()
            self.current_node = _save
        else: 
            self.current_node = _save


    def varDec(self):
        """
        varDec:  TipotInt ID 
                |TipoReal ID 
                |TipoChar ID
                ;
        """
        node = RuleNode('varDec')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node

        token = self.current_token

        if token.type in (INT,REAL,CHAR):
            self.eat(token.type)
            self.eat(ID)
            self.current_node = _save
        else: 
            self.current_node = _save


    def listaComandos(self):
        """        
        listaComandos:  stmt ;
        """
        node = RuleNode('listaComandos')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        self.stmt()        
        self.current_node = _save

    def stmt_aux(self):
        """
        stmt_aux: PVirg ListaComandos | //ε;
        """
        node = RuleNode('stmt_aux')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        if self.current_token.type == PVirg:
            self.eat(PVirg)
            self.listaComandos()
            self.current_node = _save
        else:
            self.current_node = _save


    def stmt(self):
        """
        stmt: assign_stmt stmt_aux 
        | if_then_stmt stmt_aux
        | do_while_stmt stmt_aux
        | while_stmt stmt_aux
        |//vazio
        """
        node = RuleNode('stmt')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node 

        if self.current_token.type in (ID,FACA,SE,ENQUANTO):
            token = self.current_token
            if token.type == ID:
                self.assign_stmt()
                
            elif self.current_token.type == SE:
                self.if_then_stmt()
            elif self.current_token.type == FACA:
                self.do_while_stmt()
            elif self.current_token.type == ENQUANTO:
                self.while_stmt()
        self.stmt_aux()
        self.current_node = _save

    
    def assign_stmt(self):
        """
        assign_stmt: ID OPAtrib expr;
        """

        node = RuleNode('assignStmt')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node

        self.eat(ID)
        self.eat(opAtribuicao)
        self.expr()
        self.current_node = _save

    
    def expr(self):
        """
        expr: term opArith1;
        """
        node = RuleNode('expr')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        self.term()
        self.opArith1()
        self.current_node = _save



    def term(self):
        """        
        term: fator opMath2;   
        """
        node = RuleNode('term')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        self.fator()
        self.opArith2()
        self.current_node = _save

    

    def fator(self):
        """
        fator: opArith1
            | INT
            | REAL
            | AbreParentese expr FechaParentese
            | ID
            | CHAR
        """
        node = RuleNode('fator')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        if self.current_token.type in (OPMais, OPMenos):
            self.opArith1()
        elif self.current_token.type in (ConstInt, ConstReal,ID, ConstChar):
            self.eat(self.current_token.type)
        elif self.current_token.type == AbreParentese:
            self.eat(AbreParentese)
            self.expr()
            self.eat(FechaParentese)
        self.curret_node = _save


    def opArith1(self):
        """
        opArith1: OPMais term
                |OPmenos term
                | //e
                ;
        """
        node = RuleNode('opArith1')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        if self.current_token.type in (OPMais, OPMenos):
            self.eat(self.current_token.type)
            self.term()
        
        self.curret_node = _save
    
    def opArith2(self):
        """
            opArith2: OPMult fator
                    |OPDiv fator
                    | //e
        """
        node = RuleNode('opArith2')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        if self.current_token.type in (OPMult, OPDiv):
            self.eat(self.current_token.type)
            self.fator()
        
        self.current_node = _save

    def if_then_stmt(self):
        """
        if_then_stmt: SE AbreParentese logicalExp FechaParentese ENTAO corpo stmtSENAO;
        """
        node = RuleNode('IfThenStmt')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        self.eat(SE)
        self.eat(AbreParentese)
        self.logicalExp()
        self.eat(FechaParentese)
        self.eat(ENTAO)
        self.corpo()
        self.stmtSENAO()
        self.current_node = _save

    def stmtSENAO(self):
        """
        stmtSENAO: SENAO corpo | //vazio ;
        """
        node = RuleNode('stmtSenao')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        if self.current_token.type == SENAO:
            self.eat(SENAO)
            self.corpo()

        self.current_node = _save


    def do_while_stmt(self):
        """
        do_while_stmt: FACA corpo ENQUANTO AbreParentese logicalExp FechaParentese;
        """
        node = RuleNode('doWhileStmt')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        self.eat(FACA)
        self.corpo()
        self.eat(ENQUANTO)
        self.eat(AbreParentese)
        self.logicalExp()
        self.eat(FechaParentese)
        self.current_node = _save

    def while_stmt(self):
        """
        while_stmt: ENQUANTO AbreParentese logicalExp FechaParentese corpo;
        """
        node = RuleNode('whileStmt')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        self.eat(ENQUANTO)
        self.eat(AbreParentese)
        self.logicalExp()
        self.eat(FechaParentese)
        self.corpo()
        self.current_node = _save

    
    def logicalExp(self):
        """
        logicalExp: logicalStmt opLogic;
        """
        node = RuleNode('logicalExpr')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        self.logicalStmt()
        self.opLogic()

        self.current_node = _save

    def opLogic(self):
        """
        opLogic: OPAnd logicalStmt 
                |OPOr logicalStmt 
                | //ε
        """
        node = RuleNode('opLogic')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        if self.current_token.type in (OPAnd, OPOr):
            self.eat(self.current_token.type)
            self.logicalStmt()

        self.current_node = _save

    
    def logicalStmt(self):
        """
        logicalStmt: expr opRelac;
        """
        node = RuleNode('logicalStmt')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        self.expr()
        self.opRelac()
        self.current_node = _save


    def opRelac(self):
        """
        opRelac: OPMaior expr
                |OPMenor expr
                |OPIgual expr
                |OPMaiorIgual expr
                |OPMenorIgual expr
                |OPDiferente expr
                | // ε
        """
        node = RuleNode('opRelac')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        if self.current_token.type in (OPMaior, OPMenor, OPIgual, OPDiferente, OPMaiorIgual, OPMenorIgual):
            self.eat(self.current_token.type)
            self.expr()

        self.current_node = _save


   


