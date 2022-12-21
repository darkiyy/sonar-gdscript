package gdscript_rules;

import gdscript_language.GDScriptLexer;
import gdscript_language.GDScriptParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = TrailingCommaSingeLineList.RULE_KEY, name = "Trailing comma in single-line lists", description = "Trailing commas are unnecessary in single-line lists, so don't add them in this case")
public class TrailingCommaSingeLineList implements FlagLineRule {
    public static final String RULE_KEY = "TrailingCommaSingeLineList";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {
        try {
            CharStream x = CharStreams.fromString(file.contents());
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

                    if(lastChild.equals(","))
                    {
                        NewIssue newIssue = sensorContext.newIssue();
                        newIssue
                                .forRule(ruleKey)
                                .at(newIssue.newLocation()
                                        .on(file)
                                        .at(file.selectLine(line)))
                                .save();
                    }
                }
            }

        }
        catch(Exception ex){
            //TODO: Do something
        }


    }
}

