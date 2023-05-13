package gdscript_rules;

import gdscript_language.GDScriptLexer;
import gdscript_language.GDScriptParser;
import gdscript_language.listener.*;
import gdscript_rules.rules.FileParserCreator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.InputFile;

import java.io.IOException;
import java.util.List;

public class GDScriptParserWalker {

    private static GDScriptParserWalker GDScriptParser = new GDScriptParserWalker();
    private InputFile parsedFile;
    private ParseTreeWalker walker;
    private ProxyParseTreeListener proxy;

    private GDScriptParserWalker() {
    }

    public static GDScriptParserWalker getInstance() {
        return GDScriptParser;
    }

    public void parseFile(InputFile file) {

        if (checkToBeParsed(file))
        {
            proxy = createProxyListener();
            GDScriptParser parser = createParser(file);
            walker = new ParseTreeWalker();
            walker.walk(proxy, parser.program());
            parsedFile = file;
        }

    }
    private boolean checkToBeParsed(InputFile file)
    {
        if(parsedFile == null){
            return true;
        } else if (parsedFile.equals(file)) {
            return false;
        }
        return true;
    }

    private ProxyParseTreeListener createProxyListener() {
        ProxyParseTreeListener proxy = new ProxyParseTreeListener();
        proxy = addEveryListener(proxy);

        return proxy;
    }

    private ProxyParseTreeListener addEveryListener(ProxyParseTreeListener proxy) {
        proxy.add(new AssigmentStmtListener());
        proxy.add(new ClassNameListener());
        proxy.add(new ConstantListener());
        proxy.add(new EnumListener());
        proxy.add(new IfStmtListener());
        proxy.add(new LiteralListener());
        proxy.add(new LogicListener());
        proxy.add(new MethodDeclListener());
        proxy.add(new NormalStmtListener());
        proxy.add(new WhileStmtListener());

        return proxy;
    }

    public GDScriptParserBaseListener getListener(Class<?> listenerClass) {
        List<GDScriptParserBaseListener> listener = proxy.getListeners();
        for (GDScriptParserBaseListener toCheckListener : listener) {
            {
                if (listenerClass.isInstance(toCheckListener)) {
                    return toCheckListener;
                }
            }

        }
        return null;
    }

    public static GDScriptParser createParser(InputFile file){
        try
        {
            CharStream x = CharStreams.fromString(file.contents());
            GDScriptLexer y = new GDScriptLexer(x);
            CommonTokenStream tokens = new CommonTokenStream(y);

            GDScriptParser parser = new GDScriptParser(tokens);
            return parser;
        }
        catch (IOException ex){
            //Todo: Do something
            return null;
        }

    }
}