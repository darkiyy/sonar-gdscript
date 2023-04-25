package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import java.util.ArrayList;
import java.util.List;

public class IfStmtListener extends GDScriptParserBaseListener {
    private List<GDScriptParser.IfStmtContext> ifStmts = new ArrayList<>();
    private List<GDScriptParser.ExpressionContext> ifStmtExpression = new ArrayList<>();

    @Override public void enterIfStmt(GDScriptParser.IfStmtContext ctx) {
        if(ctx.IF() != null)
        {
            ifStmts.add(ctx);
            for(int i = 0; i != ctx.expression().size(); i++)
            {
                ifStmtExpression.add(ctx.expression(i));
            }

        }

    }

    public List<GDScriptParser.ExpressionContext> getIfExpressions() {
        return ifStmtExpression;
    }

    public List<GDScriptParser.IfStmtContext> getIfStmts() {
        return ifStmts;
    }

}
