// Source: https://github.com/antlr/antlr4/issues/841
package gdscript_language.listener;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;


public class ProxyParseTreeListener extends GDScriptParserBaseListener {
    private List<GDScriptParserBaseListener> listeners;

    public ProxyParseTreeListener() {
        this(new ArrayList<GDScriptParserBaseListener>());
    }

    public ProxyParseTreeListener(List<GDScriptParserBaseListener> listeners) {
        this.listeners = listeners;
        setListeners(listeners);
    }

    public void add(GDScriptParserBaseListener listener) {
        getListeners().add(listener);
    }

    public void remove(GDScriptParserBaseListener listener) {
        getListeners().remove(listener);
    }

    public void enterEveryRule(ParserRuleContext ctx) {
        for (GDScriptParserBaseListener listener : getListeners()) {
            listener.enterEveryRule(ctx);
        }
    }

    public void exitEveryRule(ParserRuleContext ctx) {
        for (GDScriptParserBaseListener listener : getListeners()) {
            listener.exitEveryRule(ctx);
        }
    }

    public void visitErrorNode(ErrorNode node) {
        for (GDScriptParserBaseListener listener : getListeners()) {
            listener.visitErrorNode(node);
        }
    }

    public void visitTerminal(TerminalNode node) {
        for (GDScriptParserBaseListener listener : getListeners()) {
            listener.visitTerminal(node);
        }
    }

    public List<GDScriptParserBaseListener> getListeners() {
        return this.listeners;
    }

    private void setListeners(List<GDScriptParserBaseListener> listeners) {
        this.listeners = listeners;
    }
}