
import textwrap

class ParseTreeVisualizer(object):
    def __init__(self, parser):
        self.parser = parser
        self.ncount = 1
        self.dot_header = [textwrap.dedent("""\
        digraph astgraph {
          node [shape=none, fontsize=12, fontname="Courier", height=.1];
          ranksep=.3;
          edge [arrowsize=.5]

        """)]
        self.dot_body = []
        self.dot_footer = ['}']


    # Breadth-first search  
    def bfs(self, node):
        ncount = 1
        queue = []
        queue.append(node)
        s = '  node{} [label="{}"]\n'.format(ncount, node.name)
        self.dot_body.append(s)
        node._num = ncount
        ncount += 1

        while queue:
            node = queue.pop(0)
            for child_node in node.children:
                s = '  node{} [label="{}"]\n'.format(ncount, child_node.name)
                self.dot_body.append(s)
                child_node._num = ncount
                ncount += 1
                s = '  node{} -> node{}\n'.format(node._num, child_node._num)
                self.dot_body.append(s)
                queue.append(child_node)

    def gendot(self):
        tree = self.parser.parse()
        self.bfs(tree)
        return ''.join(self.dot_header + self.dot_body + self.dot_footer)
