package gdscript_language.listener;

import gdscript_language.GDScriptParser;
import java.util.ArrayList;
import java.util.List;

public class GDScriptLogicListener extends GDScriptParserBaseListener{

    private List<GDScriptParser.LogicAndContext> logicAnd = new ArrayList<>();

    private List<GDScriptParser.LogicOrContext> logicOr = new ArrayList<>();

    @Override public void enterLogicAnd(GDScriptParser.LogicAndContext ctx) {
        logicAnd.add(ctx);
    }

    @Override public void enterLogicOr(GDScriptParser.LogicOrContext ctx) {
        logicOr.add(ctx);
    }

    public List<GDScriptParser.LogicAndContext> getLogicAndContexts() {
        return logicAnd;
    }

    public List<GDScriptParser.LogicOrContext> getLogicOrContexts() {
        return logicOr;
    }

}
