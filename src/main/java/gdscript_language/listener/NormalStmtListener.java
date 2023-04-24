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
        stmts.add(ctx);
    }


    public List<GDScriptParser.StmtContext> getStmts() {
        return stmts;
    }

    public static int getStatementCount(InputFile file){
        GDScriptParser parser = FileParserCreator.createParser(file);
        NormalStmtListener listener = new NormalStmtListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());

        int x = stmts.size();
        stmts.clear();
        return x;
    }

}
