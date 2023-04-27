package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import gdscript_rules.rules.FileParserCreator;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.sonar.api.batch.fs.InputFile;

import java.util.ArrayList;
import java.util.List;

public class MethodDeclListener extends GDScriptParserBaseListener {
    private static List<GDScriptParser.MethodDeclContext> methDecl = new ArrayList<>();
    private static List<TerminalNode> methIdentifier = new ArrayList<>();

    @Override
    public void enterMethodDecl(GDScriptParser.MethodDeclContext ctx) {
        if(ctx.IDENTIFIER() != null)
        {
            TerminalNode methodIdentifier = ctx.IDENTIFIER();
            methDecl.add(ctx);
            methIdentifier.add(ctx.IDENTIFIER());
        }
    }

    public List<TerminalNode> getMethodDeclIdentifier() {
        return methIdentifier;
    }

    public List<GDScriptParser.MethodDeclContext> getMethodDecl(){
        return methDecl;
    }

    public static int getMethodCount(InputFile file){
        GDScriptParser parser = FileParserCreator.createParser(file);
        MethodDeclListener listener = new MethodDeclListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.program());

        int methDeclCount = methDecl.size();
        methDecl.clear();
        return methDeclCount;
    }

}
