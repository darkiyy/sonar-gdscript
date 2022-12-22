package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import java.util.ArrayList;
import java.util.List;

public class GDScriptIfStmtListener extends GDScriptParserBaseListener {
    private List<GDScriptParser.IfStmtContext> ifStmts = new ArrayList<>();

    @Override public void enterIfStmt(GDScriptParser.IfStmtContext ctx) {
        ifStmts.add(ctx);
    }


    public List<GDScriptParser.IfStmtContext> getLogicAndContexts() {
        return ifStmts;
    }

}
