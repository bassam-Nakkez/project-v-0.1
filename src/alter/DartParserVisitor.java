// Generated from java-escape by ANTLR 4.11.1
package alter;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DartParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(DartParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DartParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(DartParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(DartParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(DartParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops(DartParser.LoopsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(DartParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#do_while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_stat(DartParser.Do_while_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#obj_or_fun_or_Other}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_or_fun_or_Other(DartParser.Obj_or_fun_or_OtherContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(DartParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#funOfObj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunOfObj(DartParser.FunOfObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#incrementVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementVar(DartParser.IncrementVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassicForStatement}
	 * labeled alternative in {@link DartParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassicForStatement(DartParser.ClassicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#forinitstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForinitstatement(DartParser.ForinitstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DartParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#decFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFun(DartParser.DecFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#funName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunName(DartParser.FunNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(DartParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameterPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterPart(DartParser.ParameterPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(DartParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(DartParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameterPartDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterPartDec(DartParser.ParameterPartDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parameterDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDec(DartParser.ParameterDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parametersDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersDec(DartParser.ParametersDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(DartParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(DartParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#switch_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_stat(DartParser.Switch_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#switch_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_key(DartParser.Switch_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#switchBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBody(DartParser.SwitchBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#propretes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropretes(DartParser.PropretesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(DartParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classMethods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethods(DartParser.ClassMethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(DartParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(DartParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(DartParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#interfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaces(DartParser.InterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typeNotVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNotVoid(DartParser.TypeNotVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typeNotVoidList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNotVoidList(DartParser.TypeNotVoidListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#mixins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixins(DartParser.MixinsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadata(DartParser.MetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#metadatum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadatum(DartParser.MetadatumContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(DartParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(DartParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(DartParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(DartParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varableDeclaration}
	 * labeled alternative in {@link DartParser#decVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarableDeclaration(DartParser.VarableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(DartParser.VariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(DartParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(DartParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(DartParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(DartParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(DartParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(DartParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intNumber}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntNumber(DartParser.IntNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatNumber}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatNumber(DartParser.FloatNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(DartParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(DartParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqual(DartParser.LessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterEqual}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqual(DartParser.GreaterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessOperation}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOperation(DartParser.LessOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterOperation}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOperation(DartParser.GreaterOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalOperation}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualOperation(DartParser.EqualOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqual}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(DartParser.NotEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(DartParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(DartParser.LogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DartParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#type_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_ID(DartParser.Type_IDContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#identi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdenti(DartParser.IdentiContext ctx);
}