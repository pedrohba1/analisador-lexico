// Generated from .\estudolSemRec.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link estudolSemRecParser}.
 */
public interface estudolSemRecListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(estudolSemRecParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(estudolSemRecParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(estudolSemRecParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(estudolSemRecParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#secaoVariaveis}.
	 * @param ctx the parse tree
	 */
	void enterSecaoVariaveis(estudolSemRecParser.SecaoVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#secaoVariaveis}.
	 * @param ctx the parse tree
	 */
	void exitSecaoVariaveis(estudolSemRecParser.SecaoVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#listDecVariavel}.
	 * @param ctx the parse tree
	 */
	void enterListDecVariavel(estudolSemRecParser.ListDecVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#listDecVariavel}.
	 * @param ctx the parse tree
	 */
	void exitListDecVariavel(estudolSemRecParser.ListDecVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#listDecVariavel1}.
	 * @param ctx the parse tree
	 */
	void enterListDecVariavel1(estudolSemRecParser.ListDecVariavel1Context ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#listDecVariavel1}.
	 * @param ctx the parse tree
	 */
	void exitListDecVariavel1(estudolSemRecParser.ListDecVariavel1Context ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(estudolSemRecParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(estudolSemRecParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipos(estudolSemRecParser.TiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipos(estudolSemRecParser.TiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(estudolSemRecParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(estudolSemRecParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(estudolSemRecParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(estudolSemRecParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#listaComandos1}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos1(estudolSemRecParser.ListaComandos1Context ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#listaComandos1}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos1(estudolSemRecParser.ListaComandos1Context ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(estudolSemRecParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(estudolSemRecParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#singleCmd}.
	 * @param ctx the parse tree
	 */
	void enterSingleCmd(estudolSemRecParser.SingleCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#singleCmd}.
	 * @param ctx the parse tree
	 */
	void exitSingleCmd(estudolSemRecParser.SingleCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(estudolSemRecParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(estudolSemRecParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexpr(estudolSemRecParser.CexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexpr(estudolSemRecParser.CexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#cexpr1}.
	 * @param ctx the parse tree
	 */
	void enterCexpr1(estudolSemRecParser.Cexpr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#cexpr1}.
	 * @param ctx the parse tree
	 */
	void exitCexpr1(estudolSemRecParser.Cexpr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(estudolSemRecParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(estudolSemRecParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolSemRecParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(estudolSemRecParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link estudolSemRecParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(estudolSemRecParser.Expr1Context ctx);
}