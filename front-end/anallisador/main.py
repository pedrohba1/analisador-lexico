from analyzer import *
from parsetreevisualizer import *
anal =  Analyzer('programa.test')

# for token in lex.tokens:
#     print(token)

viz = ParseTreeVisualizer(anal)
content = viz.gendot()
print(content)

# execute assim: main.py > parsetree.dot
# crie o png com: dot -Tpng parsetree.dot -o outfile.png