import re
from typing import NamedTuple

file = open('codigo.nada', 'r')

lines = file.readlines()


class Token(NamedTuple):
    type: str
    value: str
    line: int
    column: int

def tokenize(code):
    keywords = {'IF', 'THEN', 'ENDIF', 'FOR', 'NEXT', 'GOSUB', 'RETURN'}
    token_specification = [
        ('ConstNumero',     r'\d+(\.\d*)?'),  # Integer or decimal 
        ('ASSIGN',   r':='),           # Assignment operator
        ('END',      r';'),            # Statement terminator
        ('ID',       r'[A-Za-z]+'),    # Identifiers
        ('OP',       r'[+\-*/]'),      # Arithmetic operators
        ('NEWLINE',  r'\n'),           # Line endings
        ('SKIP',     r'[ \t]+'),       # Skip over spaces and tabs
        ('MISMATCH', r'.'),            # Any other character
    ]
    tok_regex = '|'.join('(?P<%s>%s)' % pair for pair in token_specification)
    line_num = 1
    line_start = 0
    for mo in re.finditer(tok_regex, code):
        tipo = mo.lastgroup
        value = mo.group()
        column = mo.start() - line_start
        if tipo == 'ConstNumero':
            if('.' in value):
                tipo = 'ConstReal'
                value = float(value)
            else:
                tipo = 'ConstInteiro'
                value = int(value)
        elif tipo == 'ID' and value in keywords:
            tipo = value
        elif tipo == 'NEWLINE':
            line_start = mo.end()
            line_num += 1
            continue
        elif tipo == 'SKIP':
            continue
        elif tipo == 'MISMATCH':
            raise RuntimeError(f'{value!r} unexpected on line {line_num}')
        yield Token(tipo, value, line_num, column)

for line in lines:
    for token in tokenize(line):
        print(token)












