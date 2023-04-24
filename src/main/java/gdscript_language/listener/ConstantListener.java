package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import java.util.ArrayList;
import java.util.List;

public class ConstantListener extends GDScriptParserBaseListener {
    private List<GDScriptParser.ConstDeclContext> constDecl = new ArrayList<>();

    @Override
    public void enterConstDecl(GDScriptParser.ConstDeclContext ctx) {
        constDecl.add(ctx);
    }

    public List<GDScriptParser.ConstDeclContext> getConstDecl() {
        return constDecl;
    }

}
