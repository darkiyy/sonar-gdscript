package ANTLR4_Viewer;

import gdscript_language.GDScriptLexer;
import gdscript_language.GDScriptParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ANTLR4Viewer {

    private static JFrame frame;
    private static JPanel mainPanel;
    private static JPanel antlrPanel;
    private static String toParse;

    public static void openViewer(){
        createWindow();
        toParse = createFileString("/home/gott/Dokumente/test/test.txt");
        GDScriptParser parser = createParser(toParse);
        viewAntlr4Tree(parser);
        mainPanel.add(antlrPanel);
        createTextField();

        //frame.pack();
        frame.setVisible(true);
    }

    private static void createWindow(){
        frame = new JFrame("ANTLR4Viewer");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(1600, 800));
        frame.setLayout(new GridBagLayout());
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        frame.add(mainPanel);
        antlrPanel = new JPanel();
    }
    private static void createTextField()
    {
        JButton a = new JButton("parse");


    JSplitPane splitPane = new JSplitPane();
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitPane.setResizeWeight(1);
        splitPane.setBottomComponent(a);
        JTextArea textArea = new JTextArea("");
        textArea.setRows(10);
        textArea.setColumns(10);
        splitPane.setTopComponent(textArea);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(splitPane, c);

        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                toParse = textArea.getText();
                updateANTLR4Tree();
            }
        });

    }
    private static void viewAntlr4Tree(GDScriptParser parser) {

        parser.reset();
        ParseTree tree = parser.program();

        TreeViewer viewer = new TreeViewer(
                Arrays.asList(
                        parser.getRuleNames()
                )
                ,tree
        );


        if(antlrPanel.getComponentCount() == 1)
            antlrPanel.remove(0);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        antlrPanel.add(viewer, c);
    }

    private static void updateANTLR4Tree(){
        GDScriptParser parser = createParser(toParse);
        viewAntlr4Tree(parser);
        antlrPanel.updateUI();
    }

    public static GDScriptParser createParser(String stringToParse){
        GDScriptParser parser;

        CharStream x = CharStreams.fromString(stringToParse);
        GDScriptLexer y = new GDScriptLexer(x);

        CommonTokenStream tokens = new CommonTokenStream(y);
        parser = new GDScriptParser(tokens);

        return parser;
    }

    public static String createFileString(String path){
        StringBuilder sb = new StringBuilder();
        try {
            File file = new File(path);
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
        } catch(Exception ex) {
        }
        return sb.toString();
    }
}
