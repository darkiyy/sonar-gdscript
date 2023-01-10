package test;
import gdscript_language.*;
import gdscript_language.listener.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args){
        try {
            File file = new File("/home/gott/Dokumente/test/test.txt");
            StringBuilder sb = new StringBuilder();
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                try (BufferedReader br = new BufferedReader(new InputStreamReader(fis))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        sb.append(line);
                        sb.append('\n');
                    }
                }
            }

            CharStream x = CharStreams.fromString(sb.toString());
            GDScriptLexer y = new GDScriptLexer(x);
            ParseTreeWalker walker = new ParseTreeWalker();
            CommonTokenStream tokens = new CommonTokenStream(y);
            GDScriptParser parser = new GDScriptParser(tokens);

            GDScriptIfStmtListener listener = new GDScriptIfStmtListener();
            walker.walk(listener, parser.program());


            for (GDScriptParser.IfStmtContext context: listener.getLogicAndContexts()){
                if(context.OPEN_PAREN().size() != 0){
                    int line = context.start.getLine();
                }
            }

            GDScriptWhileStmtListener listener2 = new GDScriptWhileStmtListener();
            parser.reset();
            ParseTreeWalker walker2 = new ParseTreeWalker();
            walker2.walk(listener2, parser.program());

            for (GDScriptParser.WhileStmtContext context: listener2.getWhileContexts()){

                System.out.println("Cock");
            }
        }
        catch(Exception ex)
        {

        }




    }
}
