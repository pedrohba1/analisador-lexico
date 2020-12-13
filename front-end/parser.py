
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
        secaoVariaveis: VARS Doispontos  listDecVariavel  PVirg;
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
        listDecVariavel:  TipoInt ID listDecVariavel1 
                |   TipoReal ID listDecVariavel1 
                |   TipoChar ID listDecVariavel1
                ;
        """
        node = RuleNode('listDecVariavel')
        if self.root is None:
            self.root = node
        else:
            self.current_node.add(node)
            
        self.current_node = node

        token = self.current_token
        if token.type in (INT,REAL,CHAR):
            self.eat(token.type)
            self.eat(ID)
            self.listDecVariavel1()


    def listDecVariavel1(self):
        """
        listDecVariavel1:  VIRG TipoInt ID listDecVariavel1
                |   VIRG  TipoReal ID  listDecVariavel1 
                |   VIRG  TipoChar ID  listDecVariavel1 
                |   //ε
                ;
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
            self.eat(self.current_token.type)
            self.eat(ID)
            self.listDecVariavel1()
            self.current_node = _save
        else: 
            self.current_node = _save

    def listaComandos(self):
        """
        listaComandos:  stmt | stmt PVirg listaComandos;
        """
        node = RuleNode('listaComandos')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        self.stmt()        
        if self.current_token.type == PVirg:
            self.eat(PVirg)
            self.listaComandos()
            self.current_node = _save
        else: 
            self.current_node = _save


    def stmt(self):
        """
        stmt: assign_stmt 
        | if_then_stmt
        | do_while_stmt
        | while_stmt
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
                self.current_node = _save
            if self.current_token.type == SE:
                self.if_then_stmt()
                self.current_node = _save
            if self.current_token.type == FACA:
                self.do_while_stmt()
                self.current_node = _save
            if self.current_token.type == ENQUANTO:
                self.while_stmt()
                self.current_node = _save
        else: 
            self.current_node = _save

    
    def assign_stmt(self):
        """
        assign_stmt: ID OpAtrib expr
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
        expr: term OPMais term | term OPMenos term;
        """
        node = RuleNode('expr')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        self.term()
        if self.current_token.type in (OPMais, OPMenos):
            self.eat(self.current_token.type)
            self.term()
        self.current_node = _save



    def term(self):
        """
        term: fator OPMult fator | fator OPDiv fator;
        """
        node = RuleNode('term')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        self.fator()
        if self.current_token.type in (OPMult, OPDiv):
            self.eat(self.current_token.type)
            self.fator()
        self.current_node = _save

    

    def fator(self):
        """
        fator: OPMais fator
            | OPMenos fator
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
            self.eat(self.current_token.type)
            self.fator()
        elif self.current_token.type in (ConstInt, ConstReal,ID):
            self.eat(self.current_token.type)
        elif self.current_token.type == AbreParentese:
            self.eat(AbreParentese)
            self.expr()
            self.eat(FechaParentese)
        self.curret_node = _save

    def if_then_stmt(self):
        """
        if_then_stmt: SE AbreParentese logicalExp FechaParentese ENTAO corpo;
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
        logicalExp: logicalStmt OPAnd logicalStmt 
                | logicalStmt OPOr logicalStmt
                | logicalStmt
        """
        node = RuleNode('logicalExpr')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        self.logicalStmt()
        if self.current_token.type in (OPAnd, OPOr):
            self.eat(self.current_token.type)
        
        self.current_node = _save



    
    def logicalStmt(self):
        """
        logicalStmt: expr OPMaior expr 
                    | expr OPMenor expr
                    | expr OPIgual expr
                    | expr OPMaiorIgual expr
                    | expr OPDiferente expr
                    | expr OPMenorIgual expr
                    | expr

        """
        node = RuleNode('logicalExpr')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        self.expr()
        if self.current_token.type in (OPMaior, OPIgual, OPMaiorIgual, OPDiferente, OPMenorIgual):
            self.eat(self.current_token.type)
            self.expr()
        self.current_node = _save





    def parse(self):
        self.inicio()
        return self.root





    





