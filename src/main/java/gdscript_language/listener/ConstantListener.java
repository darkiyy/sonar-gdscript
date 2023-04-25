package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import java.util.ArrayList;
import java.util.List;

public class ConstantListener extends GDScriptParserBaseListener {
    private List<GDScriptParser.ConstDeclContext> constDecl = new ArrayList<>();
    private List<GDScriptParser.ExpressionContext> constAssignExpression = new ArrayList<>();

    @Override
    public void enterConstDecl(GDScriptParser.ConstDeclContext ctx) {

        if(ctx.IDENTIFIER() != null)
            constDecl.add(ctx);
        else if (ctx.expression() != null) {
            constAssignExpression.add(ctx.expression());
        }
    }

    public List<GDScriptParser.ConstDeclContext> getConstDecl() {
        return constDecl;
    }

}
