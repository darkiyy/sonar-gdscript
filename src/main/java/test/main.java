package test;
import gdscript_language.*;
import gdscript_language.listener.*;
import gdscript_rules.IssuesContainer;
import gdscript_rules.rules.FileParserCreator;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

            EnumListener listener = new EnumListener();
            parser.addParseListener(listener);

            walker.walk(listener, parser.program());
            for(GDScriptParser.EnumDeclContext enums: listener.getEnumDecl())
            {
                List<TerminalNode> listEntries = enums.enumList().IDENTIFIER();

                for (TerminalNode identifier: listEntries) {
                    String entry = identifier.getText();
                    String entryUpper = entry.toUpperCase();

                    if(!entry.equals(entryUpper)) // IF entry is not in Uppercase
                    {
                        System.out.println("Cock");
                    }
                }
            }

            viewAntlr4Tree(parser);
        }
        catch(Exception ex)
        {

        }
    }
    private static void viewAntlr4Tree(GDScriptParser parser)
    {
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
