// Generated from Lenguajes.g4 by ANTLR 4.8
package vicky.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LenguajesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LenguajesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LenguajesParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(LenguajesParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajesParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(LenguajesParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajesParser#llave_abierta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlave_abierta(LenguajesParser.Llave_abiertaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajesParser#llave_cerrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlave_cerrada(LenguajesParser.Llave_cerradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajesParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(LenguajesParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajesParser#condicion_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion_if(LenguajesParser.Condicion_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajesParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(LenguajesParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajesParser#bloque_condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_condicion(LenguajesParser.Bloque_condicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link LenguajesParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(LenguajesParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link LenguajesParser#asignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LenguajesParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion2}
	 * labeled alternative in {@link LenguajesParser#declarar_asignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion2(LenguajesParser.Asignacion2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajesParser#condicion_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion_while(LenguajesParser.Condicion_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajesParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(LenguajesParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code corre}
	 * labeled alternative in {@link LenguajesParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorre(LenguajesParser.CorreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code corre2}
	 * labeled alternative in {@link LenguajesParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorre2(LenguajesParser.Corre2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(LenguajesParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falso}
	 * labeled alternative in {@link LenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalso(LenguajesParser.FalsoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(LenguajesParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verdadero}
	 * labeled alternative in {@link LenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerdadero(LenguajesParser.VerdaderoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LenguajesParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relacionales}
	 * labeled alternative in {@link LenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacionales(LenguajesParser.RelacionalesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relacionales2}
	 * labeled alternative in {@link LenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacionales2(LenguajesParser.Relacionales2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link LenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(LenguajesParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumRes}
	 * labeled alternative in {@link LenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(LenguajesParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicoAnd}
	 * labeled alternative in {@link LenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicoAnd(LenguajesParser.LogicoAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicoNot}
	 * labeled alternative in {@link LenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicoNot(LenguajesParser.LogicoNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicoOr}
	 * labeled alternative in {@link LenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicoOr(LenguajesParser.LogicoOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LenguajesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LenguajesParser.IdContext ctx);
}