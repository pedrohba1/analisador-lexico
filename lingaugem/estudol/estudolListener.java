// Generated from .\estudol.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link estudolParser}.
 */
public interface estudolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link estudolParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(estudolParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(estudolParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(estudolParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(estudolParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#secaoVariaveis}.
	 * @param ctx the parse tree
	 */
	void enterSecaoVariaveis(estudolParser.SecaoVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#secaoVariaveis}.
	 * @param ctx the parse tree
	 */
	void exitSecaoVariaveis(estudolParser.SecaoVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#listDecVariavel}.
	 * @param ctx the parse tree
	 */
	void enterListDecVariavel(estudolParser.ListDecVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#listDecVariavel}.
	 * @param ctx the parse tree
	 */
	void exitListDecVariavel(estudolParser.ListDecVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(estudolParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(estudolParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipos(estudolParser.TiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipos(estudolParser.TiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(estudolParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(estudolParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(estudolParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(estudolParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(estudolParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(estudolParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#singleCmd}.
	 * @param ctx the parse tree
	 */
	void enterSingleCmd(estudolParser.SingleCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#singleCmd}.
	 * @param ctx the parse tree
	 */
	void exitSingleCmd(estudolParser.SingleCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(estudolParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(estudolParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexpr(estudolParser.CexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexpr(estudolParser.CexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(estudolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(estudolParser.ExprContext ctx);
}