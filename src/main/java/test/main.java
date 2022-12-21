package test;
import gdscript_language.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

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



            CommonTokenStream tokens = new CommonTokenStream(y);


            GDScriptParser parser = new GDScriptParser(tokens);
            for(GDScriptParser.TopLevelDeclContext topLvlCont: parser.program().topLevelDecl())
            {
                if(topLvlCont.enumDecl() != null && topLvlCont.enumDecl().start.getLine() == topLvlCont.enumDecl().stop.getLine())
                {
                    int size = topLvlCont.enumDecl().children.size();
                    String lastChild = topLvlCont.enumDecl().children.get(size-2).getText();
                    int line = topLvlCont.enumDecl().start.getLine();
                    System.out.println(lastChild);
                    if(lastChild.equals(","))
                    {

                    }
                }
            }


        }
        catch(Exception ex)
        {

        }




    }
}
