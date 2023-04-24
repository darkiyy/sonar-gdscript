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
import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args){
        try {
            File file = new File("fileToTestPath");
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
            NormalStmtListener listener = new NormalStmtListener();

            walker.walk(listener, parser.program());
            Set<Integer> lineSet = new HashSet<>();
            Set<Integer> markedLines = new HashSet<>();
            for(GDScriptParser.StmtContext context: listener.getStmts()){
                int stmtLine = context.start.getLine();
                if(!lineSet.add(stmtLine)){ //Sets do not allow duplicate values
                    if(markedLines.add(stmtLine)){ //Only mark the line once
                        System.out.println("asd");
                    }
                }
            }
        }
        catch(Exception ex)
        {

        }




    }
}
