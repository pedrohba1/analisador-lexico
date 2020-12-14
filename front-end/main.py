from lexer import Lexer
from parser import Parser
from parsetreevisualizer import *

lex =  Lexer('codigo.estudol')

# for token in lex.tokens:
#     print(token)
parser = Parser(lex.tokens)
viz = ParseTreeVisualizer(parser)
content = viz.gendot()
print(content)


# execute assim: main.py > parsetree.dot
# crie o png com: dot -Tpng parsetree.dot -o outfile.png