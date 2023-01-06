// Generated from java-escape by ANTLR 4.11.1
package alter;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DartParser}.
 */
public interface DartParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DartParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(DartParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(DartParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DartParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DartParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(DartParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(DartParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(DartParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(DartParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(DartParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(DartParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoops(DartParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoops(DartParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(DartParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(DartParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#do_while_stat}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_stat(DartParser.Do_while_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#do_while_stat}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_stat(DartParser.Do_while_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#obj_or_fun_or_Other}.
	 * @param ctx the parse tree
	 */
	void enterObj_or_fun_or_Other(DartParser.Obj_or_fun_or_OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#obj_or_fun_or_Other}.
	 * @param ctx the parse tree
	 */
	void exitObj_or_fun_or_Other(DartParser.Obj_or_fun_or_OtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(DartParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(DartParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#funOfObj}.
	 * @param ctx the parse tree
	 */
	void enterFunOfObj(DartParser.FunOfObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#funOfObj}.
	 * @param ctx the parse tree
	 */
	void exitFunOfObj(DartParser.FunOfObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#incrementVar}.
	 * @param ctx the parse tree
	 */
	void enterIncrementVar(DartParser.IncrementVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#incrementVar}.
	 * @param ctx the parse tree
	 */
	void exitIncrementVar(DartParser.IncrementVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassicForStatement}
	 * labeled alternative in {@link DartParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterClassicForStatement(DartParser.ClassicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassicForStatement}
	 * labeled alternative in {@link DartParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitClassicForStatement(DartParser.ClassicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void enterForinitstatement(DartParser.ForinitstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void exitForinitstatement(DartParser.ForinitstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DartParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DartParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#decFun}.
	 * @param ctx the parse tree
	 */
	void enterDecFun(DartParser.DecFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#decFun}.
	 * @param ctx the parse tree
	 */
	void exitDecFun(DartParser.DecFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#funName}.
	 * @param ctx the parse tree
	 */
	void enterFunName(DartParser.FunNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#funName}.
	 * @param ctx the parse tree
	 */
	void exitFunName(DartParser.FunNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(DartParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(DartParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameterPart}.
	 * @param ctx the parse tree
	 */
	void enterParameterPart(DartParser.ParameterPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameterPart}.
	 * @param ctx the parse tree
	 */
	void exitParameterPart(DartParser.ParameterPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(DartParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(DartParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(DartParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(DartParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameterPartDec}.
	 * @param ctx the parse tree
	 */
	void enterParameterPartDec(DartParser.ParameterPartDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameterPartDec}.
	 * @param ctx the parse tree
	 */
	void exitParameterPartDec(DartParser.ParameterPartDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parameterDec}.
	 * @param ctx the parse tree
	 */
	void enterParameterDec(DartParser.ParameterDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parameterDec}.
	 * @param ctx the parse tree
	 */
	void exitParameterDec(DartParser.ParameterDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parametersDec}.
	 * @param ctx the parse tree
	 */
	void enterParametersDec(DartParser.ParametersDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parametersDec}.
	 * @param ctx the parse tree
	 */
	void exitParametersDec(DartParser.ParametersDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(DartParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(DartParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(DartParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(DartParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#switch_stat}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stat(DartParser.Switch_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#switch_stat}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stat(DartParser.Switch_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#switch_key}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_key(DartParser.Switch_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#switch_key}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_key(DartParser.Switch_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBody(DartParser.SwitchBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBody(DartParser.SwitchBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(DartParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#propretes}.
	 * @param ctx the parse tree
	 */
	void enterPropretes(DartParser.PropretesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#propretes}.
	 * @param ctx the parse tree
	 */
	void exitPropretes(DartParser.PropretesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(DartParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(DartParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classMethods}.
	 * @param ctx the parse tree
	 */
	void enterClassMethods(DartParser.ClassMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classMethods}.
	 * @param ctx the parse tree
	 */
	void exitClassMethods(DartParser.ClassMethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(DartParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(DartParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(DartParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(DartParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(DartParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(DartParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#interfaces}.
	 * @param ctx the parse tree
	 */
	void enterInterfaces(DartParser.InterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#interfaces}.
	 * @param ctx the parse tree
	 */
	void exitInterfaces(DartParser.InterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typeNotVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeNotVoid(DartParser.TypeNotVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typeNotVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeNotVoid(DartParser.TypeNotVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typeNotVoidList}.
	 * @param ctx the parse tree
	 */
	void enterTypeNotVoidList(DartParser.TypeNotVoidListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typeNotVoidList}.
	 * @param ctx the parse tree
	 */
	void exitTypeNotVoidList(DartParser.TypeNotVoidListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#mixins}.
	 * @param ctx the parse tree
	 */
	void enterMixins(DartParser.MixinsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#mixins}.
	 * @param ctx the parse tree
	 */
	void exitMixins(DartParser.MixinsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#metadata}.
	 * @param ctx the parse tree
	 */
	void enterMetadata(DartParser.MetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#metadata}.
	 * @param ctx the parse tree
	 */
	void exitMetadata(DartParser.MetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#metadatum}.
	 * @param ctx the parse tree
	 */
	void enterMetadatum(DartParser.MetadatumContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#metadatum}.
	 * @param ctx the parse tree
	 */
	void exitMetadatum(DartParser.MetadatumContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(DartParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(DartParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(DartParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(DartParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(DartParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(DartParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(DartParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(DartParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varableDeclaration}
	 * labeled alternative in {@link DartParser#decVar}.
	 * @param ctx the parse tree
	 */
	void enterVarableDeclaration(DartParser.VarableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varableDeclaration}
	 * labeled alternative in {@link DartParser#decVar}.
	 * @param ctx the parse tree
	 */
	void exitVarableDeclaration(DartParser.VarableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(DartParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(DartParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(DartParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(DartParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(DartParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(DartParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(DartParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(DartParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(DartParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(DartParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(DartParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link DartParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(DartParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(DartParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(DartParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intNumber}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIntNumber(DartParser.IntNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intNumber}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIntNumber(DartParser.IntNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatNumber}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFloatNumber(DartParser.FloatNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatNumber}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFloatNumber(DartParser.FloatNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(DartParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(DartParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(DartParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link DartParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(DartParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterLessEqual(DartParser.LessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitLessEqual(DartParser.LessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterEqual}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqual(DartParser.GreaterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterEqual}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqual(DartParser.GreaterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessOperation}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterLessOperation(DartParser.LessOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessOperation}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitLessOperation(DartParser.LessOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterOperation}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOperation(DartParser.GreaterOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterOperation}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOperation(DartParser.GreaterOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalOperation}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterEqualOperation(DartParser.EqualOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalOperation}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitEqualOperation(DartParser.EqualOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqual}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(DartParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqual}
	 * labeled alternative in {@link DartParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(DartParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(DartParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(DartParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(DartParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(DartParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DartParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DartParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#type_ID}.
	 * @param ctx the parse tree
	 */
	void enterType_ID(DartParser.Type_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#type_ID}.
	 * @param ctx the parse tree
	 */
	void exitType_ID(DartParser.Type_IDContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#identi}.
	 * @param ctx the parse tree
	 */
	void enterIdenti(DartParser.IdentiContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#identi}.
	 * @param ctx the parse tree
	 */
	void exitIdenti(DartParser.IdentiContext ctx);
}