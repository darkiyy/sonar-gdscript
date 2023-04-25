package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import java.util.ArrayList;
import java.util.List;

public class EnumListener extends GDScriptParserBaseListener {
    private List<GDScriptParser.EnumDeclContext> enumDecl = new ArrayList<>();
    private List<GDScriptParser.EnumDeclContext> enumIdentifier = new ArrayList<>();

    @Override
    public void enterEnumDecl(GDScriptParser.EnumDeclContext ctx) {
        if(ctx.ENUM() != null)
        {
            enumDecl.add(ctx);
        } else if (ctx.IDENTIFIER() != null) {
            enumIdentifier.add(ctx);
        }

    }

    public List<GDScriptParser.EnumDeclContext> getEnumDecl() {
        return enumDecl;
    }
    public List<GDScriptParser.EnumDeclContext> getEnumDeclIdentifier() {
        return enumIdentifier;
    }
}
