import re
from typing import NamedTuple

file = open('codigo.prog', 'r').read()

class Token(NamedTuple):
    type: str
    value: str
    line: int
    column: int

def tokenize(code):
    keywords = {'IF', 'THEN', 'ENDIF', 'FOR', 'NEXT', 'GOSUB', 'RETURN'}
    token_specification = [
        ('Inicio',       r'programa'),    # Identifiers
        ('se',    r'se'),    # Identifiers
        ('TipoInteiro',    r'int'),
        ('ConstReal', r'\d(\d)*\.\d(\d)*'),   # FLOAT
        ('ConstInt', r'\d(\d)*'),          # INT  # Integer or decimal 
        ('opAtribuicao',   r':='),           # Assignment operator
        ('PVirg',      r';'),  
        ('ID',       r'(?<!\w)[a-zA-Z]\w*'),    # Identifiers       # Statement terminator
        ('opAdicao', r'\+'),                     # +
        ('opSubtracao', r'-'),                     # -
        ('opMult', r'\*'),                     # *
        ('opDiv', r'\/'),                      # /
        ('AbreParentese', r'\('),            # (
        ('FechaParentese', r'\)'),           # )
        ('AbreChave', r'\{'),                # {
        ('FechaChave', r'\}'),               # }
        ('OpMaior', r'>'),               # ==
        ('OpMenor', r'<'),
        ('EQ', r'=='),               # ==
        ('NE', r'!='),              # !=
        ('LE', r'<='),              # <=
        ('GE', r'>='),              # >=
        ('OR', r'\|\|'),            # ||
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





for token in tokenize(file):
    print(token)












