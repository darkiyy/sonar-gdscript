package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import gdscript_rules.rules.FileParserCreator;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;

import java.util.ArrayList;
import java.util.List;

public class MethodDeclListener extends GDScriptParserBaseListener {
    private static List<GDScriptParser.MethodDeclContext> methDecl = new ArrayList<>();

    @Override
    public void enterMethodDecl(GDScriptParser.MethodDeclContext ctx) {
        methDecl.add(ctx);
    }

    public List<GDScriptParser.MethodDeclContext> getMethodDecl() {
        return methDecl;
    }

    public static int getMethodCount(InputFile file){
        GDScriptParser parser = FileParserCreator.createParser(file);
        MethodDeclListener listener = new MethodDeclListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());

        int x = methDecl.size();
        methDecl.clear();
        return x;
    }

}
