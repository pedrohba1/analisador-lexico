import re
from typing import NamedTuple

file = open('codigo.prog', 'r').read()

class Token(NamedTuple):
    type: str
    value: str
    line: int
    column: int

def tokenize(code):
    keywords = {'programa','se', 'entao', 'senao', 'enquanto', 'faca', 'para', 'int', 'real', 'char', 'or', 'and', 'not'}
    token_specification = [
        ('ConstReal', r'\d(\d)*\.\d(\d)*'),   
        ('ConstInt', r'\d(\d)*'), 
        ('ConstChar', r'\'\w*\''),
        ('opAtribuicao',   r':='),           # Assignment operator
        ('PVirg',      r';'),            # Statement terminator
        ('opAdicao', r'\+'),                     # +
        ('opSubtracao', r'-'),                     # -
        ('opMult', r'\*'),                     # *
        ('opDiv', r'\/'),                      # /
        ('AbreParentese', r'\('),            # (
        ('FechaParentese', r'\)'),           # )
        ('AbreChave', r'\{'),                # {
        ('FechaChave', r'\}'),               # }
        ('LE', r'<='),              # <=
        ('GE', r'>='),              # >=
        ('GT', r'>'),               
        ('LT', r'<'),
        ('NE', r'!='),              # !=
        ('EQ', r'=='),               # ==
        ('ID',       r'(?<!\w)[a-zA-Z]\w*'),    # Identifiers
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
        if tipo == 'ID' and value in keywords:
            if value == 'and' or value == 'or' or value == 'not':
                tipo = 'OpLogic'  
            elif value == 'int' or value == 'real' or value == 'char':
                tipo = 'VAR_TYPE'
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
        yield Token(tipo, value, line_num, column)





for token in tokenize(file):
    print(token)


