import re
from typing import NamedTuple


class Token(NamedTuple):
    type: str
    value: str
    line: int
    column: int


class Lexer:
    def __init__(self, filename):
        self.tokens = []
        self.file = open(filename, 'r').read()
        for token in self.tokenize(self.file):
            self.tokens.append(token)


    def tokenize(self, code):
        keywords = {'PROGRAMA','SE', 'ENTAO', 'SENAO', 'ENQUANTO', 'FACA',  'INT', 'REAL', 'CHAR', 'OR', 'AND', 'NOT'}
        token_specification = [
            ('ConstReal', r'\d(\d)*\.\d(\d)*'),   
            ('ConstInt', r'\d(\d)*'), 
            ('VARS', r'VARS'),
            ('ConstChar', r'\'[\w+]?\''),
            ('opAtribuicao',   r':='), 
            ('DoisPontos', r':'),
            ('VIRG',      r','),           
            ('PVirg',      r';'),           
            ('OPMais', r'\+'),                    
            ('OPMenos', r'-'),                   
            ('OPMult', r'\*'),                    
            ('OPDiv', r'\/'),                     
            ('AbreParentese', r'\('),          
            ('FechaParentese', r'\)'),          
            ('AbreChave', r'\{'),                
            ('FechaChave', r'\}'),              
            ('OPMenorIgual', r'<='),              
            ('OPMaiorIgual', r'>='),   
            ('OPMaior', r'>'),
            ('OPMenor', r'<'),
            ('OPDiferente', r'<>'),             
            ('OPIgual', r'=='),             
            ('ID',       r'(?<!\w)[a-zA-Z0-9]\w*'),    
            ('NEWLINE',  r'\n'),          
            ('SKIP',     r'[ \t]+'),       
            ('EOF', r'\Z'),
            ('MISMATCH', r'.'),           
        ]

        # A regra (?P<name>regex) é um "named captruing group". Ou seja, o regex que
        # está escrito depois de <> pode ser acessado pelo symbolic group que no caso é name
        # aí todos os tokens acima são juntados numa string só, cada um com seu regex e seu symbolic 
        # name, separados por | que o operador de OR do regex.
        # http://www.regular-expressions.info/named.html
        tok_regex = '|'.join('(?P<%s>%s)' % pair for pair in token_specification)
        line_num = 1
        line_start = 0
        # mo é um matchObject. finditer retorna uma lista de todos os matches que foram encontrados 
        # levando em consideração o tok_regex e a entrada de texto passada (code)
        for mo in re.finditer(tok_regex, code):

            # a primeira vez que ele lê as keywords, ele considera elas um ID.
            # esse problema é corrigido logo abaixo no else do primeiro if aninhado à seguir
            tipo = mo.lastgroup
            value = mo.group()

            column = mo.start() - line_start
            if tipo == 'ID' and value in keywords:
                if value == 'AND':
                    tipo = 'OPAnd'
                elif value == 'OR':
                    tipo = 'OPOr'
                elif value == 'NOT':
                    tipo = 'opNot'  
                # esses 3 elifs nem precisam mais:
                elif value == 'int':
                    tipo = 'tipoInt'       
                elif value == 'real':
                    tipo = 'tipoReal'
                elif value == 'char':
                    tipo = 'tipoChar'
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

   


