from lexer import Lexer
from parser import Parser
lex =  Lexer('codigo.estudol')

for token in lex.tokens:
    print(token)

parser = Parser(lex.tokens)
parser.parse()