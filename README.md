# Project Title
# Linguagem de programação Estudol

O código do analisador léxico e do analisador sintático estão ambos na pasta `front-end`.
O código em `main.py` instancia um Lexer, gera os tokens e em seguida passa os tokens gerados
para um objeto Parser.

Os códigos na pasta linguagem são todos testes que fizemos na nossa linguagem para ver o que fazia sentido e o que não fazia usando o [ANTLR4](https://www.antlr.org/)

### Prerequisitos

Você vai ter que instalar o [Graphviz](https://graphviz.org/). se quiser gerar as
imagens da árvore à partir do arquivo que o `ParseTreeVisualizer`
gera. Só rodamos esse programa no linux, não sei como vai funcionar no windows, mas no WSL do windows funciona certinho.

Também usamos um programa chamado [ANTLR4](https://www.antlr.org/) para testar a gramática. È como se fosse uma linguagem de 
programação para escrever linguagens de programação. Não usamos ela no nosso código final, apenas usamos a sintaxe dela para descrever a nossa gramática porque facilitou parte do processo.

## Realizando análise sintática em arquivos.

Executar o comando `python main.py` vai apenas escrever o grafo do programa escrito no arquivo `codigo.estudol` no terminal. Demos um jeito de fazer uma visualização em imagem da árvore, por meio do software [Graphviz](https://graphviz.org/).
Esse software funciona recebendo uma sintaxe própria da representação de um grafo e gerando a imagem à partir dela,
por meio do comando: `dot -Tpng parsetree.dot -o outfile.png`, que vai gerar a árvore à partir de um texto em formato `.png`. Claro que antes de executar esse comando, você precisa guardar o "print" em `main.py` no arquivo `parsetree.dot`. O jeito mais rápido de fazer isso é usando esse comando aqui no terminal: `python main.py > parsetree.dot`.

