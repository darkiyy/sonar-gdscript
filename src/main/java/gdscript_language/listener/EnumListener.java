package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import java.util.ArrayList;
import java.util.List;

public class EnumListener extends GDScriptParserBaseListener {
    private List<GDScriptParser.EnumDeclContext> enumDecl = new ArrayList<>();

    @Override
    public void enterEnumDecl(GDScriptParser.EnumDeclContext ctx) {
        enumDecl.add(ctx);
    }

    public List<GDScriptParser.EnumDeclContext> getEnumDecl() {
        return enumDecl;
    }

}
