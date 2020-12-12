from lexer import Lexer

lex =  Lexer('codigo.estudol')

for token in lex.tokens:
    print(token[0])