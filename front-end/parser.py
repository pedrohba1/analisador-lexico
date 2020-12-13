
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
        self.eat(VARS)
        self.eat(DoisPontos)
        self.listDecVariavel()
        self.eat(PVirg)
        self.current_node = _save

    def listDecVariavel(self):
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
        stmt: assign_stmt | //vazio
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
        expr: ConstInt
        """
        node = RuleNode('expr')
        self.current_node.add(node)
        _save = self.current_node
        self.current_node = node
        self.eat(ConstInt)
        self.current_node = node


    def parse(self):
        self.inicio()
        return self.root





    





