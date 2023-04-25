package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import java.util.ArrayList;
import java.util.List;

public class AssigmentStmtListener extends GDScriptParserBaseListener {
    private List<GDScriptParser.AssignmentStmtContext> asStmt = new ArrayList<>();

    @Override
    public void enterAssignmentStmt(GDScriptParser.AssignmentStmtContext ctx) {

        asStmt.add(ctx);
    }
    public List<GDScriptParser.AssignmentStmtContext> getAsStmt() {
        return asStmt;
    }

}
