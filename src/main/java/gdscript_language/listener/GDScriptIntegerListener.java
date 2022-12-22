package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import java.util.ArrayList;
import java.util.List;

public class GDScriptIntegerListener extends GDScriptParserBaseListener {

    private List<GDScriptParser.LiteralContext> numbers = new ArrayList<>();

    @Override
    public void enterLiteral(GDScriptParser.LiteralContext ctx) {
        if(ctx.INTEGER() != null)
        {
            numbers.add(ctx);
        }
    }

    public List<GDScriptParser.LiteralContext> getNumbers(){
        return numbers;
    }
}
