package gdscript_language;// Generated from GDScriptParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GDScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GDScriptParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GDScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#iconToolDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIconToolDecl(GDScriptParser.IconToolDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#iconDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIconDecl(GDScriptParser.IconDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#fileDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileDeclaration(GDScriptParser.FileDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#inheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritance(GDScriptParser.InheritanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(GDScriptParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#topLevelDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelDecl(GDScriptParser.TopLevelDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#classVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVarDecl(GDScriptParser.ClassVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#setget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetget(GDScriptParser.SetgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#onready}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnready(GDScriptParser.OnreadyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#exportStmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStmts(GDScriptParser.ExportStmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(GDScriptParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#export_node_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_node_path(GDScriptParser.Export_node_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#export_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_range(GDScriptParser.Export_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#export_multiline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_multiline(GDScriptParser.Export_multilineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#export_exp_easing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_exp_easing(GDScriptParser.Export_exp_easingContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#export_color_no_alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_color_no_alpha(GDScriptParser.Export_color_no_alphaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#export_flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_flags(GDScriptParser.Export_flagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#export_flags_2d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_flags_2d(GDScriptParser.Export_flags_2dContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#export_flags_3d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_flags_3d(GDScriptParser.Export_flags_3dContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#export_enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_enum(GDScriptParser.Export_enumContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#typeHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeHint(GDScriptParser.TypeHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(GDScriptParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#signalDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalDecl(GDScriptParser.SignalDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#signalParList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalParList(GDScriptParser.SignalParListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#enumDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDecl(GDScriptParser.EnumDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#enumList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumList(GDScriptParser.EnumListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(GDScriptParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#parList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParList(GDScriptParser.ParListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(GDScriptParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#rpc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpc(GDScriptParser.RpcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#constructorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDecl(GDScriptParser.ConstructorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(GDScriptParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#innerClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerClass(GDScriptParser.InnerClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#stmtOrSuite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtOrSuite(GDScriptParser.StmtOrSuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(GDScriptParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(GDScriptParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#stmtEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtEnd(GDScriptParser.StmtEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#awaitStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitStmt(GDScriptParser.AwaitStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(GDScriptParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(GDScriptParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(GDScriptParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#matchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchStmt(GDScriptParser.MatchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#matchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchBlock(GDScriptParser.MatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#patternList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternList(GDScriptParser.PatternListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(GDScriptParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#bindingPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingPattern(GDScriptParser.BindingPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#arrayPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayPattern(GDScriptParser.ArrayPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#dictPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictPattern(GDScriptParser.DictPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#keyValuePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValuePattern(GDScriptParser.KeyValuePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#flowStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowStmt(GDScriptParser.FlowStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(GDScriptParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#equalsAssignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsAssignmentStmt(GDScriptParser.EqualsAssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#varDeclStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStmt(GDScriptParser.VarDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#assertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStmt(GDScriptParser.AssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#yieldStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldStmt(GDScriptParser.YieldStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#preloadStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreloadStmt(GDScriptParser.PreloadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(GDScriptParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(GDScriptParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitOr}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOr(GDScriptParser.BitOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicOr}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOr(GDScriptParser.LogicOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sign}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(GDScriptParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscription}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscription(GDScriptParser.SubscriptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(GDScriptParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicAnd}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAnd(GDScriptParser.LogicAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternacyExpr}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernacyExpr(GDScriptParser.TernacyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dictDecl}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictDecl(GDScriptParser.DictDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(GDScriptParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GDScriptParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicNot}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicNot(GDScriptParser.LogicNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitShift}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitShift(GDScriptParser.BitShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(GDScriptParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(GDScriptParser.InContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDecl}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl(GDScriptParser.ArrayDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs(GDScriptParser.IsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(GDScriptParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(GDScriptParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitAnd}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAnd(GDScriptParser.BitAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitXor}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitXor(GDScriptParser.BitXorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getNode}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetNode(GDScriptParser.GetNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uniqueNode}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueNode(GDScriptParser.UniqueNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitNot}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitNot(GDScriptParser.BitNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primary}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(GDScriptParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(GDScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GDScriptParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GDScriptParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValue(GDScriptParser.KeyValueContext ctx);
}