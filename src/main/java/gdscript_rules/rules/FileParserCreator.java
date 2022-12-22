package gdscript_rules.rules;

import gdscript_language.GDScriptLexer;
import gdscript_language.GDScriptParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.sonar.api.batch.fs.InputFile;

import java.io.IOException;

public class FileParserCreator {

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
