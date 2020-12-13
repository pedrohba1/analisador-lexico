
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
        mas ignorando o corpo agora só para testar
        inicio: PROGRAMA ID ;
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
            self.eat(FechaChave)
        self.current_node = _save

    def secaoVariaveis(self):
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
        while True:
            if self.current_token.type in (INT,REAL,CHAR):
                self.eat(self.current_token.type)
                self.eat(ID)
                if self.current_token.type == PVirg:
                    break
                self.eat(VIRG)
        self.eat(PVirg)
        self.current_node = _save


    def parse(self):
        self.inicio()
        return self.root





    





