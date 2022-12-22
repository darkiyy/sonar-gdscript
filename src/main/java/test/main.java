package test;
import gdscript_language.*;
import gdscript_language.listener.LogicListener;
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
            File file = new File("/home/gott/Dokumente/test/Test.txt");
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

            ParseTreeWalker cocks = new ParseTreeWalker();


            CommonTokenStream tokens = new CommonTokenStream(y);


            GDScriptParser parser = new GDScriptParser(tokens);
            LogicListener listener = new LogicListener();
            cocks.walk(listener, parser.program());
            for (GDScriptParser.LogicAndContext context: listener.getLogicAndContexts()){
                System.out.println(context.LOGIC_AND());
            }

        }
        catch(Exception ex)
        {

        }




    }
}
