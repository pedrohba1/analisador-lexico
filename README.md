# Project Title
# Linguagem de programação Estudol

O código do analisador léxico e do analisador sintático estão ambos na pasta `front-end`.
O código em `main.py` instancia um Lexer, gera os tokens e em seguida passa os tokens gerados
para um objeto Parser.



### Prerequisitos

What things you need to install the software and how to install them.

```
Give examples
```

## Realizando análise sintática em arquivos.

Executar o comando `python main.py` vai apenas escrever o grafo do programa escrito no arquivo `codigo.estudol` no terminal. Demos um jeito de fazer uma visualização em imagem da árvore, por meio do software [Graphviz](https://graphviz.org/).
Esse software funciona recebendo uma sintaxe própria da representação de um grafo e gerando a imagem à partir dela,
por meio do comando: `dot -Tpng parsetree.dot -o outfile.png`, que vai gerar a árvore à partir de um texto em formato `.png`. Claro que antes de executar esse comando, você precisa guardar o "print" em `main.py` no arquivo `parsetree.dot`. O jeito mais rápido de fazer isso é usando esse comando aqui no terminal: `python main.py > parsetree.dot`.

