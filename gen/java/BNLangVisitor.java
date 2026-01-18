// Generated from /Users/vl7sha/Projects/VibeCoding/build-my-compilator-osorgin/BNLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BNLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BNLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BNLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BNLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSep(BNLangParser.SepContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(BNLangParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(BNLangParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(BNLangParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(BNLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BNLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#stmtSep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtSep(BNLangParser.StmtSepContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmt(BNLangParser.SimpleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(BNLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(BNLangParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(BNLangParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(BNLangParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#readStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(BNLangParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#writeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(BNLangParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(BNLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(BNLangParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(BNLangParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(BNLangParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(BNLangParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#boolConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConst(BNLangParser.BoolConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(BNLangParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(BNLangParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BNLangParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(BNLangParser.MulOpContext ctx);
}