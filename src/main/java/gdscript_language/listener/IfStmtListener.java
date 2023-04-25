package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import java.util.ArrayList;
import java.util.List;

public class IfStmtListener extends GDScriptParserBaseListener {
    private List<GDScriptParser.IfStmtContext> ifStmts = new ArrayList<>();
    private List<GDScriptParser.ExportContext> ifStmtExpression = new ArrayList<>();

    @Override public void enterIfStmt(GDScriptParser.IfStmtContext ctx) {
        if(ctx.IF() != null)
            ifStmts.add(ctx);
    }

    public List<GDScriptParser.IfStmtContext> getIfStmts() {
        return ifStmts;
    }

}
