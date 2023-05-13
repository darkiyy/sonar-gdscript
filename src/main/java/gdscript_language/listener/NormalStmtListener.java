package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import gdscript_rules.rules.FileParserCreator;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;

import java.util.ArrayList;
import java.util.List;

public class NormalStmtListener extends GDScriptParserBaseListener {
    private static List<GDScriptParser.StmtContext> stmts = new ArrayList<>();

    @Override public void enterStmt(GDScriptParser.StmtContext ctx) {
        if(!ctx.getText().isEmpty()) // Add statement if the String is NOT empty
            stmts.add(ctx);
    }


    public List<GDScriptParser.StmtContext> getStmts() {
        return stmts;
    }

    public static int getStatementCount(InputFile file){
        return stmts.size();
    }

}
