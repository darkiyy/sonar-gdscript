package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import java.util.ArrayList;
import java.util.List;

public class GDScriptWhileStmtListener extends GDScriptParserBaseListener {
    private List<GDScriptParser.WhileStmtContext> whileStmts = new ArrayList<>();

    @Override
    public void enterWhileStmt(GDScriptParser.WhileStmtContext ctx) {
        whileStmts.add(ctx);
    }

    public List<GDScriptParser.WhileStmtContext> getWhileContexts() {
        return whileStmts;
    }

}
