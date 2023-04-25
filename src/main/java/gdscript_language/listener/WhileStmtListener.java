package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import java.util.ArrayList;
import java.util.List;

public class WhileStmtListener extends GDScriptParserBaseListener {
    private List<GDScriptParser.WhileStmtContext> whileStmts = new ArrayList<>();
    private List<GDScriptParser.ExpressionContext> whileStmtsExpression = new ArrayList<>();
    @Override
    public void enterWhileStmt(GDScriptParser.WhileStmtContext ctx) {
        if(ctx.WHILE() != null)
        {
            whileStmts.add(ctx);
            whileStmtsExpression.add(ctx.expression());
        }
    }

    public List<GDScriptParser.WhileStmtContext> getWhileContexts() {
        return whileStmts;
    }
    public List<GDScriptParser.ExpressionContext> getWhileStmtsExpression() {
        return whileStmtsExpression;
    }
}
