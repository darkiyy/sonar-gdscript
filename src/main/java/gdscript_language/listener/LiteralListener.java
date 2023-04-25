package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import java.util.ArrayList;
import java.util.List;

public class LiteralListener extends GDScriptParserBaseListener {

    private List<GDScriptParser.LiteralContext> numbers = new ArrayList<>();
    private List<GDScriptParser.LiteralContext> floatNumbers = new ArrayList<>();

    @Override
    public void enterLiteral(GDScriptParser.LiteralContext ctx) {
        if(ctx.INTEGER() != null)
        {
            numbers.add(ctx);
        } else if (ctx.FLOAT() != null) {
            floatNumbers.add(ctx);
        }
    }

    public List<GDScriptParser.LiteralContext> getNumbers(){
        return numbers;
    }

    public List<GDScriptParser.LiteralContext> getFloatNumbers(){
        return floatNumbers;
    }
}
