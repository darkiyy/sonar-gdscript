package test;
import ANTLR4_Viewer.ANTLR4Viewer;
import gdscript_language.*;
import gdscript_language.listener.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



public class main {
    public static void main(String[] args){

        ANTLR4Viewer.openViewer();
        //GDScriptParser parser = ANTLR4Viewer.createParser();
        //testCode(parser);
    }

    private static void testCode(GDScriptParser parser){
        ParseTreeWalker walker = new ParseTreeWalker();
        LiteralListener listener = new LiteralListener();
        parser.addParseListener(listener);

        walker.walk(listener, parser.program());

        int maxNumbers = 6;

        for (GDScriptParser.LiteralContext context: listener.getNumbers()){
            String number = context.INTEGER().getText();

            int numberLength = number.length();
            int hexNumberadd = 0;

            if(number.matches(".*[a-zA-Z].*"))
                hexNumberadd += 4;

            if(numberLength > (maxNumbers + hexNumberadd)) //Numbers lower than 1000000 generally don't need separators.
            {
                if(!number.contains("_")) //IF there is no _ in the long number
                {
                    System.out.println("ToLongNoUnderscore");
                }
            }
        }
    }

}
