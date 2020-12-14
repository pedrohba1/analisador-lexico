
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

class Parser:
    def __init__(self, tokens):
        self.tokens = tokens
        self.token_idx = 0
        self.current_token = self.tokens[0]

        #estrutura da parse tree
        self.root = None
        self.current_node = None


    def eat(self, token_type):
        if self.current_token.type == token_type:
            self.current_node.add(TokenNode(self.current_token.value))
            self.advance()
        else:
            self.error()

    def advance(self):
        self.token_idx +=1
        if self.token_idx < len(self.tokens):
            self.current_token = self.tokens[self.token_idx]
    
    def error(self):
        raise Exception('Invalid syntax')

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
            
        self.current_node = node

        token = self.current_token
        self.varDec()
        self.listDecVariavel1()
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
        """
        node = RuleNode('fator')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        if self.current_token.type in (OPMais, OPMenos):
            self.opArith1()
        elif self.current_token.type in (ConstInt, ConstReal,ID):
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



    def parse(self):
        self.inicio()
        return self.root
