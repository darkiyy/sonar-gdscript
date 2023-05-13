package test;
import gdscript_language.*;
import gdscript_language.listener.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;


public class main {
    public static void main(String[] args){

        GDScriptParser parser = createParser();
        testCode(parser);
        viewAntlr4Tree(parser);
    }

    private static void testCode(GDScriptParser parser){
        ParseTreeWalker walker = new ParseTreeWalker();
        ClassNameListener listener = new ClassNameListener();
        parser.addParseListener(listener);

        walker.walk(listener, parser.program());


        GDScriptParser.ClassNameContext classContext = listener.getClassName();

        if(classContext != null)
        {
            String className = classContext.IDENTIFIER().getText();

            if(!className.startsWith("\""))
            {
                Character firstChar = className.charAt(0);
                if(Character.isLowerCase(firstChar))
                    System.out.println(className);
            }
        }
    }

    private static GDScriptParser createParser(){
         GDScriptParser parser;
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

            CommonTokenStream tokens = new CommonTokenStream(y);
            parser = new GDScriptParser(tokens);

        }
        catch(Exception ex) {
            parser = null;
        }
        return parser;
    }

    private static void viewAntlr4Tree(GDScriptParser parser) {
        parser.reset();
        ParseTree tree = parser.program();
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(
                Arrays.asList(
                    parser.getRuleNames()
                )
                ,tree
        );
        viewer.setScale(0.8); // Scale a little
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
