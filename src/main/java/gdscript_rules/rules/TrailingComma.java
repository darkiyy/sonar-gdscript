package gdscript_rules.rules;

import gdscript_language.GDScriptParser;
import gdscript_rules.FlagLineRule;
import gdscript_rules.IssuesContainer;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.rule.RuleKey;
import org.sonar.check.Rule;

@Rule(key = TrailingComma.RULE_KEY)
public class TrailingComma implements FlagLineRule {
    public static final String RULE_KEY = "TrailingComma";

    @Override
    public void execute(SensorContext sensorContext, InputFile file, RuleKey ruleKey) {

        GDScriptParser parser = FileParserCreator.createParser(file);

        for(GDScriptParser.TopLevelDeclContext topLvlCont: parser.program().topLevelDecl())
        {
            if(topLvlCont.enumDecl() != null && topLvlCont.enumDecl().start.getLine() != topLvlCont.enumDecl().stop.getLine())
            {
                int size = topLvlCont.enumDecl().children.size();
                String lastChild = topLvlCont.enumDecl().children.get(size-2).getText();
                int errorLine = topLvlCont.enumDecl().stop.getLine();

                if(!lastChild.equals(","))
                {
                    IssuesContainer.createIssue(ruleKey, file, sensorContext, errorLine);
                }
            }
        }
    }
}

