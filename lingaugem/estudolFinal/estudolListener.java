// Generated from estudol.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link estudolParser#listDecVariavel1}.
	 * @param ctx the parse tree
	 */
	void enterListDecVariavel1(estudolParser.ListDecVariavel1Context ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#listDecVariavel1}.
	 * @param ctx the parse tree
	 */
	void exitListDecVariavel1(estudolParser.ListDecVariavel1Context ctx);
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
	 * Enter a parse tree produced by {@link estudolParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(estudolParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(estudolParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#if_then_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_stmt(estudolParser.If_then_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#if_then_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_stmt(estudolParser.If_then_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#do_while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_stmt(estudolParser.Do_while_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#do_while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_stmt(estudolParser.Do_while_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(estudolParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(estudolParser.While_stmtContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link estudolParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(estudolParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(estudolParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(estudolParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(estudolParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#logicalExp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExp(estudolParser.LogicalExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#logicalExp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExp(estudolParser.LogicalExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link estudolParser#logicalStmt}.
	 * @param ctx the parse tree
	 */
	void enterLogicalStmt(estudolParser.LogicalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link estudolParser#logicalStmt}.
	 * @param ctx the parse tree
	 */
	void exitLogicalStmt(estudolParser.LogicalStmtContext ctx);
}