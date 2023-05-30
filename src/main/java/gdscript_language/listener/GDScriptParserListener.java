package gdscript_language.listener;// Generated from GDScriptParser.g4 by ANTLR 4.12.0
import gdscript_language.GDScriptParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GDScriptParser}.
 */
public interface GDScriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GDScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GDScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#iconToolDecl}.
	 * @param ctx the parse tree
	 */
	void enterIconToolDecl(GDScriptParser.IconToolDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#iconToolDecl}.
	 * @param ctx the parse tree
	 */
	void exitIconToolDecl(GDScriptParser.IconToolDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#iconDecl}.
	 * @param ctx the parse tree
	 */
	void enterIconDecl(GDScriptParser.IconDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#iconDecl}.
	 * @param ctx the parse tree
	 */
	void exitIconDecl(GDScriptParser.IconDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#fileDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFileDeclaration(GDScriptParser.FileDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#fileDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFileDeclaration(GDScriptParser.FileDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void enterInheritance(GDScriptParser.InheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void exitInheritance(GDScriptParser.InheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(GDScriptParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(GDScriptParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelDecl(GDScriptParser.TopLevelDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#topLevelDecl}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelDecl(GDScriptParser.TopLevelDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#classVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassVarDecl(GDScriptParser.ClassVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#classVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassVarDecl(GDScriptParser.ClassVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#setget}.
	 * @param ctx the parse tree
	 */
	void enterSetget(GDScriptParser.SetgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#setget}.
	 * @param ctx the parse tree
	 */
	void exitSetget(GDScriptParser.SetgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#onready}.
	 * @param ctx the parse tree
	 */
	void enterOnready(GDScriptParser.OnreadyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#onready}.
	 * @param ctx the parse tree
	 */
	void exitOnready(GDScriptParser.OnreadyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#exportStmts}.
	 * @param ctx the parse tree
	 */
	void enterExportStmts(GDScriptParser.ExportStmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#exportStmts}.
	 * @param ctx the parse tree
	 */
	void exitExportStmts(GDScriptParser.ExportStmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(GDScriptParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(GDScriptParser.ExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#export_node_path}.
	 * @param ctx the parse tree
	 */
	void enterExport_node_path(GDScriptParser.Export_node_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#export_node_path}.
	 * @param ctx the parse tree
	 */
	void exitExport_node_path(GDScriptParser.Export_node_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#export_range}.
	 * @param ctx the parse tree
	 */
	void enterExport_range(GDScriptParser.Export_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#export_range}.
	 * @param ctx the parse tree
	 */
	void exitExport_range(GDScriptParser.Export_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#export_multiline}.
	 * @param ctx the parse tree
	 */
	void enterExport_multiline(GDScriptParser.Export_multilineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#export_multiline}.
	 * @param ctx the parse tree
	 */
	void exitExport_multiline(GDScriptParser.Export_multilineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#export_exp_easing}.
	 * @param ctx the parse tree
	 */
	void enterExport_exp_easing(GDScriptParser.Export_exp_easingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#export_exp_easing}.
	 * @param ctx the parse tree
	 */
	void exitExport_exp_easing(GDScriptParser.Export_exp_easingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#export_color_no_alpha}.
	 * @param ctx the parse tree
	 */
	void enterExport_color_no_alpha(GDScriptParser.Export_color_no_alphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#export_color_no_alpha}.
	 * @param ctx the parse tree
	 */
	void exitExport_color_no_alpha(GDScriptParser.Export_color_no_alphaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#export_flags}.
	 * @param ctx the parse tree
	 */
	void enterExport_flags(GDScriptParser.Export_flagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#export_flags}.
	 * @param ctx the parse tree
	 */
	void exitExport_flags(GDScriptParser.Export_flagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#export_flags_2d}.
	 * @param ctx the parse tree
	 */
	void enterExport_flags_2d(GDScriptParser.Export_flags_2dContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#export_flags_2d}.
	 * @param ctx the parse tree
	 */
	void exitExport_flags_2d(GDScriptParser.Export_flags_2dContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#export_flags_3d}.
	 * @param ctx the parse tree
	 */
	void enterExport_flags_3d(GDScriptParser.Export_flags_3dContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#export_flags_3d}.
	 * @param ctx the parse tree
	 */
	void exitExport_flags_3d(GDScriptParser.Export_flags_3dContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#export_enum}.
	 * @param ctx the parse tree
	 */
	void enterExport_enum(GDScriptParser.Export_enumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#export_enum}.
	 * @param ctx the parse tree
	 */
	void exitExport_enum(GDScriptParser.Export_enumContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#typeHint}.
	 * @param ctx the parse tree
	 */
	void enterTypeHint(GDScriptParser.TypeHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#typeHint}.
	 * @param ctx the parse tree
	 */
	void exitTypeHint(GDScriptParser.TypeHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(GDScriptParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(GDScriptParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#signalDecl}.
	 * @param ctx the parse tree
	 */
	void enterSignalDecl(GDScriptParser.SignalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#signalDecl}.
	 * @param ctx the parse tree
	 */
	void exitSignalDecl(GDScriptParser.SignalDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#signalParList}.
	 * @param ctx the parse tree
	 */
	void enterSignalParList(GDScriptParser.SignalParListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#signalParList}.
	 * @param ctx the parse tree
	 */
	void exitSignalParList(GDScriptParser.SignalParListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void enterEnumDecl(GDScriptParser.EnumDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#enumDecl}.
	 * @param ctx the parse tree
	 */
	void exitEnumDecl(GDScriptParser.EnumDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#enumList}.
	 * @param ctx the parse tree
	 */
	void enterEnumList(GDScriptParser.EnumListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#enumList}.
	 * @param ctx the parse tree
	 */
	void exitEnumList(GDScriptParser.EnumListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(GDScriptParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(GDScriptParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#parList}.
	 * @param ctx the parse tree
	 */
	void enterParList(GDScriptParser.ParListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#parList}.
	 * @param ctx the parse tree
	 */
	void exitParList(GDScriptParser.ParListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(GDScriptParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(GDScriptParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#rpc}.
	 * @param ctx the parse tree
	 */
	void enterRpc(GDScriptParser.RpcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#rpc}.
	 * @param ctx the parse tree
	 */
	void exitRpc(GDScriptParser.RpcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDecl(GDScriptParser.ConstructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#constructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDecl(GDScriptParser.ConstructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(GDScriptParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(GDScriptParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#innerClass}.
	 * @param ctx the parse tree
	 */
	void enterInnerClass(GDScriptParser.InnerClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#innerClass}.
	 * @param ctx the parse tree
	 */
	void exitInnerClass(GDScriptParser.InnerClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#stmtOrSuite}.
	 * @param ctx the parse tree
	 */
	void enterStmtOrSuite(GDScriptParser.StmtOrSuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#stmtOrSuite}.
	 * @param ctx the parse tree
	 */
	void exitStmtOrSuite(GDScriptParser.StmtOrSuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(GDScriptParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(GDScriptParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(GDScriptParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(GDScriptParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#stmtEnd}.
	 * @param ctx the parse tree
	 */
	void enterStmtEnd(GDScriptParser.StmtEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#stmtEnd}.
	 * @param ctx the parse tree
	 */
	void exitStmtEnd(GDScriptParser.StmtEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#awaitStmt}.
	 * @param ctx the parse tree
	 */
	void enterAwaitStmt(GDScriptParser.AwaitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#awaitStmt}.
	 * @param ctx the parse tree
	 */
	void exitAwaitStmt(GDScriptParser.AwaitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(GDScriptParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(GDScriptParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(GDScriptParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(GDScriptParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(GDScriptParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(GDScriptParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#matchStmt}.
	 * @param ctx the parse tree
	 */
	void enterMatchStmt(GDScriptParser.MatchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#matchStmt}.
	 * @param ctx the parse tree
	 */
	void exitMatchStmt(GDScriptParser.MatchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#matchBlock}.
	 * @param ctx the parse tree
	 */
	void enterMatchBlock(GDScriptParser.MatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#matchBlock}.
	 * @param ctx the parse tree
	 */
	void exitMatchBlock(GDScriptParser.MatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#patternList}.
	 * @param ctx the parse tree
	 */
	void enterPatternList(GDScriptParser.PatternListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#patternList}.
	 * @param ctx the parse tree
	 */
	void exitPatternList(GDScriptParser.PatternListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(GDScriptParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(GDScriptParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#bindingPattern}.
	 * @param ctx the parse tree
	 */
	void enterBindingPattern(GDScriptParser.BindingPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#bindingPattern}.
	 * @param ctx the parse tree
	 */
	void exitBindingPattern(GDScriptParser.BindingPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#arrayPattern}.
	 * @param ctx the parse tree
	 */
	void enterArrayPattern(GDScriptParser.ArrayPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#arrayPattern}.
	 * @param ctx the parse tree
	 */
	void exitArrayPattern(GDScriptParser.ArrayPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#dictPattern}.
	 * @param ctx the parse tree
	 */
	void enterDictPattern(GDScriptParser.DictPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#dictPattern}.
	 * @param ctx the parse tree
	 */
	void exitDictPattern(GDScriptParser.DictPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#keyValuePattern}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePattern(GDScriptParser.KeyValuePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#keyValuePattern}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePattern(GDScriptParser.KeyValuePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#flowStmt}.
	 * @param ctx the parse tree
	 */
	void enterFlowStmt(GDScriptParser.FlowStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#flowStmt}.
	 * @param ctx the parse tree
	 */
	void exitFlowStmt(GDScriptParser.FlowStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(GDScriptParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(GDScriptParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#equalsAssignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterEqualsAssignmentStmt(GDScriptParser.EqualsAssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#equalsAssignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitEqualsAssignmentStmt(GDScriptParser.EqualsAssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#varDeclStmt}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclStmt(GDScriptParser.VarDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#varDeclStmt}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclStmt(GDScriptParser.VarDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#assertStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssertStmt(GDScriptParser.AssertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#assertStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssertStmt(GDScriptParser.AssertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#yieldStmt}.
	 * @param ctx the parse tree
	 */
	void enterYieldStmt(GDScriptParser.YieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#yieldStmt}.
	 * @param ctx the parse tree
	 */
	void exitYieldStmt(GDScriptParser.YieldStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#preloadStmt}.
	 * @param ctx the parse tree
	 */
	void enterPreloadStmt(GDScriptParser.PreloadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#preloadStmt}.
	 * @param ctx the parse tree
	 */
	void exitPreloadStmt(GDScriptParser.PreloadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(GDScriptParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(GDScriptParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinus(GDScriptParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinus(GDScriptParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitOr}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitOr(GDScriptParser.BitOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitOr}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitOr(GDScriptParser.BitOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicOr}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicOr(GDScriptParser.LogicOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicOr}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicOr(GDScriptParser.LogicOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sign}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSign(GDScriptParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sign}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSign(GDScriptParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscription}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubscription(GDScriptParser.SubscriptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscription}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubscription(GDScriptParser.SubscriptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCast(GDScriptParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCast(GDScriptParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicAnd}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicAnd(GDScriptParser.LogicAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicAnd}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicAnd(GDScriptParser.LogicAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternacyExpr}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernacyExpr(GDScriptParser.TernacyExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternacyExpr}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernacyExpr(GDScriptParser.TernacyExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dictDecl}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDictDecl(GDScriptParser.DictDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dictDecl}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDictDecl(GDScriptParser.DictDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(GDScriptParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(GDScriptParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factor}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GDScriptParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factor}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GDScriptParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicNot}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicNot(GDScriptParser.LogicNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicNot}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicNot(GDScriptParser.LogicNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitShift}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitShift(GDScriptParser.BitShiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitShift}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitShift(GDScriptParser.BitShiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(GDScriptParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(GDScriptParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code in}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIn(GDScriptParser.InContext ctx);
	/**
	 * Exit a parse tree produced by the {@code in}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIn(GDScriptParser.InContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayDecl}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(GDScriptParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayDecl}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(GDScriptParser.ArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code is}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIs(GDScriptParser.IsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code is}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIs(GDScriptParser.IsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus(GDScriptParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus(GDScriptParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCall(GDScriptParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCall(GDScriptParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitAnd}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitAnd(GDScriptParser.BitAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitAnd}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitAnd(GDScriptParser.BitAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitXor}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitXor(GDScriptParser.BitXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitXor}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitXor(GDScriptParser.BitXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getNode}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGetNode(GDScriptParser.GetNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getNode}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGetNode(GDScriptParser.GetNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueNode}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUniqueNode(GDScriptParser.UniqueNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueNode}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUniqueNode(GDScriptParser.UniqueNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitNot}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitNot(GDScriptParser.BitNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitNot}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitNot(GDScriptParser.BitNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primary}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(GDScriptParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primary}
	 * labeled alternative in {@link GDScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(GDScriptParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GDScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GDScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GDScriptParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GDScriptParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDScriptParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(GDScriptParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDScriptParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(GDScriptParser.KeyValueContext ctx);
}